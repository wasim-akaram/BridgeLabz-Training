package bookbazar;
import java.util.HashMap;
import java.util.Map;

public class Order {

    private User user;
    private Map<Book, Integer> items = new HashMap<>();

    private String orderStatus; // restricted

    public Order(User user) {
        this.user = user;
        this.orderStatus = "CREATED";
    }

    public void addBook(Book book, int quantity) {
        items.put(book, quantity);
        book.reduceStock(quantity);
    }

    // price × quantity – discount
    public double calculateTotalCost() {
        double total = 0;

        for (Map.Entry<Book, Integer> entry : items.entrySet()) {
            Book book = entry.getKey();
            int qty = entry.getValue();

            double cost = book.getPrice() * qty;
            double discount = book.applyDiscount(qty);

            total += (cost - discount); // operators used
        }
        return total;
    }

    // Internal-only status update
    protected void updateOrderStatus(String status) {
        this.orderStatus = status;
    }

    public String getOrderStatus() {
        return orderStatus;
    }
}

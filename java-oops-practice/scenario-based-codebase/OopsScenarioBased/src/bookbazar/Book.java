package bookbazar;
public abstract class Book implements IDiscountable {

    protected String title;
    protected String author;
    protected double price;

    // Inventory must not be modified directly
    private int stock;

    // Constructor without offer
    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    // Constructor with optional offer (price override)
    public Book(String title, String author, double price,
                int stock, double offerPrice) {
        this(title, author, offerPrice, stock);
    }

    // Encapsulation: controlled inventory update
    public void reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
        } else {
            throw new RuntimeException("Insufficient stock");
        }
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }
}

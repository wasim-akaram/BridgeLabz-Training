package bookbazar;
public class Main {

    public static void main(String[] args) {

        User user = new User("U101", "Wasim");

        Book book1 = new EBook(
                "Java Mastery",
                "James Gosling",
                500,
                100
        );

        Book book2 = new PrintedBook(
                "Clean Code",
                "Robert Martin",
                700,
                20
        );

        Order order = new Order(user);

        order.addBook(book1, 2);
        order.addBook(book2, 3);

        System.out.println("Total Cost: " + order.calculateTotalCost());
        System.out.println("Order Status: " + order.getOrderStatus());
    }
}

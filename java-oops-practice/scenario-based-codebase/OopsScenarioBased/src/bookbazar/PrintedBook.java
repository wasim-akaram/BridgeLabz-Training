package bookbazar;
public class PrintedBook extends Book {

    public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(int quantity) {
        // Flat discount if bulk purchase
        if (quantity >= 3) {
            return 150;
        }
        return 0;
    }
}

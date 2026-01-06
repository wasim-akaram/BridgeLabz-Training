package swiftcart;

public class Main
{

    public static void main(String[] args) {

        Product milk = new PerishableProduct("Milk",60);
        Product bread = new PerishableProduct("Bread", 40);
        Product rice = new NonPerishableProduct("Rice", 60);

        Cart cart = new Cart();

        cart.addProduct(milk, 2);
        cart.addProduct(bread, 1);
        cart.addProduct(rice, 3);

        cart.printCartDetails();
    }
}

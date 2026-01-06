package swiftcart;


import java.util.List;
import java.util.ArrayList;

class Cart implements ICheckout 
{

    private List<CartItem> items;
    private double totalPrice;

    // Constructor: empty cart
    public Cart() 
    {
        this.items = new ArrayList<>();
        this.totalPrice = 0;
    }

    // Constructor: pre-selected items
    public Cart(List<CartItem> items)
    {
        this.items = items;
        calculateTotal();
    }

    // Only Cart can update price
    private void calculateTotal()
    {
        totalPrice = 0;
        for (CartItem item : items) 
        {
            totalPrice += item.getItemTotal();
        }
    }

    public void addProduct(Product product, int quantity) 
    {
        items.add(new CartItem(product, quantity));
        calculateTotal();
    }

    @Override
    public double applyDiscount() 
    {
        double discount = 0;

        for (CartItem item : items) 
        {
            discount += item.getItemTotal() * item.product.getDiscountRate();
        }

        return discount;
    }

    @Override
    public double generateBill() {
        double discount = applyDiscount();
        return totalPrice - discount;   // operator usage
    }

    public void printCartDetails() {
        System.out.println("----- Cart Items -----");
        for (CartItem item : items) {
            System.out.println(
                item.product.name + " | Qty: " + item.quantity +
                " | Price: " + item.product.price
            );
        }
        System.out.println("Total Price   : " + totalPrice);
        System.out.println("Final Bill    : " + generateBill());
    }
}

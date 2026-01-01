package com.objectmodeling.levelone;




import java.util.List;
import java.util.ArrayList;

class Order 
{
    private int orderId;
    private List<Product> products;

    Order(int orderId) 
    {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    void addProduct(Product product) 
    {
        products.add(product);
        System.out.println(
            "Product " + product.getProductName() +
            " added to Order " + orderId
        );
    }

    double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        for (Product p : products) {
            System.out.println(
                "Product: " + p.getProductName() +
                ", Price: " + p.getPrice()
            );
        }
        System.out.println("Total Amount: " + calculateTotal());
    }
}

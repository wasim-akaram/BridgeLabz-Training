package com.icecreamrush;
public class Main 
{

    public static void main(String[] args) 
    {

        IceCreamFlavor[] flavors = 
        	{
           
            new IceCreamFlavor("Chocolate", 180),
            new IceCreamFlavor("Strawberry", 90),
            new IceCreamFlavor("Pista", 110),
            new IceCreamFlavor("Coffee", 95),
            new IceCreamFlavor("Butterscotch", 150),
            new IceCreamFlavor("Black Current", 70),
            new IceCreamFlavor("Vanilla", 120),
            new IceCreamFlavor("Mango", 200)
           
        };

        BubbleSort sorter = new BubbleSort();
        sorter.sort(flavors);

        System.out.println("IceCreamRush – Flavors Sorted by Popularity:");
        for (IceCreamFlavor f : flavors) {
            System.out.println(f.flavorName + " → " + f.soldCount + " sales");
        }
    }
}

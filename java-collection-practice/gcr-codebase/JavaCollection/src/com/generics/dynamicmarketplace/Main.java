package com.generics.dynamicmarketplace;

public class Main {
	public static void main(String[] args) {
		Catalog<Products> cat = new Catalog();
		Book book = new Book("Reality of Life",1000);
		Clothes cloth = new Clothes("Trousers",750);
		cat.addProduct(book);
		cat.addProduct(cloth);
		cat.displayCatalog();
		cat.discount(cloth, 15);
		cat.discount(book, 75);
		cat.displayCatalog();
	}
}
package com.smartshelf;

public class Book {

	String[] bookslist = new String[1000];
	int counter = 0;

	public void addbook(String newBook) {
		bookslist[counter] = newBook;
		counter++;

		// sort the book

		if ((counter - 1) > 1) {
			insertionSort(bookslist);
		}

	}

	public void insertionSort(String[] arr) {
		int n = counter;
		for (int i = 1; i < n; i++) {
			String key = arr[i];
			int j = i - 1;

			// Move elements that are greater than key to one position ahead
			while (j >= 0 && (arr[j].compareTo(key)) > 0) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}

	// method to display books list

	public void displayBook() {
		System.out.println();
		for (int i = 0; i < counter; i++) {
			System.out.println(bookslist[i]);
		}
	}

}

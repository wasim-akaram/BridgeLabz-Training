package designPattern.librarymanagement;


interface User extends Observer {
	void showRole(); 

	void reserveBook(String bookName); // Reserve a book
}
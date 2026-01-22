package addressbook;

public class Main
{
	 public static void main(String[] args)
	 {
	        AddressBook book = new AddressBook();

	        Address a1 = new Address("Bhopal", " M P ", "462022");
	        Address a2 = new Address("Bangalore", " Karnataka ", "560001");

	        Contact c1 = new Contact("Wasim", "Akaram", "9876543210", "wasim@gmail.com", a1);
	        Contact c2 = new Contact("Vishal", "Singh", "9123456789", "vishal@gmail.com", a2);

	        book.addContact(c1);
	        book.addContact(c2);

	        System.out.println("\nAll Contacts:");
	        book.displayAllContacts();

	        System.out.println("\nSearch by City:");
	        book.searchByCityOrState("Bhopal");

	        System.out.println("\nEdit Contact:");
	        book.editContact("Vishal Singh", "9999999999", "vishal@gmail.com", a1);

	        System.out.println("\nDelete Contact:");
	        book.deleteContact("Wasim Akaram");

	        System.out.println("\nFinal Contacts:");
	        book.displayAllContacts();
	    }
}
package addressbook;

import java.util.*;

public class AddressBook 
{
    private List<Contact> contacts = new ArrayList<>();

   
    public void addContact(Contact contact) 
    {
        for (Contact c : contacts) 
        {
            if (c.getFullName().equalsIgnoreCase(contact.getFullName()))
            {
                System.out.println("Contact already exists.");
                return;
            }
        }
        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }

    
    public void editContact(String name, String newPhone, String newEmail, Address newAddress)
    {
        for (Contact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(name)) 
            {
                c.setPhone(newPhone);
                c.setEmail(newEmail);
                c.setAddress(newAddress);
                System.out.println("Contact updated.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // Delete contact by name
    public void deleteContact(String name) {
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            Contact c = iterator.next();
            if (c.getFullName().equalsIgnoreCase(name)) {
                iterator.remove();
                System.out.println("Contact deleted.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    
    public void searchByCityOrState(String location) {
        boolean found = false;
        for (Contact c : contacts) {
            Address a = c.getAddress();
            if (a != null && (a.getCity().equalsIgnoreCase(location)
                    || a.getState().equalsIgnoreCase(location))) {
                System.out.println(c);
                System.out.println("------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No contacts found for " + location);
        }
    }

    public void displayAllContacts() {
        contacts.sort(Comparator.comparing(Contact::getFullName));
        for (Contact c : contacts) {
            System.out.println(c);
            System.out.println("------------------");
        }
    }
}
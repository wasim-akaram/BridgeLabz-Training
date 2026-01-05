package com.linkedlist.librarymanagementsystem;


class Library
{

    private BookNode head;
    private BookNode tail;

    // 1. Add at Beginning
    public void addAtBeginning(int id, String title, String author, String genre, boolean available) {
        BookNode newNode = new BookNode(id, title, author, genre, available);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // 2. Add at End
    public void addAtEnd(int id, String title, String author, String genre, boolean available) {
        BookNode newNode = new BookNode(id, title, author, genre, available);

        if (tail == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // 3. Add at Specific Position (1-based)
    public void addAtPosition(int id, String title, String author, String genre,
                              boolean available, int position) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            addAtBeginning(id, title, author, genre, available);
            return;
        }

        BookNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(id, title, author, genre, available);
            return;
        }

        BookNode newNode = new BookNode(id, title, author, genre, available);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // 4. Remove by Book ID
    public void removeByBookId(int id) {
        if (head == null) {
            System.out.println("Library is empty");
            return;
        }

        BookNode temp = head;

        while (temp != null && temp.bookId != id) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Book not found");
            return;
        }

        if (temp == head) {
            head = head.next;
            if (head != null) head.prev = null;
        }
        else if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
        }
        else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        temp.prev = temp.next = null; // good practice
        System.out.println("Book removed successfully");
    }

    // 5. Search by Title
    public void searchByTitle(String title) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No book found with title: " + title);
        }
    }

    // 6. Search by Author
    public void searchByAuthor(String author) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No books found by author: " + author);
        }
    }

    // 7. Update Availability Status
    public void updateAvailability(int bookId, boolean status) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = status;
                System.out.println("Availability updated");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found");
    }

    // 8. Display Forward
    public void displayForward() {
        if (head == null) {
            System.out.println("No books available");
            return;
        }

        BookNode temp = head;
        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

    // 9. Display Reverse
    public void displayReverse() {
        if (tail == null) {
            System.out.println("No books available");
            return;
        }

        BookNode temp = tail;
        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

    // 10. Count Total Books
    public void countBooks() {
        int count = 0;
        BookNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total books in library: " + count);
    }

    // Helper Method
    private void displayBook(BookNode b) {
       
        System.out.println("Book ID    : " + b.bookId);
        System.out.println("Title      : " + b.title);
        System.out.println("Author     : " + b.author);
        System.out.println("Genre      : " + b.genre);
        System.out.println("Available  : " + (b.isAvailable ? "Yes" : "No"));
    }
}


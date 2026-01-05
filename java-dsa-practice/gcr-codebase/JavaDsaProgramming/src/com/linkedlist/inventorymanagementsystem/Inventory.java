package com.linkedlist.inventorymanagementsystem;

class Inventory
{

    private ItemNode head;

    // 1. Add at Beginning
    public void addAtBeginning(int id, String name, int qty, double price) 
    {
        ItemNode newNode = new ItemNode(id, name, qty, price);
        newNode.next = head;
        head = newNode;
    }

    // 2. Add at End
    public void addAtEnd(int id, String name, int qty, double price) 
    {
        ItemNode newNode = new ItemNode(id, name, qty, price);

        if (head == null) 
        {
            head = newNode;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // 3. Add at Specific Position (1-based)
    public void addAtPosition(int id, String name, int qty, double price, int position) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            addAtBeginning(id, name, qty, price);
            return;
        }

        ItemNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        ItemNode newNode = new ItemNode(id, name, qty, price);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // 4. Remove by Item ID
    public void removeByItemId(int id) {
        if (head == null) {
            System.out.println("Inventory is empty");
            return;
        }

        if (head.itemId == id) {
            head = head.next;
            System.out.println("Item removed");
            return;
        }

        ItemNode prev = head;
        ItemNode curr = head.next;

        while (curr != null && curr.itemId != id) {
            prev = curr;
            curr = curr.next;
        }

        if (curr == null) {
            System.out.println("Item not found");
            return;
        }

        prev.next = curr.next;
        curr.next = null;
        System.out.println("Item removed");
    }

    // 5. Update Quantity by Item ID
    public void updateQuantity(int id, int newQty) {
        ItemNode temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                System.out.println("Quantity updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // 6. Search by Item ID
    public void searchById(int id) {
        ItemNode temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // 7. Search by Item Name
    public void searchByName(String name) {
        ItemNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                displayItem(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("Item not found");
        }
    }

    // 8. Calculate Total Inventory Value
    public void calculateTotalValue() {
        double total = 0;
        ItemNode temp = head;

        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value: " + total);
    }

    // 9. Sort by Item Name (Bubble Sort)
    public void sortByName(boolean ascending) {
        if (head == null) return;

        boolean swapped;
        do {
            swapped = false;
            ItemNode curr = head;

            while (curr.next != null) {
                int cmp = curr.itemName.compareToIgnoreCase(curr.next.itemName);
                if ((ascending && cmp > 0) || (!ascending && cmp < 0)) {
                    swapData(curr, curr.next);
                    swapped = true;
                }
                curr = curr.next;
            }
        } while (swapped);
    }

    // 10. Sort by Price (Bubble Sort)
    public void sortByPrice(boolean ascending) {
        if (head == null) return;

        boolean swapped;
        do {
            swapped = false;
            ItemNode curr = head;

            while (curr.next != null) {
                if ((ascending && curr.price > curr.next.price) ||
                    (!ascending && curr.price < curr.next.price)) {
                    swapData(curr, curr.next);
                    swapped = true;
                }
                curr = curr.next;
            }
        } while (swapped);
    }

    // Display All Items
    public void displayAll() {
        if (head == null) {
            System.out.println("No items in inventory");
            return;
        }

        ItemNode temp = head;
        while (temp != null) {
            displayItem(temp);
            temp = temp.next;
        }
    }

    // Helper Methods
    private void swapData(ItemNode a, ItemNode b) {
        int id = a.itemId;
        String name = a.itemName;
        int qty = a.quantity;
        double price = a.price;

        a.itemId = b.itemId;
        a.itemName = b.itemName;
        a.quantity = b.quantity;
        a.price = b.price;

        b.itemId = id;
        b.itemName = name;
        b.quantity = qty;
        b.price = price;
    }

    private void displayItem(ItemNode i) {
        
        System.out.println("Item ID   : " + i.itemId);
        System.out.println("Name      : " + i.itemName);
        System.out.println("Quantity  : " + i.quantity);
        System.out.println("Price     : " + i.price);
    }
}

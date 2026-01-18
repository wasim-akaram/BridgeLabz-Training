package com.smartlibrary;
class InsertionSort 
{

    // Sort books alphabetically by title
    public void sort(Book[] books) 
    {

        // Start from the second book
        for (int i = 1; i < books.length; i++) 
        {

            Book key = books[i];   // book to be inserted
            int j = i - 1;

            // Shift books that come after key alphabetically
            while (j >= 0 && books[j].title.compareToIgnoreCase(key.title) > 0) 
            {
                books[j + 1] = books[j];
                j--;
            }

            // Insert book at correct position
            books[j + 1] = key;
        }
    }
}

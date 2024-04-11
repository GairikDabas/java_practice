package Assignments;

public class BookMain {
    public static void main(String[] args) {
        // create object of Book
        Book book1 = new Book();
        book1.printBookDetails();


        Book book2 = new Book("Rich Dad Poor Dad");
        book2.printBookDetails();

        Book book3 = new Book("Think and grow rich", "Napolean Hill");
        book3.printBookDetails();

        Book book4 = new Book("4 hour work week", "Timothy", 2017);
        book4.printBookDetails();

        Book book5 = new Book("Harry Potter", "J.K Rowling", 2001, "Fiction");
        book5.printBookDetails();

    }
}


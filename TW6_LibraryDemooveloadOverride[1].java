class Book {
    
    String title;
    String author;

    // ----- Constructor Overloading -----
    Book() {
        this.title = "Unknown";
        this.author = "Unknown";
    }

    Book(String title) {
        this.title = title;
        this.author = "Unknown";
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // ----- METHOD OVERLOADING -----
    void details() {
        System.out.println("Book Title: " + title);
    }

    void details(boolean showAuthor) {
        if (showAuthor)
            System.out.println("Book: " + title + " | Author: " + author);
        else
            System.out.println("Book: " + title);
    }

    void details(int year) {
        System.out.println("Book: " + title + " | Published Year: " + year);
    }

    // ----- METHOD TO BE OVERRIDDEN -----
    void read() {
        System.out.println("Reading the physical book...");
    }
}


// ------------ CHILD CLASS ------------
class EBook extends Book {

    double fileSizeMB;

    EBook(String title, String author, double fileSizeMB) {
        super(title, author);
        this.fileSizeMB = fileSizeMB;
    }

    // ----- METHOD OVERRIDING -----
    @Override
    void read() {
        System.out.println("Reading the digital eBook on a device...");
    }

    // ----- METHOD OVERLOADING in CHILD -----
    void details(double fileSizeMB) {
        System.out.println("EBook: " + title +
                           " | Author: " + author +
                           " | Size: " + fileSizeMB + "MB");
    }
}


// ------------ MAIN CLASS ------------
public class LibraryDemo {
    public static void main(String[] args) {

        Book b = new Book("Java Basics", "John Doe");
        EBook e = new EBook("AI Fundamentals", "Dr. Smith", 5.2);
        Book ref;

        System.out.println("----- OVERLOADING (Book) -----");
        b.details();
        b.details(true);
        b.details(2020);

        System.out.println("\n----- OVERLOADING (EBook) -----");
        e.details(5.2);   // child class overloading

        System.out.println("\n----- OVERRIDING -----");
        b.read();         // Book version
        e.read();         // EBook overridden version

        
    }
}

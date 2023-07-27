package Model;

public class Book {
    private int id;
    private String title;
    private String author;
    private double price;

    // Constructors
    public Book() {
    }

    public Book(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // CRUD Operations (using JDBC)
    public void saveBook() {
        // Implement the code to save the book details to the database using JDBC
    }

    public static Book getBookById(int id) {
        // Implement the code to fetch a book by its ID from the database using JDBC
        return null; // Replace with actual book object
    }

    public void updateBook() {
        // Implement the code to update the book details in the database using JDBC
    }

    public void deleteBook() {
        // Implement the code to delete the book from the database using JDBC
    }
}

package service;

import dao.BookDAO;
import Model.Book;

public class BookService {
    private BookDAO bookDAO;

    public BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    // Get all books
//    public List<Book> getAllBooks() {
//        return bookDAO.getAllBooks();
//    }

    // Get book by ID
    public Book getBookById(int bookId) {
        return bookDAO.getBookById(bookId);
    }

    // Add a new book
    public void addBook(Book book) {
        bookDAO.saveBook(book);
    }

    // Update book details
    public void updateBook(Book book) {
        bookDAO.updateBook(book);
    }

    // Delete a book
    public void deleteBook(int bookId) {
        bookDAO.deleteBook(bookId);
    }

    // Other business logic and complex operations specific to books can be added here.
}

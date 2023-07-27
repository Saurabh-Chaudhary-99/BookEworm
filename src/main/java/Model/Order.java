package Model;

import java.util.Date;

public class Order {
    private int id;
    private User user;
    private Book book;
    private Date orderDate;
    private int quantity;

    public Order() {
    }

    public Order(int id, User user, Book book, Date orderDate, int quantity) {
        this.id = id;
        this.user = user;
        this.book = book;
        this.orderDate = orderDate;
        this.quantity = quantity;
    }

    // Add getters and setters for the properties (id, user, book, orderDate, quantity)
    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Add CRUD methods for Order entity (saveOrder, getOrderById, updateOrder, deleteOrder)
    
    public void saveOrder() {
        // Implement the JDBC code to save the order details to the database
    }

    public static Order getOrderById(int id) {
        // Implement the JDBC code to fetch an order by its ID from the database
        return null; // Replace with actual order object
    }

    public void updateOrder() {
        // Implement the JDBC code to update the order details in the database
    }

    public void deleteOrder() {
        // Implement the JDBC code to delete the order from the database
    }
}


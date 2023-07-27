<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>BookEworm - Online Book Store</title>
    <!-- Add your CSS and JavaScript links here, if any -->
</head>
<body>
    <h1>Welcome to BookEworm - Your Online Book Store</h1>
    <h2>Featured Books</h2>
    <div>
        <%-- Replace this with actual code to retrieve featured books from the database --%>
        <%
            List<Book> featuredBooks = BookDAO.getFeaturedBooks(); // Assuming you have a BookDAO class to retrieve books from the database
            for (Book book : featuredBooks) {
        %>
        <div>
            <h3><%= book.getTitle() %></h3>
            <p><b>Author:</b> <%= book.getAuthor() %></p>
            <p><b>Description:</b> <%= book.getDescription() %></p>
            <p><b>Price:</b> <%= book.getPrice() %></p>
            <p><b>ISBN:</b> <%= book.getISBN() %></p>
            <!-- Add more book details as needed -->
        </div>
        <% } %>
    </div>
</body>
</html>

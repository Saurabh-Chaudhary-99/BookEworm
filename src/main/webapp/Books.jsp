<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Online Bookstore - Books</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <header>
        <h1>Online Bookstore</h1>
        <nav>
            <ul>
                <li><a href="index.html">Home</a></li>
                <li><a href="books.jsp">Books</a></li>
                <li><a href="cart.jsp">Cart</a></li>
            </ul>
        </nav>
    </header>

    <main>
        <section>
            <h2>Books</h2>
            <table>
                <tr>
                    <th>Title</th>
                    <th>Author</th>
                    <th>Price</th>
                </tr>
                <!-- Assuming you have a list of Book objects in the request scope named "booksList" -->
                <c:forEach items="${requestScope.booksList}" var="book">
                    <tr>
                        <td>${book.title}</td>
                        <td>${book.author}</td>
                        <td>${book.price}</td>
                    </tr>
                </c:forEach>
            </table>
        </section>
    </main>

    <footer>
        <p>&copy; 2023 Online Bookstore. All rights reserved.</p>
    </footer>
</body>
</html>

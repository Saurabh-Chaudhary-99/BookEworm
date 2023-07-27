<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>BookEworm - Register</title>
    <link rel="stylesheet" type="text/css" href="styles.css"> <!-- Replace 'path/to/styles.css' with the actual path to your CSS file -->
</head>
<body>
    <div class="register-container">
        <h1>Register for BookEworm</h1>
        <form class="register-form" action="registerServlet" method="post">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
            <button type="submit">Register</button>
        </form>
    </div>
</body>
</html>

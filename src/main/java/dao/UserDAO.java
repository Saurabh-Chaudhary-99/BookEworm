package dao;

import Model.User;
import java.sql.Connection;

public class UserDAO {
    private Connection connection;

    public UserDAO(Connection connection) {
        this.connection = connection;
    }

    // CRUD methods using JDBC
    public void saveUser(User user) {
        // Implement the JDBC code to save the user details to the database using the connection
    }

    public User getUserById(int id) {
        // Implement the JDBC code to fetch a user by their ID from the database using the connection
        return null; // Replace with actual user object
    }

    public void updateUser(User user) {
        // Implement the JDBC code to update the user details in the database using the connection
    }

    public void deleteUser(int id) {
        // Implement the JDBC code to delete the user from the database using the connection
    }
}

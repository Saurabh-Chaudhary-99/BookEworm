package service;

import dao.UserDAO;
import Model.User;

public class UserService {
    private UserDAO userDAO;

    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    // Get user by ID
    public User getUserById(int userId) {
        return userDAO.getUserById(userId);
    }

    // Add a new user
    public void addUser(User user) {
        userDAO.saveUser(user);
    }

    // Update user details
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    // Delete a user
    public void deleteUser(int userId) {
        userDAO.deleteUser(userId);
    }

    // Other business logic and complex operations specific to users can be added here.
}

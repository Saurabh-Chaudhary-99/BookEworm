package Model;

public class User {
    private int id;
    private String username;
    private String email;
    private String password;

    public User() {
    }

    public User(int id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // Add getters and setters for the properties (id, username, email, password)
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        // CRUD methods using JDBC
        public void saveUser() {
            // Implement the JDBC code to save the user details to the database
        }

        public static User getUserById(int id) {
            // Implement the JDBC code to fetch a user by their ID from the database
            return null; // Replace with actual user object
        }

        public void updateUser() {
            // Implement the JDBC code to update the user details in the database
        }

        public void deleteUser() {
            // Implement the JDBC code to delete the user from the database
        }
    }
   

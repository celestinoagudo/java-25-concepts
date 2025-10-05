package concepts.java25.scoped.values;

public class User {

    private final String username;
    private final String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public User(final String username, final String password) {
        this.username = username;
        this.password = password;
    }
}

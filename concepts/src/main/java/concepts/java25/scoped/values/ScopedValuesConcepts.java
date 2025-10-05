package concepts.java25.scoped.values;

import com.sun.net.httpserver.Request;

public class ScopedValuesConcepts {

    public static final ScopedValue<User> LOGGED_IN_USER = ScopedValue.newInstance();

    public static void main(String[] args) {

    }

    private void serve(Request request) {
        var loggedInUser = authenticateUser(request);
        ScopedValue.where(LOGGED_IN_USER, loggedInUser).run(() -> System.out.println("Do something productive after successful authentication!"));
    }

    private User authenticateUser(final Request request) {
        //authenticate something here...
        return new User("test-username", "test-password");
    }
}

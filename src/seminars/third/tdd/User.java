package seminars.third.tdd;

public class User {

    String name;
    String password;
    boolean isAuthenticate = false;
    boolean isAdmin;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    //3.6.
    public boolean authenticate(String enteredName, String enteredPassword) {
        isAuthenticate = enteredName.equals(name) && enteredPassword.equals(password);
        return isAuthenticate;
    }

}
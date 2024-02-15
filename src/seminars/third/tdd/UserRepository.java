package seminars.third.tdd;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public void addUser(User user) {
        // Проверяем аутентификацию пользователя
        if (user.isAuthenticate) {
            data.add(user);
            System.out.println("User " + user.name + " added successfully.");
        } else {
            System.out.println("User " + user.name + " is not authenticated.");
        }
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void logoutAllUsersExceptAdmins() {
        for (User user : data) {
            if (!user.isAdmin) {
                user.isAuthenticate = false;
            }
        }
        System.out.println("All users except admins have been logged out.");
    }

}
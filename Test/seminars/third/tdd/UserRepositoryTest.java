package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserRepositoryTest {

    @Test
    public void testAddUser_SuccessfulAuthentication() {
        UserRepository userRepository = new UserRepository();
        User user = new User("John", "password123", false);
        user.isAuthenticate = true;
        userRepository.addUser(user);
        assertTrue(userRepository.findByName("John"));
    }

    @Test
    public void testAddUser_AuthenticationFailed() {
        UserRepository userRepository = new UserRepository();
        User user = new User("Jane", "password456", false);
        user.isAuthenticate = false;
        userRepository.addUser(user);
        assertFalse(userRepository.findByName("Jane"));
    }

    @Test
    public void testLogoutAllUsersExceptAdmins() {
        User admin = new User("admin", "admin123", true);
        User user1 = new User("user1", "password1", false);
        User user2 = new User("user2", "password2", false);

        UserRepository userRepository = new UserRepository();

        admin.authenticate("admin", "admin123");
        user1.authenticate("user1", "password1");
        user2.authenticate("user2", "password2");

        userRepository.addUser(admin);
        userRepository.addUser(user1);
        userRepository.addUser(user2);

        assertTrue(admin.isAuthenticate);
        assertTrue(user1.isAuthenticate);
        assertTrue(user2.isAuthenticate);

        userRepository.logoutAllUsersExceptAdmins();

        assertTrue(admin.isAuthenticate);
        assertFalse(user1.isAuthenticate);
        assertFalse(user2.isAuthenticate);
    }
}
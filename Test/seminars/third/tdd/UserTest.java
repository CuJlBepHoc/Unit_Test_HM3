package seminars.third.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void testAuthenticateWithCorrectCredentials() {
        User user = new User("admin", "admin123", true);
        assertTrue(user.authenticate("admin", "admin123"));
    }

    @Test
    public void testAuthenticateWithIncorrectPassword() {
        User user = new User("admin", "admin123", true);
        assertFalse(user.authenticate("admin", "wrongpassword"));
    }

    @Test
    public void testAuthenticateWithIncorrectUsername() {
        User user = new User("admin", "admin123", true);
        assertFalse(user.authenticate("wrongusername", "admin123"));
    }
}
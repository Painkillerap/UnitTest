package seminar3HW.usr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    User adminUser;
    User user1;
    User user2;
    User user3;
    UserRepository userRepository;
    @BeforeEach
    void setUp() {
        //cоздаём юзеров
        adminUser = new User("admin", "admin", true);
        user1 = new User("cristina", "qwerty", false);
        user2 = new User("anton", "asdfgh", false);
        user3 = new User("tihon", "qazwsx", false);

        //добавляем юзеров в UserRepository
        userRepository = new UserRepository();
        userRepository.addUser(user1);
        userRepository.addUser(user2);
        userRepository.addUser(user3);

        //юзеры проходят аутентификацию
        adminUser.authenticate("admin", "admin");
        user1.authenticate("cristina", "qwerty");
        user2.authenticate("anton", "asdfgh");
        user3.authenticate("tihon", "qazwsx");
    }

    @Test
    @DisplayName("Все юзеры прошли аутентификацию успешно!")
    public void testAllUsersAuthenticate() {
        assertTrue(adminUser.authenticate("admin", "admin"));
        assertTrue(user1.authenticate("cristina", "qwerty"));
        assertTrue(user2.authenticate("anton", "asdfgh"));
        assertTrue(user3.authenticate("tihon", "qazwsx"));
    }

    @Test
    @DisplayName("Все юзеры кроме админов разлогинились")
    public void testLogoutAllUsersExceptAdmins() {
        userRepository.logoutAllUsersExceptAdmins();
        for (User user : userRepository.data) {
            assertEquals(user.isAdmin, user.isAuthenticate);
            assertThat(user.isAdmin).isEqualTo(user.isAuthenticate);
        }
    }

}

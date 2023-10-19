package task1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class task1Test {
    @Test
    public void testMethod() {
        assertEquals(5, 2 + 3);
    }

    @BeforeEach
    public void setup() {
        // Инициализация ресурсов
    }

    @AfterEach
    public void teardown() {
        // Очистка ресурсов
    }

    @BeforeAll
    public static void globalSetup() {
        // Инициализация
    }

    @AfterAll
    public static void globalTeardown() {
        // Очистка
    }

    @Test
    @DisplayName("Тест суммирования")
    public void testSum() {
        assertEquals(5, 2 + 3);
    }

    @Test
    @Disabled("Тест суммирования")
    public void testMethod1() {
        //этот тест не будет запущен
    }

//    @ParameterizedTest
//    @ValueSourse(ints = {1, 2, 3})
//    public void testMethod(int argument) {
//        assertTrue(argument > 0);
//    }
}

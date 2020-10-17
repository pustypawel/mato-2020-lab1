package pl.edu.wszib.lab1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ExamplesJunitTest {

    @BeforeAll
    public static void setup() {
        System.out.println("setup");
    }

    @BeforeEach
    public void setupEach() {
        System.out.println("setupEach");
    }

    @AfterAll
    public static void cleanup() {
        System.out.println("cleanup");
    }

    @AfterEach
    public void cleanupEach() {
        System.out.println("cleanupEach");
    }

    @Test
    public void test() {
        System.out.println("First test");
    }

    @Test
    public void test2() {
        System.out.println("Second test");
    }

    @Test
    @Disabled
    public void test3() {
        System.out.println("Second test");
    }

    @Test
    @DisplayName("should Return Existing Person When Age Is Over18")
    public void shouldReturnExistingPersonWhenAgeIsOver18() {

    }
}
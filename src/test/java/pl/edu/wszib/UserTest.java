package pl.edu.wszib;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    @DisplayName("Should increase age after birthday")
    public void shouldIncreaseAgeAfterBirthday() {
        // given: we create user
        final User user = new User("Paweł", "Pustelnik", 99);

        // when: user has birthday
        user.birthday();

        // then: age should be incremented by 1
        assertEquals(99, user.getAge(), "User after birthday should be 100");
    }

}
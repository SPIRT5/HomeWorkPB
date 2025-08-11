import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {
    @Test
    void testAddNewContact() {
        PhoneBook phoneBook = new PhoneBook();
        int count = phoneBook.add("Alice", "123");
        assertEquals(1, count);
    }

    @Test
    void testAddDuplicateName() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Alice", "123");
        int count = phoneBook.add("Alice", "456");
        assertEquals(1, count);
    }
}

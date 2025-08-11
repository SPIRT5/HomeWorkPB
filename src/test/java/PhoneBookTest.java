package ru.netology;

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

    @Test
    void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Alice", "123");
        phoneBook.add("Bob", "456");

        assertEquals("Alice", phoneBook.findByNumber("123"));
        assertEquals("Bob", phoneBook.findByNumber("456"));
        assertNull(phoneBook.findByNumber("999"));
    }

    @Test
    void testFindByName() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Alice", "123");
        phoneBook.add("Bob", "456");

        assertEquals("123", phoneBook.findByName("Alice"));
        assertEquals("456", phoneBook.findByName("Bob"));
        assertNull(phoneBook.findByName("Charlie"));
    }

    @Test
    void testPrintAllNames() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Bob", "456");
        phoneBook.add("Alice", "123");
        phoneBook.add("Charlie", "789");

        assertEquals("Alice\nBob\nCharlie", phoneBook.printAllNames());
    }

}

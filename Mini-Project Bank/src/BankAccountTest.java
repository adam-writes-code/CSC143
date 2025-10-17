import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void constructor() {
        BankAccount testAccount = new BankAccount("John", "12345", 1234.56);
        assertEquals("John", testAccount.getName());
        assertEquals("12345", testAccount.getId());
        assertEquals(1234.56, testAccount.getBalance(), 0.001);
        assertThrows(IllegalArgumentException.class, () -> new BankAccount("John", "12345", -1));
    }

    @Test
    void setName() {
        BankAccount testAccount = new BankAccount("John", "12345", 1234.56);
        testAccount.setName("Jane");
        assertEquals("John", testAccount.getName());
    }


    @Test
    void setBalance() {
        BankAccount testAccount = new BankAccount("John", "12345", 1234.56);
        testAccount.setBalance(5678.91);
        assertEquals(5678.91, testAccount.getBalance(), 0.001);
    }

    @Test
    void setId() {
        BankAccount testAccount = new BankAccount("John", "12345", 1234.56);
        testAccount.setId("54321");
        assertEquals("54321", testAccount.getId());
    }
}
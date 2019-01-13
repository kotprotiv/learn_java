package ru.sbrf.banking;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @org.junit.jupiter.api.Test
    void depositPositiveAmount() {
        BankAccount ba = new BankAccount("Ivan", 100);
        boolean isSucceed = ba.deposit(50);
        assertEquals(150, ba.getBalance());
        assertTrue(isSucceed);

    }

    @org.junit.jupiter.api.Test
    void depositNegativeAmount() {
        BankAccount ba = new BankAccount("Ivan", 100);
        boolean isSucceed = ba.deposit(-50);
        assertEquals(100, ba.getBalance());
        assertFalse(isSucceed);

    }

    @org.junit.jupiter.api.Test
    void withdrawNormal() {
        BankAccount ba = new BankAccount("Ivan", 100);
        boolean isSucceed = ba.withdraw(50);
        assertEquals(50, ba.getBalance());
        assertTrue(isSucceed);
    }

    @org.junit.jupiter.api.Test
    void withdrawMoreThanHas() {
        BankAccount ba = new BankAccount("Ivan", 100);
        boolean isSucceed = ba.withdraw(200);
        assertEquals(100, ba.getBalance());
        assertFalse(isSucceed);
    }

//    @org.junit.jupiter.api.Test
//    void transfer() {
//    }
}
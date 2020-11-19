package com.moffice.corkbank;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TransactionServiceTest {

    TransactionService txnService = new TransactionService();

    @Test
    void testGetTxnsByAccountNumber() {
        Assertions.assertTrue(txnService.findAllByAccountNumber(5).size() == 5);
    }
}

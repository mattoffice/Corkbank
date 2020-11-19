package com.moffice.corkbank;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {

    List<Transaction> findAllByAccountNumber(Integer n) {
        List<Transaction> txns = new ArrayList<>();
        for (int i=0; i < n; i++) {
            Transaction txn = new Transaction();
            txns.add(txn);
        }
        return txns;
    }
}

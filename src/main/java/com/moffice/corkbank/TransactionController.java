package com.moffice.corkbank;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/transactions", produces="application/json")
public class TransactionController {

    private final TransactionService svc;

    public TransactionController(TransactionService svc) {
        this.svc = svc;
    }

    @GetMapping(path="/{accountNumber}", produces="application/json")
    public List<Transaction> getTxnsByAcctNumber(@PathVariable String accountNumber) {
        return svc.findAllByAccountNumber(4);
    }
}

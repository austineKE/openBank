package com.api.openBank.home;

import com.api.openBank.home.transactions.Transaction;
import com.api.openBank.service.TransactionDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Locale;

@RestController
public class OpenBankController {

    @Autowired
    TransactionDetails transactionDetails;

    @GetMapping("/transaction/list")
    List<Transaction> getAllTransactions() {
        return transactionDetails.getAllTransactions();

    }

    @GetMapping("/transaction/list/{type}")
    List<Transaction> transactionsInType(@PathVariable String type) {
        return transactionDetails.getAllTransactionsBasedOnType(type);
    }

    @GetMapping("/totalAmount/{type}")
    Double totalAmountInType(@PathVariable String type) {
        return transactionDetails.getTotalTransactionsAmountBasedOnType(type);
    }

}

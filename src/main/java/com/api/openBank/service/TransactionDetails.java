package com.api.openBank.service;

import com.api.openBank.home.transactions.Transaction;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TransactionDetails {
    List<Transaction> getAllTransactions();
    List<Transaction> getAllTransactionsBasedOnType(final String type);
    Double getTotalTransactionsAmountBasedOnType(final String type);
}

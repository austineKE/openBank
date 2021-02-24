package com.api.openBank.service;

import com.api.openBank.home.transactions.Transaction;
import com.api.openBank.util.DataStub;
import com.api.openBank.util.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@Service
public class TransactionsService implements TransactionDetails {

    @Autowired
    DataStub dataStub;


    @Override
    public List<Transaction> getAllTransactions() {
        return new ArrayList<>(dataStub.getData());
    }

    @Override
    public List<Transaction> getAllTransactionsBasedOnType(String type) {
        List<Transaction> transactions = new ArrayList<>();
        dataStub.getData().stream().filter(t->t.getDetails().getType().equalsIgnoreCase(type)).forEach(transactions::add);
        return transactions;
    }

    @Override
    public Double getTotalTransactionsAmountBasedOnType(String type) {
        AtomicReference<Double> aDouble = new AtomicReference(Double.valueOf(0.0));
        dataStub.getData().stream().filter(t -> t.getDetails().getType().equalsIgnoreCase(type))
                .forEach(t ->
                    aDouble.set(aDouble.get()+t.getDetails().getValue().getAmount())
                );
        return aDouble.get();
    }
}

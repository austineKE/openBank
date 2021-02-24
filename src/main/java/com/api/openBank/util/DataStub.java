package com.api.openBank.util;

import com.api.openBank.home.transactions.Transaction;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * I'm using the data stub object to emulate a data source.
 * I dont want to use a database at this point.
 * The moment we decide to read from a database, we delete
 * do away with this object.
 * It is here to provide as with the data we need to return
 */

@Component
public interface DataStub {
    List<Transaction> getData();
    List<Transaction> getAllTransactionsBasedOnType(final String type);
    Double getTotalTransactionsAmountBasedOnType(String type);
}

package com.api.openBank.util;

import com.api.openBank.enums.AccountType;
import com.api.openBank.home.transactions.*;
import org.springframework.stereotype.Component;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class Database {

    private Connection dbConnection() {
        Connection conn = null;
        try {
            String userName = "root";
            String password = "root";

            String url = "jdbc:mysql://localhost:3306/open_bank_db";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, password);
        } catch (Exception e) {
            System.err.println("Cannot connect to database server");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        return conn;
    }

    public List<Transaction> getTransactions() throws Exception {
        List<Transaction> transactions = new ArrayList<>();
        Connection conn = dbConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from transactions");
        while (rs.next()) {
            Transaction transaction = new Transaction();
            Details details = new Details();
            Value value = new Value();
            value.setAmount(rs.getDouble("amount"));
            value.setCurrency(rs.getString("currency"));
            details.setValue(value);
            details.setDescription(rs.getString("decription"));
            details.setType(rs.getString("account_type"));
            transaction.setDetails(details);
            transaction.setId(String.valueOf(rs.getInt("id")));
            OtherAccount otherAccount = new OtherAccount();
            Holder holder = new Holder();
            holder.setName(rs.getString("holder_name"));
            otherAccount.setHolder(holder);
            Metadata metadata = new Metadata();
            metadata.setImage_URL(rs.getString("image_url"));
            otherAccount.setMetadata(metadata);
            otherAccount.setNumber(rs.getString("account_number"));
            transaction.setOther_account(otherAccount);
            ThisAccount thisAccount = new ThisAccount();
            thisAccount.setId(String.valueOf(rs.getInt("id")));
            transaction.setThis_account(thisAccount);
            transactions.add(transaction);
        }
        conn.close();
        return transactions;
    }

    List<Transaction> getAllTransactionsBasedOnType(final String type) throws SQLException {

        List<Transaction> transactions = new ArrayList<>();
        Connection conn = dbConnection();
        Statement statement = conn.createStatement();
//        AccountType accountType=new AccountType(type);
//        accountType.getAccountType()
        ResultSet rs = statement.executeQuery("select * from transactions where account_type=?" + type);
        while (rs.next()) {
            Transaction transaction = new Transaction();
            Details details = new Details();
            Value value = new Value();
            value.setAmount(rs.getDouble("amount"));
            value.setCurrency(rs.getString("currency"));
            details.setValue(value);
            details.setDescription(rs.getString("decription"));
            details.setType(rs.getString("account_type"));
            transaction.setDetails(details);
            transaction.setId(String.valueOf(rs.getInt("id")));
            OtherAccount otherAccount = new OtherAccount();
            Holder holder = new Holder();
            holder.setName(rs.getString("holder_name"));
            otherAccount.setHolder(holder);
            Metadata metadata = new Metadata();
            metadata.setImage_URL(rs.getString("image_url"));
            otherAccount.setMetadata(metadata);
            otherAccount.setNumber(rs.getString("account_number"));
            transaction.setOther_account(otherAccount);
            ThisAccount thisAccount = new ThisAccount();
            thisAccount.setId(String.valueOf(rs.getInt("id")));
            transaction.setThis_account(thisAccount);
            transactions.add(transaction);
        }
        conn.close();
        return transactions;
    }

    Double getTotalTransactionsAmountBasedOnType(String type) throws SQLException {
        double transactionAmount = 0;
        Connection connection = dbConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select amount from transactions where account_type=?" + type);
        while (resultSet.next()) {
            Value value = new Value();
            Details details = new Details();
            value.setAmount(resultSet.getDouble("amount"));
            transactionAmount = value.getAmount();
        }
        return transactionAmount;
    }

    Boolean createTransaction(Transaction transaction) throws Exception {
        Transaction transaction1 = new Transaction();
//        id
//                account_id
//        account_number
//                holder_name
//        image_url
//                amount
//        currency
//                account_type
//        description

//        String id =

//        Connection connection=dbConnection();
//        Statement statement=connection.createStatement();
//        ResultSet resultSet=statement.executeQuery();
//    }

//}
        return false;
    }
}


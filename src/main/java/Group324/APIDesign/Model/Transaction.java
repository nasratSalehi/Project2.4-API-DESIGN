package Group324.APIDesign.Model;

import Group324.APIDesign.Enum.UserType;

import java.sql.Timestamp;

public class Transaction {
    private Timestamp timestamp;
    private Account accountFrom;
    private Account accountTo;
    private float amount;
    private User userPerforming;

    public Transaction(Timestamp timestamp, Account accountFrom, Account accountTo, float amount, User userPerforming) {
        this.timestamp = timestamp;
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.amount = amount;
        this.userPerforming = userPerforming;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Account getAccountFrom() {
        return accountFrom;
    }

    public void setAccountFrom(Account accountFrom) {
        this.accountFrom = accountFrom;
    }

    public Account getAccountTo() {
        return accountTo;
    }

    public void setAccountTo(Account accountTo) {
        this.accountTo = accountTo;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public User getUserPerforming() {
        return userPerforming;
    }

    public void setUserPerforming(User userPerforming) {
        this.userPerforming = userPerforming;
    }
}

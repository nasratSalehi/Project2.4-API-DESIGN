package Group324.APIDesign.Model;

import Group324.APIDesign.Enum.AccountType;

public class Account {
    //format NLxxINHO0xxxxxxxxx
    private String iban;
    private float balance;
    private AccountType accountType;
    private User user;

    public Account(String iban, float balance, AccountType accountType, User user) {
        this.iban = iban;
        this.balance = balance;
        this.accountType = accountType;
        this.user = user;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

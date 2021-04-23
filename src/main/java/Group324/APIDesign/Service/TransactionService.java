package Group324.APIDesign.Service;

import Group324.APIDesign.Enum.AccountType;
import Group324.APIDesign.Enum.UserType;
import Group324.APIDesign.Model.Account;
import Group324.APIDesign.Model.Transaction;
import Group324.APIDesign.Model.User;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {

    private List<Transaction> transactionList = new ArrayList<>();

    Account accountFrom = new Account("NLxxINHO0xxxxxxxxx", 50, AccountType.Current);
    Account accountTo = new Account("NLxxINHO0xxxxxxxxx", 100, AccountType.Current);
    User user = new User("bob", "bobob", "bob@mail.com", "bobstraat", "password",UserType.Employee, accountFrom);
    public TransactionService(){
        transactionList.add(new Transaction(Timestamp.from(Instant.now()), accountFrom, accountTo, 20, user));
    }

    public List<Transaction> getAllTransactions(){
        return transactionList;
    }
}

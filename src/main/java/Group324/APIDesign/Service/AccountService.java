package Group324.APIDesign.Service;

import Group324.APIDesign.Enum.AccountType;
import Group324.APIDesign.Enum.UserType;
import Group324.APIDesign.Model.Account;
import Group324.APIDesign.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {

    private List<Account> accountList = new ArrayList<>();

    public AccountService(){
        accountList.add(new Account("NLxxINHO0xxxxxxxxx", 50, AccountType.Current));
    }

    public List<Account> getAllAccounts(){
        return accountList;
    }


    public void addAccount(Account account){
        accountList.add(account);
    }

    public void deleteAccount(Account account){
        accountList.remove(account);
    }

    public List<Account> updateAccount(Account account1, Account account2){
        int index = accountList.indexOf(account1);
        accountList.set(index, account2);

        return accountList;
    }

}

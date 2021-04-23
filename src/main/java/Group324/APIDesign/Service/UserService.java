package Group324.APIDesign.Service;

import Group324.APIDesign.Enum.AccountType;
import Group324.APIDesign.Enum.UserType;
import Group324.APIDesign.Model.Account;
import Group324.APIDesign.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> userList = new ArrayList<>();
    public Account account = new Account("NLxxINHO0xxxxxxxxx", 50, AccountType.Current);
    public UserService(){
        userList.add(new User("bob", "bobob", "bob@mail.com", "bobstraat", "password", UserType.Employee, account));
    }

    public List<User> getAllUsers(){
        return userList;
    }


}

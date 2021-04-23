package Group324.APIDesign.Controller;

import Group324.APIDesign.Model.Account;
import Group324.APIDesign.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllAccounts(){
        List<Account> accountList = accountService.getAllAccounts();
        return ResponseEntity.status(200).body(accountList);
    }

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createAccount(@RequestBody Account account){
        accountService.addAccount(account);

        return ResponseEntity.status(HttpStatus.CREATED).body(account);
    }

    //@RequestMapping(method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    @DeleteMapping("accounts")
    public void deleteAccount(@PathVariable Account account){
        accountService.deleteAccount(account);
    }

    @PutMapping("accounts")
    public List<Account> replaceAccount(@RequestBody Account oldAccount, @RequestBody Account newAccount){
        List<Account> accountList = accountService.getAllAccounts();
        accountService.updateAccount(oldAccount, newAccount);

       return accountList;
    }



}

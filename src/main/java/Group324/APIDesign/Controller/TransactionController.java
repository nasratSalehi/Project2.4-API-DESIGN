package Group324.APIDesign.Controller;

import Group324.APIDesign.Model.Transaction;
import Group324.APIDesign.Service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllTransactions(){
        List<Transaction> transactions = transactionService.getAllTransactions();

        return ResponseEntity.status(200).body(transactions);
    }
}

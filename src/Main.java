import com.example.designpattern.adapter.state.Account;
import com.example.designpattern.adapter.state.solution.DepositTransaction;
import com.example.designpattern.adapter.state.solution.Transaction;

public class Main {
    public static void main(String[] args) {
  /*      var history = new EmployeeHistory();
        var employee = new Employee("James", (short) 1);
        history.push(employee.createState());
        employee = new Employee("James", (short) 2);
        history.push(employee.createState());
        employee = new Employee("James", (short) 3);
        history.push(employee.createState());
        employee = new Employee("James", (short) 4);
        history.push(employee.createState());
        employee = new Employee("James", (short) 5);
        history.push(employee.createState());

        employee.reStoreState(history.pop());
        employee.reStoreState(history.pop());*/

       /* manageTransaction(new DepositTransaction());*/

        /*    private static void manageTransaction(Transaction transaction) {

        transaction.getBalance(100000.0);
    }*/
        var account = new Account();
        account.setTransactionType(new DepositTransaction());
        account.getBalance(100000.0);
        account.returnTransactionType();
    }




}
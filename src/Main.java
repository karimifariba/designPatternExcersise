import com.example.designpattern.adapter.memento.Employee;
import com.example.designpattern.adapter.memento.EmployeeHistory;
import com.example.designpattern.adapter.state.Account;
import com.example.designpattern.adapter.state.solution.DepositTransaction;
import com.example.designpattern.adapter.state.solution.WithdrawTransaction;

public class Main {
    public static void main(String[] args) {
        var history = new EmployeeHistory();
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
        employee.reStoreState(history.pop());

    }
}
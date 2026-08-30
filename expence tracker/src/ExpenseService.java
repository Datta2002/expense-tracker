import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ExpenseService {
    private List<ExpenseData> expenseList = new ArrayList<>();
    private ExpenseFileFormat fileHandler;

    public ExpenseService(){
        fileHandler = new ExpenseFileFormat();
        expenseList=fileHandler.loadExpensesFromFile();
    }

    public void addExpense(String name, String description, int amount, String category, String modeOfPayment) {
        ExpenseData expense = new ExpenseData(name, description, amount, LocalDate.now(), category, modeOfPayment);
//        expenseList.add(expense); // Save to list
        fileHandler.savaExpenseToFile(expense);
        System.out.println("Expense Added Successfully into file");
    }

    public void displayData() {
        if (expenseList.isEmpty()) {
            System.out.println("No expenses found.");
            return;
        }
        for (ExpenseData expense : expenseList) {
            System.out.println(expense);
        }
    }
}
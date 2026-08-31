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
        expenseList.add(expense); // FIX: Uncommented this line so newly added expenses show up in memory immediately
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

    public void deleteExpense(String expenseName) {
        boolean isRemoved = false;
        for(int i=0;i<expenseList.size();i++){
            ExpenseData expense = expenseList.get(i);
            if(expense.getExpenseName().equals(expenseName)){
                expenseList.remove(i);
                isRemoved = true;
            }
        }

        if(isRemoved==true){
                fileHandler.saveAllExpensesToFile(expenseList);
        }
        else {
            System.out.println("Expense Not Found");
        }

    }

    public void editExpense(String expenseName, String expenseDescription, int expenseAmount) {
        boolean isEdited = false;
        for(int i=0;i<expenseList.size();i++){
            ExpenseData expense = expenseList.get(i);
            if(expense.getExpenseName().equals(expenseName)){
                expense.setDescription(expenseDescription);
                expense.setAmount(expenseAmount);
                isEdited = true;
                break;
            }
        }
        if(isEdited==true){
            fileHandler.saveAllExpensesToFile(expenseList);
        }
        else  {
            System.out.println("Expense Not Found");
        }
    }
}
import java.util.Scanner;

public class ExpenseTracker {
    static ExpenseService expenseService = new ExpenseService();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to ExpenseTracker");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Expense");
            System.out.println("2. Display All Expenses");
            System.out.println("5. Exit");
            System.out.print("Select option: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    addExpense();
                    break;
                case 2:
                    displayAllExpense();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    public static void addExpense() {
        System.out.println("Adding Expense");
        System.out.print("Enter Expense Name : ");
        String expenseName = input.nextLine();
        System.out.print("Enter Expense Description : ");
        String expenseDescription = input.nextLine();

        System.out.print("Enter Expense Amount : ");
        int expenseAmount = input.nextInt();
        input.nextLine();

        System.out.print("Enter Expense Category : ");
        String expenseCategory = input.nextLine();
        System.out.print("Enter ModeOfPayment : ");
        String expenseModeOfPayment = input.nextLine();

        expenseService.addExpense(expenseName, expenseDescription, expenseAmount, expenseCategory, expenseModeOfPayment);
        System.out.println("Expense Added Successfully");
    }

    public static void displayAllExpense() {
        System.out.println("--- All Expenses ---");
        expenseService.displayData();
    }
}
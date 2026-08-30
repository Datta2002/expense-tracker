import java.time.LocalDate;

public class ExpenseData {
    private String expenseName;
    private String description;
    private int amount;
    private LocalDate expenseDate;
    private String category;
    private String modeOfPayment;

    public ExpenseData() {
    }

    public ExpenseData(String expenseName, String description, int amount, LocalDate expenseDate, String category, String modeOfPayment) {
        this.expenseName = expenseName;
        this.description = description;
        this.amount = amount;
        this.expenseDate = expenseDate;
        this.category = category;
        this.modeOfPayment = modeOfPayment;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDate getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(LocalDate expenseDate) {
        this.expenseDate = expenseDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getModeOfPayment() {
        return modeOfPayment;
    }

    public void setModeOfPayment(String modeOfPayment) {
        this.modeOfPayment = modeOfPayment;
    }

    @Override
    public String toString() {
        return "ExpenseData{" +
                "expenseName='" + expenseName + '\'' +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", expenseDate=" + expenseDate +
                ", category='" + category + '\'' +
                ", modeOfPayment='" + modeOfPayment + '\'' +
                '}';
    }
}


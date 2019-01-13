import java.util.ArrayList;
import java.util.List;

/**
 * Class contains Expenses related functionaries
 */
public class Expense {

    String expenseName;
    Category category;
    int value;
    List<Expense> expenseTrack  = new ArrayList<Expense>();;

    public Expense() {

    }
    public Expense (String name, Category category, int value) {
        expenseName = name;
        this.category = category;
        this.value = value;

    }

    public List<Expense> getExpenses(String categoryType) {
        List<Expense> typeExpenses = new ArrayList<Expense>();
        Category cat = new Category();
        cat.setCatName(categoryType);
        for (Expense expense : expenseTrack) {
            if (expense.category.getCatName().equals(categoryType)) {
                typeExpenses.add(expense);
            }
        }
        return typeExpenses;

    }

    public void addExpense(Expense expense) {

        expenseTrack.add(expense);
    }

    public void changeCategoryType(Category newCategory) {
        category = newCategory;
    }

}

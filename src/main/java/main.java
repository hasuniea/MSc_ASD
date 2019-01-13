import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Budget Tracker Main
 */
public class main {
    public static void main(String[]args) {
        List<Expense> retrivedExpenses;
        Category food = new Category("Food", 4000);
        Category trans =  new Category("trans", 20000);

        int value = 100;
        String expenseName = "MyExpense_A";




        Expense expense_A = new Expense(expenseName,food, value);
        Expense expense_B = new Expense("MyExpense_B", food, 300);
        Expense expense_C = new Expense("MyExpense_C",trans, 3000);


        Expense expense = new Expense();
        // Add Expenses

        expense.addExpense(expense_A);
        expense.addExpense(expense_B);
        expense.addExpense(expense_C);

        expense.getExpenses("Food");

        // change expense C to food Category
        expense_C.changeCategoryType(food);


        // get Food expenses
        retrivedExpenses = expense.getExpenses("Food");
        retrivedExpenses.clear();


        // change Category Name
        food.setCatName("smallExpenses");

        retrivedExpenses = expense.getExpenses("smallExpenses");
        retrivedExpenses.clear();



        // get food budget
      int foodBudget = food.getBudgetValuer(food);


    }
}

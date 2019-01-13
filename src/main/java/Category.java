/**
 * Class contains Category related functionaries
 */
public class Category {
    int catID;

    public void setCatName(String catName) {
        this.catName = catName;
    }


    public String getCatName() {
        return catName;
    }

    String catName;

    public int getBudget() {
        return budget;
    }

    public int getBudgetValuer(Category type) {
        Category budget  = type;
          return  budget.getBudget();
    }

    int budget;

    public Category() {

    }

    public Category(String name, int budget) {
        catID += 1;
        catName = name;
        this.budget = budget;
    }

    public int setBudget() {
        return budget;
    }

}

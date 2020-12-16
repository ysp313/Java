public class Food {

    // attributs
    private String name;
    private int calories;

    // constructeurs
    public Food(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    // accesseurs (getters)
    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    // mutateurs (setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
package Medical_Information;

import Food.Meal;

public class FoodHabits {
    private String getUp;
    private Meal[] meals;

    public FoodHabits(String getUp, Meal[] meals) {
        this.getUp = getUp;
        this.meals = meals;
    }

    public String getGetUp() {
        return getUp;
    }

    public void setGetUp(String getUp) {
        this.getUp = getUp;
    }

    public Meal[] getMeals() {
        return meals;
    }

    public void setMeals(Meal[] meals) {
        this.meals = meals;
    }
}

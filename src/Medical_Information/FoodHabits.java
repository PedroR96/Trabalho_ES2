package Medical_Information;

import Food.Meal;

import java.util.ArrayList;

public class FoodHabits {
    private String getUp;
    private ArrayList<Meal> meals;

    public FoodHabits(String getUp, ArrayList<Meal> meals) {
        this.getUp = getUp;
        this.meals = meals;
    }

    public String getGetUp() {
        return getUp;
    }

    public void setGetUp(String getUp) {
        this.getUp = getUp;
    }

    public ArrayList<Meal> getMeals() {
        return meals;
    }

    public void setMeals(ArrayList<Meal> meals) {
        this.meals = meals;
    }
}

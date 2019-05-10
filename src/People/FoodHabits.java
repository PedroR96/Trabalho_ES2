package People;

import java.util.HashMap;

public class FoodHabits {
    private String getUp;
    private HashMap<String,String> breakfast;
    private HashMap<String,String> middleMorning;
    private HashMap<String,String> middleMorningTwo;
    private HashMap<String,String> lunch;
    private HashMap<String,String> snack;
    private HashMap<String,String> snackTwo;
    private HashMap<String,String> dinner;
    private HashMap<String,String> supper;

    public FoodHabits(String getUp, HashMap<String, String> breakfast, HashMap<String, String> middleMorning, HashMap<String, String> middleMorningTwo, HashMap<String, String> lunch, HashMap<String, String> snack, HashMap<String, String> snackTwo, HashMap<String, String> dinner, HashMap<String, String> supper) {
        this.getUp = getUp;
        this.breakfast = breakfast;
        this.middleMorning = middleMorning;
        this.middleMorningTwo = middleMorningTwo;
        this.lunch = lunch;
        this.snack = snack;
        this.snackTwo = snackTwo;
        this.dinner = dinner;
        this.supper = supper;
    }

    public String getGetUp() {
        return getUp;
    }

    public HashMap<String, String> getBreakfast() {
        return breakfast;
    }

    public HashMap<String, String> getMiddleMorning() {
        return middleMorning;
    }

    public HashMap<String, String> getMiddleMorningTwo() {
        return middleMorningTwo;
    }

    public HashMap<String, String> getLunch() {
        return lunch;
    }

    public HashMap<String, String> getSnack() {
        return snack;
    }

    public HashMap<String, String> getSnackTwo() {
        return snackTwo;
    }

    public HashMap<String, String> getDinner() {
        return dinner;
    }

    public HashMap<String, String> getSupper() {
        return supper;
    }
}

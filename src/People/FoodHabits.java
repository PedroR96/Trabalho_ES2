package People;

public class FoodHabits {
    private String getUp;
    private String breakfast;
    private String middleMorning;
    private String middleMorningTwo;
    private String lunch;
    private String snack;
    private String snackTwo;
    private String dinner;
    private String supper;

    public FoodHabits(String getUp, String breakfast, String middleMorning, String middleMorningTwo, String lunch, String snack, String snackTwo, String dinner, String supper) {
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

    public String getBreakfast() {
        return breakfast;
    }

    public String getMiddleMorning() {
        return middleMorning;
    }

    public String getMiddleMorningTwo() {
        return middleMorningTwo;
    }

    public String getLunch() {
        return lunch;
    }

    public String getSnack() {
        return snack;
    }

    public String getSnackTwo() {
        return snackTwo;
    }

    public String getDinner() {
        return dinner;
    }

    public String getSupper() {
        return supper;
    }
}

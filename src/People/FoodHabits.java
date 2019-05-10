package People;

public class FoodHabits {
    private String getUp;
    private String breakfast;
    private String middleMorning;
    private String middleMorningTwo;
    private String lunch;
    private String snak;
    private String snakTwo;
    private String dinner;
    private String supper;

    public FoodHabits(String getUp, String breakfast, String middleMorning, String middleMorningTwo, String lunch, String snak, String snakTwo, String dinner, String supper) {
        this.getUp = getUp;
        this.breakfast = breakfast;
        this.middleMorning = middleMorning;
        this.middleMorningTwo = middleMorningTwo;
        this.lunch = lunch;
        this.snak = snak;
        this.snakTwo = snakTwo;
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

    public String getSnak() {
        return snak;
    }

    public String getSnakTwo() {
        return snakTwo;
    }

    public String getDinner() {
        return dinner;
    }

    public String getSupper() {
        return supper;
    }
}

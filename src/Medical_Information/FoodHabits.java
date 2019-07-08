package Medical_Information;

import Food.Meal;
import Food.Product;
import java.sql.Time;
import java.util.ArrayList;

public class FoodHabits  {

    private String getUp;
    private ArrayList<Meal> meals = new ArrayList<>();


    public FoodHabits(String s)  {

        assert   s!=null;
        assert   !s.isEmpty();

        String[] allMeals = s.split(",");

        this.setGetUp(allMeals[0]);

        for (int i = 1; i < allMeals.length; i++) {
            Meal temp = new Meal();
            /**
             * Refeiçoes
             */
            if (i % 3 == 0) {

                /*** Descriçao*/
                temp.setDescription(allMeals[i-2]);
                /*** Hora*/

                String[] horas = allMeals[i - 1].split(":");
                Time time = new Time(Integer.parseInt(horas[0]),Integer.parseInt(horas[1]),0);
                temp.setSchedule(time);
                /*** Refeiçao*/
                String[] ref = allMeals[i].split(";");
                for (int j = 0; j < ref.length; j++) {
                    String[] refSplit = ref[j].split("/");
                    Product prod = new Product();
                    prod.setAmount(Float.parseFloat(refSplit[0]));
                    prod.setProductID(refSplit[1]);
                    /**
                     * Add prod to Meal
                     */
                    temp.setProducts(prod);
                }
                this.setMeals(temp);
            }
        }
    }


    public FoodHabits() {
    }


    public String getGetUp() {
        return getUp;
    }

    public void setGetUp(String getUp) {
        assert  getUp != null;
        assert getUp.length() == 5;
        assert !getUp.isEmpty();


        this.getUp = getUp;
    }

    public ArrayList<Meal> getMeals() {
        return meals;
    }

    public void setMeals(Meal meals) {
        assert meals!=null;
        this.meals.add(meals);
    }
}

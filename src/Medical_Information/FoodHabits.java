package Medical_Information;

import Food.Meal;
import Food.Product;
import People.MaxCharacters;

import java.sql.Time;
import java.util.ArrayList;

public class FoodHabits {

    private String getUp;
    private ArrayList<Meal> meals = new ArrayList<>();

    /**
     * @param s = specs from the file two
     */
    public FoodHabits(String s) throws MaxCharacters {
        //System.out.println(s);
        String[] allMeals = s.split(",");

        this.setGetUp(allMeals[0]);

        for (int i = 1; i < allMeals.length; i++) {
            Meal temp = new Meal();
            /**
             * Refeiçoes
             */
            if (i % 3 == 0) {

                /**
                 * Descriçao
                 */
                //System.out.println("\t " + allMeals[i - 2]);
                temp.setDescription(allMeals[i-2]);
                /**
                 * Hora
                 */
                //System.out.println("\t " + allMeals[i - 1]); = ﻿06:30
                String[] horas = allMeals[i - 1].split(":");
                Time time = new Time(Integer.parseInt(horas[0]),Integer.parseInt(horas[1]),0);
                temp.setSchedule(time);
                /**
                 * Refeiçao
                 */
                String[] ref = allMeals[i].split(";");
                for (int j = 0; j < ref.length; j++) {
                    String[] refSplit = ref[j].split("/");
                    //System.out.println("\t " + refSplit[0] + "    " +refSplit[1]);

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

    public FoodHabits(String getUp, ArrayList<Meal> meals) {
        this.getUp = getUp;
        this.meals = meals;
    }

    public String getGetUp() {
        return getUp;
    }

    public void setGetUp(String getUp) throws MaxCharacters {
        if (getUp.length() != 6)
            throw new MaxCharacters();
        this.getUp = getUp;
    }

    public ArrayList<Meal> getMeals() {
        return meals;
    }

    private void setMeals(Meal meals) {
        this.meals.add(meals);
    }
}

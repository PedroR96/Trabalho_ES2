import Food.NutricionalSpecs;
import Medical_Information.FoodHabits;
import People.MaxCharacters;
import People.Person;
import Utils.FileFunctions;

import java.util.HashMap;

public class Main {

    private static FileFunctions fileFunctions = new FileFunctions();

    private static HashMap<String, NutricionalSpecs> productNutricionalSpecs = new HashMap<>();
    private static Person person= new Person();

    public static void main(String[] args) throws MaxCharacters {

        /**
         * Upload Nutricional table to hashmap
         */
        productNutricionalSpecs = fileFunctions.readCSV();

        /**
         * Upload Folha 2
         */
        FoodHabits oldHabits = fileFunctions.readFiletwo("Escolha a Folha 2");
        person.setFoodHabits(oldHabits);
        /**
         * Upload Folha 4
         */
        FoodHabits newHabits = fileFunctions.readFiletwo("Escolha a Folha 4");
        person.setNewPlan(newHabits);

        System.out.println("GET UP FOLHA 2 " + person.getFoodHabits().getGetUp());

        System.out.println("GET UP FOLHA 4 " + person.getNewPlan().getGetUp());







    }


}

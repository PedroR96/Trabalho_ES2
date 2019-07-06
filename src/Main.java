import Food.Meal;
import Food.NutricionalSpecs;
import Food.Product;
import Medical_Information.FoodHabits;
import Medical_Information.Physical_Data;
import People.MaxCharacters;
import People.Person;
import Utils.CalculosxD;
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
         * Upload Folha 1
         */
        person=fileFunctions.readFileOne("Escolha a Folha 1");

        /**
         * Upload Folha 2
         */
        FoodHabits oldHabits = fileFunctions.readFiletwo("Escolha a Folha 2");
        person.setFoodHabits(oldHabits);

        /**
         * Upload Folha 3
         */
        Physical_Data physicalData = fileFunctions.readFileThree("Escolha a Folha 3");
        person.setPhysicalData(physicalData);



        /**
         * Upload Folha 4
         */
        FoodHabits newHabits = fileFunctions.readFiletwo("Escolha a Folha 4");
        person.setNewPlan(newHabits);
//
//        System.out.println("GET UP FOLHA 2 " + person.getFoodHabits().getMeals().get(0).getSchedule());
//
//        System.out.println("GET UP FOLHA 4 " + person.getNewPlan().getGetUp());
//
//        System.out.println("PD FOLHA 3 " + person.getPhysicalData().getHeight());

//        CalculosxD calculosxD=new CalculosxD();
//      calculosxD.calculateEnergyUsingHarris(65f,1.65f,43,"Feminino","Acamado","38","Fratura ossos longos");

Float energyTotal=0f;
         for(Meal meal : person.getNewPlan().getMeals()){
             System.out.println("Meal: "+meal.getDescription());

                     for(Product prod:meal.getProducts()){


                         System.out.println("\tProduct: "+ productNutricionalSpecs.get(prod.getProductID()).getName());

                         System.out.println("\tAmount: " + prod.getAmount());
                         System.out.println("\tKcla por 100: "+ productNutricionalSpecs.get(prod.getProductID()).getEnergiaKCla());
//
//                         System.out.println(productNutricionalSpecs.get(prod.getProductID()).getEnergiaKCla().floatValue()/100.0f);
//                         System.out.println((productNutricionalSpecs.get(prod.getProductID()).getEnergiaKCla().floatValue()/100.0f)*5.0f);
//
//                         System.out.println("\tCalorias: "+(productNutricionalSpecs.get(prod.getProductID()).getEnergiaKCla()/100.0f)*prod.getAmount());
//                         System.out.println(+"/100 * "+prod.getAmount()+"="+ (productNutricionalSpecs.get(prod.getProductID()).getEnergiaKCla()/100)*prod.getAmount());

                         System.out.println("\tCalorias ingeridas: "+(productNutricionalSpecs.get(prod.getProductID()).getEnergiaKCla().floatValue()/100.0f)*prod.getAmount());
                          energyTotal+=((productNutricionalSpecs.get(prod.getProductID()).getEnergiaKCla().floatValue()/100.0f)*prod.getAmount());
                         System.out.println("");
                     }
             System.out.println("\n   ");

         }


         System.out.println("Total de Calorias ingeridas: "+energyTotal);







    }


}

import Food.NutricionalSpecs;
import Medical_Information.FoodHabits;
import People.Person;
import Utils.CalculosxD;
import Utils.FileFunctions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Main {

    private static FileFunctions fileFunctions = new FileFunctions();

    private static HashMap<String, NutricionalSpecs> productNutricionalSpecs = new HashMap<>();
    private static Person person= new Person();

    public static void main(String[] args)  {

        /**
         * Upload Nutricional table to hashmap
         */
        productNutricionalSpecs = fileFunctions.readCSV("Assets/CALCULOCSV.csv");

        /**
         * Upload Folha 1
         */
        person=fileFunctions.readFileOne();

        /**
         * Upload Folha 2
         */
        FoodHabits oldHabits = fileFunctions.readFiletwo();
        person.setFoodHabits(oldHabits);

        /**
         * Upload Folha 3
         */
                person.setPhysicalData(  fileFunctions.readFileThree());



        /**
         * Upload Folha 4
         */
        person.setNewPlan(fileFunctions.readFileFour());



        CalculosxD calulo=new CalculosxD();
        NutricionalSpecs  newPlanNutricionalSpecifications= calulo.calculateTotalNutrientsPlan(person.getNewPlan(),productNutricionalSpecs);
        NutricionalSpecs  oldPlanNutricionalSpecifications= calulo.calculateTotalNutrientsPlan(person.getFoodHabits(),productNutricionalSpecs);
        String toCSV="Old Plan \n"+oldPlanNutricionalSpecifications.nutricionalSpecsToString()+"\nNew Plan\n"+newPlanNutricionalSpecifications.nutricionalSpecsToString();
//               calulo.calculateEnergyUsingHarris(person.getPhysicalData().getWeight(),person.getPhysicalData().getHeight()*100,person.getAge(),person.getGender(),person.getQuiz().getPhisicalActivity(),38,"Acamado");

        Date date = new Date();SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy_HHmm");

        Path file = Paths.get("Assets/"+person.getName()+"_"+formatter.format(date)+".csv");
        try {

            Files.write(file, toCSV.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }






}

import Food.Meal;
import Food.NutricionalSpecs;
import Food.Product;
import Medical_Information.FoodHabits;
import Utils.FileFunctions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class FoodHabitsTest {


    @Test
    void testeNCamposCorretos(){
        HashMap<String, NutricionalSpecs> hm ;
        FileFunctions fileFunctions = new FileFunctions();
        hm = fileFunctions.readCSV();
        System.out.println(hm);

        NutricionalSpecs ns  =hm.get("IS555");
        System.out.println(ns.getProductID());
        System.out.println(ns.getAgua());




    }

}
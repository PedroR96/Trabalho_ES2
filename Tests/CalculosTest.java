import Food.NutricionalSpecs;
import Medical_Information.FoodHabits;
import Utils.CalculosxD;
import Utils.FileFunctions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculosTest {

    @Test
    void testCalculateTotalNutrientsPlanNullValues() {

        CalculosxD cal = new CalculosxD();
        FoodHabits nFH = null;
        HashMap<String, NutricionalSpecs> nP = new HashMap<>();
        assertThrows(AssertionError.class, () -> cal.calculateTotalNutrientsPlan(nFH, nP));
    }

    @Test
    void testCalculateTotalNutrientsPlanFoodHabitsNullValue() {

        CalculosxD cal = new CalculosxD();
        FoodHabits nFH = new FoodHabits();
        HashMap<String, NutricionalSpecs> nP = null;
        assertThrows(AssertionError.class, () -> cal.calculateTotalNutrientsPlan(nFH, nP));
    }

    @Test
    void testCalculateTotalNutrientsPlan() {

        CalculosxD cal = new CalculosxD();
        FileFunctions fileFunctions = new FileFunctions();
        //FoodHabits nFH = new FoodHabits();
        String x = "09:00,Pequeno almoço,09:30,5/IS093;3/IS094,Meio da manha,10:00,1/IS432,Almoço,12:00,2/IS781,Meio da tarde,16:00,3/IS478,Jantar,20:00,1/IS377,Ceia,22:00,1/IS698";
        FoodHabits nFH = new FoodHabits(x);

        HashMap<String, NutricionalSpecs> np = fileFunctions.readCSV("Assets/CALCULOCSV.csv");
        cal.calculateTotalNutrientsPlan(nFH, np);



    }

}
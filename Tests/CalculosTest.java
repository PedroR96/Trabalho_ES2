import Food.NutricionalSpecs;
import Medical_Information.FoodHabits;
import Utils.CalculosxD;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculosTest {

    @Test
    void testCalculateTotalNutrientsPlanNullValues(){

        CalculosxD cal = new CalculosxD();
        FoodHabits nFH = null;
        HashMap<String, NutricionalSpecs> nP = new HashMap<>();
        assertThrows(AssertionError.class,()-> cal.calculateTotalNutrientsPlan(nFH,nP));
    }

    @Test
    void testCalculateTotalNutrientsPlanFoodHabitsNullValue(){

        CalculosxD cal = new CalculosxD();
        FoodHabits nFH = new FoodHabits();
        HashMap<String, NutricionalSpecs> nP = null;
        assertThrows(AssertionError.class,()-> cal.calculateTotalNutrientsPlan(nFH,nP));
    }

    @Test
    void testCalculateTotalNutrientsPlan(){

        CalculosxD cal = new CalculosxD();
        FoodHabits nFH = new FoodHabits();
        HashMap<String, NutricionalSpecs> nP = new HashMap<>();
        assertThrows(AssertionError.class,()-> cal.calculateTotalNutrientsPlan(nFH,nP));
    }

}
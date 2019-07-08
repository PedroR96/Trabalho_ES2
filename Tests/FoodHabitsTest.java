import Food.Meal;
import Food.NutricionalSpecs;
import Food.Product;
import Medical_Information.FoodHabits;
import Utils.FileFunctions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class FoodHabitsTest {


//    @Test
//    void testConstructor(){
//
//        String x="09:00,Pequeno almoço,09:30,5/IS093;3/IS094,Meio da manha,10:00,1/IS432,Almoço,12:00,2/IS781,Meio da tarde,16:00,3/IS478,Jantar,20:00,1/IS377,Ceia,22:00,1/IS698,";
//        FoodHabits plan=new FoodHabits(x);
//        assertNotEquals(plan,null);
//
//    }

    @Test
    void testFoodHabitsGetUpDiferentFromSix(){
        FoodHabits foodHabits=new FoodHabits();
        assertThrows(AssertionError.class,()->foodHabits.setGetUp(""));
    }

    @Test
    void testFoodHabitsGetUpNull(){
        FoodHabits foodHabits=new FoodHabits();
        assertThrows(AssertionError.class,()->foodHabits.setGetUp(null));
    }
    @Test
    void testFoodHabitsGetUpEmpty(){
        FoodHabits foodHabits=new FoodHabits();
        assertThrows(AssertionError.class,()->foodHabits.setGetUp(""));
    }



    @Test
    void testFoodHabitsGetUpValid(){
        FoodHabits foodHabits=new FoodHabits();
        foodHabits.setGetUp("09:00");

        assertEquals("09:00",foodHabits.getGetUp());
    }



    @Test
    void testFoodHabitsSetMealValid(){
        FoodHabits foodHabits=new FoodHabits();
        Meal meal1=new Meal();
        Meal meal2=new Meal();
        ArrayList<Meal> meals = new ArrayList<>();
        foodHabits.setMeals(meal1);
        foodHabits.setMeals(meal2);
        meals.add(meal1);
        meals.add(meal2);
        assertEquals(meals,foodHabits.getMeals());
    }
    @Test
    void testFoodHabitsSetMealNull(){
        FoodHabits foodHabits=new FoodHabits();
        assertThrows(AssertionError.class,()->foodHabits.setMeals(null));
    }

    @Test
    void testFoodHabitsConstructorEmpty(){
        assertThrows(AssertionError.class,()->new FoodHabits(""));
    }

    @Test
    void testFoodHabitsConstructorNull(){
        assertThrows(AssertionError.class,()->new FoodHabits(null));
    }


}
import Food.Meal;
import Food.Product;
import org.junit.jupiter.api.Test;

import java.sql.Time;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MealTest {

    @Test
    void testMealDescriptionValid(){
        Meal meal=new Meal();
        meal.setDescription("Pequeno-Almoço");
        assertEquals("Pequeno-Almoço",meal.getDescription());
    }

    @Test
    void testMealDescriptionNull(){
        Meal meal=new Meal();
        assertThrows(AssertionError.class,()-> meal.setDescription(null));

    }

    @Test
    void testMealDescriptionEmpty(){
        Meal meal=new Meal();
        assertThrows(AssertionError.class,()-> meal.setDescription(""));
    }

    @Test
    void testMealDescriptionBiggerThanMax(){
        Meal meal=new Meal();
        assertThrows(AssertionError.class,()-> meal.setDescription("123456789012345678901234567890123456789012345678901"));
    }

    @Test
    void testMealTimeNull(){
        Meal meal=new Meal();
        assertThrows(AssertionError.class,()-> meal.setSchedule(null));
    }

    @Test
    void testMealTimeValid(){
        Meal meal=new Meal();
        assertThrows(AssertionError.class,()-> meal.setSchedule(new Time(19,20,00)));
    }

    @Test
    void testMealProductsNull(){
        Meal meal=new Meal();
        assertThrows(AssertionError.class,()-> meal.setProducts(null));
    }

    @Test
    void testMealProductsValid(){
        Meal meal=new Meal();
        Product product= new Product();
        meal.setProducts(product);
        ArrayList<Product> productArrayList=new ArrayList<>();
        productArrayList.add(product);

        assertEquals(productArrayList,meal.getProducts());
    }
}
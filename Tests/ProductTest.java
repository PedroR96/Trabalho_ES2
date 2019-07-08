import Food.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {


    @Test
    void testProductProductIDNull(){
        Product product=new Product();
        assertThrows(AssertionError.class,()->product.setProductID(null));
    }

    @Test
    void testProductProductIDEmpty(){
        Product product=new Product();
        assertThrows(AssertionError.class,()->product.setProductID(""));
    }

    @Test
    void testProductProductIDBiggerThanMax(){
        Product product=new Product();
        assertThrows(AssertionError.class,()->product.setProductID("12345678901234567890123456789012345678901234567890"));
    }

    @Test
    void testProductProductIDValid(){
        Product product=new Product();
        product.setProductID("IS1563");
      assertEquals("IS1563",product.getProductID());
    }

    @Test
    void testProductAmountValid(){
        Product product=new Product();
        product.setAmount(150f);
        assertEquals(150f,product.getAmount());
    }

    @Test
    void testProductAmountNull(){
        Product product=new Product();
        assertThrows(AssertionError.class,()-> product.setAmount(null));

    }

    @Test
    void testProductAmountLesserThanZero(){
        Product product=new Product();
        assertThrows(AssertionError.class,()-> product.setAmount(0f));
    }

    @Test
    void testProductAmountDescriptionValid(){
        Product product=new Product();
        product.setAmountDescription("4 colheres de sopa");
        assertEquals("4 colheres de sopa",product.getAmountDescription());
    }
    @Test
    void testProductAmountDescriptionNull(){
        Product product=new Product();
        assertThrows(AssertionError.class,()->product.setAmountDescription(null));
    }

    @Test
    void testProductAmountDescriptionEmpty(){
        Product product=new Product();
        assertThrows(AssertionError.class,()->product.setAmountDescription(""));
    }

    @Test
    void testProductAmountDescriptionBiggerThanMax(){
        Product product=new Product();
        assertThrows(AssertionError.class,()->product.setAmountDescription("12345678901234567890123456789012345678901234567890"));
    }


}
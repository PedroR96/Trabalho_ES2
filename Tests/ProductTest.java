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
    void testProductProductIDLesserThanMin(){
        Product product=new Product();
        assertThrows(AssertionError.class,()->product.setProductID("IS"));
    }

    @Test
    void testProductProductIDBiggerThanMax(){
        Product product=new Product();
        assertThrows(AssertionError.class,()->product.setProductID("12345678901234567890123456789012345678901234567890"));
    }


    @Test
    void testProductProductIDValid(){
        Product product=new Product();
        product.setProductID("IS1");
      assertEquals("IS1",product.getProductID());
        product.setProductID("IS34567890123456789012345678901234567890123456789");
        assertEquals("IS34567890123456789012345678901234567890123456789",product.getProductID());
    }

//_____________________________________________


    @Test
    void testProductAmountValid(){
        Product product=new Product();
        product.setAmount(0f);
        assertEquals(0f,product.getAmount());
        product.setAmount(4999.9f);
        assertEquals(4999.9f,product.getAmount());
    }

    @Test
    void testProductAmountNull(){
        Product product=new Product();
        assertThrows(AssertionError.class,()-> product.setAmount(null));

    }

    @Test
    void testProductAmountLesserThanMin(){
        Product product=new Product();
        assertThrows(AssertionError.class,()-> product.setAmount(-0.1f));
    }

    @Test
    void testProductAmountBiggerThanMax(){
        Product product=new Product();
        assertThrows(AssertionError.class,()-> product.setAmount(5000.0f));
    }

    //_____________________________________________




    @Test
    void testProductAmountDescriptionValid(){
        Product product=new Product();
        product.setAmountDescription("4");
        assertEquals("4",product.getAmountDescription());
        product.setAmountDescription("1234567890123456789012345678901234567890123456789");
        assertEquals("1234567890123456789012345678901234567890123456789",product.getAmountDescription());
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
import Food.NutricionalSpecs;
import People.MaxCharacters;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.plaf.FontUIResource;
import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class NutricionalSpecsTest {

    @BeforeEach
    void setUp() {
    }


    /**
     * Tests from ProductID
     * @throws MaxCharacters
     */
    @Test
    void testProductIDRight() throws MaxCharacters {
        NutricionalSpecs ns = new NutricionalSpecs();

        ns.setProductID("IS019");

        assertEquals("IS019",ns.getProductID());
    }

    @Test
    void testProductIDNull(){
        NutricionalSpecs ns =  new NutricionalSpecs();

        assertThrows(NullPointerException.class,()->{
            ns.setProductID(null);
            ns.getProductID();
        });
    }


    @Test
    void testProductIDBigger(){
        NutricionalSpecs ns = new NutricionalSpecs();

        assertThrows(MaxCharacters.class,()->{
            ns.setProductID("sdefrgthyju");
            ns.getProductID();
        });
    }

    @Test
    void testProductIDSmaller(){
        NutricionalSpecs ns = new NutricionalSpecs();

        assertThrows(MaxCharacters.class,()->{
            ns.setProductID("12");
            ns.getProductID();
        });
    }

    /**
     * Tests from Name of product
     * @throws MaxCharacters
     */
    @Test
    void testNameRight() throws MaxCharacters {
        NutricionalSpecs ns = new NutricionalSpecs();

        ns.setName("Leite de Ovelha cru");
        assertEquals("Leite de Ovelha cru",ns.getName());
    }

    @Test
    void testNameNull(){
        NutricionalSpecs ns = new NutricionalSpecs();

        assertThrows(NullPointerException.class,()->{
           ns.setName(null);
           ns.getName();
        });
    }

    @Test
    void testNameBigger(){
        NutricionalSpecs ns = new NutricionalSpecs();

        assertThrows(MaxCharacters.class,()->{
            ns.setName("qwsedrtferdaesrdftgvcfdergvbhfdertgfdetvjjokjhgfdej");
            ns.getName();
        });
    }

    @Test
    void testNameSmaller(){
        NutricionalSpecs ns = new NutricionalSpecs();

        assertThrows(MaxCharacters.class,()->{
            ns.setName("q");
            ns.getName();
        });
    }

    /**
     * Tests from energiaKCla of product
     */

    @Test
    void testEnergyKClaRight() throws MaxCharacters {
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setEnergiaKCla(352);
        assertEquals(352,ns.getEnergiaKCla());
    }

    @Test
    void testEnergyKClaBigger() {
        NutricionalSpecs ns = new NutricionalSpecs();

        assertThrows(MaxCharacters.class,()->{
            ns.setEnergiaKCla(1001);
            ns.getEnergiaKCla();
        });
    }

    @Test
    void testEnergyKClaSmaller() {
        NutricionalSpecs ns = new NutricionalSpecs();

        assertThrows(MaxCharacters.class,()->{
            ns.setEnergiaKCla(1001);
            ns.getEnergiaKCla();
        });
    }

    /**
     *tests from energiaKj of products
     */
    @Test
    void testEnergyKJRight() throws MaxCharacters {
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setEnergiaKj(125);
        assertEquals(125,ns.getEnergiaKj());
    }
    @Test
    void testEnergyKjBigger() {
        NutricionalSpecs ns = new NutricionalSpecs();

        assertThrows(MaxCharacters.class,()->{
           ns.setEnergiaKj(4501);
           ns.getEnergiaKj();
        });
    }
    @Test
    void testEnergyKjSmaller() {
        NutricionalSpecs ns = new NutricionalSpecs();

        assertThrows(MaxCharacters.class,()->{
            ns.setEnergiaKj(-1);
            ns.getEnergiaKj();
        });
    }

    /**
     *test from water of products
     */
    @Test
    void testWaterRight() throws MaxCharacters {
        NutricionalSpecs ns = new NutricionalSpecs();

        ns.setAgua((float) 25.3);
        assertEquals((float)25.3,ns.getAgua());
    }

    @Test
    void testWaterBigger(){
        NutricionalSpecs ns = new NutricionalSpecs();

        assertThrows(MaxCharacters.class,()->{
           ns.setAgua((float)100.1);
           ns.getAgua();
        });
    }

    @Test
    void testWaterSmaller(){
        NutricionalSpecs ns = new NutricionalSpecs();

        assertThrows(MaxCharacters.class,()->{
            ns.setAgua((float)1.4);
            ns.getAgua();
        });
    }

    /**
     * test from Protein of product
     */
    @Test
    void testProteinRight() throws MaxCharacters {
        NutricionalSpecs ns =new NutricionalSpecs();
        ns.setProteina((float) 20.2);
        assertEquals((float)20.2,ns.getProteina());
    }
}
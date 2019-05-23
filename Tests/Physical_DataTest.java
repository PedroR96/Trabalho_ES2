import Medical_Information.Physical_Data;

import People.MaxCharacters;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Physical_DataTest {

    /**
     * Test to  get the weight from a Physical_data class
     */
    @Test
    void checkWeightLimitsBigger() {
        Physical_Data weightbigger = new Physical_Data();
        assertThrows(MaxCharacters.class, ()->{
            weightbigger.setWeight((float) 758.25);
            weightbigger.getWeight();
        });
    }

    @Test
    void checkWeightLimitSmaller(){
        Physical_Data weightsmaller = new Physical_Data();
        assertThrows(MaxCharacters.class,()->{
           weightsmaller.setWeight((float)1.2);
           weightsmaller.getWeight();
        });
    }

    @Test
    void checkWeight(){
        Physical_Data weight = new Physical_Data();

    }

    /**
     * Test to  get the Height from a Physical_data class
     */
    @Test
    void checkHeight(){
        Physical_Data n1 = new Physical_Data();

        assertEquals(180, n1.getHeight());
    }
    /**
     * Test to  get the IMC from a Physical_data class
     */
    @Test
    void checkIMC(){
        Physical_Data n1 = new Physical_Data();
        assertEquals(182, n1.getIMC());
    }


    /**
     * Test to  get the BF from a Physical_data class
     */

    @Test
    void testGetBF(){
        Physical_Data n1 = new Physical_Data();
        assertEquals(40, n1.getBF());
    }
    /**
     * Test to  get the viseralfat from a Physical_data class
     */

    @Test
    void testGetViseralFat(){
        Physical_Data n1 = new Physical_Data();
        assertEquals(20, n1.getVisceralFat());
    }
    /**
     * Test to  get the muscle from a Physical_data class
     */
    @Test
    void testGetMuscle(){
        Physical_Data n1 = new Physical_Data();
        assertEquals(10, n1.getMuscle());
    }

    /**
     * Test to  get the metabolicage from a Physical_data class
     */
    @Test
    void testGetMetabolicAge(){
        Physical_Data n1 = new Physical_Data();
        assertEquals(20, n1.getMetabolicAge());
    }
    /**
     * Test to  get the H20 from a Physical_data class
     */
    @Test
    void testGetH20(){
        Physical_Data n1 = new Physical_Data();
        assertEquals(70, n1.getH2O());
    }
    /**
     * Test to  get the Metabolicbasal from a Physical_data class
     */
    @Test
    void testGetMetabolicBasal(){
        Physical_Data n1 = new Physical_Data();
        assertEquals(20, n1.getMetabolicBasal());
    }
    /**
     * Test to  get the bone from a Physical_data class
     */
    @Test
    void testGetBone(){
        Physical_Data n1 = new Physical_Data();
        assertEquals(214, n1.getBone());
    }
}
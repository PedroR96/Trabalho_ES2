import Medical_Information.Physical_Data;

import People.MaxCharacters;
import Utils.DecimalFloat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Physical_DataTest {

    /**
     * Test to  get the weight from a Physical_data class
     */
    @Test
    void checkWeightLimitsBigger(){
        Physical_Data weight = new Physical_Data();

        assertThrows(MaxCharacters.class,()->{
            weight.setWeight((float)800.0);
            weight.getWeight();
        });
    }

    @Test
    void checkWeightLimitsSmaller(){
        Physical_Data weight = new Physical_Data();

        assertThrows(MaxCharacters.class,()->{
            weight.setWeight((float)1.0);
            weight.getWeight();
        });
    }
    @Test
    void checkWeight() throws MaxCharacters {
        Physical_Data weight = new Physical_Data();
        weight.setWeight((float) 70);
        assertEquals(70, weight.getWeight());
    }

    /**
     * Test to  get the Height from a Physical_data class
     */
    @Test
    void checkHeight() throws MaxCharacters {
        Physical_Data height = new Physical_Data();
        height.setHeight((float)180);
        assertEquals(180, height.getHeight());
    }

    @Test
    void checkHeightBigger() {
        Physical_Data height = new Physical_Data();

        assertThrows(MaxCharacters.class,()->{
            height.setHeight((float)300);
            height.getHeight();
        });
    }
    @Test
    void checkHeightSmaller() {
        Physical_Data height = new Physical_Data();

        assertThrows(MaxCharacters.class,()->{
            height.setHeight((float)10.20);
            height.getHeight();
        });
    }
    /**
     * Test to  get the IMC from a Physical_data class
     */
    @Test
    void checkIMC() throws MaxCharacters {
        Physical_Data IMC = new Physical_Data();
        DecimalFloat df = new DecimalFloat();

        IMC.setIMC( df.round((float) 8.1,2));
        assertEquals(df.round((float) 8.1,2), IMC.getIMC());
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
    /**     * Test to  get the bone from a Physical_data class
     */
    @Test
    void testGetBone(){
        Physical_Data n1 = new Physical_Data();
        assertEquals(214, n1.getBone());
    }
}
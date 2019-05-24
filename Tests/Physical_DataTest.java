import Medical_Information.Physical_Data;

import People.MaxCharacters;
import Utils.DecimalFloat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import javax.crypto.Mac;

import static org.junit.jupiter.api.Assertions.*;

class Physical_DataTest {

    /**
     * Test to  get the weight from a Physical_data class
     */
    @Test
    void checkWeightLimitsBigger(){
        Physical_Data weight = new Physical_Data();

        assertThrows(MaxCharacters.class,()->{
            weight.setWeight((float)635.1);
            weight.getWeight();
        });
    }

    @Test
    void checkWeightLimitsSmaller(){
        Physical_Data weight = new Physical_Data();

        assertThrows(MaxCharacters.class,()->{
            weight.setWeight((float)2.0);
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
            height.setHeight((float)272.1);
            height.getHeight();
        });
    }
    @Test
    void checkHeightSmaller() {
        Physical_Data height = new Physical_Data();

        assertThrows(MaxCharacters.class,()->{
            height.setHeight((float)54.4);
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

    @Test
    void checkIMCBigger() throws MaxCharacters {
        Physical_Data IMC = new Physical_Data();
        DecimalFloat df = new DecimalFloat();
        assertThrows(MaxCharacters.class,()->{
            IMC.setIMC( df.round((float) 30.01,2));
            IMC.getIMC();
        });
    }

    @Test
    void checkIMCSmaller() throws MaxCharacters {
        Physical_Data IMC = new Physical_Data();
        DecimalFloat df = new DecimalFloat();

        assertThrows(MaxCharacters.class,()->{
            IMC.setIMC( df.round((float) 1.9,2));
            IMC.getIMC();
        });
    }


    /**
     * Test to  get the BF from a Physical_data class
     */

    @Test
    void testGetBF() throws MaxCharacters {
        Physical_Data n1 = new Physical_Data();
        DecimalFloat df = new DecimalFloat();
        n1.setBF(df.round((float)40.2,2));
        assertEquals(df.round((float)40.2,2), n1.getBF());
    }

    @Test
    void testBFBigger(){
        Physical_Data BF =  new Physical_Data();
        DecimalFloat df = new DecimalFloat();
        assertThrows(MaxCharacters.class,()->{
            BF.setBF(df.round((float)50.1,2));
            BF.getBF();
        });
    }

    @Test
    void testBFSmaller(){
        Physical_Data BF =  new Physical_Data();
        assertThrows(MaxCharacters.class,()->{
            BF.setBF((float)4.9);
            BF.getBF();
        });
    }

    /**
     * Test to  get the viseralfat from a Physical_data class
     */

    @Test
    void testGetViseralFat() throws MaxCharacters {
        Physical_Data n1 = new Physical_Data();
        DecimalFloat df = new DecimalFloat();
        n1.setVisceralFat(df.round((float)20.2,2));
        assertEquals(df.round((float)20.2,2), n1.getVisceralFat());
    }

    @Test
    void testGetViseralFatBigger(){
        Physical_Data viseralFat = new Physical_Data();
        assertThrows(MaxCharacters.class,()->{
           viseralFat.setVisceralFat((float) 60.1);
           viseralFat.getVisceralFat();
        });
    }

    @Test
    void testGetViseralFatSmaller(){
        Physical_Data viseralFat = new Physical_Data();
        assertThrows(MaxCharacters.class,()->{
           viseralFat.setVisceralFat((float) -0.1);
           viseralFat.getVisceralFat();
        });
    }
    /**
     * Test to  get the muscle from a Physical_data class
     */
    @Test
    void testGetMuscle() throws MaxCharacters {
        Physical_Data muscle = new Physical_Data();
        DecimalFloat df = new DecimalFloat();
        muscle.setMuscle(df.round((float)15.25,2));
        assertEquals(df.round((float)15.25,2), muscle.getMuscle());
    }

    @Test
    void testGetMuscleBigger(){
        Physical_Data muscle = new Physical_Data();
        assertThrows(MaxCharacters.class,()->{
           muscle.setMuscle((float)90.1);
           muscle.getMuscle();
        });
    }

    @Test
    void testGetMuscleSmaller(){
        Physical_Data muscle = new Physical_Data();
        assertThrows(MaxCharacters.class,()->{
            muscle.setMuscle((float)-0.1);
            muscle.getMuscle();
        });
    }

    /**
     * Test to  get the metabolicage from a Physical_data class
     */
    @Test
    void testGetMetabolicAge() throws MaxCharacters {
        Physical_Data metabolicAge = new Physical_Data();
        DecimalFloat df = new DecimalFloat();
        metabolicAge.setMetabolicAge(25);
        assertEquals(25, metabolicAge.getMetabolicAge());
    }
    @Test
    void testGetMetabolicAgeBigger() throws MaxCharacters {
        Physical_Data metabolicAge = new Physical_Data();
        assertThrows(MaxCharacters.class,()->{
           metabolicAge.setMetabolicAge(91);
           metabolicAge.getMetabolicAge();
        });
    }

    @Test
    void testGetMetabolicAgeSmaller() throws MaxCharacters {
        Physical_Data metabolicAge = new Physical_Data();
        assertThrows(MaxCharacters.class,()->{
            metabolicAge.setMetabolicAge(0);
            metabolicAge.getMetabolicAge();
        });
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
    void testGetMetabolicBasal() throws MaxCharacters {
        Physical_Data metabolicBasal = new Physical_Data();
        DecimalFloat df = new DecimalFloat();
        metabolicBasal.setMetabolicBasal(df.round((float)3250.25,2));
        assertEquals(df.round((float)3250.25,2), metabolicBasal.getMetabolicBasal());
    }

    @Test
    void testGetMetabolicBasalBigger()  {
        Physical_Data metabolicBasal = new Physical_Data();
        assertThrows(MaxCharacters.class,()->{
           metabolicBasal.setMetabolicBasal((float) 20000.1);
           metabolicBasal.getMetabolicBasal();
        });
    }

    @Test
    void testGetMetabolicBasalSmaller()  {
        Physical_Data metabolicBasal = new Physical_Data();
        assertThrows(MaxCharacters.class,()->{
            metabolicBasal.setMetabolicBasal((float) 499);
            metabolicBasal.getMetabolicBasal();
        });
    }
    /**     * Test to  get the bone from a Physical_data class
     */
    @Test
    void testGetBone(){
        /*o que colocar*/
    }
}
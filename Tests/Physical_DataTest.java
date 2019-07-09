import Medical_Information.Physical_Data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Physical_DataTest {


    /**
     * Test to  get the weight from a Physical_data class
     */

    @Test
    void testCreatePhysicalDataNull() {
        assertThrows(AssertionError.class, () -> new Physical_Data(null));
    }

    @Test
    void testCreatePhysicalDataEmpty() {
        assertThrows(AssertionError.class, () -> new Physical_Data(""));
    }

//_________________________________________________________________

    @Test
    void testPhysicalDataWeightValid() {
        Physical_Data physical_data = new Physical_Data();
        physical_data.setWeight(2.2f);
        assertEquals(2.2f, physical_data.getWeight());
        physical_data.setWeight(634.9f);
        assertEquals(634.9f, physical_data.getWeight());
    }

    @Test
    void testPhysicalDataWeightNull() {

        Physical_Data physical_data = new Physical_Data();
        assertThrows(AssertionError.class, () -> physical_data.setWeight(null));
    }

    @Test
    void testPhysicalDataLesserThanMin() {

        Physical_Data physical_data = new Physical_Data();
        assertThrows(AssertionError.class, () -> physical_data.setWeight(2.1f));
    }

    @Test
    void testPhysicalDataBiggerThanMax() {

        Physical_Data physical_data = new Physical_Data();
        assertThrows(AssertionError.class, () -> physical_data.setWeight(635.0f));
    }
//_________________________________________________________

    @Test
    void testPhysicalDataHeightValid() {

        Physical_Data physical_data = new Physical_Data();
        physical_data.setHeight(0.54f);
        assertEquals(0.54f, physical_data.getHeight());
        physical_data.setHeight(2.71f);
        assertEquals(2.71f, physical_data.getHeight());
    }

    @Test
    void testPhysicalDataHeightNull() {
        Physical_Data physical_data = new Physical_Data();
        assertThrows(AssertionError.class, () -> physical_data.setHeight(null));

    }


    @Test
    void testPhysicalDataHeightLesserThanMin() {
        Physical_Data physical_data = new Physical_Data();
        assertThrows(AssertionError.class, () -> physical_data.setHeight(0.53f));

    }

    @Test
    void testPhysicalDataHeightBiggerThanMax() {
        Physical_Data physical_data = new Physical_Data();
        assertThrows(AssertionError.class, () -> physical_data.setHeight(2.72f));
    }
//_________________________________________________________


    @Test
    void testPhysicalDataIMCValid() {

        Physical_Data physical_data = new Physical_Data();
        physical_data.setIMC(2.01f);
        assertEquals(2.01f, physical_data.getIMC());
        physical_data.setIMC(29.99f);
        assertEquals(29.99f, physical_data.getIMC());
    }


    @Test
    void testPhysicalDataIMCNull() {

        Physical_Data physical_data = new Physical_Data();
        assertThrows(AssertionError.class, () -> physical_data.setIMC(null));

    }

    @Test
    void testPhysicalDataIMCLesserThanMin() {
        Physical_Data physical_data = new Physical_Data();
        assertThrows(AssertionError.class, () -> physical_data.setIMC(2.00f));
    }

    @Test
    void testPhysicalDataIMCBiggerThanMax() {
        Physical_Data physical_data = new Physical_Data();
        assertThrows(AssertionError.class, () -> physical_data.setIMC(30.00f));
    }
//_________________________________________________________


    @Test
    void testPhysicalDataBFValid() {

        Physical_Data physical_data = new Physical_Data();
        physical_data.setBF(5.01f);
        assertEquals(5.01f, physical_data.getBF());
        physical_data.setBF(49.99f);
        assertEquals(49.99f, physical_data.getBF());

    }

    @Test
    void testPhysicalDataBFNull() {

        Physical_Data physical_data = new Physical_Data();
        assertThrows(AssertionError.class, () -> physical_data.setIMC(null));
    }

    @Test
    void testPhysicalDataBFLesserThanMin() {
        Physical_Data physical_data = new Physical_Data();
        assertThrows(AssertionError.class, () -> physical_data.setBF(5.00f));
    }

    @Test
    void testPhysicalDataBFBiggerThanMax() {
        Physical_Data physical_data = new Physical_Data();
        assertThrows(AssertionError.class, () -> physical_data.setBF(50.00f));
    }
//_________________________________________________________

    @Test
    void testPhysicalDataVisceralFatValid() {

        Physical_Data physical_data = new Physical_Data();
        physical_data.setVisceralFat(0.01f);
        assertEquals(0.01f, physical_data.getVisceralFat());

        physical_data.setVisceralFat(59.99f);
        assertEquals(59.99f, physical_data.getVisceralFat());

    }

    @Test
    void testPhysicalDataVisceralFatNull() {

        Physical_Data physical_data = new Physical_Data();
        assertThrows(AssertionError.class, () -> physical_data.setVisceralFat(null));
    }

    @Test
    void testPhysicalDataVisceralFatBiggerThanMax() {

        Physical_Data physical_data = new Physical_Data();
        assertThrows(AssertionError.class, () -> physical_data.setVisceralFat(60.00f));
    }

    @Test
    void testPhysicalDataVisceralFatLesserThanMin() {

        Physical_Data physical_data = new Physical_Data();
        assertThrows(AssertionError.class, () -> physical_data.setVisceralFat(0.00f));
    }

    //_________________________________________________________
    @Test
    void testPhysicalDataMuscleValid() {

        Physical_Data physical_data = new Physical_Data();
        physical_data.setMuscle(0.1f);
        assertEquals(0.1f, physical_data.getMuscle());

        physical_data.setMuscle(89.9f);
        assertEquals(89.9f, physical_data.getMuscle());

    }

    @Test
    void testPhysicalDataMuscleNull() {
        Physical_Data physical_data = new Physical_Data();
        assertThrows(AssertionError.class, () -> physical_data.setMuscle(null));
    }


    @Test
    void testPhysicalDataMuscleBiggerThanMax() {
        Physical_Data physical_data = new Physical_Data();
        assertThrows(AssertionError.class, () -> physical_data.setMuscle(90.0f));
    }

    @Test
    void testPhysicalDataMuscleLesserThanMin() {
        Physical_Data physical_data = new Physical_Data();
        assertThrows(AssertionError.class, () -> physical_data.setMuscle(0.0f));
    }

    //_________________________________________________________
    @Test
    void testPhysicalDataMetabolicAgeValid() {
        Physical_Data physical_data = new Physical_Data();
        physical_data.setMetabolicAge(2);
        assertEquals(2, physical_data.getMetabolicAge());

        physical_data.setMetabolicAge(89);
        assertEquals(89f, physical_data.getMetabolicAge());
    }


    @Test
    void testPhysicalDataMetabolicAgeNull() {
        Physical_Data physical_data = new Physical_Data();
        assertThrows(AssertionError.class, () -> physical_data.setMetabolicAge(null));
    }


    @Test
    void testPhysicalDataMetabolicAgeBiggerThanMax() {
        Physical_Data physical_data = new Physical_Data();
        assertThrows(AssertionError.class, () -> physical_data.setMetabolicAge(90));
    }

    @Test
    void testPhysicalDataMetabolicAgeLesserThanMin() {
        Physical_Data physical_data = new Physical_Data();
        assertThrows(AssertionError.class, () -> physical_data.setMetabolicAge(1));
    }

    //_________________________________________________________
    @Test
    void testPhysicalDataMetabolicBasalValid() {
        Physical_Data physical_data = new Physical_Data();
        physical_data.setMetabolicBasal(500.1f);
        assertEquals(500.1f, physical_data.getMetabolicBasal());

        physical_data.setMetabolicBasal(49999.1f);
        assertEquals(49999.1f, physical_data.getMetabolicBasal());
    }

    @Test
    void testPhysicalDataMetabolicBasalNull() {
        Physical_Data physical_data = new Physical_Data();
        assertThrows(AssertionError.class, () -> physical_data.setMetabolicBasal(null));

    }

    @Test
    void testPhysicalDataMetabolicBasalBiggerThanMax() {
        Physical_Data physical_data = new Physical_Data();
        assertThrows(AssertionError.class, () -> physical_data.setMetabolicBasal(50000.0f));

    }

    @Test
    void testPhysicalDataMetabolicBasalLesserThanMin() {
        Physical_Data physical_data = new Physical_Data();
        assertThrows(AssertionError.class, () -> physical_data.setMetabolicBasal(500.0f));
    }


    //_________________________________________________________
    @Test
    void testPhysicalDataBoneValid() {
        Physical_Data physical_data = new Physical_Data();
        physical_data.setBone(1);
        assertEquals(1, physical_data.getBone());
        physical_data.setBone(149);
        assertEquals(149, physical_data.getBone());
    }

    @Test
    void testPhysicalDataBoneNull() {
        Physical_Data physical_data = new Physical_Data();
        assertThrows(AssertionError.class, () -> physical_data.setBone(null));
    }

    @Test
    void testPhysicalDataBoneLesserThanMin() {
        Physical_Data physical_data = new Physical_Data();
        assertThrows(AssertionError.class, () -> physical_data.setBone(0));
    }

    @Test
    void testPhysicalDataBoneBiggerThanMax() {
        Physical_Data physical_data = new Physical_Data();
        assertThrows(AssertionError.class, () -> physical_data.setBone(150));
    }


//    _____________________________________
}
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
    void testPhysicalDataConstructorNull(){
        assertThrows(AssertionError.class,()->new Physical_Data(null));
    }

    @Test
    void testPhysicalDataConstructorEmpty(){
        assertThrows(AssertionError.class,()->new Physical_Data(""));
    }


    @Test
    void testPhysicalDataWeightValid(){
        Physical_Data physical_data=new Physical_Data();
        physical_data.setWeight(2.2f);
        assertEquals(2.2f,physical_data.getWeight());
        physical_data.setWeight(634.9f);
        assertEquals(634.9f,physical_data.getWeight());
    }

    @Test
    void testPhysicalDataWeightNull(){

        Physical_Data physical_data=new Physical_Data();
        assertThrows(AssertionError.class,()->physical_data.setWeight(null));
    }
    @Test
    void testPhysicalDataLesserThanMin(){

        Physical_Data physical_data=new Physical_Data();
        assertThrows(AssertionError.class,()->physical_data.setWeight(2.1f));
    }

    @Test
    void testPhysicalDataBiggerThanMax(){

        Physical_Data physical_data=new Physical_Data();
        assertThrows(AssertionError.class,()->physical_data.setWeight(635.0f));
    }


    @Test
    void testPhysicalDataHeightValid(){

        Physical_Data physical_data=new Physical_Data();
        physical_data.setHeight(0.54f);
        assertEquals(0.54f,physical_data.getHeight());
        physical_data.setHeight(2.71f);
        assertEquals(2.71f,physical_data.getHeight());
    }

    @Test
    void testPhysicalDataHeightNull(){
        Physical_Data physical_data=new Physical_Data();
        assertThrows(AssertionError.class,()->physical_data.setHeight(null));

    }


    @Test
    void testPhysicalDataHeightLesserThanMin(){
        Physical_Data physical_data=new Physical_Data();
        assertThrows(AssertionError.class,()->physical_data.setHeight( 0.53f));

    }

    @Test
    void testPhysicalDataHeightBiggerThanMax(){
        Physical_Data physical_data=new Physical_Data();
        assertThrows(AssertionError.class,()->physical_data.setHeight( 2.72f));
    }


    @Test
    void testPhysicalDataIMCValid(){

        Physical_Data physical_data=new Physical_Data();
        physical_data.setIMC(2.01f);
        assertEquals(2.01f,physical_data.getIMC());
        physical_data.setIMC(29.99f);
        assertEquals(29.99f,physical_data.getIMC());
    }



    @Test
    void testPhysicalDataIMCNull(){

        Physical_Data physical_data=new Physical_Data();
        assertThrows(AssertionError.class,()->physical_data.setIMC( null));

    }

    @Test
    void testPhysicalDataIMCLesserThanMin(){
        Physical_Data physical_data=new Physical_Data();
        assertThrows(AssertionError.class,()->physical_data.setIMC( 2f));
    }

    @Test
    void testPhysicalDataIMCBiggerThanMax(){
        Physical_Data physical_data=new Physical_Data();
        assertThrows(AssertionError.class,()->physical_data.setIMC( 30f));
    }


    @Test
    void testPhysicalDataBFValid(){

        Physical_Data physical_data=new Physical_Data();
        physical_data.setBF(5.01f);
        assertEquals(5.01f,physical_data.getBF());
        physical_data.setBF(49.99f);
        assertEquals(49.99f,physical_data.getBF());

    }

    @Test
    void testPhysicalDataBFNull(){

        Physical_Data physical_data=new Physical_Data();
        assertThrows(AssertionError.class,()->physical_data.setIMC( null));
    }

    @Test
    void testPhysicalDataBFLesserThanMin(){
        Physical_Data physical_data=new Physical_Data();
        assertThrows(AssertionError.class,()->physical_data.setBF( 5f));
    }

    @Test
    void testPhysicalDataBFBiggerThanMax(){
        Physical_Data physical_data=new Physical_Data();
        assertThrows(AssertionError.class,()->physical_data.setBF( 50f));
    }

    @Test
    void testPhysicalDataVisceralFatValid(){

        Physical_Data physical_data=new Physical_Data();
        physical_data.setVisceralFat(0.01f);
        assertEquals(0.01f,physical_data.getVisceralFat());

        physical_data.setVisceralFat(59.99f);
        assertEquals(59.99f,physical_data.getVisceralFat());

    }

    @Test
    void testPhysicalDataVisceralFatNull(){

        Physical_Data physical_data=new Physical_Data();
        assertThrows(AssertionError.class,()->physical_data.setVisceralFat( null));
    }

    @Test
    void testPhysicalDataVisceralFatBiggerThanMax(){

        Physical_Data physical_data=new Physical_Data();
        assertThrows(AssertionError.class,()->physical_data.setVisceralFat( 60.00f));
    }

    @Test
    void testPhysicalDataVisceralFatLesserThanMin(){

        Physical_Data physical_data=new Physical_Data();
        assertThrows(AssertionError.class,()->physical_data.setVisceralFat( 0.00f));
    }


    @Test
    void testPhysicalDataMuscleValid(){

        Physical_Data physical_data=new Physical_Data();
        physical_data.setMuscle(0.1f);
        assertEquals(0.1f,physical_data.getMuscle());

        physical_data.setMuscle(89.9f);
        assertEquals(89.9f,physical_data.getMuscle());

    }

    @Test
    void testPhysicalDataMuscleNull(){
        Physical_Data physical_data=new Physical_Data();
        assertThrows(AssertionError.class,()->physical_data.setMuscle( null));
    }


    @Test
    void testPhysicalDataMuscleBiggerThanMax(){
        Physical_Data physical_data=new Physical_Data();
        assertThrows(AssertionError.class,()->physical_data.setMuscle( 90.0f));
    }

    @Test
    void testPhysicalDataMuscleLesserThanMin(){
        Physical_Data physical_data=new Physical_Data();
        assertThrows(AssertionError.class,()->physical_data.setMuscle( 0.0f));
    }


    @Test
    void testPhysicalDataMetabolicAgeValid(){
        Physical_Data physical_data=new Physical_Data();
        physical_data.setMetabolicAge(2);
        assertEquals(2,physical_data.getMetabolicAge());

        physical_data.setMetabolicAge(89);
        assertEquals(89f,physical_data.getMetabolicAge());
    }


    @Test
    void testPhysicalDataMetabolicAgeNull(){
        Physical_Data physical_data=new Physical_Data();
        assertThrows(AssertionError.class,()->physical_data.setMetabolicAge( null));
    }


    @Test
    void testPhysicalDataMetabolicAgeBiggerThanMax(){
        Physical_Data physical_data=new Physical_Data();
        assertThrows(AssertionError.class,()->physical_data.setMetabolicAge( 90));
    }

    @Test
    void testPhysicalDataMetabolicAgeLesserThanMin(){
        Physical_Data physical_data=new Physical_Data();
        assertThrows(AssertionError.class,()->physical_data.setMetabolicAge(1));
    }


    @Test
    void testPhysicalDataMetabolicBasalValid(){
        Physical_Data physical_data=new Physical_Data();
        physical_data.setMetabolicBasal(500.1f);
        assertEquals(500.1f,physical_data.getMetabolicBasal());

        physical_data.setMetabolicBasal(49999.1f);
        assertEquals(49999.1f,physical_data.getMetabolicBasal());
    }

    @Test
    void testPhysicalDataMetabolicBasalNull(){
        Physical_Data physical_data=new Physical_Data();
        assertThrows(AssertionError.class,()->physical_data.setMetabolicBasal(null));

    }

    @Test
    void testPhysicalDataMetabolicBasalBiggerThanMax(){
        Physical_Data physical_data=new Physical_Data();
        assertThrows(AssertionError.class,()->physical_data.setMetabolicBasal( 50000.0f));

    }

    @Test
    void testPhysicalDataMetabolicBasalLesserThanMin(){
        Physical_Data physical_data=new Physical_Data();
        assertThrows(AssertionError.class,()->physical_data.setMetabolicBasal( 500.0f));
    }


    @Test
    void testPhysicalDataBoneValid() {
        Physical_Data physical_data = new Physical_Data();
        physical_data.setBone(1);
        assertEquals(1,physical_data.getBone());
        physical_data.setBone(149);
        assertEquals(149,physical_data.getBone());
    }

    @Test
    void testPhysicalDataBoneNull() {
        Physical_Data physical_data = new Physical_Data();
        assertThrows(AssertionError.class,()->physical_data.setBone( null));
    }

    @Test
    void testPhysicalDataBoneLesserThanMin() {
        Physical_Data physical_data = new Physical_Data();
        assertThrows(AssertionError.class,()->physical_data.setBone( 0));
    }

    @Test
    void testPhysicalDataBoneBiggerThanMax() {
        Physical_Data physical_data = new Physical_Data();
        assertThrows(AssertionError.class,()->physical_data.setBone( 150));
    }


//    _____________________________________

//
//    @Test
//    void checkWeightLimitsBigger(){
//        Physical_Data weight = new Physical_Data();
//
//        assertThrows(MaxCharacters.class,()->{
//            weight.setWeight((float)635.1);
//            weight.getWeight();
//        });
//    }
//
//    @Test
//    void checkWeightLimitsSmaller(){
//        Physical_Data weight = new Physical_Data();
//
//        assertThrows(MaxCharacters.class,()->{
//            weight.setWeight((float)2.0);
//            weight.getWeight();
//        });
//    }
//    @Test
//    void checkWeight() throws MaxCharacters {
//        Physical_Data weight = new Physical_Data();
//        weight.setWeight((float) 70);
//        assertEquals(70, weight.getWeight());
//    }
//
//    /**
//     * Test to  get the Height from a Physical_data class
//     */
//    @Test
//    void checkHeight() throws MaxCharacters {
//        Physical_Data height = new Physical_Data();
//        height.setHeight((float)180);
//        assertEquals(180, height.getHeight());
//    }
//
//    @Test
//    void checkHeightBigger() {
//        Physical_Data height = new Physical_Data();
//
//        assertThrows(MaxCharacters.class,()->{
//            height.setHeight((float)272.1);
//            height.getHeight();
//        });
//    }
//    @Test
//    void checkHeightSmaller() {
//        Physical_Data height = new Physical_Data();
//
//        assertThrows(MaxCharacters.class,()->{
//            height.setHeight((float)54.4);
//            height.getHeight();
//        });
//    }
//    /**
//     * Test to  get the IMC from a Physical_data class
//     */
//    @Test
//    void checkIMC() throws MaxCharacters {
//        Physical_Data IMC = new Physical_Data();
//        DecimalFloat df = new DecimalFloat();
//
//        IMC.setIMC( df.round((float) 8.1,2));
//        assertEquals(df.round((float) 8.1,2), IMC.getIMC());
//
//    }
//
//    @Test
//    void checkIMCBigger() throws MaxCharacters {
//        Physical_Data IMC = new Physical_Data();
//        DecimalFloat df = new DecimalFloat();
//        assertThrows(MaxCharacters.class,()->{
//            IMC.setIMC( df.round((float) 30.01,2));
//            IMC.getIMC();
//        });
//    }
//
//    @Test
//    void checkIMCSmaller() throws MaxCharacters {
//        Physical_Data IMC = new Physical_Data();
//        DecimalFloat df = new DecimalFloat();
//
//        assertThrows(MaxCharacters.class,()->{
//            IMC.setIMC( df.round((float) 1.9,2));
//            IMC.getIMC();
//        });
//    }
//
//
//    /**
//     * Test to  get the BF from a Physical_data class
//     */
//
//    @Test
//    void testGetBF() throws MaxCharacters {
//        Physical_Data n1 = new Physical_Data();
//        DecimalFloat df = new DecimalFloat();
//        n1.setBF(df.round((float)40.2,2));
//        assertEquals(df.round((float)40.2,2), n1.getBF());
//    }
//
//    @Test
//    void testBFBigger(){
//        Physical_Data BF =  new Physical_Data();
//        DecimalFloat df = new DecimalFloat();
//        assertThrows(MaxCharacters.class,()->{
//            BF.setBF(df.round((float)50.1,2));
//            BF.getBF();
//        });
//    }
//
//    @Test
//    void testBFSmaller(){
//        Physical_Data BF =  new Physical_Data();
//        assertThrows(MaxCharacters.class,()->{
//            BF.setBF((float)4.9);
//            BF.getBF();
//        });
//    }
//
//    /**
//     * Test to  get the viseralfat from a Physical_data class
//     */
//
//    @Test
//    void testGetViseralFat() throws MaxCharacters {
//        Physical_Data n1 = new Physical_Data();
//        DecimalFloat df = new DecimalFloat();
//        n1.setVisceralFat(df.round((float)20.2,2));
//        assertEquals(df.round((float)20.2,2), n1.getVisceralFat());
//    }
//
//    @Test
//    void testGetViseralFatBigger(){
//        Physical_Data viseralFat = new Physical_Data();
//        assertThrows(MaxCharacters.class,()->{
//           viseralFat.setVisceralFat((float) 60.1);
//           viseralFat.getVisceralFat();
//        });
//    }
//
//    @Test
//    void testGetViseralFatSmaller(){
//        Physical_Data viseralFat = new Physical_Data();
//        assertThrows(MaxCharacters.class,()->{
//           viseralFat.setVisceralFat((float) -0.1);
//           viseralFat.getVisceralFat();
//        });
//    }
//    /**
//     * Test to  get the muscle from a Physical_data class
//     */
//    @Test
//    void testGetMuscle() throws MaxCharacters {
//        Physical_Data muscle = new Physical_Data();
//        DecimalFloat df = new DecimalFloat();
//        muscle.setMuscle(df.round((float)15.25,2));
//        assertEquals(df.round((float)15.25,2), muscle.getMuscle());
//    }
//
//    @Test
//    void testGetMuscleBigger(){
//        Physical_Data muscle = new Physical_Data();
//        assertThrows(MaxCharacters.class,()->{
//           muscle.setMuscle((float)90.1);
//           muscle.getMuscle();
//        });
//    }
//
//    @Test
//    void testGetMuscleSmaller(){
//        Physical_Data muscle = new Physical_Data();
//        assertThrows(MaxCharacters.class,()->{
//            muscle.setMuscle((float)-0.1);
//            muscle.getMuscle();
//        });
//    }
//
//    /**
//     * Test to  get the metabolicage from a Physical_data class
//     */
//    @Test
//    void testGetMetabolicAge() throws MaxCharacters {
//        Physical_Data metabolicAge = new Physical_Data();
//        DecimalFloat df = new DecimalFloat();
//        metabolicAge.setMetabolicAge(25);
//        assertEquals(25, metabolicAge.getMetabolicAge());
//    }
//    @Test
//    void testGetMetabolicAgeBigger() throws MaxCharacters {
//        Physical_Data metabolicAge = new Physical_Data();
//        assertThrows(MaxCharacters.class,()->{
//           metabolicAge.setMetabolicAge(91);
//           metabolicAge.getMetabolicAge();
//        });
//    }
//
//    @Test
//    void testGetMetabolicAgeSmaller() throws MaxCharacters {
//        Physical_Data metabolicAge = new Physical_Data();
//        assertThrows(MaxCharacters.class,()->{
//            metabolicAge.setMetabolicAge(0);
//            metabolicAge.getMetabolicAge();
//        });
//    }
//    /**
//     * Test to  get the H20 from a Physical_data class
//     */
//    @Test
//    void testGetH20(){
//        Physical_Data n1 = new Physical_Data();
//        assertEquals(70, n1.getH2O());
//    }
//    /**
//     * Test to  get the Metabolicbasal from a Physical_data class
//     */
//    @Test
//    void testGetMetabolicBasal() throws MaxCharacters {
//        Physical_Data metabolicBasal = new Physical_Data();
//        DecimalFloat df = new DecimalFloat();
//        metabolicBasal.setMetabolicBasal(df.round((float)3250.25,2));
//        assertEquals(df.round((float)3250.25,2), metabolicBasal.getMetabolicBasal());
//    }
//
//    @Test
//    void testGetMetabolicBasalBigger()  {
//        Physical_Data metabolicBasal = new Physical_Data();
//        assertThrows(MaxCharacters.class,()->{
//           metabolicBasal.setMetabolicBasal((float) 20000.1);
//           metabolicBasal.getMetabolicBasal();
//        });
//    }
//
//    @Test
//    void testGetMetabolicBasalSmaller()  {
//        Physical_Data metabolicBasal = new Physical_Data();
//        assertThrows(MaxCharacters.class,()->{
//            metabolicBasal.setMetabolicBasal((float) 499);
//            metabolicBasal.getMetabolicBasal();
//        });
//    }
//    /**     * Test to  get the bone from a Physical_data class
//     */
//    @Test
//    void testGetBone(){
//        /*o que colocar*/
//    }
}
import Medical_Information.Physical_Data;
import Medical_Information.Quiz;
import Medical_Information.Quiz;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class QuizTest {
    @BeforeEach
    void setUp() {
    }

    @AfterAll
    static void tearDown() {
    }

    @Test
    void testQuizCreateValid(){

        Quiz quiz=new Quiz("Excesso de peso","Perda de peso",
                "Diabetes","Nenhuma",
                "Hipertensão","Sedentario",
                "Diarreias",  "Good",
                new HashMap<String, String>() {{
                    put("ureia", "20");
                    put("coleterol", "25");
                    put("glicémia", "78");
                    put("profcoreatova", "97");
                    put("ereatinina", "89");
                }});

        assertEquals("Excesso de peso",quiz.getReason());
        assertEquals("Perda de peso",quiz.getObjective() );
        assertEquals("Nenhuma",quiz.getMedication() );
        assertEquals("Hipertensão",quiz.getFamilyHistory() );
        assertEquals("Sedentario",quiz.getPhisicalActivity() );
        assertEquals("Diarreias",quiz.getIntestinalFunction() );
        assertEquals("Good",quiz.getWaterConsuming() );
        assertEquals( new HashMap<String, String>() {{ put("ureia", "20");put("coleterol", "25");put("glicémia", "78");put("profcoreatova", "97");put("ereatinina", "89"); }},quiz.getChemistsAndBiologicalData() );


        quiz=new Quiz("1234567890123456789012345678901234567890123456789",
                "1234567890123456789012345678901234567890123456789",
                "1234567890123456789012345678901234567890123456789",
                "1234567890123456789012345678901234567890123456789",
                "1234567890123456789012345678901234567890123456789",
                "Sedentario","Diarreias",  "Good",
                new HashMap<String, String>() {{
                    put("ureia", "20");
                    put("coleterol", "25");
                    put("glicémia", "78");
                    put("profcoreatova", "97");
                    put("ereatinina", "89");
                }});

        assertEquals("1234567890123456789012345678901234567890123456789",quiz.getReason());
        assertEquals("1234567890123456789012345678901234567890123456789",quiz.getObjective() );
        assertEquals("1234567890123456789012345678901234567890123456789",quiz.getMedication() );
        assertEquals("1234567890123456789012345678901234567890123456789",quiz.getFamilyHistory() );
        assertEquals("Sedentario",quiz.getPhisicalActivity() );
        assertEquals("Diarreias",quiz.getIntestinalFunction() );
        assertEquals("Good",quiz.getWaterConsuming() );
        assertEquals( new HashMap<String, String>() {{ put("ureia", "20");put("coleterol", "25");put("glicémia", "78");put("profcoreatova", "97");put("ereatinina", "89"); }},quiz.getChemistsAndBiologicalData() );


    }
  //____________________________________________________

    @Test
    void testQuizCreateReasonNull(){

        assertThrows(AssertionError.class,()->new Quiz(null,"Perda de peso","Diabetes","Nenhuma","Hipertensão","Sedentario","Diarreias",  "Good",
                new HashMap<String, String>() {{
                    put("ureia", "20");
                    put("coleterol", "25");
                    put("glicémia", "78");
                    put("profcoreatova", "97");
                    put("ereatinina", "89");
                }}));

    }

    @Test
    void testQuizCreateReasonEmpty(){

        assertThrows(AssertionError.class,()->new Quiz("","Perda de peso","Diabetes","Nenhuma","Hipertensão","Sedentario","Diarreias",  "Good",
                new HashMap<String, String>() {{
                    put("ureia", "20");
                    put("coleterol", "25");
                    put("glicémia", "78");
                    put("profcoreatova", "97");
                    put("ereatinina", "89");
                }}));

    }

    @Test
    void testQuizCreateReasonBiggerThanMax(){

        assertThrows(AssertionError.class,()->new Quiz("12345678901234567890123456789012345678901234567890","Perda de peso","Diabetes","Nenhuma","Hipertensão","Sedentario","Diarreias",  "Good",
                new HashMap<String, String>() {{
                    put("ureia", "20");
                    put("coleterol", "25");
                    put("glicémia", "78");
                    put("profcoreatova", "97");
                    put("ereatinina", "89");
                }}));

    }

//____________________________________________________

    @Test
    void testQuizCreateObjectiveNull(){

        assertThrows(AssertionError.class,()->new Quiz("Excesso de peso",null,"Diabetes","Nenhuma","Hipertensão","Sedentario","Diarreias",  "Good",
                new HashMap<String, String>() {{
                    put("ureia", "20");
                    put("coleterol", "25");
                    put("glicémia", "78");
                    put("profcoreatova", "97");
                    put("ereatinina", "89");
                }}));

    }

    @Test
    void testQuizCreateObjectiveEmpty(){

        assertThrows(AssertionError.class,()->new Quiz("Excesso de peso","","Diabetes","Nenhuma","Hipertensão","Sedentario","Diarreias",  "Good",
                new HashMap<String, String>() {{
                    put("ureia", "20");
                    put("coleterol", "25");
                    put("glicémia", "78");
                    put("profcoreatova", "97");
                    put("ereatinina", "89");
                }}));

    }


    @Test
    void testQuizCreateObjectiveBiggerThanMax(){

        assertThrows(AssertionError.class,()->new Quiz("Excesso de peso","12345678901234567890123456789012345678901234567890","Diabetes","Nenhuma","Hipertensão","Sedentario","Diarreias",  "Good",
                new HashMap<String, String>() {{
                    put("ureia", "20");
                    put("coleterol", "25");
                    put("glicémia", "78");
                    put("profcoreatova", "97");
                    put("ereatinina", "89");
                }}));

    }

//____________________________________________________

    @Test
    void testQuizCreatePathologiesNull(){

        assertThrows(AssertionError.class,()->new Quiz("Excesso de peso","Perda de peso",null,"Nenhuma","Hipertensão","Sedentario","Diarreias",  "Good",
                new HashMap<String, String>() {{
                    put("ureia", "20");
                    put("coleterol", "25");
                    put("glicémia", "78");
                    put("profcoreatova", "97");
                    put("ereatinina", "89");
                }}));

    }


    @Test
    void testQuizCreatePathologiesEmpty(){

        assertThrows(AssertionError.class,()->new Quiz("Excesso de peso","Perda de peso","","Nenhuma","Hipertensão","Sedentario","Diarreias",  "Good",
                new HashMap<String, String>() {{
                    put("ureia", "20");
                    put("coleterol", "25");
                    put("glicémia", "78");
                    put("profcoreatova", "97");
                    put("ereatinina", "89");
                }}));

    }

    @Test
    void testQuizCreatePathologiesBiggerThanMax(){

        assertThrows(AssertionError.class,()->new Quiz("Excesso de peso","Perda de peso","12345678901234567890123456789012345678901234567890","Nenhuma","Hipertensão","Sedentario","Diarreias",  "Good",
                new HashMap<String, String>() {{
                    put("ureia", "20");
                    put("coleterol", "25");
                    put("glicémia", "78");
                    put("profcoreatova", "97");
                    put("ereatinina", "89");
                }}));

    }
//____________________________________________________

    @Test
    void testQuizCreateMedicationNull(){

        assertThrows(AssertionError.class,()->new Quiz("Excesso de peso","Perda de peso","Diabetes",null,"Hipertensão","Sedentario","Diarreias",  "Good",
                new HashMap<String, String>() {{
                    put("ureia", "20");
                    put("coleterol", "25");
                    put("glicémia", "78");
                    put("profcoreatova", "97");
                    put("ereatinina", "89");
                }}));

    }


    @Test
    void testQuizCreateMedicationEmpty(){

        assertThrows(AssertionError.class,()->new Quiz("Excesso de peso","Perda de peso","Diabetes","","Hipertensão","Sedentario","Diarreias",  "Good",
                new HashMap<String, String>() {{
                    put("ureia", "20");
                    put("coleterol", "25");
                    put("glicémia", "78");
                    put("profcoreatova", "97");
                    put("ereatinina", "89");
                }}));

    }

    @Test
    void testQuizCreateMedicationBiggerThanMax(){

        assertThrows(AssertionError.class,()->new Quiz("Excesso de peso","Perda de peso","Diabetes","12345678901234567890123456789012345678901234567890","Hipertensão","Sedentario","Diarreias",  "Good",
                new HashMap<String, String>() {{
                    put("ureia", "20");
                    put("coleterol", "25");
                    put("glicémia", "78");
                    put("profcoreatova", "97");
                    put("ereatinina", "89");
                }}));

    }

//____________________________________________________

    @Test
    void testQuizCreateFamilyHistoryNull(){

        assertThrows(AssertionError.class,()->new Quiz("Excesso de peso","Perda de peso","Diabetes","Nenhuma",null,"Sedentario","Diarreias",  "Good",
                new HashMap<String, String>() {{
                    put("ureia", "20");
                    put("coleterol", "25");
                    put("glicémia", "78");
                    put("profcoreatova", "97");
                    put("ereatinina", "89");
                }}));

    }

    @Test
    void testQuizCreateFamilyHistoryEmpty(){

        assertThrows(AssertionError.class,()->new Quiz("Excesso de peso","Perda de peso","Diabetes","Nenhuma","","Sedentario","Diarreias",  "Good",
                new HashMap<String, String>() {{
                    put("ureia", "20");
                    put("coleterol", "25");
                    put("glicémia", "78");
                    put("profcoreatova", "97");
                    put("ereatinina", "89");
                }}));

    }


    @Test
    void testQuizCreateFamilyHistoryBiggerThanMax(){

        assertThrows(AssertionError.class,()->new Quiz("Excesso de peso","Perda de peso","Diabetes","Nenhuma","12345678901234567890123456789012345678901234567890","Sedentario","Diarreias",  "Good",
                new HashMap<String, String>() {{
                    put("ureia", "20");
                    put("coleterol", "25");
                    put("glicémia", "78");
                    put("profcoreatova", "97");
                    put("ereatinina", "89");
                }}));

    }

 //____________________________________________________

    @Test
    void testQuizCreatePhysicalActivityNull(){

        assertThrows(AssertionError.class,()->new Quiz("Excesso de peso","Perda de peso","Diabetes","Nenhuma","Diabetes",
                null,"Diarreias",  "Good",
                new HashMap<String, String>() {{
                    put("ureia", "20");
                    put("coleterol", "25");
                    put("glicémia", "78");
                    put("profcoreatova", "97");
                    put("ereatinina", "89");
                }}));

    }

    @Test
    void testQuizCreatePhysicalActivityEmpty(){

        assertThrows(AssertionError.class,()->new Quiz("Excesso de peso","Perda de peso","Diabetes","Nenhuma","Diabetes",
                "","Diarreias",  "Good",
                new HashMap<String, String>() {{
                    put("ureia", "20");
                    put("coleterol", "25");
                    put("glicémia", "78");
                    put("profcoreatova", "97");
                    put("ereatinina", "89");
                }}));

    }

    @Test
    void testQuizCreatePhysicalActivityEnumInvalid(){

        assertThrows(IllegalArgumentException.class,()->new Quiz("Excesso de peso","Perda de peso","Diabetes","Nenhuma","Diabetes",
                "Teste","Diarreias",  "Good",
                new HashMap<String, String>() {{
                    put("ureia", "20");
                    put("coleterol", "25");
                    put("glicémia", "78");
                    put("profcoreatova", "97");
                    put("ereatinina", "89");
                }}));

    }

    //____________________________________________________

    @Test
    void testQuizCreateIntestinalFunctionNull(){

        assertThrows(AssertionError.class,()->new Quiz("Excesso de peso","Perda de peso","Diabetes","Nenhuma","Diabetes",
                "Sedentario",null,  "Good",
                new HashMap<String, String>() {{
                    put("ureia", "20");
                    put("coleterol", "25");
                    put("glicémia", "78");
                    put("profcoreatova", "97");
                    put("ereatinina", "89");
                }}));

    }


    @Test
    void testQuizCreateIntestinalFunctionEmpty(){

        assertThrows(AssertionError.class,()->new Quiz("Excesso de peso","Perda de peso","Diabetes","Nenhuma","Diabetes",
                "Sedentario","",  "Good",
                new HashMap<String, String>() {{
                    put("ureia", "20");
                    put("coleterol", "25");
                    put("glicémia", "78");
                    put("profcoreatova", "97");
                    put("ereatinina", "89");
                }}));

    }


    @Test
    void testQuizCreateIntestinalFunctionEnumInvalid(){

        assertThrows(IllegalArgumentException.class,()->new Quiz("Excesso de peso","Perda de peso","Diabetes","Nenhuma","Diabetes",
                "Sedentario","Teste",  "Good",
                new HashMap<String, String>() {{
                    put("ureia", "20");
                    put("coleterol", "25");
                    put("glicémia", "78");
                    put("profcoreatova", "97");
                    put("ereatinina", "89");
                }}));

    }

    //____________________________________________________

    @Test
    void testQuizCreateWaterConsumingNull(){

        assertThrows(AssertionError.class,()->new Quiz("Excesso de peso","Perda de peso","Diabetes","Nenhuma","Diabetes",
                "Sedentario","Diarreias",  null,
                new HashMap<String, String>() {{
                    put("ureia", "20");
                    put("coleterol", "25");
                    put("glicémia", "78");
                    put("profcoreatova", "97");
                    put("ereatinina", "89");
                }}));

    }

    @Test
    void testQuizCreateWaterConsumingEmpty(){

        assertThrows(AssertionError.class,()->new Quiz("Excesso de peso","Perda de peso","Diabetes","Nenhuma","Diabetes",
                "Sedentario","Diarreias",  "",
                new HashMap<String, String>() {{
                    put("ureia", "20");
                    put("coleterol", "25");
                    put("glicémia", "78");
                    put("profcoreatova", "97");
                    put("ereatinina", "89");
                }}));

    }

    @Test
    void testQuizCreateWaterConsumingEnumInvalid(){

        assertThrows(IllegalArgumentException.class,()->new Quiz("Excesso de peso","Perda de peso","Diabetes","Nenhuma","Diabetes",
                "Sedentario","Diarreias",  "Teste",
                new HashMap<String, String>() {{
                    put("ureia", "20");
                    put("coleterol", "25");
                    put("glicémia", "78");
                    put("profcoreatova", "97");
                    put("ereatinina", "89");
                }}));

    }

    //____________________________________________________

    @Test
    void testQuizCreateChemistsAndBiologicalDataNull(){
        assertThrows(AssertionError.class,()->new Quiz("Excesso de peso","Perda de peso","Diabetes","Nenhuma","Diabetes",
                "Sedentario","Diarreias",  "Good",
                null));
    }

    @Test
    void testQuizCreateChemistsAndBiologicalDataEmpty(){
        assertThrows(AssertionError.class,()->new Quiz("Excesso de peso","Perda de peso","Diabetes","Nenhuma","Diabetes",
                "Sedentario","Diarreias",  "Good",
                new HashMap<String, String>() ));
    }




    //____________________________________________________
    @Test
    void testQuizReasonNull(){
        Quiz quiz=new Quiz();
        assertThrows(AssertionError.class,()->quiz.setReason(null));
    }

    @Test
    void testQuizReasonEmpty(){
        Quiz quiz=new Quiz();
        assertThrows(AssertionError.class,()->quiz.setReason(""));
    }

    @Test
    void testQuizReasonBiggerThanMax(){
        Quiz quiz=new Quiz();
        assertThrows(AssertionError.class,()->quiz.setReason("12345678901234567890123456789012345678901234567890"));
    }


    @Test
    void testQuizReasonValid(){
        Quiz quiz=new Quiz();
        quiz.setReason("E");
        assertEquals("E",quiz.getReason());
        quiz.setReason("1234567890123456789012345678901234567890123456789");
        assertEquals("1234567890123456789012345678901234567890123456789",quiz.getReason());
    }
    //____________________________________________________

    @Test
    void testQuizObjectiveNull(){
        Quiz quiz=new Quiz();
        assertThrows(AssertionError.class,()->quiz.setObjective(null));
    }

    @Test
    void testQuizObjectiveEmpty(){
        Quiz quiz=new Quiz();
        assertThrows(AssertionError.class,()->quiz.setObjective(""));
    }

    @Test
    void testQuizObjectiveBiggerThanMax(){
        Quiz quiz=new Quiz();
        assertThrows(AssertionError.class,()->quiz.setObjective("12345678901234567890123456789012345678901234567890"));
    }

    @Test
    void testQuizObjectiveValid(){
        Quiz quiz=new Quiz();
        quiz.setObjective("P");
        assertEquals("P",quiz.getObjective());
        quiz.setObjective("1234567890123456789012345678901234567890123456789");
        assertEquals("1234567890123456789012345678901234567890123456789",quiz.getObjective());

    }

    //____________________________________________________


    @Test
    void testQuizPathologiesNull(){
        Quiz quiz=new Quiz();
        assertThrows(AssertionError.class,()->quiz.setPathologies(null));
    }


    @Test
    void testQuizPathologiesEmpty(){
        Quiz quiz=new Quiz();
        assertThrows(AssertionError.class,()->quiz.setPathologies(""));
    }

    @Test
    void testQuizPathologiesBiggerThanMax(){
        Quiz quiz=new Quiz();
        assertThrows(AssertionError.class,()->quiz.setPathologies("12345678901234567890123456789012345678901234567890"));
    }

    @Test
    void testQuizPathologiesValid(){
        Quiz quiz=new Quiz();
        quiz.setPathologies("D");
        assertEquals("D",quiz.getPathologies());

        quiz.setPathologies("1234567890123456789012345678901234567890123456789");
        assertEquals("1234567890123456789012345678901234567890123456789",quiz.getPathologies());
    }

    //____________________________________________________


    @Test
    void testQuizMedicationNull(){
        Quiz quiz=new Quiz();
        assertThrows(AssertionError.class,()-> quiz.setMedication(null));
    }

    @Test
    void testQuizMedicationEmpty(){
        Quiz quiz=new Quiz();
        assertThrows(AssertionError.class,()-> quiz.setMedication(""));
    }

    @Test
    void testQuizMedicationBiggerThanMax(){
        Quiz quiz=new Quiz();
        assertThrows(AssertionError.class,()-> quiz.setMedication("12345678901234567890123456789012345678901234567890"));
    }

    @Test
    void testQuizMedicationValid(){
        Quiz quiz=new Quiz();
        quiz.setMedication("N");
        assertEquals("N",quiz.getMedication());

        quiz.setMedication("1234567890123456789012345678901234567890123456789");
        assertEquals("1234567890123456789012345678901234567890123456789",quiz.getMedication());
    }

    //____________________________________________________


    @Test
    void testQuizFamilyHistoryNull(){
        Quiz quiz=new Quiz();
        assertThrows(AssertionError.class,()-> quiz.setFamilyHistory(null));
    }

    @Test
    void testQuizFamilyHistoryEmpty(){
        Quiz quiz=new Quiz();
        assertThrows(AssertionError.class,()-> quiz.setFamilyHistory(""));
    }

    @Test
    void testQuizFamilyHistoryBiggerThanMax(){
        Quiz quiz=new Quiz();
        assertThrows(AssertionError.class,()-> quiz.setFamilyHistory("12345678901234567890123456789012345678901234567890"));
    }

    @Test
    void testQuizFamilyHistoryValid(){
        Quiz quiz=new Quiz();
        quiz.setFamilyHistory("D");
        assertEquals("D",quiz.getFamilyHistory());

        quiz.setFamilyHistory("1234567890123456789012345678901234567890123456789");
        assertEquals("1234567890123456789012345678901234567890123456789",quiz.getFamilyHistory());
    }

    //____________________________________________________

    @Test
    void testQuizFamilyPhisiclActivityEnumInvalid() {
        Quiz quiz=new Quiz();
        assertThrows(IllegalArgumentException.class,()-> quiz.setPhisicalActivity("Teste"));
    }

    @Test
    void testQuizFamilyPhisiclActivityNull() {
        Quiz quiz=new Quiz();
        assertThrows(AssertionError.class,()-> quiz.setPhisicalActivity(null));
    }
    @Test
    void testQuizFamilyPhisiclActivityEmpty() {
        Quiz quiz=new Quiz();
        assertThrows(AssertionError.class,()-> quiz.setPhisicalActivity(""));
    }


    @Test
    void testQuizFamilyPhisiclActivityValid() {
        Quiz quiz=new Quiz();
        quiz.setPhisicalActivity("Sedentario");
        assertEquals("Sedentario",quiz.getPhisicalActivity());
        quiz.setPhisicalActivity("ModeradamenteAtivo");
        assertEquals("ModeradamenteAtivo",quiz.getPhisicalActivity());
        quiz.setPhisicalActivity("Ativo");
        assertEquals("Ativo",quiz.getPhisicalActivity());
        quiz.setPhisicalActivity("MuitoAtivo");
        assertEquals("MuitoAtivo",quiz.getPhisicalActivity());

    }
    //____________________________________________________


    @Test
    void testQuizIntestinalFunctionEnumInvalid() {
        Quiz quiz=new Quiz();
        assertThrows(IllegalArgumentException.class,()-> quiz.setIntestinalFunction("Teste"));
    }
    @Test
    void testQuizIntestinalFunctionNull() {
        Quiz quiz=new Quiz();
        assertThrows(AssertionError.class,()-> quiz.setIntestinalFunction(null));
    }
    @Test
    void testQuizIntestinalFunctionEmpty() {
        Quiz quiz=new Quiz();
        assertThrows(AssertionError.class,()-> quiz.setIntestinalFunction(""));
    }

    @Test
    void testQuizIntestinalFunctionValid() {
        Quiz quiz=new Quiz();
        quiz.setIntestinalFunction("Normal");
        assertEquals("Normal",quiz.getIntestinalFunction());

        quiz.setIntestinalFunction("Obstipado");
        assertEquals("Obstipado",quiz.getIntestinalFunction());

        quiz.setIntestinalFunction("Diarreias");
        assertEquals("Diarreias",quiz.getIntestinalFunction());


    }


    //____________________________________________________


    @Test
    void testQuizWaterConsumingEnumInvalid() {
        Quiz quiz=new Quiz();
        assertThrows(IllegalArgumentException.class,()-> quiz.setWaterConsuming("Teste"));
    }

    @Test
    void testQuizWaterConsumingNull() {
        Quiz quiz=new Quiz();
        assertThrows(AssertionError.class,()-> quiz.setWaterConsuming(null));
    }

    @Test
    void testQuizWaterConsumingEmpty() {
        Quiz quiz=new Quiz();
        assertThrows(AssertionError.class,()-> quiz.setWaterConsuming(""));
    }

    @Test
    void testQuizWaterConsumingValid() {
        Quiz quiz=new Quiz();
        quiz.setWaterConsuming("Median");
        assertEquals("Median",quiz.getWaterConsuming());
        quiz.setWaterConsuming("Weak");
        assertEquals("Weak",quiz.getWaterConsuming());

        quiz.setWaterConsuming("Good");
        assertEquals("Good",quiz.getWaterConsuming());

        quiz.setWaterConsuming("Obsessive");
        assertEquals("Obsessive",quiz.getWaterConsuming());

    }


    //____________________________________________________



    @Test
    void testQuizChemistsAndBiologicalDataNull() {
        Quiz quiz=new Quiz();
        assertThrows(AssertionError.class,()-> quiz.setChemistsAndBiologicalData(null));
    }

    @Test
    void testQuizChemistsAndBiologicalDataEmpty() {
        Quiz quiz=new Quiz();
        assertThrows(AssertionError.class,()-> quiz.setChemistsAndBiologicalData(new HashMap<>()));
    }
    @Test
    void testQuizChemistsAndBiologicalDataValid() {
        Quiz quiz=new Quiz();
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("Ureia","56");
        quiz.setChemistsAndBiologicalData(hashMap);
        assertEquals(hashMap,quiz.getChemistsAndBiologicalData());
    }
}
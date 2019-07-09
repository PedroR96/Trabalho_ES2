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
    void testQuizCreate(){
        Quiz quiz=new Quiz("Back pain",
                "Get better",
                "No one",
                "Benoroum",
                "Diabetes",
                "Activo",
                "Normal",
                "menos de 0,5 L",
                new HashMap<String,String>(){{
                    put("Colestrol",null);
                    put("Glicémia",null);
                    put("Ureia",null);
                    put("Nao sei",null);
                    put("tambem naos sei",null); }}  );
        assertEquals("Back pain",quiz.getReason());
        assertEquals("Get better",quiz.getObjective());
        assertEquals("No one",quiz.getPathologies());
        assertEquals("Benoroum",quiz.getMedication());
        assertEquals("Diabetes",quiz.getFamilyHistory());
        assertEquals("Activo",quiz.getPhisicalActivity());
        assertEquals("Normal",quiz.getIntestinalFunction());
        assertEquals("menos de 0,5 L",quiz.getWaterConsuming());
        assertEquals(new HashMap<String,String>(){{ put("Colestrol",null);put("Glicémia",null);put("Ureia",null);put("Nao sei",null);put("tambem naos sei",null); }},quiz.getChemistsAndBiologicalData());

    }



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
        quiz.setReason("Excesso de peso");
        assertEquals("Excesso de peso",quiz.getReason());
    }


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
        quiz.setObjective("Perda de peso");
        assertEquals("Perda de peso",quiz.getObjective());
    }



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
        quiz.setPathologies("Diabetes");
        assertEquals("Diabetes",quiz.getPathologies());
    }

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
        quiz.setMedication("Nenhuma");
        assertEquals("Nenhuma",quiz.getMedication());
    }

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
        quiz.setFamilyHistory("Diabetes");
        assertEquals("Diabetes",quiz.getFamilyHistory());
    }


    @Test
    void testQuizFamilyPhisiclActivityInvalid() {
        Quiz quiz=new Quiz();
        assertThrows(IllegalArgumentException.class,()-> quiz.setPhisicalActivity("Teste"));
    }


    @Test
    void testQuizFamilyPhisiclActivityValid() {
        Quiz quiz=new Quiz();
        quiz.setPhisicalActivity("Sedentario");
        assertEquals("Sedentario",quiz.getPhisicalActivity());

    }


    @Test
    void testQuizFamilyIntestinalFunctionInvalid() {
        Quiz quiz=new Quiz();
        assertThrows(IllegalArgumentException.class,()-> quiz.setIntestinalFunction("Teste"));
    }


    @Test
    void testQuizFamilyIntestinalFunctionValid() {
        Quiz quiz=new Quiz();
        quiz.setIntestinalFunction("Normal");
        assertEquals("Normal",quiz.getIntestinalFunction());
    }

    @Test
    void testQuizFamilyWaterConsumingInvalid() {
        Quiz quiz=new Quiz();
        assertThrows(IllegalArgumentException.class,()-> quiz.setWaterConsuming("Teste"));
    }


    @Test
    void testQuizFamilyWaterConsumingValid() {
        Quiz quiz=new Quiz();
        quiz.setWaterConsuming("Median");
        assertEquals("Median",quiz.getWaterConsuming());
    }


    @Test
    void testQuizFamilyChemistsAndBiologicalDataNull() {
        Quiz quiz=new Quiz();
        assertThrows(AssertionError.class,()-> quiz.setChemistsAndBiologicalData(null));
    }

    @Test
    void testQuizFamilyChemistsAndBiologicalDataEmpty() {
        Quiz quiz=new Quiz();
        assertThrows(AssertionError.class,()-> quiz.setChemistsAndBiologicalData(new HashMap<>()));
    }
    @Test
    void testQuizFamilyChemistsAndBiologicalDataValid() {
        Quiz quiz=new Quiz();
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("Ureia","56");
        quiz.setChemistsAndBiologicalData(hashMap);
        assertEquals(hashMap,quiz.getChemistsAndBiologicalData());
    }
}
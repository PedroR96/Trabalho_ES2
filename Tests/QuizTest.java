import People.Quiz;
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

 private String reason;
 private String objective;
 private String pathologies;
 private String medication;
 private String familyHistory;
 private String phisicalActivity;
 private String intestinalFunction;
 private String waterConsuming;
 private HashMap<String,String> chemistsAndBiologicalData;
}
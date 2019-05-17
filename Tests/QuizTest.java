import Medical_Information.Quiz;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuizTest {
    @AfterAll
    static void tearDown() {
    }

    @BeforeEach
    void setUp() {
    }

    @Test
    void testQuizCreate() {
        Quiz quiz = new Quiz("Back pain",
                "Get better",
                "No one",
                "Benoroum",
                "Diabetes",
                "Activo",
                "Normal",
                "menos de 0,5 L",
                new HashMap<String, String>() {{
                    put("Colestrol", null);
                    put("Glicémia", null);
                    put("Ureia", null);
                    put("Nao sei", null);
                    put("tambem naos sei", null);
                }});

        assertEquals("Back pain", quiz.getReason());
        assertEquals("Get better", quiz.getObjective());
        assertEquals("No one", quiz.getPathologies());
        assertEquals("Benoroum", quiz.getMedication());
        assertEquals("Diabetes", quiz.getFamilyHistory());
        assertEquals("Activo", quiz.getPhisicalActivity());
        assertEquals("Normal", quiz.getIntestinalFunction());
        assertEquals("menos de 0,5 L", quiz.getWaterConsuming());
        assertEquals(new HashMap<String, String>() {{
            put("Colestrol", null);
            put("Glicémia", null);
            put("Ureia", null);
            put("Nao sei", null);
            put("tambem naos sei", null);
        }}, quiz.getChemistsAndBiologicalData());

    }

}
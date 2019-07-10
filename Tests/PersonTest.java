import Medical_Information.FoodHabits;
import Medical_Information.Physical_Data;
import Medical_Information.Quiz;
import People.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PersonTest {


    @Test
    void testCreatePersonNull() {
        assertThrows(AssertionError.class, () ->new Person(null));
    }


    @Test
    void testCreatePersonEmpty() {
        assertThrows(AssertionError.class, () ->new Person(""));
    }


//_____________________________________________
    @Test
    void testPersonNameValid() {

        Person person = new Person();
        person.setName("ana");
        assertEquals("ana", person.getName());

        person.setName("123456789012345678901234567890123456789");
        assertEquals("123456789012345678901234567890123456789", person.getName());
    }

    @Test
    void testPersonNameNull() {
        Person person = new Person();
        assertThrows(AssertionError.class, () -> person.setName(null));
    }

    @Test
    void testPersonNameLesserThanMin() {
        Person person = new Person();
        assertThrows(AssertionError.class, () -> person.setName("an"));
    }

    @Test
    void testPersonNameBiggerThanMax() {
        Person person = new Person();
        assertThrows(AssertionError.class, () -> person.setName("1234567890123456789012345678901234567890"));
    }


// ____________________________________________________

    @Test
    void testPersonJobValid() {

        Person person = new Person();
        person.setJob("a");
        assertEquals("a", person.getJob());

        person.setJob("1234567890123456789012345678901234567890123456789");
        assertEquals("1234567890123456789012345678901234567890123456789", person.getJob());
    }

    @Test
    void testPersonJobNull() {
        Person person = new Person();
        assertThrows(AssertionError.class, () -> person.setJob(null));
    }

    @Test
    void testPersonJobEmpty() {
        Person person = new Person();
        assertThrows(AssertionError.class, () -> person.setJob(""));
    }

    @Test
    void testPersonJobBiggerThanMax() {
        Person person = new Person();
        assertThrows(AssertionError.class, () -> person.setJob("12345678901234567890123456789012345678901234567890"));
    }


// ____________________________________________________


    @Test
    void testPersonAgeValid() {

        Person person = new Person();
        person.setAge(1);
        assertEquals(1, person.getAge());

        person.setAge(144);
        assertEquals(144, person.getAge());
    }

    @Test
    void testPersonAgeNull() {

        Person person = new Person();
        assertThrows(AssertionError.class, () -> person.setAge(null));
    }

    @Test
    void testPersonAgeLesserThanMin() {

        Person person = new Person();
        assertThrows(AssertionError.class, () -> person.setAge(0));
    }

    @Test
    void testPersonAgeBiggerThanMax() {

        Person person = new Person();
        assertThrows(AssertionError.class, () -> person.setAge(145));
    }

// ____________________________________________________


    @Test
    void testPersonQuizValid() {

        Person person = new Person();
        Quiz quiz = new Quiz();
        person.setQuiz(quiz);
        assertEquals(quiz, person.getQuiz());

    }

    @Test
    void testPersonQuizNull() {

        Person person = new Person();
        assertThrows(AssertionError.class, () -> person.setQuiz(null));

    }

// ____________________________________________________


    @Test
    void testPersonHeightValid() {

        Person person = new Person();
        person.setHeight(0.54f);
        assertEquals(0.54f, person.getHeight());

        person.setHeight(2.71f);
        assertEquals(2.71f, person.getHeight());

    }

    @Test
    void testPersonHeightNull() {
        Person person = new Person();
        assertThrows(AssertionError.class, () -> person.setHeight(null));
    }

    @Test
    void testPersonLesserThanMin() {
        Person person = new Person();
        assertThrows(AssertionError.class, () -> person.setHeight(0.53f));
    }


    @Test
    void testPersonBiggerThanMax() {
        Person person = new Person();
        assertThrows(AssertionError.class, () -> person.setHeight(2.72f));
    }


// ____________________________________________________


    @Test
    void testPersonFoodHabitsValid() {

        Person person = new Person();
        FoodHabits quiz = new FoodHabits();
        person.setFoodHabits(quiz);
        assertEquals(quiz, person.getFoodHabits());

    }

    @Test
    void testPersonFoodHabitsNull() {

        Person person = new Person();
        assertThrows(AssertionError.class, () -> person.setFoodHabits(null));

    }

// ____________________________________________________

    @Test
    void testPersonNewPlanValid() {

        Person person = new Person();
        FoodHabits quiz = new FoodHabits();
        person.setNewPlan(quiz);
        assertEquals(quiz, person.getNewPlan());

    }

    @Test
    void testPersonNewPlansNull() {

        Person person = new Person();
        assertThrows(AssertionError.class, () -> person.setNewPlan(null));

    }

// ____________________________________________________

    @Test
    void testPersonPhysicalDataValid() {

        Person person = new Person();
        Physical_Data physical_data = new Physical_Data();
        person.setPhysicalData(physical_data);
        assertEquals(physical_data, person.getPhysicalData());

    }

    @Test
    void testPersonPhysicalDataNull() {

        Person person = new Person();
        assertThrows(AssertionError.class, () -> person.setPhysicalData(null));

    }
// ____________________________________________________


    @Test
    void testPersonGenderValid() {

        Person person = new Person();
        person.setGender("a");
        assertEquals("a", person.getGender());

        person.setGender("12345678901234");
        assertEquals("12345678901234", person.getGender());

    }

    @Test
    void testPersonGenderNull() {
        Person person = new Person();
        assertThrows(AssertionError.class, () -> person.setGender(null));
    }

    @Test
    void testGenderLesserThanMin() {
        Person person = new Person();
        assertThrows(AssertionError.class, () -> person.setGender(""));
    }


    @Test
    void testGenderBiggerThanMax() {
        Person person = new Person();
        assertThrows(AssertionError.class, () -> person.setGender("123456789012345"));
    }
}
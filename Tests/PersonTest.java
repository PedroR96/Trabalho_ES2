import People.MaxCharacters;
import People.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PersonTest {


    /**
     * Test the Person Constructor
     */
    @Test
    void testConstructor() {
        Person p = new Person("Elton John", 72);
        Person p1 = new Person("Elton John", 72, "Musician");
        //Person p2 = new Person("Elton John", 72,"Musician", Pyshical_Data);
    }

    /**
     * Test the getName method from Person class
     */
    @Test
    void testGetAndSetNamePerson() {
        Person p = new Person("Elton John", 72);
        assertEquals("Elton John", p.getName());
    }

    /**
     * Test the getJob method from Person class
     */
    @Test
    void testGetJob() {
        Person p = new Person("Elton John", 72, "Musician");
        assertEquals("Musician", p.getJob());
    }

    /**
     * Test if the exception is throned when the name is null
     */
    @Test
    void testNullName() {
        assertThrows(NullPointerException.class, () -> {
            Person p = new Person(null, 72);
            p.getName();
        });
    }

    /**
     * Test if the exception is throned when the name or age or job is null
     */
    @Test
    void testNullNameAgeAndJob() {

        Person min = new Person("Elton John", 1, "Musician");
        Person max = new Person("Elton John", 144, "Musician");

        assertThrows(NullPointerException.class, () -> {
            Person p = new Person(null, 72, "Musician");
            p.getName();
            p.getJob();
            p.getAge();
        });

        assertThrows(NullPointerException.class, () -> {
            Person p = new Person("Elton John", 72, null);
            p.getName();
            p.getJob();
        });
        /**
         * Age
         */
        assertEquals(1, min.getAge());
        assertEquals(144, max.getAge());

        assertThrows(NullPointerException.class, () -> {
            Person p = new Person("Elton John", 200, "Musician");
            p.getName();
            p.getJob();
            p.getAge();
        });

    }


}
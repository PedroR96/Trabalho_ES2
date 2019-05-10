import People.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {


    /**
     * Test the Person Constructor
     */
    @Test
    void testConstructor() {
        Person p = new Person("Elton John");
    }

    /**
     * Test the getName method from Person class
     */
    @Test
    void testGetAndSetNamePerson() {
        Person p = new Person("Elton John");
        assertEquals("Elton John", p.getName());
    }

    /**
     * Test the getJob method from Person class
     */
    @Test
    void testGetJob() {
        Person p = new Person("Elton John", "Musician");
        assertEquals("Musician", p.getJob());
    }


}
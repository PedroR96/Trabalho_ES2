import People.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class EmployeeTest {

    @Test
    void TestgetNameEmployee() {
        Employee e = new Employee("Mary Jane", 28);
        assertEquals("Mary Jane", e.getName());
    }

    @Test
    void TestgetAgeEmployee() {
        Employee e = new Employee("Mary Jane", 28);
        assertEquals(28, e.getAge());
    }

    /**
     * Test Employee Name and Age parameters
     */
    @Test
    void testGetNameAndAge(){
        assertThrows(NullPointerException.class, ()->{
            Employee e = new Employee("",20);
            e.getName();
        });

        assertThrows(NullPointerException.class, ()->{
            Employee e = new Employee("sjdkflrtopemdmsksd,vfmkfjvjvjgjjgjgjglknbdaçloblviubsalicbwal",20);
            e.getName();
        });

        assertThrows(NullPointerException.class, ()->{
            Employee e = new Employee("Ana",200);
            e.getName();
        });

        assertThrows(NullPointerException.class, ()->{
            Employee e = new Employee("Ana",0);
            e.getName();
        });
    }

}
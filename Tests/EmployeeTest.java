import People.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}
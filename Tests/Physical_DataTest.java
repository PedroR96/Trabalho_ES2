import People.Person;
import People.Physical_Data;
import org.junit.jupiter.api.Test;

class Physical_DataTest {
    @Test
    void checkPesoLimits() {
        Physical_Data n1 = new Physical_Data(70, 10, 182, 40, 20, 10, 20, 70, 20, 214);
        Person P = new Person("Inacio", "Apanhador de lixo", n1);

    }
}
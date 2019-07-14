import Utils.FileFunctions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileFunctionsTest {

    @Test
    void testReadCSV(){
        FileFunctions f = new FileFunctions();
        Boolean boolea= true;
        try{
            f.readCSV("Assets/CALCULOCSV.csv");
        }catch (Exception e){
            boolea = false;
        }
        assertTrue(boolea);
    }

    @Test
    void testReadCSVWrongPath(){
        FileFunctions f = new FileFunctions();
        assertThrows(AssertionError.class,()->f.readCSV("AsCALCULOCSV.csv"));
    }

    @Test
    void testReadFileFour(){
        FileFunctions f = new FileFunctions();
        Boolean boolea= true;
        try{
            f.readFileFour("Assets/Folha 4.csv");
        }catch (Exception e){
            boolea = false;
        }
        assertTrue(boolea);
    }

    @Test
    void testReadFileFourWrongPath(){
        FileFunctions f = new FileFunctions();
        assertThrows(AssertionError.class,()->f.readFileFour("AsCALCULOCSV.csv"));
    }


    @Test
    void testReadFiletwo(){
        FileFunctions f = new FileFunctions();
        Boolean boolea= true;
        try{
            f.readFiletwo("Assets/Folha 2.csv");
        }catch (Exception e){
            boolea = false;
        }
        assertTrue(boolea);
    }

    @Test
    void testReadFiletwoWrongPath(){
        FileFunctions f = new FileFunctions();
        assertThrows(AssertionError.class,()->f.readFiletwo("AsCALCULOCSV.csv"));
    }



    @Test
    void testReadFileOne(){
        FileFunctions f = new FileFunctions();
        Boolean boolea= true;
        try{
            f.readFileOne("Assets/Folha 1.csv");
        }catch (Exception e){
            boolea = false;
        }
        assertTrue(boolea);
    }

    @Test
    void testReadFileOneWrongPath(){
        FileFunctions f = new FileFunctions();
        assertThrows(AssertionError.class,()->f.readFileOne("AsCALCULOCSV.csv"));
    }


    @Test
    void testReadFileThree(){
        FileFunctions f = new FileFunctions();
        Boolean boolea= true;
        try{
            f.readFileThree("Assets/Folha 3.csv");
        }catch (Exception e){
            boolea = false;
        }
        assertTrue(boolea);
    }

    @Test
    void testReadFileThreeWrongPath(){
        FileFunctions f = new FileFunctions();
        assertThrows(AssertionError.class,()->f.readFileThree("AsCALCULOCSV.csv"));
    }




}
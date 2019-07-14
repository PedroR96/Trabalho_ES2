package Utils;

import Food.NutricionalSpecs;
import Medical_Information.FoodHabits;
import Medical_Information.Physical_Data;
import People.Person;
import com.opencsv.CSVReader;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class FileFunctions {

    public FileFunctions() {
    }


    /**
     * Read a CSV File to get nutricional specs
     */
    public HashMap<String, NutricionalSpecs> readCSV(String relactivePath) {
        HashMap<String, NutricionalSpecs> productNutricionalSpecs = new HashMap<>();
        String nutSpecs;
        Path path1 = Paths.get(relactivePath);
        try {
            Reader reader = Files.newBufferedReader(path1);
            CSVReader csvReader = new CSVReader(reader);
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                nutSpecs = "";

                for (String s : nextRecord) {
                    nutSpecs += s + ";";
                }

                NutricionalSpecs nutricionalSpecs1 = new NutricionalSpecs(nutSpecs);
                productNutricionalSpecs.put(nutricionalSpecs1.getProductID(), nutricionalSpecs1);
            }
        } catch (Exception e) {
            assert false;
        }
        return productNutricionalSpecs;
    }

    /**
     * Read CSV to get folha 2 values
     */

    public FoodHabits readFileFour(String relactivePath) {
        Path path1 = Paths.get(relactivePath);
        String specs = "";
        try {
            Reader reader = Files.newBufferedReader(path1);
            CSVReader csvReader = new CSVReader(reader);
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                for (String k : nextRecord) {
                    specs += k + ",";
                }
            }
        } catch (Exception e) {

            assert false;
        }
        return new FoodHabits(specs);
    }


    public FoodHabits readFiletwo(String relactivePath) {

        Path path1 = Paths.get(relactivePath);

        String specs = "";
        try {
            Reader reader = Files.newBufferedReader(path1);
            CSVReader csvReader = new CSVReader(reader);
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                for (String k : nextRecord) {
                    specs += k + ",";
                }
            }
        } catch (Exception e) {
            assert false;
        }
        return new FoodHabits(specs);
    }

    /**
     * Read CSV to get folha 1 values
     */
    public Person readFileOne(String relactivePath) {
        String data = "";
        Path path1 = Paths.get(relactivePath);
        try {
            Reader reader = Files.newBufferedReader(path1);
            CSVReader csvReader = new CSVReader(reader);
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {

                for (String k : nextRecord) {
                    data += k + ";";
                }
            }
        } catch (Exception e) {
            assert false;
        }
        return new Person(data);
    }

    /**
     * Read File 3
     */

    public Physical_Data readFileThree(String relactivePath) {

        Path path1 = Paths.get(relactivePath);
        String specs = "";
        try {
            Reader reader = Files.newBufferedReader(path1);
            CSVReader csvReader = new CSVReader(reader);
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {

                for (String k : nextRecord) {
                    specs += k + ",";
                }
            }
        } catch (Exception e) {
            assert false;
        }
        return new Physical_Data(specs);
    }

}

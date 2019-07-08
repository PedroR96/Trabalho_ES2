package Utils;

import Food.NutricionalSpecs;
import Medical_Information.FoodHabits;
import Medical_Information.Physical_Data;
import People.MaxCharacters;
import People.Person;
import com.opencsv.CSVReader;

import java.awt.*;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class FileFunctions {

    public FileFunctions() {
    }

    /**
     * Get the File Path
     *
     * @return path
     */
    public static String getFilePath(String title) {
        FileDialog dialog = new FileDialog((Frame) null, title);
        dialog.setMode(FileDialog.LOAD);
        dialog.setVisible(true);
        return dialog.getDirectory() + dialog.getFile();
    }

    public static void main(String[] args) throws MaxCharacters {

        //FileFunctions f = new FileFunctions();
        //f.readCSV("CALCULO");
        //f.readFiletwo("FOLHA 2");
        //f.readFileThree("FOLHA 3");


        String s = "85.0";

        try
        {
            float f = Float.valueOf(s.trim()).floatValue();

            System.out.println("float f = " + f + "\n" + Float.parseFloat(s));
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("NumberFormatException: " + nfe.getMessage());
        }

    }

    /**
     * Read a CSV File to get nutricional specs
     */
    public HashMap<String, NutricionalSpecs> readCSV() {
        HashMap<String, NutricionalSpecs> productNutricionalSpecs = new HashMap<>();
//        String path = getFilePath("Escolha o ficheiro com a tabela nutricional");
        String nutSpecs;
        Path path1=Paths.get("Assets/CALCULOCSV.csv");
//        System.out.println(path1);

        try {
            Reader reader = Files.newBufferedReader(path1);
            CSVReader csvReader = new CSVReader(reader);
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                nutSpecs = "";

                for (String s : nextRecord) {
                    nutSpecs += s + ";";
                }

                //System.out.println(nutSpecs);
                NutricionalSpecs nutricionalSpecs1 = new NutricionalSpecs(nutSpecs);
                productNutricionalSpecs.put(nutricionalSpecs1.getProductID(), nutricionalSpecs1);
            }
        } catch (Exception e) {
            System.out.println(e);
            e.getStackTrace();
        }
        return productNutricionalSpecs;
    }

    /**
     * Read CSV to get folha 2 values
     */

    public FoodHabits  readFileFour(String title) throws MaxCharacters {
//        String path = getFilePath(title);
        Path path1=Paths.get("Assets/Folha 4.csv");
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
            System.out.println("readFiletwo: " + e);
            e.getStackTrace();
        }
        return new FoodHabits(specs);
    }


    public FoodHabits readFiletwo(String title) throws MaxCharacters {
//        String path = getFilePath(title);
        Path path1=Paths.get("Assets/Folha 2.csv");

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
            System.out.println("readFiletwo: " + e);
            e.getStackTrace();
        }
        return new FoodHabits(specs);
    }

    /**
     * Read CSV to get folha 1 values
     */
    public Person readFileOne(String title) {
//        String path = getFilePath(title);
        String data="";
        Path path1=Paths.get("Assets/Folha 1.csv");
        try {
            Reader reader = Files.newBufferedReader(path1);
            CSVReader csvReader = new CSVReader(reader);
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {

                for (String k : nextRecord) {
                    //System.out.println(k);v
                    data += k + ";";
                }
            }

        } catch (Exception e) {
            System.out.println(e);
            e.getStackTrace();
        }
        return new Person(data);
    }

    /**
     * Read File 3
     */

    public Physical_Data readFileThree(String title) throws MaxCharacters {
//        String path = getFilePath(title);
        Path path1=Paths.get("Assets/Folha 3.csv");
        String specs = "";
        try {
            Reader reader = Files.newBufferedReader(path1);
            CSVReader csvReader = new CSVReader(reader);
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {

                for (String k : nextRecord) {
                    //System.out.println(k);
                    specs += k + ",";
                }
            }
        } catch (Exception e) {
            System.out.println(e);
            e.getStackTrace();
        }
        return new Physical_Data(specs);
    }

}

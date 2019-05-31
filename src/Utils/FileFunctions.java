package Utils;

import Food.NutricionalSpecs;
import com.opencsv.CSVReader;

import java.awt.*;
import java.io.Reader;
import java.nio.file.Files;
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
    public static String getFilePath() {
        FileDialog dialog = new FileDialog((Frame) null, "Escolha um ficheiro");
        dialog.setMode(FileDialog.LOAD);
        dialog.setVisible(true);
        return dialog.getDirectory() + dialog.getFile();
    }

    public static void main(String[] args) {

        FileFunctions f = new FileFunctions();
        //f.readCSV();
        f.readFiletwo();


    }

    /**
     * Read a CSV File to get nutricional specs
     */
    public HashMap<String, NutricionalSpecs> readCSV() {
        HashMap<String, NutricionalSpecs> productNutricionalSpecs = new HashMap<>();
        String path = getFilePath();
        String nutSpecs;
        try {
            Reader reader = Files.newBufferedReader(Paths.get(path));
            CSVReader csvReader = new CSVReader(reader);
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {

                nutSpecs = "";
                for (int i = 0; i < 43; i++) {
                    //System.out.println(nextRecord[i]);
                    nutSpecs += nextRecord[i] + ";";
                }
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
    public void readFiletwo() {
        String path = getFilePath();
        String specs;
        try {
            Reader reader = Files.newBufferedReader(Paths.get(path));
            CSVReader csvReader = new CSVReader(reader);
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {

                specs = "";
                for (String k : nextRecord){
                    //System.out.println(k);
                    specs += k;
                }
                specs += "|";
                System.out.println(specs);
            }


        } catch (Exception e) {
            System.out.println(e);
            e.getStackTrace();
        }

    }


    /**
     * Write in a CSV File
     */
    public void writeCSV() {


    }

}

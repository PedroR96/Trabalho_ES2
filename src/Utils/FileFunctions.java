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


    /**
     * Read a CSV File
     */
    public  HashMap<String, NutricionalSpecs>  readCSV() {
        String path = getFilePath();
        HashMap<String, NutricionalSpecs> productNutricionalSpecs;

        try {
            Reader reader = Files.newBufferedReader(Paths.get(path));
            CSVReader csvReader = new CSVReader(reader);
            String[] nextRecord;

            while ((nextRecord = csvReader.readNext()) != null) {

                for (int i = 0; i < 43; i++) {

                    System.out.println(nextRecord[i]);
                }

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



    public static void main(String[] args) {

        FileFunctions f = new FileFunctions();
        f.readCSV();


    }

}

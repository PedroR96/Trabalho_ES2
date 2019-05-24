package Utils;

import com.opencsv.CSVReader;

import java.awt.*;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileFunctions {

    private static final String CSV_FILE_NAME = "Plano_Alimentar";

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
    public void readCSV() {
        String path = getFilePath();

        try {
            Reader reader = Files.newBufferedReader(Paths.get(path));
            CSVReader csvReader = new CSVReader(reader);
            String[] nextRecord;

            for ( String s : csvReader.readNext()){
                System.out.println(s);
            }

/*
            while ((nextRecord = csvReader.readNext()) != null) {
                System.out.println("Name : " + nextRecord[0]);
                System.out.println("Email : " + nextRecord[1]);
                System.out.println("Phone : " + nextRecord[2]);
                System.out.println("Country : " + nextRecord[3]);
                System.out.println("==========================");
            }*/
        } catch (Exception e) {
            System.out.println(e);
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

import Food.NutricionalSpecs;
import Utils.FileFunctions;

import java.util.HashMap;

public class Main {

    private static HashMap<String, NutricionalSpecs> productNutricionalSpecs = new HashMap<>();;

    private static FileFunctions fileFunctions = new FileFunctions();

    public static void main(String[] args) {

        /**
         * Upload table to hashmap
         */

        productNutricionalSpecs = fileFunctions.readCSV();



    }


}

package Utils;

import Food.NutricionalSpecs;

import java.util.HashMap;

public class ProductSpecifications {

     private static HashMap<String, NutricionalSpecs> productNutricionalSpecs;


    public static HashMap<String, NutricionalSpecs> getProductNutricionalSpecs() {
        return productNutricionalSpecs;
    }

    public static void setProductNutricionalSpecs(HashMap<String, NutricionalSpecs> productNutricionalSpecs) {
        ProductSpecifications.productNutricionalSpecs = productNutricionalSpecs;
    }

    public static void addProductNutricionalSpecs(String productID, NutricionalSpecs nutSpecs) {
        productNutricionalSpecs.put(productID, nutSpecs);

    }


}

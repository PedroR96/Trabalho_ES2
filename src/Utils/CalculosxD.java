package Utils;

import Food.Meal;
import Food.NutricionalSpecs;
import Food.Product;
import Medical_Information.FoodHabits;

import java.util.HashMap;

public class CalculosxD {
//    Mulher-655,1 + 9,5 x Peso (kg) + 1,8 x Altura (cm) – 4,7 x idade (anos)
//    Homem-66,5 + 13,8 x Peso (kg) + 5 x altura (cm) – 6,8 x idade (anos)


    Float TMB;
    Float weight;
    Float size;
    Integer age;
    String gender;
    HashMap<String, Float> activityFactor = new HashMap<>();
    HashMap<String, Float> injurieFactor = new HashMap<>();
    HashMap<Integer, Float> termicalFactor = new HashMap<>();


    public CalculosxD() {

        //Initialize termicalFactor

        termicalFactor.put(38, 1.1f);
        termicalFactor.put(39, 1.2f);
        termicalFactor.put(40, 1.3f);
        termicalFactor.put(41, 1.4f);

        //Initialize activityFactor
        activityFactor.put("Acamado", 1.2f);
        activityFactor.put("Acamado + móvel", 1.25f);
        activityFactor.put("Deambulando", 1.3f);


        //Initialize InjurieFactor
        injurieFactor.put("Paciente não complicado", 1f);
        injurieFactor.put("Pós operatório oncológico", 1.1f);
        injurieFactor.put("Fratura ossos longos", 1.2f);
        injurieFactor.put("Sepse moderada", 1.3f);
        injurieFactor.put("Peritonite", 1.4f);
        injurieFactor.put("Politrauma em reabilitação", 1.5f);
        injurieFactor.put("Politrauma + Sepse", 1.6f);
        injurieFactor.put("Queimadura 30 a 50%", 1.7f);
        injurieFactor.put("Queimadura 50 a 70%", 1.8f);
        injurieFactor.put("Queimadura 70 a 90%", 2f);

    }

/*
    public void calculateEnergyUsingHarris(Float weight, Float size, Integer age, String gender, String activity, Integer termical, String injurie) {

        if (gender.equalsIgnoreCase("Masculino"))
            TMB = (66.5f) + ((13.8f * weight) + (5 * (size * 100)) - (6.8f * age));
        else if (gender.equalsIgnoreCase("Feminino"))
            TMB = (655.1f) + ((9.5f * weight) + (1.8f * (size * 100)) - (4.7f * age));


        float x = activityFactor.get(activity);
        float y = injurieFactor.get(injurie);
        float z = termicalFactor.get(termical);

        Float energyWaste = TMB * x * y * z;


        System.out.println(" Taxa Metabólica Basal: " + TMB);
        System.out.println(" Gasto Energético Total: " + energyWaste);


    }*/


    public NutricionalSpecs calculateTotalNutrientsPlan(FoodHabits plan, HashMap<String, NutricionalSpecs> productNutricionalSpecs) {

        assert plan != null;
        assert productNutricionalSpecs != null;

        NutricionalSpecs planNutricionalSpecifications = new NutricionalSpecs("0000;0000;0000;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;");

        for (Meal meal : plan.getMeals()) {
            System.out.println("Meal: " + meal.getDescription());

            for (Product prod : meal.getProducts()) {
                planNutricionalSpecifications.sum(productNutricionalSpecs.get(prod.getProductID()), prod.getAmount());

                System.out.println("\tProduct: " + productNutricionalSpecs.get(prod.getProductID()).getName());
                System.out.println("\tAmount: " + prod.getAmount());

            }
            System.out.println("\n   ");

        }
        return planNutricionalSpecifications;
    }

}

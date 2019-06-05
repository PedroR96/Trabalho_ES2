package Medical_Information;
import java.util.HashMap;
import Enum.*;


public class Quiz {
    private String reason;
    private String objective;
    private String pathologies;
    private String medication;
    private String familyHistory;
    private PhisicalActivity phisicalActivity;
    private FuncIntestinal intestinalFunction;
    private WaterConsuption waterConsuming;
    private HashMap<String, String> chemistsAndBiologicalData;

    public Quiz(String reason, String objective, String pathologies, String medication, String familyHistory, String phisicalActivity, String intestinalFunction, String waterConsuming, HashMap<String, String> chemistsAndBiologicalData) {
        this.reason = reason;
        this.objective = objective;
        this.pathologies = pathologies;
        this.medication = medication;
        this.familyHistory = familyHistory;
        this.phisicalActivity = PhisicalActivity.valueOf(phisicalActivity) ;
        this.intestinalFunction = FuncIntestinal.valueOf(intestinalFunction);
        this.waterConsuming = WaterConsuption.valueOf(waterConsuming);
        this.chemistsAndBiologicalData = chemistsAndBiologicalData;
//        System.out.println(" this.objective "+ this.objective );
//        System.out.println(" this.pathologies "+ this.pathologies );
//        System.out.println("this.medication "+this.medication );
//        System.out.println(" this.familyHistory"+ this.familyHistory);
//        System.out.println("   this.phisicalActivity "+   this.phisicalActivity );
//        System.out.println("this.intestinalFunction "+this.intestinalFunction );
//        System.out.println("  this.waterConsuming "+  this.waterConsuming );
//        System.out.println("    this.chemistsAndBiologicalData "+    this.chemistsAndBiologicalData);
         }

    public String getReason() {
        return reason;
    }

    public String getObjective() {
        return objective;
    }

    public String getPathologies() {
        return pathologies;
    }

    public String getMedication() {
        return medication;
    }

    public String getFamilyHistory() {
        return familyHistory;
    }

    public String getPhisicalActivity() {
        return phisicalActivity.toString();
    }

    public String getIntestinalFunction() {
        return intestinalFunction.toString();
    }

    public String getWaterConsuming() {
        return waterConsuming.toString();
    }

    public HashMap<String, String> getChemistsAndBiologicalData() {
        return chemistsAndBiologicalData;
    }
}

package Medical_Information;
import Enum.*;
import java.util.HashMap;


public class Quiz {
    private String reason;
    private String objective;
    private String pathologies;
    private PhisicalActivity phisicalActivity;
    private FuncIntestinal funcIntestinal;
    private WaterConsuption waterConsuption;
    private String medication;
    private String familyHistory;
    private HashMap<String, String> chemistsAndBiologicalData;

    public Quiz(String reason, String objective, String pathologies, String medication, String familyHistory, String intestinalFunction, String waterConsuming, HashMap<String, String> chemistsAndBiologicalData) {
        this.reason = reason;
        this.objective = objective;
        this.pathologies = pathologies;
        this.medication = medication;
        this.familyHistory = familyHistory;
        this.chemistsAndBiologicalData = chemistsAndBiologicalData;
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

    public PhisicalActivity getPhisicalActivity() {
        return phisicalActivity;
    }

    public FuncIntestinal getFuncIntestinal() {
        return funcIntestinal;
    }

    public WaterConsuption getWaterConsuption() {
        return waterConsuption;
    }

    public String getMedication() {
        return medication;
    }

    public String getFamilyHistory() {
        return familyHistory;
    }

    public HashMap<String, String> getChemistsAndBiologicalData() {
        return chemistsAndBiologicalData;
    }
}
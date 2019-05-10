package People;

import java.util.HashMap;

public class Quiz {
    private String reason;
    private String objective;
    private String pathologies;
    private String medication;
    private String familyHistory;
    private String phisicalActivity;
    private String intestinalFunction;
    private String waterConsuming;
    private HashMap<String,String> chemistsAndBiologicalData;

    public Quiz(String reason, String objective, String pathologies, String medication, String familyHistory, String phisicalActivity, String intestinalFunction, String waterConsuming, HashMap<String, String> chemistsAndBiologicalData) {
        this.reason = reason;
        this.objective = objective;
        this.pathologies = pathologies;
        this.medication = medication;
        this.familyHistory = familyHistory;
        this.phisicalActivity = phisicalActivity;
        this.intestinalFunction = intestinalFunction;
        this.waterConsuming = waterConsuming;
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
    public String getMedication() {
        return medication;
    }

    public String getFamilyHistory() {
        return familyHistory;
    }

    public String getPhisicalActivity() {
        return phisicalActivity;
    }

    public String getIntestinalFunction() {
        return intestinalFunction;
    }

    public String getWaterConsuming() {
        return waterConsuming;
    }

    public HashMap<String, String> getChemistsAndBiologicalData() {
        return chemistsAndBiologicalData;
    }
}

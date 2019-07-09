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
    public Quiz(){}
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

    public void setReason(String reason) {
        assert reason!=null;
        assert !reason.isEmpty();
        assert reason.length()<50;
        this.reason = reason;
    }

    public void setObjective(String objective) {
        assert objective!=null;
        assert !objective.isEmpty();
        assert objective.length()<50;
        this.objective = objective;
    }

    public void setPathologies(String pathologies) {
        assert pathologies!=null;
        assert !pathologies.isEmpty();
        assert pathologies.length()<50;

        this.pathologies = pathologies;
    }

    public void setMedication(String medication) {
        assert medication!=null;
        assert !medication.isEmpty();
        assert medication.length()<50;

        this.medication = medication;
    }

    public void setFamilyHistory(String familyHistory) {
        assert familyHistory!=null;
        assert !familyHistory.isEmpty();
        assert familyHistory.length()<50;
        this.familyHistory = familyHistory;
    }

    public void setPhisicalActivity(String phisicalActivity) {
               this.phisicalActivity =  PhisicalActivity.valueOf(phisicalActivity);
    }

    public void setIntestinalFunction(String intestinalFunction) {
        this.intestinalFunction = FuncIntestinal.valueOf(intestinalFunction);

    }

    public void setWaterConsuming(String waterConsuming) {
        this.waterConsuming = WaterConsuption.valueOf(waterConsuming);
    }

    public void setChemistsAndBiologicalData(HashMap<String, String> chemistsAndBiologicalData) {
        assert chemistsAndBiologicalData!=null;
        assert !chemistsAndBiologicalData.isEmpty();
        this.chemistsAndBiologicalData = chemistsAndBiologicalData;
    }
}

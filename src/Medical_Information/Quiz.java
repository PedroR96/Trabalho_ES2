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


    public Quiz(String reason, String objective, String pathologies,
                String medication, String familyHistory,
                String phisicalActivity, String intestinalFunction,
                String waterConsuming,
                HashMap<String, String> chemistsAndBiologicalData) {
        assert reason!=null;
        assert !reason.isEmpty();
        assert reason.length()<50;

        this.reason = reason;

        assert objective!=null;
        assert !objective.isEmpty();
        assert objective.length()<50;
        this.objective = objective;

        assert pathologies!=null;
        assert !pathologies.isEmpty();
        assert pathologies.length()<50;
        this.pathologies = pathologies;

        assert medication!=null;
        assert !medication.isEmpty();
        assert medication.length()<50;
        this.medication = medication;

        assert familyHistory!=null;
        assert !familyHistory.isEmpty();
        assert familyHistory.length()<50;
        this.familyHistory = familyHistory;

        assert phisicalActivity!=null;
        assert !phisicalActivity.isEmpty();
        this.phisicalActivity = PhisicalActivity.valueOf(phisicalActivity) ;

        assert intestinalFunction!=null;
        assert !intestinalFunction.isEmpty();
        this.intestinalFunction = FuncIntestinal.valueOf(intestinalFunction);

        assert waterConsuming!=null;
        assert !waterConsuming.isEmpty();
        this.waterConsuming = WaterConsuption.valueOf(waterConsuming);

        assert chemistsAndBiologicalData!=null;
        assert !chemistsAndBiologicalData.isEmpty();
        this.chemistsAndBiologicalData = chemistsAndBiologicalData;
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
        assert phisicalActivity!=null;
        assert !phisicalActivity.isEmpty();
               this.phisicalActivity =  PhisicalActivity.valueOf(phisicalActivity);
    }

    public void setIntestinalFunction(String intestinalFunction) {
      assert intestinalFunction!=null;
        assert !intestinalFunction.isEmpty();
        this.intestinalFunction = FuncIntestinal.valueOf(intestinalFunction);

    }

    public void setWaterConsuming(String waterConsuming) {
        assert waterConsuming!=null;
        assert !waterConsuming.isEmpty();
        this.waterConsuming = WaterConsuption.valueOf(waterConsuming);
    }

    public void setChemistsAndBiologicalData(HashMap<String, String> chemistsAndBiologicalData) {
        assert chemistsAndBiologicalData!=null;
        assert !chemistsAndBiologicalData.isEmpty();
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

}

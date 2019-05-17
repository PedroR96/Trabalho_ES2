package Medical_Information;

public class Physical_Data {

    private float weight;
    private float height;
    private float IMC;
    private float BF;
    private float visceralFat;
    private float muscle;
    private float metabolicAge;
    private float H2O;
    private float metabolicBasal;
    private int bone;

    public Physical_Data(float weight, float height, float IMC, float BF, float visceralFat, float muscle, float metabolicAge, float h2O, float metabolicBasal, int bone) {
        this.weight = weight;
        this.height = height;
        this.IMC = IMC;
        this.BF = BF;
        this.visceralFat = visceralFat;
        this.muscle = muscle;
        this.metabolicAge = metabolicAge;
        H2O = h2O;
        this.metabolicBasal = metabolicBasal;
        this.bone = bone;
    }
    public float getWeight() {
        return weight;
    }

    public float getHeight() {
        return height;
    }

    public float getIMC() {
        return IMC;
    }

    public float getBF() {
        return BF;
    }

    public float getVisceralFat() {
        return visceralFat;
    }

    public float getMuscle() {
        return muscle;
    }

    public float getMetabolicAge() {
        return metabolicAge;
    }

    public float getH2O() {
        return H2O;
    }

    public float getMetabolicBasal() {
        return metabolicBasal;
    }

    public int getBone() {
        return bone;
    }
}

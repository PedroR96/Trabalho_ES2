package People;

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

    public Physical_Data(float peso, float altura, float IMC, float BF, float gorduraV, float musculo, float idadeMetabo, float h2O, float metabolismoBassal, int osso) {
        this.weight = peso;
        this.height = altura;
        this.IMC = IMC;
        this.BF = BF;
        visceralFat = gorduraV;
        muscle = musculo;
        metabolicAge = idadeMetabo;
        H2O = h2O;
        metabolicBasal = metabolismoBassal;
        bone = osso;
    }

    public float getPeso() {
        return weight;
    }

    public void setPeso(float peso) {
        this.weight = peso;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getIMC() {
        return IMC;
    }

    public void setIMC(float IMC) {
        this.IMC = IMC;
    }

    public float getBF() {
        return BF;
    }

    public void setBF(float BF) {
        this.BF = BF;
    }

    public float getVisceralFat() {
        return visceralFat;
    }

    public void setVisceralFat(float visceralFat) {
        this.visceralFat = visceralFat;
    }

    public float getMuscle() {
        return muscle;
    }

    public void setMuscle(float muscle) {
        this.muscle = muscle;
    }

    public float getMetabolicAge() {
        return metabolicAge;
    }

    public void setMetabolicAge(float metabolicAge) {
        this.metabolicAge = metabolicAge;
    }

    public float getH2O() {
        return H2O;
    }

    public void setH2O(float h2O) {
        H2O = h2O;
    }

    public float getMetabolicBasal() {
        return metabolicBasal;
    }

    public void setMetabolicBasal(float metabolicBasal) {
        this.metabolicBasal = metabolicBasal;
    }

    public int getBone() {
        return bone;
    }

    public void setBone(int bone) {
        this.bone = bone;
    }

}

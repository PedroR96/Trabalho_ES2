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

    public Physical_Data() {

    }

    public void setWeight(float weight) throws MaxCharacters {
        if(weight > 635.0 || weight < 0 )
            throw new MaxCharacters();
        this.weight = weight;
    }

    public void setHeight(float height) throws MaxCharacters {
        if( height<54.5 && height > 2.72)
            throw  new MaxCharacters();
        this.height = height;
    }

    public void setIMC(float IMC) throws MaxCharacters {
        if(IMC < 0 && IMC > 30)
            throw  new MaxCharacters();
        this.IMC = IMC;
    }

    public void setBF(float BF) throws MaxCharacters {
        if(BF < 5 && BF > 50)
          throw new MaxCharacters();
        this.BF = BF;
    }

    public void setVisceralFat(float visceralFat) throws MaxCharacters {
        if(visceralFat<0 && visceralFat >60)
            throw new MaxCharacters();
        this.visceralFat = visceralFat;
    }

    public void setMuscle(float muscle) throws MaxCharacters {
        if(muscle < 0 && muscle > 90)
            throw new MaxCharacters();
        this.muscle = muscle;
    }

    public void setMetabolicAge(float metabolicAge) {
        this.metabolicAge = metabolicAge;
    }

    public void setH2O(float h2O) {
        H2O = h2O;
    }

    public void setMetabolicBasal(float metabolicBasal) {
        this.metabolicBasal = metabolicBasal;
    }

    public void setBone(int bone) {
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

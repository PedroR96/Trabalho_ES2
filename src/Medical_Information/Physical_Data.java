package Medical_Information;

import People.MaxCharacters;

public class Physical_Data {

    private float weight;
    private float height;
    private float IMC;
    private float BF;
    private float visceralFat;
    private float muscle;
    private int metabolicAge;
    private float H2O;
    private float metabolicBasal;
    private int bone;

    public Physical_Data(String s)  {
        assert s!=null;
        assert !s.isEmpty();

        String[] specs = s.split(",");
        String sub =specs[0].substring(1, specs[0].length());

        Float x=Float.parseFloat(specs[0].substring(1, specs[0].length()));
        this.setHeight(Float.parseFloat(specs[1]));
        this.setIMC(Float.parseFloat(specs[2]));
        this.setBF(Float.parseFloat(specs[3]));
        this.setVisceralFat(Float.parseFloat(specs[4]));
        this.setMuscle(Float.parseFloat(specs[5]));
        this.setMetabolicAge(Integer.parseInt(specs[6]));
        this.setH2O(Float.parseFloat(specs[7]));
        this.setMetabolicBasal(Float.parseFloat(specs[8]));
        this.setBone(Integer.parseInt(specs[9]));
    }


    public Physical_Data() {
    }



    public float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        assert weight !=null;
        assert weight > 2.1;
        assert weight < 635.0 ;

        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(Float height) {

        assert height !=null;
        assert height >  0.53;
        assert height < 2.72 ;

        this.height = height;
    }

    public float getIMC() {
        return IMC;
    }

    public void setIMC(Float IMC)
    {

        assert IMC !=null;
        assert IMC > 2.00;
        assert IMC < 30.00;

        this.IMC = IMC;
    }

    public float getBF() {
        return BF;
    }

    public void setBF(Float BF){

        assert BF !=null;
        assert BF > 5.00;
        assert BF < 50.00;

        this.BF = BF;
    }

    public float getVisceralFat() {
        return visceralFat;
    }

    public void setVisceralFat(Float visceralFat)  {

        assert visceralFat !=null;
        assert visceralFat > 0.00;
        assert visceralFat < 60.00;


        this.visceralFat = visceralFat;
    }

    public float getMuscle() {
        return muscle;
    }

    public void setMuscle(Float muscle) {
        assert muscle !=null;
        assert muscle > 0.0;
        assert muscle < 90.0;

        this.muscle = muscle;
    }

    public float getMetabolicAge() {
        return metabolicAge;
    }

    public void setMetabolicAge(Integer metabolicAge) {

        assert metabolicAge !=null;
        assert metabolicAge > 1;
        assert metabolicAge < 90;


        this.metabolicAge = metabolicAge;
    }

    public float getH2O() {
        return H2O;
    }

    /*
     *
     *
     *Testes deste campo e como calcular e quais os limites
     *
     *
     * */
    public void setH2O(float h2O) {
        H2O = h2O;
    }

    public float getMetabolicBasal() {
        return metabolicBasal;
    }

    public void setMetabolicBasal(Float metabolicBasal) {
        assert metabolicBasal !=null;
        assert metabolicBasal > 500.0;
        assert metabolicBasal < 50000.0;

        this.metabolicBasal = metabolicBasal;
    }

    public int getBone() {
        return bone;
    }

    /*
     *
     *
     *Testes deste campo e como calcular e quais os limites
     *
     *
     * */
    public void setBone(Integer bone) {

        assert bone !=null;
        assert bone > 0;
        assert bone < 150;

        this.bone = bone;
    }
}

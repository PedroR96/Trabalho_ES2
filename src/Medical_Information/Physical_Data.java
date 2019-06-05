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

    public Physical_Data(String s) throws MaxCharacters {
        String[] specs = s.split(",");


        /**
         * Compor isto
         */
        try {
/*
            System.out.println("asdasd " + specs[0]);

            System.out.println("f2" + Float.valueOf(specs[0].concat("f").trim().replace(".",",")).floatValue());

            System.out.println( "Float " + Float.parseFloat(specs[0]));

            System.out.println( "DOUBLE " + Double.parseDouble(specs[0]));*/

            this.setWeight(Float.parseFloat(specs[0]));


        }catch (Exception e){
            System.out.println("EXCEPTION " + e.getMessage());
            e.printStackTrace();
        }

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

    /***********************************************
     * Getters
     ************************************************/

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) throws MaxCharacters {
        if (weight > 635.0 || weight < 2.1)
            throw new MaxCharacters();
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) throws MaxCharacters {
        if (height < 54.5 || height > 272.0)
            throw new MaxCharacters();
        this.height = height;
    }

    public float getIMC() {
        return IMC;
    }

    public void setIMC(float IMC) throws MaxCharacters {
        if (IMC < 2.00 || IMC > 30.00)
            throw new MaxCharacters();
        this.IMC = IMC;
    }

    public float getBF() {
        return BF;
    }

    public void setBF(float BF) throws MaxCharacters {
        if (BF < 5 || BF > 50)
            throw new MaxCharacters();
        this.BF = BF;
    }

    public float getVisceralFat() {
        return visceralFat;
    }

    public void setVisceralFat(float visceralFat) throws MaxCharacters {
        if (visceralFat < 0 || visceralFat > 60)
            throw new MaxCharacters();
        this.visceralFat = visceralFat;
    }

    public float getMuscle() {
        return muscle;
    }

    public void setMuscle(float muscle) throws MaxCharacters {
        if (muscle < 0 || muscle > 90)
            throw new MaxCharacters();
        this.muscle = muscle;
    }

    public float getMetabolicAge() {
        return metabolicAge;
    }

    public void setMetabolicAge(int metabolicAge) throws MaxCharacters {
        if (metabolicAge < 1 || metabolicAge > 90)
            throw new MaxCharacters();
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

    public void setMetabolicBasal(float metabolicBasal) throws MaxCharacters {
        if (metabolicBasal < 500 || metabolicBasal > 20000)
            throw new MaxCharacters();
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
    public void setBone(int bone) {
        this.bone = bone;
    }
}

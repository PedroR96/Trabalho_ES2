package People;

import Medical_Information.FoodHabits;
import Medical_Information.Physical_Data;
import Medical_Information.Quiz;

import java.util.HashMap;

public class Person {

    private String name;
    private String job;

    private float height;
    private int age;
    private Physical_Data physicalData;
    private Quiz quiz;
    private FoodHabits foodHabits;
    private FoodHabits newPlan;

    public Person() {
    }

    public Person(String name, int age) {
        if ((name.length() > 0 && name.length() < 40 ) && (age < 145 && age > 0)) {
            this.name = name;
            this.age = age;
        }else
            throw new NullPointerException();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setFoodHabits(FoodHabits foodHabits) {
        this.foodHabits = foodHabits;
    }

    public void setNewpPlan(FoodHabits newpPlan) {
        this.newpPlan = newpPlan;
    }

    public Person(String info) {
        String[] x=info.split(";");
        this.setName(x[0]);
        this.setAge(Integer.parseInt(x[1]));
        this.setHeight(Float.parseFloat(x[2]));
        this.setJob(x[3]);
        HashMap<String,String> aux=new HashMap<>();aux.put("colestrol",x[12].toString());aux.put("glicémia",x[13].toString());aux.put("ureia",x[14].toString());aux.put("ereatinina",x[15].toString());aux.put("profcoreatova",x[16].toString());
        this.setQuiz(new Quiz(x[4],x[5],x[6],x[7],x[8],x[9],x[10],x[11],aux));

    }
    public Person(String name, int age, String job) {
        if ((name.length() > 0 && name.length() < 40 ) && (age < 145 && age > 0) &&(job.length() > 0 && job.length() < 40)) {
            this.name = name;
            this.age = age;
            this.job = job;
        }else
            throw new NullPointerException();
    }


    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }

    public Physical_Data getPhysicalData() {
        return physicalData;
    }

    public void setPhysicalData(Physical_Data physicalData) {
        this.physicalData = physicalData;
    }

    public FoodHabits getFoodHabits() {
        return foodHabits;
    }

    public void setFoodHabits(FoodHabits foodHabits) {
        this.foodHabits = foodHabits;
    }

    public FoodHabits getNewPlan() {
        return newPlan;
    }

    public void setNewPlan(FoodHabits newPlan) {
        this.newPlan = newPlan;
    }
}

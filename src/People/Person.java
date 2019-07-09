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
    private String gender;
    private Physical_Data physicalData;
    private Quiz quiz;
    private FoodHabits foodHabits;
    private FoodHabits newPlan;


    public Person() {
    }

    public Person(String info) {
        assert  info!=null;
        String[] x=info.split(";");
        this.setName(x[0]);
        this.setAge(Integer.parseInt(x[1]));
        this.setGender(x[2]);
        this.setHeight(Float.parseFloat(x[3]));
        this.setJob(x[4]);
        HashMap<String,String> aux=new HashMap<>();aux.put("colestrol",x[13].toString());aux.put("glicémia",x[14].toString());aux.put("ureia",x[15].toString());aux.put("ereatinina",x[16].toString());aux.put("profcoreatova",x[17].toString());
        this.setQuiz(new Quiz(x[5],x[6],x[7],x[8],x[9],x[10],x[11],x[12],aux));
    }


    public void setName(String name) {
        assert name != null;
        assert name.length() > 2;
        assert name.length() < 40;
        this.name = name;
    }

    public void setJob(String job) {
        assert job != null;
        assert !job.isEmpty();
        assert job.length() < 50;
        this.job = job;
    }

    public void setAge(Integer age) {
        assert age != null;
        assert age > 0;
        assert age < 145;

        this.age = age;
    }

    public void setQuiz(Quiz quiz) {
        assert quiz != null;
        this.quiz = quiz;
    }


    public void setGender(String gender) {
        assert gender != null;
        assert !job.isEmpty();
        assert job.length() < 15;
        this.gender = gender; }

    public void setHeight(Float height) {

        assert height !=null;
        assert height >  0.53;
        assert height < 2.72 ;
        this.height = height;
    }

    public void setFoodHabits(FoodHabits foodHabits) {
        assert foodHabits!=null;
        this.foodHabits = foodHabits;
    }
    public void setNewPlan(FoodHabits newPlan) {
        assert newPlan!=null;
        this.newPlan = newPlan;
    }

    public void setPhysicalData(Physical_Data physicalData) {
        assert physicalData!=null;
        this.physicalData = physicalData;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public String getGender() { return gender; }

    public float getHeight() {
        return height;
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

    public FoodHabits getFoodHabits() {
        return foodHabits;
    }

    public FoodHabits getNewPlan() {
        return newPlan;
    }


}

package People;

import Medical_Information.FoodHabits;
import Medical_Information.Physical_Data;
import Medical_Information.Quiz;

public class Person {

    private String name;
    private String job;
    private int age;
    private Physical_Data physicalData;
    private Quiz quiz;
    private FoodHabits foodHabits;
    private FoodHabits newpPlan;

    public Person(String name, int age) {
        if ((name.length() > 0 && name.length() < 40 ) && (age < 145 && age > 0)) {
            this.name = name;
            this.age = age;
        }else
            throw new NullPointerException();
    }

    public Person(String name, int age, String job) {
        if ((name.length() > 0 && name.length() < 40 ) && (age < 145 && age > 0) &&(job.length() > 0 && job.length() < 40)) {
            this.name = name;
            this.age = age;
            this.job = job;
        }else
            throw new NullPointerException();
    }

    public Person(String name, int age, String job, Physical_Data physicalData) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.physicalData = physicalData;
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
}

package People;

import Medical_Information.Physical_Data;

public class Person {

    private String name;
    private String job;
    private Physical_Data physicalData;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public Person(String name, String job, Physical_Data physicalData) {
        this.name = name;
        this.job = job;
        this.physicalData = physicalData;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public Physical_Data getPhysicalData() {
        return physicalData;
    }

    public void setPhysicalData(Physical_Data physicalData) {
        this.physicalData = physicalData;
    }
}

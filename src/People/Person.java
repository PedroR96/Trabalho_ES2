package People;

public class Person {

    private String name;
    private int age;
    private float high;
    private String job;

    public Person(String name, int age, float high) {
        this.name = name;
        this.age = age;
        this.high = high;
    }

    public Person(String name, int age, float high, String job) {
        this.name = name;
        this.age = age;
        this.high = high;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHigh() {
        return high;
    }

    public void setHigh(float high) {
        this.high = high;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}

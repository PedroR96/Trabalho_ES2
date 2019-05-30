package People;

public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        if ((name.length() > 0 && name.length() < 40) && (age < 145 && age > 0)) {
            this.name = name;
            this.age = age;
        } else
            throw new NullPointerException();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

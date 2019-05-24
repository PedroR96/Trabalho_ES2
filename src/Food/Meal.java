package Food;

import java.sql.Time;

public class Meal {
    private String description;
    private Time schedule;
    private Product[] products;

    public Meal(String description, Time schedule, Product[] products) {
        this.description = description;
        this.schedule = schedule;
        this.products = products;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Time getSchedule() {
        return schedule;
    }

    public void setSchedule(Time schedule) {
        this.schedule = schedule;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}

package Food;

import java.sql.Time;
import java.util.ArrayList;

public class Meal {
    private String description;
    private Time schedule;
    private ArrayList<Product> products = new ArrayList<>();

    public Meal() {
    }

    public Meal(String description, Time schedule, ArrayList<Product> products) {
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

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(Product product) {
        if (product!= null)
            this.products.add(product);
        return;
    }
}

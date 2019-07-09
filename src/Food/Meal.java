package Food;

import java.sql.Time;
import java.util.ArrayList;

public class Meal {
    private String description;
    private Time schedule;
    private ArrayList<Product> products = new ArrayList<>();

    public Meal() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        assert description!=null;
        assert !description.isEmpty();
        assert description.length()<50;


        this.description = description;
    }

    public Time getSchedule() {
        return schedule;
    }

    public void setSchedule(Time schedule) {
        assert schedule!=null;

        this.schedule = schedule;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        assert products!=null;
        this.products.add(products);
    }
}
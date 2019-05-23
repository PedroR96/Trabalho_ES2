package Food;


public class Product {

    private String name;
    private float amount;
    private String amountDescription;
    private String productID;


    public Product(String name, float amount, String amountDescription, String productID) {
        this.name = name;
        this.amount = amount;
        this.amountDescription = amountDescription;
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getAmountDescription() {
        return amountDescription;
    }

    public void setAmountDescription(String amountDescription) {
        this.amountDescription = amountDescription;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }
}

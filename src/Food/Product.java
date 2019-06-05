package Food;


public class Product {

    private String productID;
    private float amount;
    private String amountDescription;

    public Product() {
    }

    public Product(String productID, float amount, String amountDescription) {
        this.productID = productID;
        this.amount = amount;
        this.amountDescription = amountDescription;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
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
}

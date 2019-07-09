package Food;


public class Product {

    private String productID;
    private float amount;
    private String amountDescription;

    public Product() {
    }


    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        assert productID!=null;
        assert !productID.isEmpty();

        assert productID.length()<50;
        this.productID = productID;
    }

    public float getAmount()
    {
        return amount;
    }

    public void setAmount(Float amount) {
        assert amount!=null;
        assert amount>0;

        this.amount = amount;
    }

    public String getAmountDescription()
    {
        return amountDescription;
    }

    public void setAmountDescription(String amountDescription) {
        assert amountDescription!=null;
        assert !amountDescription.isEmpty();
        assert amountDescription.length()<50;

        this.amountDescription = amountDescription;
    }
}

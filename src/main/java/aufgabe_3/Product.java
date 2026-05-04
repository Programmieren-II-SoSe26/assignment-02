package aufgabe_3;

public abstract class Product {
    protected String name;
    protected int productId;
    protected double price;

    public Product(String name, int productId, double price) {
        this.name = name;
        this.productId = productId;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getProductID() {
        return productId;
    }

    public double calculatePrice() {

        return 0;
    }
}

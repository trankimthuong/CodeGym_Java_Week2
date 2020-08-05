package collection_framework;

public class Product {
    private String productName;
    private int cost;
    private int id;

    public Product(){
    }

    public Product(String productName, int cost, int id){
        this.productName = productName;
        this.cost = cost;
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product name = " + getProductName() +
                ", id = " + getId() + ", cost = " + getCost();
    }
}

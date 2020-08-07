package IO_product_manager;

public class Product {
    private int id;
    private String name;
    private String manufacturer;
    private int cost;
    private String note;

    public Product(){
    }

    public Product(int id, String name, String manufacturer,
                   int cost, String note){
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.cost = cost;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "\"" + getId() + "\",\"" + getName() + "\",\"" +
                getManufacturer() + "\",\"" + getCost() + "\",\"" +
                getNote() + "\"";
    }
}

package model;

public class Product {
    private int attractedID;
    private String nameOfProduct;
    private String category;
    private int quantity;
    private float price;

    public int getAttractedID() {
        return attractedID;
    }

    public void setAttractedID(int attractedID) {
        this.attractedID = attractedID;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Product(int quantity, String field, String category, String s, String field1) {
        this.quantity = quantity;
    }

    public Product(float price) {
        this.price = price;
    }

    public Product(int attractedID, String nameOfProduct, String category, int quantity, float price) {
        this.attractedID = attractedID;
        this.nameOfProduct = nameOfProduct;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "attractedID=" + attractedID +
                ", nameOfProduct='" + nameOfProduct + '\'' +
                ", category='" + category + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public Product() {
        this.attractedID = 0;
        this.nameOfProduct = "";
        this.category = "";
        this.quantity = 0;
        this.price = 0;


    }
}



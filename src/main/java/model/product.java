package model;

public class product {
    private String attractedID;
    private String nameOfProduct;
    private String category;
    private int quantity;
    private float price;

    public String getAttractedID() {
        return attractedID;
    }

    public void setAttractedID(String attractedID) {
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

    public product(String attractedID) {
        this.attractedID = attractedID;
    }

    public product(int quantity) {
        this.quantity = quantity;
    }

    public product(float price) {
        this.price = price;
    }

    public product(String attractedID, String nameOfProduct, String category, int quantity, float price) {
        this.attractedID = attractedID;
        this.nameOfProduct = nameOfProduct;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
    }
    public product() {
        this.attractedID = "";
        this.nameOfProduct = "";
        this.category = "";
        this.quantity = 0;
        this.price = 0;


    }
}



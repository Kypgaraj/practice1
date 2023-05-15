package model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;


public class ProductCollection {

    private ArrayList<Product> Foods;

    public ProductCollection(ArrayList<Product> Foods) {
        this.Foods = Foods;
    }

    public ArrayList<Product> getFoods() {
        return Foods;
    }

    public ProductCollection() {
        Foods = new ArrayList<Product>();
    }

    public void add(Product newProduct) {

        Foods.add(newProduct);

    }
    public void setFoods(ArrayList<Product> foods) {
        Foods = foods;
    }

    public void remove_from_Product(Product removeObj) {
        Foods.remove(removeObj);
    }

    public void remove_by_id(int removeID) {
        for (int i = 0; i < Foods.size(); i++) {
            if (Foods.get(i).getAttractedID() == removeID) {
                Foods.remove(i);
            } else {
                System.out.print("Current id: " + Foods.get(i).getAttractedID() + " != " + removeID);
            }
        }
    }

    public Product get1(int index_get) {
        for (Product test : Foods) {
            if (test.getAttractedID() == index_get) {
                return test;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "ProductCollection{" +
                "Foods=" + Foods +
                '}';
    }

    private static Product getProduct(String line) {
        String[] fields = line.split(",");
        return new Product(Integer.parseInt(fields[0]),fields[1],fields[2],Integer.parseInt(fields[3]),Integer.parseInt(fields[4]));
    }

    public void readCSV() {
        Path path = Path.of("src", "main", "resources", "Products.csv");

        try {
            Files.lines(path)
                    .skip(1)
                    .map(ProductCollection::getProduct)
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

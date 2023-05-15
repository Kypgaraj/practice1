package model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class CSVFileStream {
    public static void main(String[] args) {
        Path path = Path.of("src", "main", "resources", "Products.csv");

        try {
            Files.lines(path)
                    .skip(1)
                    .map(CSVFileStream::getProduct)
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static Product getProduct(String line) {
        String[] fields = line.split(",");
        return new Product(Integer.parseInt(fields[0]),fields[1],fields[2],Integer.parseInt(fields[3]),Integer.parseInt(fields[4]));
    }
}
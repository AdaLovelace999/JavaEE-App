package models;

import entities.Product;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ProductModel {
    private static final ProductModel productModelInstance = new ProductModel();
    private final List<Product> productModels;

    public static ProductModel getInstance() {
        return productModelInstance;
    }

    private ProductModel() {
        productModels = new ArrayList<>();
    }

    public void add(Product product) {
        productModels.add(product);
    }

    public List<String> list(){
        return productModels.stream().map(Product::getName).collect(Collectors.toList());
    }
}

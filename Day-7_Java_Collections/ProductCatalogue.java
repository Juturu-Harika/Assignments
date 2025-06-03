package Assignments;

import java.util.*;

public class ProductCatalogue {
    private Map<Product, Integer> catalogue = new HashMap<>();

    public boolean addProduct(Product product, int quantity) {
        if (catalogue.containsKey(product)) {
            System.out.println("Product already exists. Use updateProduct to modify.");
            return false;
        }
        catalogue.put(product, quantity);
        return true;
    }

    public Integer getQuantity(Product product) {
        return catalogue.getOrDefault(product, null);
    }

    public boolean updateProduct(Product oldProduct, Product newProduct, int newQuantity) {
        if (!catalogue.containsKey(oldProduct)) {
            System.out.println("Product not found.");
            return false;
        }
        catalogue.remove(oldProduct);
        catalogue.put(newProduct, newQuantity);
        return true;
    }

    public boolean deleteProduct(Product product) {
        if (catalogue.containsKey(product)) {
            catalogue.remove(product);
            return true;
        } else {
            System.out.println("Product not found.");
            return false;
        }
    }

    public List<Map.Entry<Product, Integer>> sortById() {
        List<Map.Entry<Product, Integer>> list = new ArrayList<>(catalogue.entrySet());
        list.sort(Comparator.comparing(entry -> entry.getKey().getId()));
        return list;
    }

    public List<Map.Entry<Product, Integer>> sortByName() {
        List<Map.Entry<Product, Integer>> list = new ArrayList<>(catalogue.entrySet());
        list.sort(Comparator.comparing(entry -> entry.getKey().getName()));
        return list;
    }

    public void printCatalogue() {
        for (Map.Entry<Product, Integer> entry : catalogue.entrySet()) {
            System.out.println(entry.getKey() + " -> Quantity: " + entry.getValue());
        }
    }
}


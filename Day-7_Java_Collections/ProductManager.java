package Assignments;

import java.util.*;

public class ProductManager {
    private Map<Integer, Product> productMap = new HashMap<>();

    public boolean addProduct(Product product) {
        if (productMap.containsKey(product.getId())) {
            System.out.println("Duplicate Product ID: " + product.getId());
            return false;
        }
        productMap.put(product.getId(), product);
        return true;
    }

    // Retrieve product by ID
    public Product getProduct(int id) {
        return productMap.get(id);
    }

    // Update product by ID
    public boolean updateProduct(int id, Product newProduct) {
        if (!productMap.containsKey(id)) {
            System.out.println("Product not found with ID: " + id);
            return false;
        }
        productMap.put(id, newProduct);
        return true;
    }

    // Delete product by ID
    public boolean deleteProduct(int id) {
        if (productMap.remove(id) != null) {
            return true;
        } else {
            System.out.println("Product not found for deletion: " + id);
            return false;
        }
    }

    // List all products
    public List<Product> getAllProducts() {
        return new ArrayList<>(productMap.values());
    }

    // Sort products by ID
    public List<Product> sortById() {
        List<Product> list = getAllProducts();
        list.sort(Comparator.comparingInt(Product::getId));
        return list;
    }

    // Sort products by name
    public List<Product> sortByName() {
        List<Product> list = getAllProducts();
        list.sort(Comparator.comparing(Product::getName));
        return list;
    }
}


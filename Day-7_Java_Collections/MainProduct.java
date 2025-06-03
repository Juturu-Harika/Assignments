package Assignments;

public class MainProduct {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();

        // Adding products
        manager.addProduct(new Product(101, "Laptop", "Electronics", 59999));
        manager.addProduct(new Product(102, "Chair", "Furniture", 2999));
        manager.addProduct(new Product(103, "Pen", "Stationery", 20));
        manager.addProduct(new Product(104, "Smartphone", "Electronics", 24999));

        // Try to add duplicate
        manager.addProduct(new Product(101, "Tablet", "Electronics", 19999));

        // Display all products
        System.out.println("\nAll Products:");
        manager.getAllProducts().forEach(System.out::println);

        // Sort by ID
        System.out.println("\nSorted by Product ID:");
        manager.sortById().forEach(System.out::println);

        // Sort by Name
        System.out.println("\nSorted by Product Name:");
        manager.sortByName().forEach(System.out::println);

        // Retrieve a product
        System.out.println("\nProduct with ID 102: " + manager.getProduct(102));

        // Update product
        manager.updateProduct(102, new Product(102, "Ergonomic Chair", "Furniture", 4999));

        // Delete product
        manager.deleteProduct(103);

        // Final product list
        System.out.println("\nFinal Product List:");
        manager.getAllProducts().forEach(System.out::println);
    }
}


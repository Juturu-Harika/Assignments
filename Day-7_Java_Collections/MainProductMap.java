package Assignments;

public class MainProductMap {
    public static void main(String[] args) {
        ProductCatalogue catalogue = new ProductCatalogue();

        Product p1 = new Product(101, "Laptop", "Electronics", 60000);
        Product p2 = new Product(102, "Chair", "Furniture", 3500);
        Product p3 = new Product(103, "Pen", "Stationery", 25);
        Product p4 = new Product(104, "Mobile", "Electronics", 20000);

        catalogue.addProduct(p1, 10);
        catalogue.addProduct(p2, 5);
        catalogue.addProduct(p3, 50);
        catalogue.addProduct(p4, 7);
        catalogue.addProduct(p1, 10);

        System.out.println("\nAll Products:");
        catalogue.printCatalogue();
        System.out.println("\nSorted by ID:");
        catalogue.sortById().forEach(entry -> System.out.println(entry.getKey() + " -> Quantity: " + entry.getValue()));

        System.out.println("\nSorted by Name:");
        catalogue.sortByName().forEach(entry -> System.out.println(entry.getKey() + " -> Quantity: " + entry.getValue()));

        Product updatedP2 = new Product(102, "Ergonomic Chair", "Furniture", 4500);
        catalogue.updateProduct(p2, updatedP2, 6);

        catalogue.deleteProduct(p3);
        System.out.println("\nFinal Catalogue:");
        catalogue.printCatalogue();
    }
}


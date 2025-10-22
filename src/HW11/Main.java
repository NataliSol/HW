package HW11;


import java.util.*;


public class Main {
    public static void main(String[] args) {

        ProductCatalog catalog = new ProductCatalog();

        Product banana = new Product("Banana", "fruits", 69.70);
        Product yogurt = new Product("Yogurt", "milk", 30.00);
        Product potato = new Product("potato", "veg", 15.50);
        Product tomato = new Product("tomato", "veg", 14.30);

        catalog.addProduct(banana);
        catalog.addProduct(yogurt);
        catalog.addProduct(potato);
        catalog.addProduct(tomato);

        List<Product> vegCategory = catalog.filter(
                p -> p.getCategory().equals("veg"));

        vegCategory.forEach(product -> catalog.display(p -> System.out.println(p.getName() + " " + p.getCategory() + " " + p.getPrice())));


        List<Product> priceIsLower15 = catalog.filter(
                product -> product.getPrice() < 15.00);
        priceIsLower15.forEach(product -> catalog.display(p -> System.out.println(p.getName() + " " + p.getCategory() + " " + p.getPrice())));

        List<Product> allProducts = catalog.getProducts();
        allProducts.sort(Comparator.comparingDouble(Product::getPrice));
        for (Product product : allProducts) {
            System.out.println(product.getPrice());
        }
        catalog.display(p -> System.out.println(p.getName() + " " + p.getCategory() + " " + p.getPrice()));
    }
}


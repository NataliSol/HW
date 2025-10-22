package HW11;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ProductCatalog {
    private List<Product> products;

    public ProductCatalog() {

        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> filter(Predicate<Product> predicate) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (predicate.test(product)) {
                result.add(product);
            }
        }
        return result;
    }

    public void display(Consumer<Product> consumer) {
        for (Product product : products) {
            consumer.accept(product);
        }
    }

    public List<Product> getProducts() {
        return products;
    }
}
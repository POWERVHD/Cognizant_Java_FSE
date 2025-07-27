import java.util.Arrays;
import java.util.Comparator;

public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Phone", "Electronics"),
            new Product(203, "Shoes", "Footwear"),
            new Product(150, "Laptop", "Electronics"),
            new Product(110, "Watch", "Accessories")
        };

        
        System.out.println("Linear Search:");
        Product foundLinear = ProductSearch.linearSearch(products, 150);
        System.out.println(foundLinear != null ? foundLinear : "Product not found");

        
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));
        System.out.println("\nBinary Search:");
        Product foundBinary = ProductSearch.binarySearch(products, 150);
        System.out.println(foundBinary != null ? foundBinary : "Product not found");
    }
}

package tr.cd;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Created by erhan.karakaya on 2/21/2017.
 */
public class ProductRepository {
  private static List<Product> products;

  public static List<Product> getProducts() {
    if (products == null) {
      products = new ArrayList<>();
      products.add(new Product(1, "Kalem", 10));
      products.add(new Product(2, "Silgi", 20));
      products.add(new Product(3, "Defter", 5));
      products.add(new Product(4, "Kitap", 6));
      products.add(new Product(5, "Dosya", 16));
    }
    return products;
  }

  public static Product getProductById(Integer id) {

    List<Product> products = getProducts();

    Optional<Product> product = products.stream().filter(p -> p.getId() == id).findFirst();

    return product.orElse(null);

  }

  public static void saveProduct(Product product) {
    Objects.requireNonNull(product);

    Product tempProduct = getProductById(product.getId());

    if (tempProduct==null) {
      tempProduct = new Product(product.getId(),product.getTitle(),product.getQuantity());
      products.add(tempProduct);
    }
    else {
      products.remove(tempProduct);
      products.add(product);
    }

  }
}

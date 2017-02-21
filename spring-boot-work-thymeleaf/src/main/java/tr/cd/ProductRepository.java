package tr.cd;

import java.util.ArrayList;
import java.util.List;

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
}

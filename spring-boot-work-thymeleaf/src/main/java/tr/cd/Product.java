package tr.cd;

/**
 * Created by erhan.karakaya on 2/20/2017.
 */
public class Product {

  public Product() {

  }

  public Product(Integer id, String title, Integer quantity) {
    this.id = id;
    this.title = title;
    this.quantity = quantity;
  }

  private Integer id;
  private String title;
  private Integer quantity;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }
}

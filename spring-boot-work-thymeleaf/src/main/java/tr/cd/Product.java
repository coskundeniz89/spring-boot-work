package tr.cd;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by erhan.karakaya on 2/20/2017.
 */
public class Product {


  //region constructors

  public Product() {
  }

  public Product(Integer id, String title, Integer quantity) {
    this.id = id;
    this.title = title;
    this.quantity = quantity;
  }

  //endregion constructors


  //region fields

  @NotNull
  private Integer id;

  @NotNull
  @Size(min = 5, max = 20)
  private String title;

  @NotNull
  @Min(5)
  @Max(20)
  private Integer quantity;

  //endregion fields

  //region getter-setters

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

  //endregion getter-setters

}

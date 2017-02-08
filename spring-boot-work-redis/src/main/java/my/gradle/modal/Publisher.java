package my.gradle.modal;

import java.io.Serializable;

/**
 * Created by coskun.deniz on 08.02.2017.
 */
public class Publisher implements Serializable {

  private static final long serialVersionUID = 1L;

  private int id;
  private String name;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

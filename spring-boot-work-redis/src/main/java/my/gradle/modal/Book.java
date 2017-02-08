package my.gradle.modal;

import java.io.Serializable;
import java.util.List;

/**
 * Created by coskun.deniz on 07.02.2017.
 */
public class Book implements Serializable {

  private static final long serialVersionUID = 1L;

  private String id;
  private String name;
  private Publisher publisher;
  private List<BookPage> pages;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Publisher getPublisher() {
    return publisher;
  }

  public void setPublisher(Publisher publisher) {
    this.publisher = publisher;
  }

  public List<BookPage> getPages() {
    return pages;
  }

  public void setPages(List<BookPage> pages) {
    this.pages = pages;
  }
}

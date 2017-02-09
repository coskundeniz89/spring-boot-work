package my.gradle.modal;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Reference;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.io.Serializable;
import java.util.List;

/**
 * Created by coskun.deniz on 07.02.2017.
 */
@Data
@EqualsAndHashCode
@RedisHash("books")
@NoArgsConstructor
public class Book {

  @Id
  private String id;

  @Indexed
  private String name;

  private Publisher publisher;

//  @Reference
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

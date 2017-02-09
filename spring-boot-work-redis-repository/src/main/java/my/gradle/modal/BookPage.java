package my.gradle.modal;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.io.Serializable;

/**
 * Created by coskun.deniz on 08.02.2017.
 */
@Data
@EqualsAndHashCode
//@RedisHash("BookPage")
//@NoArgsConstructor
public class BookPage {

  @Indexed
  private int id;
  @Indexed
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

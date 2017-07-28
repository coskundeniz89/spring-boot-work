package tr.cd;

/**
 * Created by coskun.deniz on 7/27/2017.
 */
public class Greeting {

  private long id;
  private String content;

  public Greeting() {
  }

  public Greeting(long id, String content) {
    this.id = id;
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }

}
package tr.cd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

  @Value("${message}")
  private String message;

  public static void main(String[] args) {
    System.out.println("******* " + System.getProperty("spring.profiles.active"));
      SpringApplication.run(Application.class, args);
  }

  @GetMapping(path = "/")
  public String test() {
    System.out.println("******* " + message);
    return message;
  }

}

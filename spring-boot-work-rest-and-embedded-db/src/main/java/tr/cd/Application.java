package tr.cd;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Bean
  public CommandLineRunner loadData(ClientRepository repository) {
    return (args) -> {
      // save a couple of customers
      repository.save(new Client("Coşkun Deniz", "Developer"));
      repository.save(new Client("Erhan Karakaya", "Developer"));
      repository.save(new Client("Niyazi Motor", "Developer"));
      repository.save(new Client("Okan Demirtaş", "Tester"));
      repository.save(new Client("Hüseyin Cihad Güler", "Tester"));
      repository.save(new Client("Sefa Aras", "Android"));
    };
  }
}

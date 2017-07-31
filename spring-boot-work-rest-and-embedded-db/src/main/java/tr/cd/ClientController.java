package tr.cd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by coskun.deniz on 7/27/2017.
 */
@RestController
public class ClientController {

  private ClientRepository repository;

  @Autowired
  public ClientController(ClientRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/list")
  public long listClient() {
    return repository.count();
  }

}
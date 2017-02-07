package my.gradle;

import my.gradle.domain.Client;
import my.gradle.repository.ClientRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by coskun.deniz on 30.01.2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PersitenceTest {

  @Autowired
  ClientRepository clientRepository;

  @Test
  public void clientRepository_IsNotNull() {
    Assert.assertNotNull(clientRepository);
  }

  @Test
  public void clientRepository_InsertEntry() {

    long size = clientRepository.count();
    Client client = new Client();
    client.setTitle("tetst");

    clientRepository.save(client);
    Assert.assertEquals(size + 1, clientRepository.count());

  }

}

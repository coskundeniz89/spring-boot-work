package tr.cd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("prod")
public class ApplicationProdTest {

  @Value("${server.address}")
  String serverAddress;


  @Test
  public void checkServerAddress() {
    assertEquals("productionAddress", serverAddress);
  }

}

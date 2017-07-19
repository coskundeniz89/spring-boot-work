package tr.cd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

  @Value("${server.address}")
  String serverAddress;

  @Autowired
  MyConfig myConfig;

  @Test
  public void checkServerAddress() {
    assertEquals("defaultAddress", serverAddress);
  }

  @Test
  public void checkMyConfig() {
    assertEquals(2, myConfig.getServers().size());
    assertEquals(true, myConfig.isEnabled());

    assertEquals("myname", myConfig.getSecurity().getUsername());
    assertNull(myConfig.getSecurity().getPassword());
    assertEquals(2, myConfig.getSecurity().getRoles().size());
  }

}

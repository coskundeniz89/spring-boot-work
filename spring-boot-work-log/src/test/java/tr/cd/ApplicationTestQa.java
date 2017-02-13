package tr.cd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by coskun.deniz on 06.02.2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("qa")
public class ApplicationTestQa {

  @Test
  public void testExampleService() {
    ExampleService.exampleFunction();
  }

}

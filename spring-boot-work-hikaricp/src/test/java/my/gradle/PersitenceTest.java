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

import javax.sql.DataSource;

/**
 * Created by coskun.deniz on 30.01.2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PersitenceTest {

  @Autowired
  DataSource dataSource;

  @Autowired
  ClientRepository clientRepository;

  @Test
  public void clientRepository_IsNotNull() {
    Assert.assertNotNull(clientRepository);
  }

  @Test
  public void getDataSource_IsNotNull() {
    Assert.assertNotNull(dataSource);
  }

  @Test
  public void getDataSourceClass_ShouldHikari() {
    Assert.assertEquals("com.zaxxer.hikari.HikariDataSource", dataSource.getClass().getName());
  }

}

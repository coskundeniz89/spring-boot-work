package my.gradle;

import my.gradle.modal.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Created by coskun.deniz on 30.01.2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PersitenceTest {

  @Autowired
  private RedisTemplate<String, Object> redisTemplate;

  @Test
  public void flushAll() {
    redisTemplate.getConnectionFactory().getConnection().flushAll();
    Set<byte[]> keys = redisTemplate.getConnectionFactory().getConnection().keys("*".getBytes());
    assertEquals(0, keys.size());
  }

}

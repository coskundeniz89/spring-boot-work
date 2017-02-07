package my.gradle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.BootstrapContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by coskun.deniz on 30.01.2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PersitenceTest {

  @Autowired
  private RedisTemplate<String, Book> template;

  @Test
  public void testBook_InsertEntry() {

    ValueOperations<String, Book> ops = template.opsForValue();

    Book newBook = new Book();
    newBook.setId("Test1");
    newBook.setName("Test Name");
    newBook.setPublisher("Test Publisher");

    ops.set("key1", newBook);

  }

//  @Autowired
//  private RedisTemplate<String, String> template;
//  @Test
//  public void testString_InsertEntry() {
//
//    ValueOperations<String, String> ops = template.opsForValue();
//
//    ops.set("key1", "asdfasdfsdf");
//
//  }
}

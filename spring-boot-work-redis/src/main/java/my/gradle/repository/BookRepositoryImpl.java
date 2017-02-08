package my.gradle.repository;

import my.gradle.modal.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Map;

/**
 * Created by coskun.deniz on 08.02.2017.
 */
@Repository
public class BookRepositoryImpl implements BookRepository {

  private static final String KEY = "Books";

  private RedisTemplate<String, Book> redisTemplate;
  private HashOperations hashOps;

  @Autowired
  public BookRepositoryImpl(RedisTemplate redisTemplate) {
    this.redisTemplate = redisTemplate;
  }

  @PostConstruct
  private void init() {
    hashOps = redisTemplate.opsForHash();
  }

  @Override
  public void saveBook(Book book) {
    hashOps.put(KEY, book.getId(), book);
  }

  @Override
  public void updateBook(Book book) {
    hashOps.put(KEY, book.getId(), book);
  }

  @Override
  public Book findBook(String id) {
    return (Book) hashOps.get(KEY, id);
  }

  @Override
  public Map<Object, Object> findAllBook() {
    return hashOps.entries(KEY);
  }

  @Override
  public void deleteBook(String id) {
    hashOps.delete(KEY, id);
  }

}

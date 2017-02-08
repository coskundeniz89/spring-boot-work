package my.gradle;

import my.gradle.modal.Book;
import my.gradle.modal.BookPage;
import my.gradle.modal.Publisher;
import my.gradle.repository.BookRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by coskun.deniz on 30.01.2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BookRepositoryTest {

  private static final String MY_NEW_BOOK = "Yeni kitabım";
  private static final String MY_NEW_BOOK_1 = "Yeni kitabım 1";
  private static final String MY_NEW_BOOK_2 = "Yeni kitabım 2";

  private static final String MY_BOOK = "BenimKitap";
  private static final String MY_BOOK_1 = "BenimKitap1";
  private static final String MY_BOOK_2 = "BenimKitap2";

  private static final String PUBLISHER_NAME = "Coşkun Deniz";

  @Autowired
  private BookRepository bookRepository;

  @Test
  public void bookRepository_ShouldNotNull() {
    Assert.assertNotNull(bookRepository);
  }

  @Test
  public void saveBook_ShouldInsertSuccess() {

    Book newBook = new Book();
    newBook.setId(MY_BOOK);
    newBook.setName(MY_NEW_BOOK);

    Publisher publisher = new Publisher();
    publisher.setId(10);
    publisher.setName(PUBLISHER_NAME);

    newBook.setPublisher(publisher);

    List<BookPage> pages = new ArrayList<>();

    BookPage newPage = new BookPage();
    newPage.setId(1);
    newPage.setName("İçindekiler");
    pages.add(newPage);

    newPage = new BookPage();
    newPage.setId(2);
    newPage.setName("Önsöz");
    pages.add(newPage);

    newPage = new BookPage();
    newPage.setId(3);
    newPage.setName("Başlıyoruz");
    pages.add(newPage);

    newBook.setPages(pages);

    bookRepository.save(newBook);

    Book newBook1 = new Book();
    newBook1.setId(MY_BOOK_1);
    newBook1.setName(MY_NEW_BOOK_1);

    bookRepository.save(newBook1);

    Book newBook2 = new Book();
    newBook2.setId(MY_BOOK_2);
    newBook2.setName(MY_NEW_BOOK_2);

    bookRepository.save(newBook2);

  }

  @Test
  public void findAll_ShouldGetCount3() {
    long count = bookRepository.count();
    assertEquals(3, count);
  }

  @Test
  public void findOne_ShouldGetMyBookPublisher() {
    Book book = bookRepository.findOne(MY_BOOK);
    assertEquals(PUBLISHER_NAME, book.getPublisher().getName());
  }

  @Test
  public void findBook_ShouldPageSize3() {
    Book myBook = bookRepository.findOne(MY_BOOK);
    assertEquals(3, myBook.getPages().size());
  }

}

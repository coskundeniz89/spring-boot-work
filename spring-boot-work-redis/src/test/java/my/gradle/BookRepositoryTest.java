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

  public static final String MY_NEW_BOOK = "Yeni kitabım";
  public static final String MY_BOOK = "BenimKitap";
  @Autowired
  private BookRepository bookRepository;

  @Test
  public void bookRepository_IsNotNull() {
    Assert.assertNotNull(bookRepository);
  }

  @Test
  public void testBook_InsertEntry() {
    Book newBook = new Book();
    newBook.setId(MY_BOOK);
    newBook.setName(MY_NEW_BOOK);

    Publisher newPublisher = new Publisher();
    newPublisher.setId(10);
    newPublisher.setName("Coşkun Deniz");

    newBook.setPublisher(newPublisher);

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

    bookRepository.saveBook(newBook);
  }

  @Test
  public void bookRepository_FindAll() {
    assertEquals(1, bookRepository.findAllBook().size());
  }

  @Test
  public void bookRepository_FindAllForOneBook() {
    Book myBook = ((Book) bookRepository.findAllBook().get(MY_BOOK));
    assertEquals(MY_NEW_BOOK, myBook.getName());
  }

  @Test
  public void bookRepository_GetOneBookPageSize() {
    Book myBook = bookRepository.findBook(MY_BOOK);
    assertEquals(3, myBook.getPages().size());
  }

}

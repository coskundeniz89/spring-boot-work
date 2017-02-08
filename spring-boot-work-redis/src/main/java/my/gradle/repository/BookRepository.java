package my.gradle.repository;

import my.gradle.modal.Book;

import java.util.Map;

/**
 * Created by coskun.deniz on 08.02.2017.
 */
public interface BookRepository {

  void saveBook(Book book);

  void updateBook(Book book);

  Book findBook(String id);

  Map<Object, Object> findAllBook();

  void deleteBook(String id);

}

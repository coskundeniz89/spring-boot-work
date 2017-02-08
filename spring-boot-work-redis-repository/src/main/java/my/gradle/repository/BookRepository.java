package my.gradle.repository;

import my.gradle.modal.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by coskun.deniz on 08.02.2017.
 */
//@Repository
public interface BookRepository extends CrudRepository<Book, String> {

  List<Book> findByName(String name);

}

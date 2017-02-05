package my.gradle.repository;

import my.gradle.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by coskun.deniz on 30.01.2017.
 */
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}

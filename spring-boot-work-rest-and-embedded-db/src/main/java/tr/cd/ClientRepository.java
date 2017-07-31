package tr.cd;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

/**
 * Created by coskun.deniz on 7/31/2017.
 */
@Transactional
public interface ClientRepository extends JpaRepository<Client, Long> {
}

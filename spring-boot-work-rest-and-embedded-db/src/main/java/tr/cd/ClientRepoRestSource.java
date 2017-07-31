package tr.cd;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by coskun.deniz on 7/31/2017.
 */
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface ClientRepoRestSource extends PagingAndSortingRepository<Client, Long> {

}

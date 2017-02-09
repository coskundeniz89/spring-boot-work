package tr.cd;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

/**
 * Created by coskun.deniz on 07.02.2017.
 */
@Repository
public class MyRepositoryImpl implements MyRepository {

  @Override
  @Cacheable("testForCaches")
  public String testForCache() {
    simulateSlowService();
    return "hi";
  }

  // Don't do this at home
  private void simulateSlowService() {
    try {
      long time = 3000L;
      Thread.sleep(time);
    } catch (InterruptedException e) {
      throw new IllegalStateException(e);
    }
  }
}

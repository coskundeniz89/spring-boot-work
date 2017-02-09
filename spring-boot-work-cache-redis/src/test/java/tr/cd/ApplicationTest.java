package tr.cd;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.CacheManager;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by coskun.deniz on 06.02.2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationTest.class);

  @Autowired
  MyRepository myRepository;

  @Autowired
  private CacheManager cacheManager;

  @Test
  public void getCacheManagerName() {
    LOGGER.info("Cache manager name " + cacheManager.getClass().getName());
    Assert.assertEquals("org.springframework.data.redis.cache.RedisCacheManager", cacheManager.getClass().getName());
  }

  @Test
  public void getCachedMethod() throws Exception {

    LOGGER.info("Started testForCache first");
    myRepository.testForCache();
    LOGGER.info("Finished testForCache first");

    LOGGER.info("Started testForCache second");
    myRepository.testForCache();
    LOGGER.info("Finished testForCache second");

  }

}

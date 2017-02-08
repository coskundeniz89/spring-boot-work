package my.gradle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

import java.util.Objects;

@SpringBootApplication
@EnableRedisRepositories
public class SpringBootExampleApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootExampleApplication.class, args);
  }

  @Autowired
  JedisConnectionFactory jedisConnectionFactory;

  @Bean
  RedisTemplate<?, ?> redisTemplate() {

    RedisTemplate<byte[], byte[]> template = new RedisTemplate<>();
    template.setConnectionFactory(jedisConnectionFactory);

    return template;
  }

}

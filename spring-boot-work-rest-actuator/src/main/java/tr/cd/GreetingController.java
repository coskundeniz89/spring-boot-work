package tr.cd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by coskun.deniz on 7/27/2017.
 */
@RestController
public class GreetingController {

  private static final String template = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();

  /**
   * http://localhost:8080/greeting
   * http://localhost:8080/greeting?name=coşkun
   *
   * @param name name
   * @return rest of greeting
   */
  //@RequestMapping("/greeting")
  @GetMapping("/greeting")
  public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
    return new Greeting(counter.incrementAndGet(),
        String.format(template, name));
  }

  /**
   * http://localhost:8080/greeting/coşkun
   *
   * @param name name
   * @return rest of greeting
   */
  //@RequestMapping("/greeting/{name}")
  @GetMapping("/greeting/{name}")
  public Greeting greetingWithPath(@PathVariable(value = "name") String name) {
    return new Greeting(counter.incrementAndGet(),
        String.format(template, name));
  }

  /**
   * Uri
   * http://localhost:8080/greeting
   *
   * Body
   * {
       "id": 1,
       "content": "Hello, denizz!"
     }
   *
   * @param greeting greeting
   * @return string greeting.id + greeting.name
   */
  @PostMapping("/greeting")
  public String greetingWithPost(@RequestBody Greeting greeting) {
    return greeting.getId() + " and " + greeting.getContent() + " done";
  }

}
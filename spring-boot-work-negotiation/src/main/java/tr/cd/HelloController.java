package tr.cd;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by coskun.deniz on 09.02.2017.
 */
@Controller
public class HelloController {

  @RequestMapping("/index")
  public String getIndex(Model model) {

    JsonObject jsonObject = new JsonObject();
    jsonObject.setName("Test 1");
    jsonObject.setSurname("Test 2");

    model.addAttribute("myModel", jsonObject);
    return "index";
  }

}

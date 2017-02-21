package tr.cd;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by coskun.deniz on 09.02.2017.
 */
@Controller
public class HelloController {

  @RequestMapping({"/","/index"})
  public String getIndex() {
    return "index";
  }

  @RequestMapping("/list")
  public String getList(Model model) {

    List<Product> products = ProductRepository.getProducts();

    model.addAttribute("prods",products);

    return "list";
  }

}

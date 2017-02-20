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

    List<Product> products = new ArrayList<>();
    products.add(new Product(1,"Kalem",10));
    products.add(new Product(2,"Silgi",20));
    products.add(new Product(3,"Defter",5));
    products.add(new Product(4,"Kitap",6));
    products.add(new Product(5,"Dosya",16));

    model.addAttribute("prods",products);

    return "list";
  }

}

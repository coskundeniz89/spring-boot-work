package tr.cd;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

  /**
   * list of products.
   * @param model
   * @return product list
   */
  @RequestMapping("/list")
  public String getList(Model model) {

    List<Product> products = ProductRepository.getProducts();

    model.addAttribute("prods",products);

    return "list";
  }


  /**
   * detail of a product.
   * @param id
   * @param model
   * @return product
   */
  @RequestMapping(value = "/detail", method = RequestMethod.GET)
  public String getProductById(@RequestParam Integer id, Model model) {

    Product product = ProductRepository.getProductById(id);

    model.addAttribute("product",product);

    return "detail";
  }


}

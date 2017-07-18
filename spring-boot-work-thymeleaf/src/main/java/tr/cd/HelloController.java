package tr.cd;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
  @RequestMapping(value = "/list", method = RequestMethod.GET)
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
  @GetMapping("/detail")
  public String getProductById(@RequestParam(required = false) Integer id, Model model) {

    Product product;
    if (id==null) {
      product = new Product();
    } else {
      product = ProductRepository.getProductById(id);
    }

    model.addAttribute("product",product);

    return "detail";
  }


  @PostMapping("/detail")
  public String getProductById(@Valid Product product, BindingResult bindingResult) {

    if (bindingResult.hasErrors()) {
      return "/detail";
    }

    ProductRepository.saveProduct(product);

    return "redirect:list";
  }


}

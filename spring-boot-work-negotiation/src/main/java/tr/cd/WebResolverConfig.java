package tr.cd;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.util.Locale;

/**
 * Created by coskun.deniz on 10.02.2017.
 */
@Configuration
public class WebResolverConfig {

  @Bean
  public ViewResolver jsonViewResolver() {
    return new ViewResolver() {
      @Override
      public View resolveViewName(String viewName, Locale locale) throws Exception {
        MappingJackson2JsonView view = new MappingJackson2JsonView();
        view.setContentType("application/json");
        return view;
      }
    };
  }

}

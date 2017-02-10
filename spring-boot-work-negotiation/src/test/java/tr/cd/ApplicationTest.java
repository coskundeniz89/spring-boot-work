package tr.cd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JsonContentAssert;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by coskun.deniz on 06.02.2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ApplicationTest {

  @Autowired
  private MockMvc mvc;

  @Test
  public void getRoot() throws Exception {
    mvc.perform(MockMvcRequestBuilders.get("/")
        .accept(MediaType.TEXT_HTML))
        .andExpect(status().is4xxClientError());
  }

  @Test
  public void getIndex() throws Exception {
    mvc.perform(MockMvcRequestBuilders.get("/index")
        .accept(MediaType.TEXT_HTML))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.TEXT_HTML))
        .andExpect(content().string(containsString("Merhaba Türkiye")));
  }

  @Test
  public void getIndexJson() throws Exception {
    mvc.perform(MockMvcRequestBuilders.get("/index.json")
        .accept(MediaType.TEXT_HTML))
        .andExpect(status().isOk())
        .andExpect(model().size(1))
        .andExpect(content().contentType(MediaType.APPLICATION_JSON));
  }

}

package spittr.web.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import spittr.web.HomeController;

public class HomeControllerTest {
   @Test
   public void testHomePage() throws Exception {
      final HomeController controller = new HomeController();
      final MockMvc mockMvc = standaloneSetup(controller).build();
      mockMvc.perform(get("/")).andExpect(view().name("home"));
   }
}
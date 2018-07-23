

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TestWelcomeController {
	@Autowired
    private MockMvc mvc;

    @Test
    public void testWelcome() throws Exception {
    	MvcResult  result=mvc.perform(MockMvcRequestBuilders.get("/Welcome/msg").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();
                //.andExpect(content().string(equalTo("Welcome from Spring Boot!")));
    	String msg = result.getResponse().getContentAsString();
    	System.out.println(msg);
    }
    @Test
    public void testWelcomeWelcome() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/welcome/welcome").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("You are welcoming to boot application.")));
    }
}

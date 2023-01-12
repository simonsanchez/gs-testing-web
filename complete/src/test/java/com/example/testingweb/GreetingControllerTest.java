package com.example.testingweb;

import com.example.testingweb.TestingWebApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
public class GreetingControllerTest extends AbstractTestNGSpringContextTests {

	@Autowired
	private WebApplicationContext webApplicationContext;

	private MockMvc mockMvc;

	@BeforeClass
	public void setup() {
		mockMvc = MockMvcBuilders
                 .webAppContextSetup(webApplicationContext)
                 .build();
	}

	@Test
	public void testGreetingRoute() throws Exception {
    // This test is purposefully made to fail.
    mockMvc.perform(get("/greeting"))
      .andExpect(status().isOk())
      .andExpect(content().string(containsString("Hello, Mock")));
	}
}

/*
 * package com.example.demo;
 * 
 * 
 * import static
 * org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
 * import static
 * org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
 * import static
 * org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
 * import static
 * org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
 * 
 * import org.junit.Before; import org.junit.Test; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.test.web.servlet.MockMvc; import
 * org.springframework.test.web.servlet.setup.MockMvcBuilders; import
 * org.springframework.web.context.WebApplicationContext;
 * 
 * public class TestWebApp extends DemoApplicationTests {
 * 
 * @Autowired private WebApplicationContext webApplicationContext;
 * 
 * private MockMvc mockMvc;
 * 
 * @Before public void setup() { mockMvc =
 * MockMvcBuilders.webAppContextSetup(webApplicationContext).build(); }
 * 
 * @Test public void testEmployee() throws Exception {
 * System.out.println("Inside testEmployee");
 * mockMvc.perform(get("/employee/1")).andExpect(status().isOk())
 * .andExpect(content().contentType("application/json;charset=UTF-8"))
 * .andExpect(jsonPath("$.id").value("")).andExpect(jsonPath("$.name").value(
 * "John1")) .andExpect(jsonPath("$.departmrntId").value("11"));
 * 
 * }
 * 
 * }
 * 
 * 
 */
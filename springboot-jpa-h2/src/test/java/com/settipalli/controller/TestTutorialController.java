package com.settipalli.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.settipalli.repository.TutorialRepository;

@WebMvcTest(TutorialController.class)
public class TestTutorialController {

	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private TutorialController controller;

	@MockBean
	TutorialRepository userRepository;

	@Test
	public void createTutorial() throws Exception {
		mvc.perform(MockMvcRequestBuilders.post("/v1/api/tutorials")
				.content("{\"id\":2,\"title\":\"SecondTutorial\",\"description\":\"Inprinting\",\"published\":false}")
				.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().is2xxSuccessful());
	}

}

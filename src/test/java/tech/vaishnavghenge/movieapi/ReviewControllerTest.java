package tech.vaishnavghenge.movieapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class ReviewControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void testCreateReview() throws Exception {
        String imdbId = "tt10298840";
        String reviewBody = "Great movie!";

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/reviews/create")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"reviewBody\": \"" + reviewBody + "\", \"imdbId\": \"" + imdbId + "\"}"))
                .andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.body").value(reviewBody));
    }
}

package tech.vaishnavghenge.movieapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.Matchers.hasSize;

@SpringBootTest
@AutoConfigureMockMvc
public class MovieControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void testGetAllMovies() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/movies")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$", hasSize(10)));
    }

    @Test
    void testGetOneMovie() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/movies/tt10298840")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.imdbId").value("tt10298840"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.title").value("Strange World"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.releaseDate").value("2022-11-23"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.trailerLink").value("https://www.youtube.com/watch?v=bKh2G73gCCs"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.poster").value("https://image.tmdb.org/t/p/w500/kgJ8bX3zDQDM2Idkleis28XSVnu.jpg"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.genres[0]").value("Family"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.genres[1]").value("Adventure"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.genres[2]").value("Science Fiction"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.genres[3]").value("Animation"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.backdrops", hasSize(10)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.reviewIds", hasSize(3)));
    }
}

package tech.vaishnavghenge.movieapi;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Objects;

@SpringBootApplication
public class MovieApiApplication {
	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();
		System.setProperty("SYSTEM_ENV_MONGO_USER", Objects.requireNonNull(dotenv.get("MONGO_USER")));
		System.setProperty("SYSTEM_ENV_MONGO_PASSWORD", Objects.requireNonNull(dotenv.get("MONGO_PASSWORD")));
		System.setProperty("SYSTEM_ENV_MONGO_DATABASE", Objects.requireNonNull(dotenv.get("MONGO_DATABASE")));
		System.setProperty("SYSTEM_ENV_MONGO_CLUSTER", Objects.requireNonNull(dotenv.get("MONGO_CLUSTER")));

		SpringApplication.run(MovieApiApplication.class, args);
	}
}

package TooDoList.Too_Do_List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"services,controller"})
@EnableJpaRepositories(basePackages = "repository")
@EntityScan(basePackages = "entities")
public class TooDoListApplication {

	public static void main(String[] args) {
		SpringApplication.run(TooDoListApplication.class, args);
	}

}

package am.gch;

import am.gch.domain.*;
import am.gch.repository.*;
import org.springframework.beans.factory.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.*;
import org.springframework.boot.context.web.*;
import org.springframework.context.annotation.*;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	// This method will be handled in case of non embedded server
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

	@Bean
	InitializingBean populatingTestData(UserRepository repository) {

		//InitializingBean bean = new InitializingBean() {
		//	@Override
		//	public void afterPropertiesSet() throws Exception {
		//		repository.save(new User("admin@gitc.am", "123456", "Admin", "Adminian"));
		//		repository.findAll().forEach(System.out::println);
		//	}
		//};
		// equivalent
		//InitializingBean bean1 = ()-> {
		//		repository.save(new User("admin@gitc.am", "123456", "Admin", "Adminian"));
		//		repository.findAll().forEach(System.out::println);
		//};

		return () -> {
			repository.save(new User("admin@gitc.am", "123456", "Admin", "Adminian"));
			repository.findAll().forEach(System.out::println);
		};
	}
}

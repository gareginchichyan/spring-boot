package am.gch;

import am.gch.domain.*;
import am.gch.repository.*;
import org.springframework.beans.factory.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
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
		//// ===
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

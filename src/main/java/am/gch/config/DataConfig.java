package am.gch.config;

import am.gch.domain.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.core.env.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.*;

//@Profile("default") // @Profile({"p1", "!p2"}), p1 is active, or p2 is not active
@Configuration
@EnableTransactionManagement
public class DataConfig {

	@Autowired
	private MvcConfig mvcConfig;

	@Autowired
	private Environment env;

	@Bean
	public User getUser() {
		User user = new User();
		return user;
	}
}

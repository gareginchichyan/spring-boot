package am.gch;

import org.springframework.boot.builder.*;
import org.springframework.boot.context.web.*;

/**
 * Created by Garik on 2/11/16.
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

}

package am.gch.controller;

import am.gch.domain.*;
import am.gch.repository.*;
import am.gch.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by Garik on 2/11/16.
 */
@RestController
@RequestMapping("/users")
public class UserRestController {

	private UserService userService;

	@Autowired
	public UserRestController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<User> getAll() {
		return userService.getAll();
	}
}

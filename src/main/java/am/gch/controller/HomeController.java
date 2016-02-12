package am.gch.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

/**
 * Created by Garik on 2/11/16.
 */
@Controller
public class HomeController {

	@RequestMapping("/")
	public ModelAndView homePage() {
		ModelAndView model = new ModelAndView("home");
		model.addObject("name", "User");
		return model;
	}
}

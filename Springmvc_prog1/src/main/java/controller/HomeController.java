package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home()
	{
		System.out.println("Index page url");
		return"index";
	}
	@RequestMapping("/about")
	public String page2()
	{
		System.out.println("About page url");
		return"about";
	}

}

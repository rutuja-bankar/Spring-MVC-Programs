package controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String method1()
	{
		System.out.println("method 1 url");
		return"index";
	}
	@RequestMapping("/form1")
	public String method2(Model model)
	{
		model.addAttribute("Id", "12177");
		model.addAttribute("Name","Rutuja Bankar");
		System.out.println("form1 url");
		return "form1";
	}
}

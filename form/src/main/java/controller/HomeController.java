package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Formdata;

@Controller
public class HomeController {
	@RequestMapping("/")
public String home()
{
	return"index";
}
	@RequestMapping("/input")
	public String input(Model m)
	{
		Formdata obj=new Formdata();
		m.addAttribute("obj",obj);
		return "input";
	}
	@RequestMapping("/processing")
	public String processing(@ModelAttribute Formdata obj,Model m)
	{
		System.out.println(obj);
		m.addAttribute("obj",obj);
		return "output";
	}
}

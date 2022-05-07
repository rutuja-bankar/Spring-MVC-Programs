package controller;

import java.text.Normalizer.Form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.info;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home()
	{
		System.out.println("home url");
		return "index";
	
	}
	@RequestMapping("/input")
	public String form1() {
		System.out.println("input url");
		return "input";

	}
	@RequestMapping(value="/processing",method=RequestMethod.POST)
	public String processing(@ModelAttribute info obj,Model m)
	{
		System.out.println("processing.....");
		System.out.println(obj);//call to toString method
		m.addAttribute("obj", obj);
		
		System.out.println("Homecontroller returning output");
		return "output";
		
	}
	

}

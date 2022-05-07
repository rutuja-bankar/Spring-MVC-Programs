package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String method1()
		{
		return "index";
	}
	@RequestMapping("/stud")
 public ModelAndView method2()
 {
		ModelAndView obj= new ModelAndView();
		obj.addObject("heading", "ModelAndView Demo");
		obj.addObject("id","12177");
		
		
	//	obj.setViewName("stud");
	 return obj;
 }
}

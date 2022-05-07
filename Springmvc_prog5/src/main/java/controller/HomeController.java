package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//parameter passsing using @RequestParam annotation
@Controller
public class HomeController 
{
	@RequestMapping("/")
	public String method1()
	{
		return "index";
	}
	@RequestMapping("/input")
	public String htmlform()
	{
		return "input";
	}

	@RequestMapping(value ="/processing", method = RequestMethod.POST)
	public String processing(
			@RequestParam("studname")String varname,
			@RequestParam("studid") String varid,
			@RequestParam("studadd")String varadd,
			Model m)
	{
		m.addAttribute("studname",varname);
		m.addAttribute("studid",varid);
		m.addAttribute("studadd",varadd);
		
   return"output";
     }
}

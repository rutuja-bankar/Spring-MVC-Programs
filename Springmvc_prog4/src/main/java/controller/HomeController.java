package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String method1()
	{
		return "index";
		
	}
	@RequestMapping("/input")
	public String form()
	{
		return"input";
	}
	@RequestMapping("/processing")
	public String processing(HttpServletRequest req,Model m)
	{
		//1)Accessing Element of html
		String varid = req.getParameter("studid");
		String varname = req.getParameter("studname");
		String varcity=req.getParameter("studcity");
		
		//2)Adding Element to model
		m.addAttribute("studid",varid);
		m.addAttribute("studname",varname);
		m.addAttribute("studcity",varcity);
		
		return"output";
	}

}

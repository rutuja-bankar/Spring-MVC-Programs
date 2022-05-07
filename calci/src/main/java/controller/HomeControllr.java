package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import model.MyNumber;

@Controller
public class HomeControllr {
@RequestMapping("/")
	public String home()
	{
	System.out.println("returning home()");
		return "index";
	}

@RequestMapping("/input")
public String input(Model m)
{
	MyNumber obj=new MyNumber();
	m.addAttribute("obj",obj);
	return "input";
}
@RequestMapping("/processing")
public String processing(@ModelAttribute MyNumber obj,Model m)
{
	System.out.println(obj);
	int ans=obj.operation();
	m.addAttribute("obj",obj);
	m.addAttribute("ans", ans);
	
	
	return "output";
	
}

}










package com.example;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Controller1 
{
	@RequestMapping(value="/hello",method = RequestMethod.GET)
	public String dispaly(HttpServletRequest req, Model model) 
	{
		String name=req.getParameter("name");
		String password=req.getParameter("pass");
		if(password.equals("admin"))
		{
			String msg="Hi "+name;
			model.addAttribute("key1", msg);
			 return "viewpage";  
		}
		else  
        {  
            String msg="Sorry "+ name+". You entered an incorrect password.";  
            model.addAttribute("key2", msg);  
            return "errorpage";  
        }     
	}
}

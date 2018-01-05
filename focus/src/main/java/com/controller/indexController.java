package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.DaoImpl.UserDaoImpl;
import com.Model.User;

@Controller
public class indexController 
{
	@Autowired
	UserDaoImpl userDaoImpl;
	
    @RequestMapping("/")
    public String index()
    {
    	return "index";
    }
    
    @RequestMapping(value="/goTORegister", method=RequestMethod.GET)
    public ModelAndView goToRegister()
    {
    	ModelAndView mav=new ModelAndView();
    	mav.addObject("user",new User());  //
    	mav.setViewName("register");      //
    	return mav;
    }
    
    @RequestMapping(value="/saveRegister",method=RequestMethod.POST)
    public ModelAndView ModelAndView(@ModelAttribute("user")User user)  // (User user) and Binding result
    {
    	 ModelAndView mav=new ModelAndView();
    	 
    	 user.setRole("Role_User");
    	 userDaoImpl.insertUser(user);
    	 mav.setViewName("index");     //
    	 return mav;	 
    }
}

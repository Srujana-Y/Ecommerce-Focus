package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.DaoImpl.*;
import com.Model.Category;
import com.Model.Supplier;
import com.Model.User;

@Controller
public class adminController
{
	@Autowired
	SupplierDaoImpl supplierDaoImpl;
	
	@Autowired
	CategoryDaoImpl categoryDaoImpl;
	
   @RequestMapping("/adding")
   public String adding()
   {
	   return "adding";
   }

@RequestMapping(value="/saveSupp",method=RequestMethod.POST)
@Transactional
public ModelAndView saveSuppData(@RequestParam("sid")int sid, @RequestParam("sname")String sname)
{
	ModelAndView mav=new ModelAndView();
	Supplier sup=new Supplier();
	sup.setSid(sid);
	sup.setSuppliername(sname);
	supplierDaoImpl.insertSupplier(sup);
	mav.setViewName("adding");
	return mav;
}

@RequestMapping(value="/saveCat",method=RequestMethod.POST)
@Transactional
public ModelAndView saveCatData(@RequestParam("cid")int cid, @RequestParam("cname")String cname)
{
	ModelAndView mav=new ModelAndView();
	Category cat=new Category();
	cat.setCid(cid);
	cat.setCname(cname);
	categoryDaoImpl.insertCategory(cat);
	mav.setViewName("adding");
	return mav;
}

}

package com.te.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class SpringMVCController {
	
	
	@RequestMapping(path = "/home",method = RequestMethod.GET)
	public ModelAndView getHome() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("search");
		return mv;
		
	}
	@GetMapping(path = "/hello")
	public ModelAndView gethello() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("search");
		return mv;
		
	}
	@GetMapping(path="/search")
	public ModelAndView getsearch(HttpServletRequest req,ModelAndView mv) {
		String s=req.getParameter("id");
		mv.addObject("id",s);
		mv.setViewName("search");
		return mv;
	}
	@GetMapping(path="/search1")
	public String getValue(HttpServletRequest req,ModelMap m) {
		String s=req.getParameter("id");
		m.addAttribute("id", s);
		return "search";
	}
	

	

}

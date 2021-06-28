package com.te.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Blogs {
	@GetMapping(path="/sports")
	public String getsports() {
		
		return "Sports";
		
	}
	
	@GetMapping(path="/movies")
	public String getMovies(HttpServletRequest req,ModelMap m) {
		String name=req.getParameter("moviename");
		m.addAttribute("mname",name);
		return "Movies";
	}
	@GetMapping("/foods")
	public String getFood(HttpServletRequest req,ModelMap m) {
		String name=req.getParameter("food");
		m.addAttribute("food",name);
		return "Food";
	}
	@GetMapping("/science")
	public ModelAndView getScience() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Science");
		return mv;
		
	}

}

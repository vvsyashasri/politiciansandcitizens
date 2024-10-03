package klu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")

public class ViewProjectUrls {
	
	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView MV = new ModelAndView();
	    MV.setViewName("loginpage.html");
	    return MV; 
	}
	
	@GetMapping("/signup")
	public ModelAndView signup() {
		ModelAndView MV = new ModelAndView();
	    MV.setViewName("signuppage.html");
	    return MV; 
	}
	
	@GetMapping("/main")
	public ModelAndView mainpage() {
		ModelAndView MV = new ModelAndView();
	    MV.setViewName("mainpage.html");
	    return MV; 
	}
	
	@GetMapping("/")
	public ModelAndView mepage() {
		ModelAndView MV = new ModelAndView();
	    MV.setViewName("index.html");
	    return MV; 
	}
	
	@GetMapping("/index")
	public ModelAndView index() {
		ModelAndView MV = new ModelAndView();
	    MV.setViewName("index.html");
	    return MV; 
	}
	
	@GetMapping("/news")
	public ModelAndView news() {
		ModelAndView MV= new ModelAndView();
		MV.setViewName("news.html");
		return MV;
	}
	
	@GetMapping("/indiaataglance")
	public ModelAndView indiaataglance() {
		ModelAndView MV= new ModelAndView();
		MV.setViewName("indiaataglance.html");
		return MV;
	}
	@GetMapping("/adminlogin")
	public ModelAndView adminlogin() {
		ModelAndView MV= new ModelAndView();
		MV.setViewName("adminlogin.html");
		return MV;
	}
	
	@GetMapping("/politicianlogin")
	public ModelAndView politicianlogin() {
		ModelAndView MV= new ModelAndView();
		MV.setViewName("politicianlogin.html");
		return MV;
	}
	@GetMapping("/reportanissue")
	public ModelAndView reportanissue() {
		ModelAndView MV= new ModelAndView();
		MV.setViewName("reportanissue.html");
		return MV;
	}
	
	@GetMapping("/emergency")
	public ModelAndView emergency() {
		ModelAndView MV = new ModelAndView();
		MV.setViewName("emergency.html");
		return MV;
	}

}

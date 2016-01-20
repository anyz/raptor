package com.prodigi.raptor.web.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RaptorWelcomeController {

	private final Logger log = Logger.getLogger(this.getClass().getName());
	
	@RequestMapping("/home")
	public String launchHome(HttpServletRequest req, Model model) throws Exception {
		log.info("launching home page");
		System.out.println("*****************");
		Date date = new Date();
		
		model.addAttribute("serverTime", date.toString() );
		return "default";
	}
	
	@RequestMapping("/admin")
	public String adminLaunch(HttpServletRequest req, Model model) throws Exception {
		return "admin";
	}
	
}

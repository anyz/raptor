package com.prodigi.raptor.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RaptorWelcomeController {

	private static Logger log = Logger.getLogger(RaptorWelcomeController.class);
	
	@RequestMapping("/")
	public ModelAndView launchHome(HttpServletRequest req, Model model) throws Exception {
		log.info("launching home page");
		return new ModelAndView("index");
	}
	
}

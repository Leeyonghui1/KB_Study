package com.myspring.mypro;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	
	
	// 메인 페이지 화면
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView home() {
		return new ModelAndView("/home");
	}
	
}

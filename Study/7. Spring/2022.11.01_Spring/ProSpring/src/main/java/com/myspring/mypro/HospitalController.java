package com.myspring.mypro;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HospitalController {
	@Autowired
	HospitalService hospitalService;
	
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public ModelAndView join() {
		return new ModelAndView("hospital/join");
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public ModelAndView joinPost(@RequestParam Map<String, Object> map) {
		ModelAndView mav = new ModelAndView();
		String id = this.hospitalService.join(map);
		if(id == null)
			mav.setViewName("redirect:/join");
		else
			mav.setViewName("redirect:/detail?id="+id);
		return mav;
	}
}

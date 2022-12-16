package com.myspring.mypro;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HospitalController {
	@Autowired
	HospitalService hospitalService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView home() {
		return new ModelAndView("hospital/home");
	}
	
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public ModelAndView join() {
		return new ModelAndView("hospital/join");
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public ModelAndView joinPost(@RequestParam Map<String, Object> map) {
		ModelAndView mav = new ModelAndView();
		String Id = this.hospitalService.join(map);
		if(Id == null)
			mav.setViewName("redirect:/join");
		else
			mav.setViewName("redirect:/");
		return mav;
	}
	
	@RequestMapping(value="/memberIdChk", method=RequestMethod.POST)
	@ResponseBody
	public String memeberIdChkPOST(String memberId) throws Exception{
		int result = this.hospitalService.idCheck(memberId);
		System.out.println(result);
		if(result != 0) {
			return "fail"; // 중복 아이디 존재
		} else {
			return "success"; // 중복 아이디 x
		}
	}
}

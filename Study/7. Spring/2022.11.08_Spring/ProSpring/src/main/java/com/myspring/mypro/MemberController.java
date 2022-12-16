package com.myspring.mypro;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import member.MemberDTO;
import member.MemberServiceImpl;



@Controller
public class MemberController {
	@Autowired
	MemberServiceImpl service;
	
	// ȸ������ ȭ��
	@RequestMapping(value = "/member", method = RequestMethod.GET)
	public ModelAndView join() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/member/join");
		return mav;
	}
	
	// �Ƿ��� ��� ȭ��
	@RequestMapping(value = "/list.staff", method = RequestMethod.GET)
	public ModelAndView list_staff() {
		ModelAndView mav = new ModelAndView();
		List<MemberDTO> list_staff = service.member_list();
		mav.addObject("list", list_staff);
		mav.setViewName("/member/list");
		return mav;
	}
	
	// ���̵� �ߺ�Ȯ�� ��û
	@ResponseBody @RequestMapping(value = "/id_check", method = RequestMethod.POST)
	public boolean id_check(String id) {
		return service.id_check(id);
	}
	
	// ȸ������ ��û
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public ModelAndView join(@RequestParam Map<String, Object> map) {
		ModelAndView mav = new ModelAndView();
		map.put("phone", map.get("ph1")+"-"+map.get("ph2")+"-"+map.get("ph3"));
		map.put("addr", map.get("addr")+" "+map.get("addr2"));
		String id = this.service.join(map);
		if(id == null) {
			mav.setViewName("redirect:/member");
		} else {
			mav.setViewName("redirect:/");
		}
		return mav;
	}
	
	// �α��� ��û
	@ResponseBody @RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(String id, String pw, HttpSession session) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id", id);
		map.put("pw", pw);
		
		MemberDTO dto = this.service.login(map);
		session.setAttribute("login_info", dto);
		
		return dto == null ? "false" : "true";
		
	}
	
	// �α׾ƿ� ��û
	@ResponseBody @RequestMapping(value = "/logout", method = RequestMethod.POST)
	public void logout(HttpSession session) {
		session.removeAttribute("login_info");
	}
	
	
	// ȸ�� �������� ��û
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public ModelAndView detail(String id) {
		ModelAndView mav = new ModelAndView();
		MemberDTO dto = service.detail(id);
		mav.addObject("data", dto);
		mav.setViewName("/member/detail");
		return mav;
	}

}

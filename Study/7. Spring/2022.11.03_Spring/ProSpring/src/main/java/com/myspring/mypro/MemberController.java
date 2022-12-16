package com.myspring.mypro;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import member.MemberServiceImpl;
import member.MemberVo;

@Controller
public class MemberController {
	@Autowired
	MemberServiceImpl service;
	
	// �α��� ��û
	@ResponseBody @RequestMapping("/login")
	public String login(String id, String pw, HttpSession session) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("pw", pw);
		MemberVo vo = service.member_login(map);
		session.setAttribute("login_info", vo);
		
		return vo==null?"false":"true";
	}
	
	// �α׾ƿ� ��û
	@ResponseBody @RequestMapping("/logout")
	public void logout(HttpSession session) {
		session.removeAttribute("login_info");
	}
	
	// ȸ������ ȭ�� ��û
	@RequestMapping("/member")
	public String member(HttpSession session) {
		session.setAttribute("category", "join");
		return "member/join";
	}
	
	// ���̵� �ߺ�Ȯ�� ��û
	@ResponseBody @RequestMapping("/id_check")
	public boolean id_check(String id) {
		return service.member_id_check(id);
	}
}

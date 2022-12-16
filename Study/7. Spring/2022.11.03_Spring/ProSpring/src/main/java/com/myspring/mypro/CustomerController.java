package com.myspring.mypro;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import customer.CustomerServiceImpl;
import customer.CustomerVo;

@Controller
public class CustomerController {
	@Autowired
	CustomerServiceImpl service;
	
	// 고객 관리 목록
	@RequestMapping("/list.cu")
	public String list(HttpSession session, Model model) {
		session.setAttribute("category", "cu");
		List<CustomerVo> list = service.customer_list();
		model.addAttribute("list", list);
		return "customer/list";
	}
	
	// 고객 상세 화면
	@RequestMapping("/detail.cu")
	public String detail(int id, Model model) {
		CustomerVo vo = service.customer_detail(id);
		model.addAttribute("vo", vo);
		return "customer/detail";
	}
	
	// 신규 고객 등록 화면
	@RequestMapping("/new.cu")
	public String customer() {
		return "customer/new";
	}
	
	// 신규 고객 등록 처리 요청
	@RequestMapping("/insert.cu")
	public String insert(CustomerVo vo) {
		service.customer_insert(vo);
		return "redirect:list.cu";
	}
	
	// 고객 정보 수정 화면 요청
	@RequestMapping("/modify.cu")
	public String modify(int id, Model model) {
		model.addAttribute("vo", service.customer_detail(id));
		return "customer/modify";
	}
	
	// 고객 정보 수정 저장 처리 요청
	@RequestMapping("/update.cu")
	public String update(CustomerVo vo) {
		service.customer_update(vo);
		return "redirect:detail.cu?id="+vo.getId();
	}
	
	// 고객 정보 삭제 처리 요청
	@RequestMapping("/delete.cu")
	public String delete(int id) {
		service.customer_delete(id);
		return "redirect:list.cu";
	}
}

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
	
	// �� ���� ���
	@RequestMapping("/list.cu")
	public String list(HttpSession session, Model model) {
		session.setAttribute("category", "cu");
		List<CustomerVo> list = service.customer_list();
		model.addAttribute("list", list);
		return "customer/list";
	}
	
	// �� �� ȭ��
	@RequestMapping("/detail.cu")
	public String detail(int id, Model model) {
		CustomerVo vo = service.customer_detail(id);
		model.addAttribute("vo", vo);
		return "customer/detail";
	}
	
	// �ű� �� ��� ȭ��
	@RequestMapping("/new.cu")
	public String customer() {
		return "customer/new";
	}
	
	// �ű� �� ��� ó�� ��û
	@RequestMapping("/insert.cu")
	public String insert(CustomerVo vo) {
		service.customer_insert(vo);
		return "redirect:list.cu";
	}
	
	// �� ���� ���� ȭ�� ��û
	@RequestMapping("/modify.cu")
	public String modify(int id, Model model) {
		model.addAttribute("vo", service.customer_detail(id));
		return "customer/modify";
	}
	
	// �� ���� ���� ���� ó�� ��û
	@RequestMapping("/update.cu")
	public String update(CustomerVo vo) {
		service.customer_update(vo);
		return "redirect:detail.cu?id="+vo.getId();
	}
	
	// �� ���� ���� ó�� ��û
	@RequestMapping("/delete.cu")
	public String delete(int id) {
		service.customer_delete(id);
		return "redirect:list.cu";
	}
}

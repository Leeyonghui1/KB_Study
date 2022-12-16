package com.lecspring.myspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
// ������̼� :: �����Ϸ����ٰ� ����� �˷���
// ��ǥ���� ������̼� :: �������̵�, Deprecated ��
// @Controller :: MVC�߿��� Controller�� �ش��Ѵٰ� �˷��ִ� ǥ��
import org.springframework.web.servlet.ModelAndView;
@Controller
public class BookController {
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public ModelAndView create() {
		// book ������ create.jsp�� ����
		// ModelAndView ��ü�� ȭ�鵵 �ѱ�� ���� �ѱ�
		return new ModelAndView("book/create");
	}
}

package com.myspring.mypro;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.myspring.notice.NoticeDTO;
import com.myspring.notice.NoticeServiceImpl;



@Controller
public class NoticeController {
	@Autowired
	NoticeServiceImpl service;
	
	// 공지사항 화면 요청
	@RequestMapping(value = "/list.board", method = RequestMethod.GET)
	public ModelAndView notice_list(@RequestParam Map<String, Object> map) {
		List<NoticeDTO> notice_list = this.service.notice_list();
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/notice/list");
		return mav;
	}
	/*
	// 선택된 전공 소속 의료진 목록 요청
		@RequestMapping(value = "/list", method = RequestMethod.POST)
		public ModelAndView staff_list(@RequestParam Map<String, Object> map) {
			String m_code = map.get("m_code").toString();
			List<MemberDTO> staff_list = this.service.staff_list(m_code);
			
			ModelAndView mav = new ModelAndView();
			mav.addObject("m_code", m_code);
			mav.addObject("data", staff_list);
			mav.setViewName("/member/list");
			return mav;
		}*/
}

package com.lecspring.myspring;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
// 어노테이션 :: 컴파일러에다가 기능을 알려줌
// 대표적인 어노테이션 :: 오버라이딩, Deprecated 등
// @Controller :: MVC중에서 Controller에 해당한다고 알려주는 표시
import org.springframework.web.servlet.ModelAndView;
@Controller
public class BookController {
	// BookService bookService = new BookService();
	// 랑 똑같은 어노테이션 표현식
	@Autowired
	BookService bookService;
	
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public ModelAndView create() {
		// book 폴더의 create.jsp를 리턴
		// ModelAndView 객체는 화면도 넘기고 값도 넘김
		return new ModelAndView("book/create");
	}
	
	// /create로 들어오는데 post방식으로 들어온 경우 호출 메소드
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public ModelAndView createPost(@RequestParam Map<String, Object> map)
	{
		ModelAndView mav = new ModelAndView();
		System.out.println(map.toString());
		String bookId = this.bookService.create(map);
		if(bookId == null)
			mav.setViewName("redirect:/create");
		else
			mav.setViewName("redirect:/detail?bookId="+bookId);
		return mav;
	}
	
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	public ModelAndView detail(@RequestParam Map<String, Object> map)
	{
		Map<String, Object> detailMap = this.bookService.detail(map);
		ModelAndView mav = new ModelAndView();
		mav.addObject("data", detailMap);
		String bookId = map.get("bookId").toString();
		mav.addObject("bookId", bookId);
		mav.setViewName("/book/detail");
		return mav;
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public ModelAndView update(@RequestParam Map<String, Object> map)
	{
		Map<String, Object> detailMap = this.bookService.detail(map);
		ModelAndView mav = new ModelAndView();
		mav.addObject("data", detailMap);
		mav.setViewName("/book/update");
		return mav;
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public ModelAndView updatePost(@RequestParam Map<String, Object> map)
	{
		ModelAndView mav = new ModelAndView();
		boolean isUpdateSuccess = this.bookService.edit(map);
		if(isUpdateSuccess)
		{
			String bookId = map.get("bookId").toString();
			mav.setViewName("redirect:/detail?bookId="+bookId);
		}
		else
			mav = this.update(map);  // GET방식으로 다시 접근
		return mav;
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public ModelAndView deletePost(@RequestParam Map<String, Object> map)
	{
		ModelAndView mav = new ModelAndView();
		boolean isDeleteSuccess = this.bookService.remove(map);
		if(isDeleteSuccess)
			mav.setViewName("redirect:/list");
		else
		{
			String bookId = map.get("bookId").toString();
			mav.setViewName("redirect:/detail?bookId="+bookId);
		}
		return mav;
	}
	
	@RequestMapping(value="list")
	public ModelAndView list(@RequestParam Map<String, Object> map, @RequestParam(value="nowPage", required=false)String nowPage)
	{
		double CNT = 3.0; // 한 번에 보여지는 페이지 개수
		int LIMITCOUNT = (int)CNT;
		if(nowPage != null)
		{
			int now = Integer.parseInt(nowPage);
			int skipCount = 0;
			if(now>1)
				skipCount = (now-1)*LIMITCOUNT;
			map.put("skipCount", skipCount);
		}
		else
			map.put("skipCount", 0);
		
		List<Map<String, Object>> list = this.bookService.list(map);
		ModelAndView mav = new ModelAndView();
		mav.addObject("data", list);
		// ceil :: 올림
		int totalCount = (int)Math.ceil(this.bookService.countBookBoard(map)/CNT);
		mav.addObject("totalCount", totalCount); // 맨 끝 페이지 정보
		
		int nowPos = nowPage==null?1:Integer.parseInt(nowPage);
		if(nowPos<=0)
			nowPos=1;
		mav.addObject("nowPage", nowPos);
		
		int endPage = (int)(Math.ceil(nowPos/CNT)*(LIMITCOUNT));
		int startPage = 0;
		if(endPage>totalCount)
		{
			startPage = endPage-(LIMITCOUNT)+1;
			endPage = totalCount;
		}
		else
			startPage = endPage-(LIMITCOUNT)+1;
		
		if(startPage<=0)
			startPage=1;
		
		mav.addObject("startPage", startPage);
		mav.addObject("endPage", endPage);
		
		
		if(map.containsKey("keyword"))
			mav.addObject("keyword", map.get("keyword"));
		mav.setViewName("/book/list");
		return mav;
	}
}

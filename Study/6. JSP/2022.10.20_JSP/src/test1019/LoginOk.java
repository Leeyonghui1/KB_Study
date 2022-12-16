package test1019;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Servlet implementation class LoginOk
 */
@WebServlet("/LoginOkp")
public class LoginOk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginOk() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		doAction(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doAction(request, response);
	}
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		MemberDTO m = new MemberDTO();
		m.setId(request.getParameter("id"));
		m.setPw(request.getParameter("pw"));
		// m의 id를 이용해서 compareM에 값을 추가함
		// m의 pw와 compareM의 pw를 매칭
		MemberDTO compareM = new MemberDAO().checkMember(m);
		PasswordEncoder p = new BCryptPasswordEncoder();
		HttpSession hs = request.getSession();
		if(p.matches(m.getPw(), compareM.getPw()))
		{
			System.out.println("성공");
			hs.setAttribute("name", compareM.getName());
			hs.setAttribute("gender", compareM.getGender());
			hs.setAttribute("id", compareM.getId());
			response.sendRedirect("loginResult.jsp");
		}
		else
		{
			System.out.println("실패");
			// compareM.getId() :: DB에 저장되어있는 ID
			hs.setAttribute("id", compareM.getId());
			// m.getId() :: 로그인 창에서 로그인 시도한 ID
			hs.setAttribute("tryid", m.getId());
			response.sendRedirect("loginFail.jsp");
		}
	}

	
}

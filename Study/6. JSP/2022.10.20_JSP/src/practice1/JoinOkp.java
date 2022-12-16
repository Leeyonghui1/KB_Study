package practice1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Servlet implementation class JoinOkp
 */
@WebServlet("/JoinOkp")
public class JoinOkp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JoinOkp() {
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
		MemberDAO memberDAO = new MemberDAO();
		request.setCharacterEncoding("utf-8");
		MemberDTO m = new MemberDTO();
		m.setName(request.getParameter("name"));
		m.setId(request.getParameter("id"));
		
		// m.setPw(request.getParameter("pw"));
		// 암호를 암호화하여 DB에 저장
		String password = request.getParameter("pw");
		PasswordEncoder p = new BCryptPasswordEncoder();
		// PasswordEncoder :: 인터페이스
		// 익명클래스로 encode, matches 메소드 오버라이딩 가능
		String cPassWord = p.encode(password);
		System.out.println(p.matches(password, cPassWord));
		m.setPw(cPassWord);
		
		m.setGender(request.getParameter("gender"));
		memberDAO.memberInsert(m);
		response.sendRedirect("memberInsert.jsp");
		
		
	}
}

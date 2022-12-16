package practice1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ModifyOk
 */
@WebServlet("/ModifyOk")
public class ModifyOk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyOk() {
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
		m.setName(request.getParameter("name"));
		m.setGender(request.getParameter("gender"));
		m.setId(request.getParameter("id"));
		System.out.println(m.getId());
		System.out.println(m.getName());
		System.out.println(m.getGender());
		MemberDAO dao = new MemberDAO();
		System.out.println(dao.memberModify(m));
		if(dao.memberModify(m) == 1)
		{
			System.out.println("성공");
			response.sendRedirect("modifyResult.jsp");
		}
		else
		{
			System.out.println("실패");
			response.sendRedirect("modify.jsp");
		}
		
	}

}

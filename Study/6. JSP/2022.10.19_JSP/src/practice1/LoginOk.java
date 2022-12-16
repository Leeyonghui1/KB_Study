package practice1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
@WebServlet("/LoginOk")
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
		
		String strID = request.getParameter("id");
		String strPW = request.getParameter("pw");
		System.out.println(strID + strPW);
		String strQuery = String.format("select * from memberdto where id='%s'", strID);
		PasswordEncoder p = new BCryptPasswordEncoder();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			String jdbcDriver =
					"jdbc:mysql://localhost:3306/jspdb?"+
					"useUnicode=true&characterEncoding=utf8&"+
					"serverTimezone=UTC";
			String dbUser = "root";
			String dbPass = "1234";
			
			conn = DriverManager.getConnection(jdbcDriver,dbUser,dbPass);
			stmt = conn.createStatement(); 
			rs = stmt.executeQuery(strQuery);
			rs.next();
			if(p.matches(strPW, rs.getString("pw")))
			{
				// 로그인 성공
				String strName = rs.getString("name");
				String strIda = rs.getString("id");
				String strGender = rs.getString("gender");
				HttpSession httpsession = request.getSession();
				httpsession.setAttribute("name", strName);
				httpsession.setAttribute("id", strIda);
				httpsession.setAttribute("gender", strGender);
				response.sendRedirect("loginPass.jsp");
			}
			else
			{
				// 로그인 실패
				response.sendRedirect("loginFail.jsp");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				stmt.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
		
		
	}

}

package test2Sol;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestResponse
 */
@WebServlet("/RequestResponse")
public class RequestResponse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestResponse() {
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
	
	public void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String str = request.getParameter("birth");
		
		try {		
			int year = Integer.parseInt(str);
			Date now = new Date();  // ���� �ð� ��������
				
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
			String NowYear = formatter.format(now);
			int age = Integer.parseInt(NowYear)-year+1;
				
			if(age >= 20)
				// ? �ڴ� ����  �Ķ����, �������� &�� �̾����
				// jsp������ WebContent�� �ƴ� �ٸ� ������ ������ ��������� �ݵ�� �ؾ���
				response.sendRedirect("test1Sol/pass.jsp?age="+age);
			else
				response.sendRedirect("test1Sol/ng.jsp?age="+age);
		} catch (Exception e) {
			response.setContentType("text/html;charset=UTF-8");
			request.setCharacterEncoding("UTF-8");
			response.sendRedirect("test2Sol/fail.jsp?birth="+str);
		}
			
		
	}

}

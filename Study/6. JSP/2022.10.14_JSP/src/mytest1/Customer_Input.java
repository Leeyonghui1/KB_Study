package mytest1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Customer_Input
 */
@WebServlet("/Customer_Input")
public class Customer_Input extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customer_Input() {
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

	
	public void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String id = request.getParameter("id");
		
		if(id.equals("admin"))
			response.sendRedirect("manager.jsp");
		else
		{
			Customer c = new Customer(name, Integer.parseInt(age), id);
			response.getWriter().append("<h1> 이름 : "+c.getName()+"</h1>");
			response.getWriter().append("<h1> 나이 : "+c.getAge()+"</h1>");
			response.getWriter().append("<h1> ID : "+c.getId()+"</h1>");
			
	
			request.setAttribute("r_name", name);
			request.setAttribute("r_age", age);
			request.setAttribute("r_id", id);
			
			ServletContext context = getServletContext();
			RequestDispatcher dispatcher = context.getRequestDispatcher("/under.jsp");
			dispatcher.forward(request, response);
			
			int t = c.getAge() - 20<0?1:2;
			switch (t) 
			{
				case 1:
					response.sendRedirect("under.jsp");
					break;
				case 2:
					response.sendRedirect("over.jsp");
					break;
				default:
					break;
			}
		}			
		}
		
	}


package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/home") //url맵핑
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		//요청된 request의 action에 들어간 파라미터 값을 가져오는겨 (login or help)
		//그 값에 따라서 
		String page =null;
		
		if(action.equals("login"))
			page="/view/loginform.jsp"; 
		else
			page="/view/help.jsp";
		//위에 jsp는 미리 만든게아니라 지금 써놓고 후에 만들려고 하는거야.
		
		//forward하기위해서 RequestDispatcher필요해
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
	}

}

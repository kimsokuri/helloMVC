package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import service.CustomerService;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/doLogin") //url맵핑
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String customerId = request.getParameter("customerId");
		
		//Perform business logic, return to a bean as result 
		//데베 접근해야해서 해시맵으로..ㅠ service/Customer안에 해쉬맵있어
		CustomerService service = new CustomerService();
		//CustomerService 객체 생성 얘  초기 작업(생성자)이 addCustomer해서 해쉬맵ㄴ 넣는거임
		
		Customer customer = service.findCustomer(customerId);
		//저 함수가 customer객체 리턴
		//service객체안에 있는 find함수 불러와
		//id(key)에 해당하는 Customer객체(value)를 hashmap에서 리턴하겠다는거임.
		request.setAttribute("customer", customer);
		//request 객체에다  "customer"이름으로 
        //findCustomer(customerId); 함수 수행한 결과의 customer객체를 집어넣음
		
		
		List<Customer> customerList = service.getAllCustomers();
		//CustomerService클래스에 있는 모든 value값 list형식으로 리턴
		request.setAttribute("customers", customerList);
		//request 객체에다  "customers"이름으로 
        //getAllCustomers(); 함수 수행한 결과의 customerList 객체를 집어넣음
		
		//customer 정보 받아온 가정하에
		String page;
		if(customer == null) ////customer은 findCustomer(customerId);결과값이들어잇어
			page="/view/error.jsp";
		else
			page="/view/success.jsp";
			
		//페이지 포워딩
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
		//success,error 리퀘스트도 같이 넘어가니까. 
		//findCustomer(customerId);의 결과값인 customer 객체도 같이 넘어가.
	}

}

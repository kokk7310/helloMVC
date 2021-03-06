package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import service.CustomerService;

/**
 * Servlet implementation class DoRegister
 */
@WebServlet("/doRegister")
public class DoRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=request.getParameter("customerId");
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String gender =request.getParameter("gender");
		String email=request.getParameter("email");
		CustomerService instance=(CustomerService) CustomerService.getInstance();
		
		Customer customer=new Customer(id,password,gender,name,email);
		instance.addCustomer(customer);
		request.setAttribute("customer", customer);
		String page;
		page="/view/registerSuccess.jsp";				
		
		RequestDispatcher dispatcher =request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
	}

}

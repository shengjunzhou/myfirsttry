package shengjun.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shengjun.daoo.ProductImp;
import shengjun.entity.Product;

/**
 * Servlet implementation class Addservlet
 */

public class Addservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		response.setContentType("text/html;charset=utf-8");
		Product po=new Product();
	
		po.setId(request.getParameter("id"));
		po.setProname((String)request.getParameter("proname"));
		po.setPrice(Double.parseDouble(request.getParameter("price")));
		po.setProtype((String)request.getParameter("protype"));
		
//		String id=po.getId();
//		String 	productname=po.getProname();
//		
//		String producttype=po.getProtype();
//		Double price=po.getPrice();
		ProductImp.addproduct(po);
		response.getWriter().write("增加了商品");
	}

}

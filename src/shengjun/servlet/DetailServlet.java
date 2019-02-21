package shengjun.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shengjun.daoo.ProductImp;
import shengjun.entity.Product;

/**
 * Servlet implementation class DetailServlet
 */

public class DetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetailServlet() {
        super();
    
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String str=request.getParameter("id");
		ProductImp haha=new ProductImp();	
		Product pp=haha.query(str);
	
		String html="<html><head><title></title></head><body>這是第"+pp.getId()+"個商品</body>";
		html+="</html>";
		response.getWriter().write(html);
		
		Cookie co=new Cookie("proco",str);
		co.setMaxAge(1*60*60);
		response.addCookie(co);
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}

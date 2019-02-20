package shengjun.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shengjun.daoo.ProductImp;
import shengjun.entity.Product;

/**
 * Servlet implementation class Listservlet
 */
@WebServlet("/Listservlet")
public class Listservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Listservlet() {
        super();
      
    }

	/**
	 * 显示所有商品页面
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("test/html;charset=utf-8");
		
		ProductImp pro=new ProductImp();
		List<Product> list1 =pro.findall();
		
		String html="<html><head><title>商品列表</title></head><body>";
		html+="<table border ='1' align='center' width='600px'";
		html+="<tr><th>编号</th><th>商品名称</th><th>商品型号</th><th>商品价格</th></tr>";
		if(list1!=null) {
			for(Product proo:list1) {
			html+="<tr><td>"+proo.getId()+"</td><td>"+proo.getProname()+"<a href='"+request.getContextPath()+"/DetailServlet?id=1'></td><td>"+proo.getProtype()+"</td><td>"+proo.getPrice()+"</td></tr>";
			
			}
		}
		
		html+="</body></head></html>";
		
		response.getWriter().write(html);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

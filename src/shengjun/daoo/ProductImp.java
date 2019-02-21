package shengjun.daoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import shengjun.entity.Product;

public class ProductImp{
   
	
	

	public void addproduct(Product product) {
		
		
	}
	
	public void updateproduct(Product product) {
		// TODO Auto-generated method stub
		
	}
	
	public void deleproduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	public Product query(String id) {
		ProductImp pro=new ProductImp();
		for(Product product:pro.jdbcc()) {
			if(product.getId().equals(id)) {
				return product;
			}	
		}
		return null;
		
	}

	public List<Product> findall() {
		ProductImp oo=new ProductImp();
		  return oo.jdbcc();
	}
	
	public  static List<Product> jdbcc() {
		
		List<Product> po=new ArrayList();
		 Connection con=null;
		 PreparedStatement pre=null;
	 try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
	}
	 
	 try {
	
	 String sql="select * from product";
	
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sell","root","root");
	pre=con.prepareStatement(sql);
	ResultSet re=pre.executeQuery();
	
	while(re.next()){
		String id=re.getString("id");
		String  proname=re.getString("proname");
		String protype =re.getString("protype");
		Double price=re.getDouble("price");
		Product pro=new Product();
		pro.setId(id);
		pro.setPrice(price);
		pro.setProname(proname);
		pro.setProtype(protype);
		po.add(pro);
	}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}finally {
	if(con!=null) {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	if(pre!=null) {
		try {
			pre.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	return po;
		
	}
}
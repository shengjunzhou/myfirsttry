package shengjun.daoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import shengjun.entity.Product;
import shengjun.util.JdbcUtil;

public class ProductImp{
   
	
	
//增加商品
	public void addproduct(Product product) {
		Connection con=null;
		ResultSet re = null;
		Statement stml=null;
		String sql="insert into product(id,proname,protype,price)values(?,?,?,?)";
		try {
				con=JdbcUtil.CreateJ();
				PreparedStatement pre=con.prepareStatement(sql);
				pre.setString(1, product.getId());
				pre.setString(1, product.getProname());
				pre.setString(1, product.getProtype());
				pre.setDouble(1, product.getPrice());
				pre.execute();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
			JdbcUtil.closeJdbc(re,con,stml);	
	}	
		
	
	//更新商品
	public void updateproduct(Product product) {
		// TODO Auto-generated method stub
		
	}
	//删除商品
	public void deleproduct(String id) {
		for(Product product:ProductImp.jdbcc()) {
			if(product.getId().equals(id)) {
				//执行删除操作
				Connection con=null;
				ResultSet re = null;
				Statement stml=null;
				String sql="delete from product where id=?";
				try {
						con=JdbcUtil.CreateJ();
						PreparedStatement pre=con.prepareStatement(sql);
						pre.setString(1, product.getId());
						pre.execute();
					} catch (SQLException e) {
						e.printStackTrace();
					}	
					JdbcUtil.closeJdbc(re,con,stml);	
			}	
		}	
	}
//查询id值的product对象
	public Product query(String id) {
		for(Product product:ProductImp.jdbcc()) {
			if(product.getId().equals(id)) {
				return product;
			}	
		}
		return null;
		
	}
	//查询所有商品
	public List<Product> findall() {
		  return ProductImp.jdbcc();
	}
	//查询所有商品
	public  static List<Product> jdbcc()  {
		Connection con=null;
		ResultSet re = null;
		Statement stml=null;
		List<Product> po=new ArrayList();
		String sql="select * from product";
	
		
		try {
			con=JdbcUtil.CreateJ();
			stml=con.createStatement();
			re=stml.executeQuery(sql);
		
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
		}
		JdbcUtil.closeJdbc(re,con,stml);
		return po;
	}
}
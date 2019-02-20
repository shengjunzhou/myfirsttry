package shengjun.daoo;

import java.util.ArrayList;
import java.util.List;

import shengjun.entity.Product;

public class ProductImp  implements Productdao{
   
	private static 	List<Product> data=new ArrayList<>();
	static {
	for(int i=1;i<=10;i++) {
		data.add(new Product(""+i,"笔记本"+i,"LNOO"+i,34.0+i));
	}
		
		
	}
	@Override
	public void addproduct(Product product) {
		
		
	}
	@Override
	public void updateproduct(Product product) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleproduct(Product product) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Product query(String id) {
		for(Product product:data) {
			if(product.getId().equals(id)) {
				return product;
			}	
		}
		return null;
		
	}
	@Override
	public List<Product> findall() {
		
		return data;
	}
}
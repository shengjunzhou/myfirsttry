package shengjun.daoo;

import java.util.List;

import shengjun.entity.Product;

/**
 * @author 周圣军
 *增删改查的方法
 */
interface Productdao {
	public void addproduct(Product product);
	public void updateproduct(Product product);
	public void deleproduct(Product product);
	public Product query(String id);
	public List<Product> findall();
	public  List<Product> jdbcc();
	
}

package cn.itcast.service;

import cn.itcast.pojo.ResultModel;

public interface ProductService {
	
	// 查询商品一览
	public ResultModel findProductResults(String queryString, String catalog_name, 
			String price, Integer page, String sort) throws Exception;
	
	private int a;
	private int c;

}

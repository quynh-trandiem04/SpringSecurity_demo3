package vn.iotstar.service;

import java.util.List;

import vn.iotstar.entity.Product;

public interface ProductServices {

	List<Product> listAll();

	Product save(Product product);

	Product get(Long id);

	void delete(Long id);

}

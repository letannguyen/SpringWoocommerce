package poly.store.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import poly.store.dao.ProductDAO;
import poly.store.entity.Product;
import poly.store.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductDAO productDAO;

	@Override
	public List<Product> findAll() {
		return productDAO.findAll();
	}


	@Override
	public Product findById(Integer id) {
		return productDAO.findById(id).get();
	}


	@Override
	public List<Product> findByCategoryId(String cid) {
		return productDAO.findByCategoryId(cid);
	}


	@Override
	public Product create(Product product) {
		return productDAO.save(product);
	}


	@Override
	public Product update(Product product) {
		return productDAO.save(product);
	}


	@Override
	public void delete(Integer id) {
		productDAO.deleteById(id);
	}
	
	
}

package poly.store.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import poly.store.dao.CategoryDAO;
import poly.store.entity.Category;
import poly.store.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	CategoryDAO categoryDAO;

	@Override
	public <S extends Category> S save(S entity) {
		return categoryDAO.save(entity);
	}

	@Override
	public Page<Category> findAll(Pageable pageable) {
		return categoryDAO.findAll(pageable);
	}

	@Override
	public List<Category> findAll() {
		return categoryDAO.findAll();
	}

	@Override
	public List<Category> findAll(Sort sort) {
		return categoryDAO.findAll(sort);
	}

	@Override
	public Category findById(Integer id) {
		return categoryDAO.findById(id).get();
	}

	@Override
	public <S extends Category> List<S> saveAll(Iterable<S> entities) {
		return categoryDAO.saveAll(entities);
	}

	@Override
	public boolean existsById(Integer id) {
		return categoryDAO.existsById(id);
	}

	@Override
	public <S extends Category> boolean exists(Example<S> example) {
		return categoryDAO.exists(example);
	}

	@Override
	public long count() {
		return categoryDAO.count();
	}

	@Override
	public void deleteById(Integer id) {
		categoryDAO.deleteById(id);
	}

	@Override
	public void delete(Category entity) {
		categoryDAO.delete(entity);
	}

	@Override
	public void deleteAll() {
		categoryDAO.deleteAll();
	}

	@Override
	public Category getById(Integer id) {
		return categoryDAO.getById(id);
	}
	
	
}

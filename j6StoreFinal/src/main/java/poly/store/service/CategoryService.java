package poly.store.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import poly.store.entity.Category;

public interface CategoryService {

	Category getById(Integer id);

	void deleteAll();

	void delete(Category entity);

	void deleteById(Integer id);

	long count();

	<S extends Category> boolean exists(Example<S> example);

	boolean existsById(Integer id);

	<S extends Category> List<S> saveAll(Iterable<S> entities);

	Category findById(Integer id);

	List<Category> findAll(Sort sort);

	List<Category> findAll();

	Page<Category> findAll(Pageable pageable);

	<S extends Category> S save(S entity);

}

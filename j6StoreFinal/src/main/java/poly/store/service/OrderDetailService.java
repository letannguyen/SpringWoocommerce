package poly.store.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import poly.store.entity.OrderDetail;

public interface OrderDetailService {

	OrderDetail getById(Integer id);

	void deleteAll();

	void delete(OrderDetail entity);

	void deleteById(Integer id);

	long count();

	<S extends OrderDetail> boolean exists(Example<S> example);

	<S extends OrderDetail> Page<S> findAll(Example<S> example, Pageable pageable);

	boolean existsById(Integer id);

	<S extends OrderDetail> List<S> saveAll(Iterable<S> entities);

	Optional<OrderDetail> findById(Integer id);

	List<OrderDetail> findAllById(Iterable<Integer> ids);

	List<OrderDetail> findAll(Sort sort);

	List<OrderDetail> findAll();

	Page<OrderDetail> findAll(Pageable pageable);

	<S extends OrderDetail> S save(S entity);

}

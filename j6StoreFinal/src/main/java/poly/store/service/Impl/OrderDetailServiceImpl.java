package poly.store.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import poly.store.dao.OrderDetailDAO;
import poly.store.entity.OrderDetail;
import poly.store.service.OrderDetailService;


@Service
public class OrderDetailServiceImpl implements OrderDetailService{
	
	@Autowired
	OrderDetailDAO OrderDetailDAO;

	@Override
	public <S extends OrderDetail> S save(S entity) {
		return OrderDetailDAO.save(entity);
	}

	@Override
	public Page<OrderDetail> findAll(Pageable pageable) {
		return OrderDetailDAO.findAll(pageable);
	}

	@Override
	public List<OrderDetail> findAll() {
		return OrderDetailDAO.findAll();
	}

	@Override
	public List<OrderDetail> findAll(Sort sort) {
		return OrderDetailDAO.findAll(sort);
	}

	@Override
	public List<OrderDetail> findAllById(Iterable<Integer> ids) {
		return OrderDetailDAO.findAllById(ids);
	}

	@Override
	public Optional<OrderDetail> findById(Integer id) {
		return OrderDetailDAO.findById(id);
	}

	@Override
	public <S extends OrderDetail> List<S> saveAll(Iterable<S> entities) {
		return OrderDetailDAO.saveAll(entities);
	}

	@Override
	public boolean existsById(Integer id) {
		return OrderDetailDAO.existsById(id);
	}

	@Override
	public <S extends OrderDetail> Page<S> findAll(Example<S> example, Pageable pageable) {
		return OrderDetailDAO.findAll(example, pageable);
	}

	@Override
	public <S extends OrderDetail> boolean exists(Example<S> example) {
		return OrderDetailDAO.exists(example);
	}

	@Override
	public long count() {
		return OrderDetailDAO.count();
	}

	@Override
	public void deleteById(Integer id) {
		OrderDetailDAO.deleteById(id);
	}

	@Override
	public void delete(OrderDetail entity) {
		OrderDetailDAO.delete(entity);
	}

	@Override
	public void deleteAll() {
		OrderDetailDAO.deleteAll();
	}

	@Override
	public OrderDetail getById(Integer id) {
		return OrderDetailDAO.getById(id);
	}
	
	
}

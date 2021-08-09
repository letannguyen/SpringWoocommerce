package poly.store.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import poly.store.dao.RoleDAO;
import poly.store.entity.Role;
import poly.store.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	RoleDAO roleDAO;

	@Override
	public List<Role> findAll() {
		return roleDAO.findAll();
	}

	
	
}

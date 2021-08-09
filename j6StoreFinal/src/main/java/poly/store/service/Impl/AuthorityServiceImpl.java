package poly.store.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import poly.store.dao.AccountDAO;
import poly.store.dao.AuthorityDAO;
import poly.store.entity.Account;
import poly.store.entity.Authority;
import poly.store.service.AuthorityService;

@Service
public class AuthorityServiceImpl implements AuthorityService{
	
	@Autowired
	AuthorityDAO authorityDAO;
	@Autowired
	AccountDAO accountDAO;


	@Override
	public List<Authority> findAll() {
		return authorityDAO.findAll();
	}


	@Override
	public void delete(Integer id) {
		authorityDAO.deleteById(id);
	}


	@Override
	public List<Authority> findAuthoritiesOfAdministrators() {
		List<Account> accounts = accountDAO.getAdministrators();
		return authorityDAO.authoritiesOf(accounts);
	}


	@Override
	public Authority create(Authority auth) {
		return authorityDAO.save(auth);
	}

	
	
}

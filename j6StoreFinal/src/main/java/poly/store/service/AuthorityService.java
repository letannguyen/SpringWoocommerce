package poly.store.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import poly.store.entity.Authority;

public interface AuthorityService {

	void delete(Integer id);

	List<Authority> findAll();

	List<Authority> findAuthoritiesOfAdministrators();

	public Authority create(Authority auth);
}

package br.com.btg.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import br.com.btg.entities.User;
import br.com.btg.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public User findById(Long id) {
		Optional<User> result = repository.findById(id);
		return result.orElseThrow();
	}

	public Page<User> findAll(PageRequest pageRequest) {
		return repository.findAll(pageRequest);
	}

	public User insert(User dto) {
		return repository.save(dto);
	}

}

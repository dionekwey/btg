package br.com.btg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.btg.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

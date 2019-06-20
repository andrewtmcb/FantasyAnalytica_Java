package io.mcbrayer.fa7.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.mcbrayer.fa7.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

	public User findByEmail(String email);
}

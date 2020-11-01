package com.brown.messenger.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brown.messenger.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

}

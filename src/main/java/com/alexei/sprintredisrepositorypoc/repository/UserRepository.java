package com.alexei.sprintredisrepositorypoc.repository;

import org.springframework.data.repository.CrudRepository;

import com.alexei.sprintredisrepositorypoc.domain.User;

public interface UserRepository extends CrudRepository<User, String> {
  
}

package com.alexei.sprintredisrepositorypoc.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.alexei.sprintredisrepositorypoc.domain.User;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = TestRedisConfiguration.class)
public class UserRepositoryTest {  

  @Autowired
  private UserRepository userRepository;

  private User userData = new User("id","Alexei", "29");


  @Test
  void deveSalvarUmUsuarioNoCache() {

    userRepository.save(userData);    

    long count = userRepository.count();

    Assertions.assertEquals(1L, count);

  }
}

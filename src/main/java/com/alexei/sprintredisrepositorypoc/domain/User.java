package com.alexei.sprintredisrepositorypoc.domain;

import org.springframework.data.redis.core.RedisHash;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@RedisHash("user")
public class User {
  
  private String id;
  private String name;
  private String age;
}

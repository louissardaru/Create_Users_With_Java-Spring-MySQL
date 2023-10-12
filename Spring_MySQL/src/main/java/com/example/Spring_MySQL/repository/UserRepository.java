//repository that holds user records
//// This will be auto implemented by Spring into a Bean called userRepository
package com.example.Spring_MySQL.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.Spring_MySQL.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
}
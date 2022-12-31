
package com.concretedetailer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.concretedetailer.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {

}

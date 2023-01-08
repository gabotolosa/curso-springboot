package com.gabotolofullstack.cursospringboot.repository;

import com.gabotolofullstack.cursospringboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

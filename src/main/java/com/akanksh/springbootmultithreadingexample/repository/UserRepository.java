package com.akanksh.springbootmultithreadingexample.repository;

import com.akanksh.springbootmultithreadingexample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}

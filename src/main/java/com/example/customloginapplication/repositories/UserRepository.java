package com.example.customloginapplication.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.customloginapplication.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    User findByUsername (String username);

}

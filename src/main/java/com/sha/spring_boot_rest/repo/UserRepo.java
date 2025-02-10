package com.sha.spring_boot_rest.repo;

import com.sha.spring_boot_rest.model.Users;
import com.sha.spring_boot_rest.repo.UserRepo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users,Integer> {
    Users findByUsername(String username);
}

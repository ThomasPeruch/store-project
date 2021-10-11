package com.tperuch.storeproject.repositories;

import com.tperuch.storeproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
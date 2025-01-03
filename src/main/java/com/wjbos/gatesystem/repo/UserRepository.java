package com.wjbos.gatesystem.repo;

import com.wjbos.gatesystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User ,Long> {
}

package com.wjbos.gatesystem.features.authentication.repository;

import com.wjbos.gatesystem.features.authentication.entity.AuthenticationUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthenticationUserRepository extends JpaRepository<AuthenticationUser, Long> {
}

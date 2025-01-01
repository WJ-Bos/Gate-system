package com.wjbos.gatesystem.repo;

import com.wjbos.gatesystem.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, String> {
}

package com.wjbos.gatesystem.repo;

import com.wjbos.gatesystem.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token, String> {
    Optional<Token> findByRecipientCellNumber(String cellNumber);

    Optional<Token> findByTokenValue(String tokenValue);
}

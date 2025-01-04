package com.wjbos.gatesystem.config;

import com.wjbos.gatesystem.features.authentication.entity.AuthenticationUser;
import com.wjbos.gatesystem.features.authentication.repository.AuthenticationUserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabaseConfig {

    @Bean
    public CommandLineRunner initDatabase(AuthenticationUserRepository authenticationUserRepository){
        return args -> {
            AuthenticationUser authenticationUser = new AuthenticationUser("user@example.com","password");
            authenticationUserRepository.save(authenticationUser);
        };
    }
}

package com.example.cms.repository;

import com.example.cms.entity.SessionToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SessionTokenRepository extends JpaRepository<SessionToken,Long> {
    Optional<SessionToken> findByToken(String token);
}

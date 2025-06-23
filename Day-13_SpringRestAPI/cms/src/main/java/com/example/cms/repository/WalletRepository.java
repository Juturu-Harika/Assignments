package com.example.cms.repository;

import com.example.cms.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet,Long> {
    Wallet findByUserId(Long id);
}

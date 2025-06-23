package com.example.cms.controller;

import com.example.cms.entity.Wallet;
import com.example.cms.repository.UserRepository;
import com.example.cms.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/wallet")
public class WalletController {
    @Autowired
    private WalletRepository walletRepository;
    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public ResponseEntity<Wallet> addMoney(@RequestParam Long id, @RequestParam double amount){
        Wallet wallet=walletRepository.findByUserId(id);
        wallet.setBalance(wallet.getBalance()+amount);
        walletRepository.save(wallet);
        return ResponseEntity.ok(wallet);
    }

}
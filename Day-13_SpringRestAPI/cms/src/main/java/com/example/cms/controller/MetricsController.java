package com.example.cms.controller;

import com.example.cms.repository.ServiceRequestRepository;
import com.example.cms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class MetricsController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ServiceRequestRepository serviceRequestRepository;

    @GetMapping("/active-user")
    public long countActiveUsers(){
        return userRepository.count();
    }

    @GetMapping("/active-service-requests")
    public long countActiveRequests(){
        return serviceRequestRepository.count();
    }
}

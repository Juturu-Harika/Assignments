package com.example.cms.controller;

import com.example.cms.entity.ServiceRequest;
import com.example.cms.repository.ServiceRequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-request")
@RequiredArgsConstructor
public class ServiceRequestController {
    @Autowired
    private ServiceRequestRepository serviceRequestRepository;

    @PostMapping
    public ResponseEntity<ServiceRequest> createREquest(@RequestBody ServiceRequest serviceRequest){
        ServiceRequest saveRequest=serviceRequestRepository.save(serviceRequest);
        return ResponseEntity.ok(saveRequest);
    }
}

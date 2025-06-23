package com.example.cms.repository;

import com.example.cms.entity.ServiceRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRequestRepository extends JpaRepository<com.example.cms.entity.ServiceRequest,Long> {
}

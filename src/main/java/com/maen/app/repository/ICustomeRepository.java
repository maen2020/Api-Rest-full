package com.maen.app.repository;

import com.maen.app.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomeRepository extends JpaRepository<CustomerEntity, Integer> {
}

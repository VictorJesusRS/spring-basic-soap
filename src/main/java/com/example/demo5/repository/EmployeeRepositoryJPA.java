package com.example.demo5.repository;

import com.example.demo5.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepositoryJPA extends CrudRepository<EmployeeEntity, String> {
}

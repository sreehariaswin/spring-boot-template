package com.example.demo.bootdemo.repository;

import com.example.demo.bootdemo.model.HelloEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloRepository extends JpaRepository<HelloEntity, Long> {
}
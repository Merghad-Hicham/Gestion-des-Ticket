package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Billet;


public interface BilletRepository extends JpaRepository<Billet, Long> {

}

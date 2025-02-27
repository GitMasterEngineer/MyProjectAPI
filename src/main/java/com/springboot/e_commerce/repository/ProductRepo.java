package com.springboot.e_commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.e_commerce.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

}

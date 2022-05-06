package com.devsuperior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}

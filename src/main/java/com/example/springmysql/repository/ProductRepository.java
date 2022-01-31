package com.example.springmysql.repository;

import com.example.springmysql.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product,Integer> {
    Product findByName(String name);
}


package com.example.th02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.th02.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
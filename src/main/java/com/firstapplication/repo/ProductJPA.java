package com.firstapplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstapplication.jpa.productDetails;

public interface ProductJPA extends JpaRepository<productDetails,Integer> {

}

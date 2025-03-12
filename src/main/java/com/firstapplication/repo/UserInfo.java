package com.firstapplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstapplication.jpa.userInformation;

public interface UserInfo extends JpaRepository<userInformation, Integer> {

}

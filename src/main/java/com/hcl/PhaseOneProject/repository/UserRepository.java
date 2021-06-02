package com.hcl.PhaseOneProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.PhaseOneProject.model.User;

public interface UserRepository extends JpaRepository <User, Long>{

	
}

package com.hcl.PhaseOneProject.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.PhaseOneProject.model.User;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

public interface UserRepository extends JpaRepository <User, Long>{

}

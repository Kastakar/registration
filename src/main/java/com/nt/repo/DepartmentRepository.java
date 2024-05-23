package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

	

}

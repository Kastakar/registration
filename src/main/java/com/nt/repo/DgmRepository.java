	package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.model.Dgm;

@Repository
public interface DgmRepository extends JpaRepository<Dgm, Long>  {

}

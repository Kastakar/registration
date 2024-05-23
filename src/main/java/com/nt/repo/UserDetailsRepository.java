package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.model.UserDetails;


@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {

}

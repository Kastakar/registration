package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nt.model.Department;
import com.nt.model.Dgm;
import com.nt.model.UserDetails;
import com.nt.repo.DepartmentRepository;
import com.nt.repo.DgmRepository;
import com.nt.repo.UserDetailsRepository;

@Service
public class UserService {

    @Autowired
    private UserDetailsRepository userDetailsRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private DgmRepository dgmRepository;

    @Transactional
    public UserDetails createUser(String username, String password, String name, String role, Long departmentId, String email) {
       
    	if ("checker".equalsIgnoreCase(role)) {
            // Insert into dgm table
            Dgm dgm = new Dgm();
            dgm.setDgmName(name);
            dgm.setDgmMail(email);
            dgm = dgmRepository.save(dgm);

            // Update the department with the new DGM ID
            Department department = departmentRepository.findById(departmentId)
                    .orElseThrow(() -> new IllegalArgumentException("Invalid department ID"));
            department.setDgmId(dgm.getDgmId());
            departmentRepository.save(department);
            

            // Set the username as the DGM ID
            username = dgm.getDgmId().toString();
        }

        // Insert into user_details table
        UserDetails userDetails = new UserDetails();
        userDetails.setUsername(username);
//        userDetails.setDepartment(department);
        userDetails.setPassword(password);
        userDetails.setName(name);
        userDetails.setRole(role);
        userDetails.setDepartmentId(departmentId);
        userDetails.setEmail(email);
        return userDetailsRepository.save(userDetails);
    }
}

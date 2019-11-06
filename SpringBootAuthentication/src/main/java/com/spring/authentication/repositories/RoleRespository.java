package com.spring.authentication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.authentication.models.Role;

@Repository("roleRepository")
public interface RoleRespository extends JpaRepository<Role, Integer> {
	Role findByRole(String role);
}

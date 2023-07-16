package com.example.lastsmida.Repository;

import com.example.lastsmida.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository <Role, String> {
}

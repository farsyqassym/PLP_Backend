package com.example.lastsmida.Repository;

import com.example.lastsmida.Model.User;
import com.example.lastsmida.Service.UserService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}

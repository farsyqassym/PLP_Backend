package com.example.lastsmida.Service;

import com.example.lastsmida.Model.Role;
import com.example.lastsmida.Model.Staff;
import com.example.lastsmida.Model.Applicant;
import com.example.lastsmida.Model.User;
import com.example.lastsmida.Repository.RoleRepository;
import com.example.lastsmida.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Applicant registerNewApplicant(Applicant applicant){
      Role role = roleRepository.findById("Applicant").get();

      Set <Role> roles = new HashSet<>();
      roles.add(role);
      applicant.setRole(roles);

     // applicant.setUserPassword(getEncodedPassword(applicant.getUserPassword()));

        return userRepository.save(applicant);
    }

    // Staff registration
    public Staff registerNewStaff(Staff staff){
        Role role = roleRepository.findById("Staff").get();

        Set <Role> roles = new HashSet<>();
        roles.add(role);
        staff.setRole(roles);

       // staff.setUserPassword(getEncodedPassword(staff.getUserPassword()));

        return userRepository.save(staff);
    }
    @Autowired
    private RoleRepository roleRepository;

//    @Autowired
//    private PasswordEncoder passwordEncoder;
    public void initRoleAndUser() {
        Role adminRole = new Role();
        adminRole.setRoleName("Admin");
        adminRole.setRoleDescription("Admin role");
        roleRepository.save(adminRole);

        Role staffRole = new Role();
        staffRole.setRoleName("Staff");
        staffRole.setRoleDescription("this person has staff role");
        roleRepository.save(staffRole);

        Role applicantRole = new Role();
        applicantRole.setRoleName("Applicant");
        applicantRole.setRoleDescription("this person has applicant role");
        roleRepository.save(applicantRole);

        User adminUser = new User();
        adminUser.setUserFirstName("Abdulla");
        adminUser.setUserMiddleName("Makame");
        adminUser.setUserLastName("Abdalla");
        adminUser.setUserEmail("carrasco21abdulla@gmail.com");
        adminUser.setUserPhone("0778109782");
        adminUser.setUserName("carrasco");
    //    adminUser.setUserPassword(getEncodedPassword("5673"));
        Set <Role> adminRoles = new HashSet<>();
        adminRoles.add(adminRole);
        adminUser.setRole(adminRoles);
        userRepository.save(adminUser);

        User staffUser = new User();
        staffUser.setUserFirstName("Is-haka");
        staffUser.setUserMiddleName("Abdulla");
        staffUser.setUserLastName("Abeid");
        staffUser.setUserEmail("ishak@gmail.com");
        staffUser.setUserPhone("0774568903");
        staffUser.setUserName("binabeid");
       // staffUser.setUserPassword(getEncodedPassword("12345"));
        Set <Role> staffRoles = new HashSet<>();
        staffRoles.add(staffRole);
        staffUser.setRole(staffRoles);
        userRepository.save(staffUser);

        User applicantUser = new User();
        applicantUser.setUserFirstName("Akram");
        applicantUser.setUserMiddleName("Salum");
        applicantUser.setUserLastName("Ali");
        applicantUser.setUserEmail("akram@gmail.com");
        applicantUser.setUserPhone("0779035673");
        applicantUser.setUserName("supervisor");
//        applicantUser.setUserPassword(getEncodedPassword("suza"));
        Set <Role> applicantRoles = new HashSet<>();
        applicantRoles.add(applicantRole);
        applicantUser.setRole(applicantRoles);
        userRepository.save(applicantUser);

    }

//    public String getEncodedPassword(String password) {
//        return passwordEncoder.encode(password);
//    }


}

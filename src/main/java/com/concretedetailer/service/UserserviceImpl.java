/*
 * package com.concretedetailer.service;
 * 
 * import java.util.Arrays; import java.util.HashSet;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; import
 * org.springframework.stereotype.Service;
 * 
 * import com.concretedetailer.model.Role; import
 * com.concretedetailer.model.Users; import
 * com.concretedetailer.repo.RoleRepository; import
 * com.concretedetailer.repo.UserRepository;
 * 
 * @Service public class UserserviceImpl {
 * 
 * private UserRepository userRepository; private RoleRepository roleRepository;
 * private BCryptPasswordEncoder bCryptPasswordEncoder;
 * 
 * 
 * @Autowired public UserserviceImpl(UserRepository userRepository,
 * RoleRepository roleRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
 * this.userRepository = userRepository; this.roleRepository = roleRepository;
 * this.bCryptPasswordEncoder = bCryptPasswordEncoder; }
 * 
 * 
 * public Users findUserByEmail(String email) { return
 * userRepository.findByEmail(email); }
 * 
 * 
 * 
 * public Users saveUser(Users user) {
 * user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
 * user.setActive(true); Role userRole = roleRepository.findByRoleName("ADMIN");
 * user.setRoles(new HashSet<Role>(Arrays.asList(userRole))); return
 * userRepository.save(user); }
 * 
 * 
 * 
 * 
 * }
 */
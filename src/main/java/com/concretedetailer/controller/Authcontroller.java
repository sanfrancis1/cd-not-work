/*
 * package com.concretedetailer.controller;
 * 
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.security.crypto.password.PasswordEncoder; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestBody;
 * 
 * import com.concretedetailer.dto.SignupDto; import
 * com.concretedetailer.model.Users; import
 * com.concretedetailer.repo.UserRepository;
 * 
 * @Controller public class Authcontroller {
 * 
 * @Autowired private UserRepository userRepository;
 * 
 * 
 * @Autowired private RoleRepository roleRepository;
 * 
 * @Autowired private PasswordEncoder passwordEncoder;
 * 
 * @PostMapping("/signup") public ResponseEntity<?> registerUser(@RequestBody
 * SignupDto signupdto){
 * 
 * // add check for username exists in a DB
 * if(userRepository.existsByUsername(signupdto.getEmail())){ return new
 * ResponseEntity<>("Username is already taken!", HttpStatus.BAD_REQUEST); }
 * 
 * Users user = new Users(); user.setName(signupdto.getName());
 * user.setUsername(signupdto.getEmail()); user.setEmail(signupdto.getEmail());
 * user.setPassword(passwordEncoder.encode(signupdto.getPassword()));
 * userRepository.save(user);
 * 
 * return new ResponseEntity<>("User registered successfully", HttpStatus.OK); }
 * }
 */
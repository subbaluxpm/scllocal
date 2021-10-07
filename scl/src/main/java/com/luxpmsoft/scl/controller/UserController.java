/**
 * 
 */
package com.luxpmsoft.scl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luxpmsoft.scl.model.User;
import com.luxpmsoft.scl.repository.UserRepository;
import com.luxpmsoft.scl.util.StatusEnum;

/**
 * @author user
 *
 */
@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
    private UserRepository userRepository;
	
	@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@PostMapping("/register")
    public StatusEnum registerUser(@Validated @RequestBody User newUser) {
        List<User> users = userRepository.findAll();
        System.out.println("New user: " + newUser.toString());
        for (User user : users) {
            System.out.println("Registered user: " + newUser.toString());
            if (user.equals(newUser)) {
                System.out.println("User Already exists!");
                return StatusEnum.USER_ALREADY_EXISTS;
            }
        }
        userRepository.save(newUser);
        return StatusEnum.SUCCESS;
    }
	
	@PostMapping("/signup")
    public User signUp(@RequestBody User user)
    {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
	
	@GetMapping("/users")
    public List<User> users()
    {
        return userRepository.findAll();
    }
	
	@GetMapping("/home")
	public String home(){
		return "This is Home Page";		
	}
	
	@GetMapping("/admin")
	public String admin(){
		return "This is Admin Page";		
	}

}

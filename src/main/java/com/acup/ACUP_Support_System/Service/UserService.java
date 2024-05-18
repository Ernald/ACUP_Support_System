package com.acup.ACUP_Support_System.Service;

import com.acup.ACUP_Support_System.Repository.UserRepository;
import com.acup.ACUP_Support_System.models.User;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;

//    public User saveUser(User user) {
//        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
//        return userRepository.save(user);
//    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    // We can add custom query methods if needed

}

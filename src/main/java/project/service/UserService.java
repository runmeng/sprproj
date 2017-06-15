package project.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import project.model.User;

public interface UserService extends UserDetailsService{
    void save(User user);
    User findByUsername(String username);
}

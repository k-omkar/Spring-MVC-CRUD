package blog.services;

import blog.models.User;
import blog.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.JpaSort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImplementation implements UserService{
    @Autowired
    private UserRepository userRepo;

    @Override
    public boolean authenticate(String username, String password) {
        return Objects.equals(username, password);
    }

    public List<User> listUsers(){
        return this.userRepo.listAllUsers();
    }

    public User findById(Long id) {
        return this.userRepo.findById(id).orElse(null);
    }

    public User create(User user) {
        return this.userRepo.save(user);
    }

    public User edit(User user) {
        return this.userRepo.save(user);
    }

    public void deleteById(Long id) {
        this.userRepo.deleteById(id);
    }
}

package hotel.UserService;

import hotel.User;
import hotel.UserRepository.UserRepository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class UserService {

private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findUserById (@PathVariable long id) {
        return userRepository.findUserById(id);
    }

    public User findUserByPhone(String phone) {
        return userRepository.findUserByPhone(phone);
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}

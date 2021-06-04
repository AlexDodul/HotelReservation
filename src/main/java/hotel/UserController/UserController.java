package hotel.UserController;

import hotel.User;
import hotel.UserService.UserService;
import org.springframework.web.bind.annotation.PathVariable;

public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public User findUserById (@PathVariable long id){
        return userService.findUserById(id);
    }

}

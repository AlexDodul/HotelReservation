package hotel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private long id;

    private String phone;

    private String password;

    private String firstName;

    private String lastName;

    private UserRole role;

    public User(
            String phone,
            String password,
            String firstName,
            String lastName,
            UserRole role
    ) {
        this.phone = phone;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

}

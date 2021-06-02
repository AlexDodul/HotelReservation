package hotel;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="users")
public class User {

    @Id
    @Column(name = "id", nullable = false, length = 50)
    @Type(type = "BIGINT")
    private long id;

    @Column(name = "phone", nullable = false, length = 10)
    @Type(type = "VARCHAR")
    private String phone;

    @Column(name = "password", nullable = false, length = 50)
    @Type(type = "VARCHAR")
    private String password;

    @Column(name = "firstName", nullable = false, length = 30)
    @Type(type = "VARCHAR")
    private String firstName;

    @Column(name = "lastName", nullable = false, length = 30)
    @Type(type = "VARCHAR")
    private String lastName;

    @Enumerated(EnumType.STRING)
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

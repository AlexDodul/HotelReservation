package hotel;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.security.Timestamp;

@Getter
@Setter
@Entity
@Table(name="reservations")
public class Reservation {

    @Id
    @Column(name = "id", nullable = false, length = 300)
    @Type(type = "BIGINT")
    private long id;

    @Column(name = "roomId", nullable = false, length = 200)
    @Type(type = "BIGINT")
    private long roomId;

    @Column(name = "userId", nullable = false, length = 30)
    @Type(type = "BIGINT")
    private long userId;

    @Column(name = "price", nullable = false, length = 30)
    @Type(type = "DECIMAL")
    private double price;

    @Enumerated(EnumType.STRING)
    private ReservationStatus status;

    @Enumerated(EnumType.STRING)
    private Timestamp startDate;

    public Reservation(
            long roomId,
            long userId,
            double price,
            ReservationStatus status,
            Timestamp startDate
    ) {
        this.roomId = roomId;
        this.userId = userId;
        this.price = price;
        this.status = status;
        this.startDate = startDate;
    }

}

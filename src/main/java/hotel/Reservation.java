package hotel;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.security.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "reservations")
public class Reservation {

    @Id
    @Column(name = "id", columnDefinition = "BIGINT", nullable = false, length = 300)
    private long id;

    @Column(name = "roomId", columnDefinition = "BIGINT", nullable = false, length = 200)
    private long roomId;

    @Column(name = "userId", columnDefinition = "BIGINT", nullable = false, length = 30)
    private long userId;

    @Column(name = "price", columnDefinition = "DECIMAL", nullable = false, length = 30)
    private double price;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", columnDefinition = "VARCHAR", nullable = false, length = 30)
    private ReservationStatus status;

    @Enumerated(EnumType.STRING)
    @Column(name = "start_date", columnDefinition = "VARCHAR", nullable = false, length = 30)
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

package hotel;

import lombok.Getter;
import lombok.Setter;

import java.security.Timestamp;

@Getter
@Setter
public class Reservation {

    private long id;

    private long roomId;

    private long userId;

    private double price;

    private ReservationStatus status;

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

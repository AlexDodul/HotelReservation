package hotel;

import java.security.Timestamp;

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }
}

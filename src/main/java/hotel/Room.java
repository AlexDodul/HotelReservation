package hotel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Room {

    private long id;

    private long roomNumber;

    private long guestsNumber;

    private RoomCategory category;

    private RoomStatus status;

    private double price;

    public Room(
            long roomNumber,
            long guestsNumber,
            RoomCategory category,
            RoomStatus status,
            double price
    ) {
        this.roomNumber = roomNumber;
        this.guestsNumber = guestsNumber;
        this.category = category;
        this.status = status;
        this.price = price;
    }

}

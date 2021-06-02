package hotel;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="rooms")
public class Room {

    @Id
    @Column(name = "id", nullable = false, length = 300)
    @Type(type = "BIGINT")
    private long id;

    @Column(name = "roomNumber", nullable = false, length = 200)
    @Type(type = "BIGINT")
    private long roomNumber;

    @Column(name = "guestsNumber", nullable = false, length = 200)
    @Type(type = "BIGINT")
    private long guestsNumber;

    @Enumerated(EnumType.STRING)
    private RoomCategory category;

    @Enumerated(EnumType.STRING)
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

package hotel;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "rooms")
public class Room {

    @Id
    @Column(name = "id", columnDefinition = "BIGINT", nullable = false, length = 300)
    private long id;

    @Column(name = "roomNumber", columnDefinition = "BIGINT", nullable = false, length = 200)
    private long roomNumber;

    @Column(name = "guestsNumber", columnDefinition = "BIGINT", nullable = false, length = 200)
    private long guestsNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "category", columnDefinition = "VARCHAR", nullable = false, length = 30)
    private RoomCategory category;

    @Enumerated(EnumType.STRING)
    @Column(name = "price", columnDefinition = "DECIMAL", nullable = false, length = 30)
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

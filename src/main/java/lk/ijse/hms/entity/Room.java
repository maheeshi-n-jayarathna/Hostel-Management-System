package lk.ijse.hms.entity;

import lombok.*;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Entity
public class Room implements SuperEntity{
    @Id
    @Column(name = "room_type_id")
    private String roomTypeId;
    private String type;
    @Column(name = "key_money")
    private double keyMoney;
    private int qty;

    @OneToMany(mappedBy = "room",cascade = CascadeType.ALL)
    private List<Reservation> reservations = new ArrayList<>();
}

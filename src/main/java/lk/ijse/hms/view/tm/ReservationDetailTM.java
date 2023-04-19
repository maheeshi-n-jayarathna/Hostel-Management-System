package lk.ijse.hms.view.tm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReservationDetailTM {
    String reservationId;
    String studentId;
    String name;
    String RoomTypeId;
    String type;
    Double keyMoney;
    String status;
    Date date;
}

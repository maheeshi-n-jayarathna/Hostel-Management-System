package lk.ijse.hms.view.tm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@Data
public class RoomTM {
    String roomTypeId;
    String type;
    Double keyMoney;
    Integer qty;
}

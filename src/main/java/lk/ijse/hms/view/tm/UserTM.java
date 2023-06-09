package lk.ijse.hms.view.tm;

import lk.ijse.hms.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserTM {
    private String userId;
    private String name;
    private String telNo;
    private String email;
    private String userName;
    private String password;
    public UserDTO toUserDTO(){
        return new UserDTO(this.userId, this.name, this.telNo, this.email, this.userName, this.password);
    }
}

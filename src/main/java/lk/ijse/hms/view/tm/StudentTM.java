package lk.ijse.hms.view.tm;

import lombok.*;

import java.time.LocalDate;



@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class StudentTM {
    String studentId;
    String name;
    String address;
    String contactNo;
    LocalDate dob;
    String gender;
}

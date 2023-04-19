package lk.ijse.hms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class StudentDTO {
    private String studentId;
    private String name;
    private String address;
    private String contactNo;
    private LocalDate dob;
    private String gender;
}

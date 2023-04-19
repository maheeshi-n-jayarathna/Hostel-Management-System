package lk.ijse.hms.bo.custom;

import lk.ijse.hms.bo.SuperBO;
import lk.ijse.hms.bo.exception.DuplicateException;
import lk.ijse.hms.bo.exception.InUseException;
import lk.ijse.hms.dto.StudentDTO;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;


public interface StudentBO extends SuperBO {
    List<StudentDTO> getAllStudent();

    List<StudentDTO> searchBookByText(String text);

    StudentDTO getStudentById(String studentId);

    boolean saveStudent(StudentDTO studentDTO) throws DuplicateException;

    boolean updateStudent(StudentDTO studentDTO);

    boolean deleteStudent(StudentDTO studentDTO) throws InUseException;
}

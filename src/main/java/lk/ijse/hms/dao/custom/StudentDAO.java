package lk.ijse.hms.dao.custom;

import lk.ijse.hms.dao.CrudDAO;
import lk.ijse.hms.entity.Student;
import org.hibernate.Session;

import java.util.List;

public interface StudentDAO extends CrudDAO<Student, String> {
    List<Student> search(String text, Session session);
}

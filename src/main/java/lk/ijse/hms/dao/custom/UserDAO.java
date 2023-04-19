package lk.ijse.hms.dao.custom;

import lk.ijse.hms.dao.CrudDAO;
import lk.ijse.hms.entity.User;
import org.hibernate.Session;

import java.util.List;
import java.util.Optional;

public interface UserDAO extends CrudDAO<User, String> {
    Optional<User> findByUserName(String userName, Session session);

    List<User> search(String text, Session session);
}

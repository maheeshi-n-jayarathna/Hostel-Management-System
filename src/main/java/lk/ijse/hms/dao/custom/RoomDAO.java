package lk.ijse.hms.dao.custom;

import lk.ijse.hms.dao.CrudDAO;
import lk.ijse.hms.entity.Room;
import org.hibernate.Session;

import java.util.Arrays;
import java.util.List;

public interface RoomDAO extends CrudDAO<Room, String> {
    List<Room> search(String text, Session session);
}

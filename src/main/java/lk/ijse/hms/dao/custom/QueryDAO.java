package lk.ijse.hms.dao.custom;

import lk.ijse.hms.dao.SuperDAO;
import org.hibernate.Session;

import java.sql.Date;
import java.util.List;

public interface QueryDAO extends SuperDAO {
    List<Object[]> findAllUnPaidReservationDetails(Session session);

    List<Object[]> findAllReservationDetails(Session session);

    List<Object[]> findAllReservationDetailsByText(String text, Session session);

    List<Object[]> findUnPaidReservationByRoomTypeId(String roomTypeId, Session session);

    List<Object[]> findAllReservationDetailsByRoomTypeId(String roomTypeId, Session session);

    List<Object[]> findAllUnPaidReservationDetailsByStudentId(String studentId, Session session);
}

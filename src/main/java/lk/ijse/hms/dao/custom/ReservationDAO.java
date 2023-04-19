package lk.ijse.hms.dao.custom;

import lk.ijse.hms.dao.CrudDAO;
import lk.ijse.hms.dto.CustomDTO;
import lk.ijse.hms.entity.Reservation;
import org.hibernate.Session;

import java.sql.Date;

public interface ReservationDAO extends CrudDAO<Reservation, String> {
    boolean updateStatusByPk(String reservationId, CustomDTO.Status status, Session session);

    long findAllByDate(Date valueOf, Session session);
}

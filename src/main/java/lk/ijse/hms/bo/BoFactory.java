package lk.ijse.hms.bo;

import lk.ijse.hms.bo.custom.impl.LoginBOImpl;
import lk.ijse.hms.bo.custom.impl.RoomBOImpl;
import lk.ijse.hms.bo.custom.impl.StudentBOImpl;

public class BoFactory {
    private static BoFactory boFactory;

    private BoFactory() {
    }

    public static BoFactory getInstance(){
        return boFactory == null?
                boFactory = new BoFactory() : boFactory;
    }

    public <T extends SuperBO>T getBO(BoTypes boTypes){
        switch (boTypes){
            case ROOM:
                return (T) new RoomBOImpl();
            case STUDENT:
                return (T) new StudentBOImpl();
            case LOGIN:
                return (T) new LoginBOImpl();
            default:
                return null;
        }
    }
}

package lk.ijse.hms.bo.custom;

import lk.ijse.hms.bo.SuperBO;
import lk.ijse.hms.bo.exception.DuplicateException;
import lk.ijse.hms.bo.exception.NotFoundException;
import lk.ijse.hms.dto.UserDTO;

import java.util.Arrays;
import java.util.List;


public interface LoginBO extends SuperBO{
    UserDTO verifyUser(UserDTO userDTO) throws NotFoundException;

    List<UserDTO> getAllUser();

    List<UserDTO> searchUserByText(String text);

    String getNextUserId();

    boolean saveUser(UserDTO userDTO) throws DuplicateException;

    boolean updateUser(UserDTO userDTO) throws DuplicateException;

    boolean deleteUser(UserDTO userDTO);
}

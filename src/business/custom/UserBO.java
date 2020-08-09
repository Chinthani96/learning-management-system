package business.custom;

import dao.DAOFactory;
import dao.DAOType;
import dao.custom.UserDAO;
import entity.User;
import util.UserTM;

import java.util.ArrayList;
import java.util.List;

public interface UserBO {
    List<UserTM> getAllUsers() throws Exception;
    UserTM getUser(String userId) throws Exception;
    boolean update(String userId, String username, String password, String userRole) throws Exception;
    boolean save(String userId, String userName, String password, String userRole) throws Exception;
    boolean delete(String userId) throws Exception;
}

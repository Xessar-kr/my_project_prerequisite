package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoJDBCImpl();
        userDao.createUsersTable();
        userDao.saveUser("Ivan", "Ivanov", (byte) 20);
        userDao.saveUser("Svetlana", "Belova", (byte) 30);
        userDao.saveUser("Sam", "Samov", (byte) 40);
        userDao.saveUser("Elena", "Troyanskaya", (byte) 50);
        List<User> users = userDao.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
//        userDao.dropUsersTable();

    }
}

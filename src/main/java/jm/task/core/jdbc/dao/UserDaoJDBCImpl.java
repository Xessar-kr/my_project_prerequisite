package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserDaoJDBCImpl implements UserDao {
    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() {
//        String sql = "CREATE TABLE IF NOT EXISTS USERS (" +
//                "id BIGINT AUTO_INCREMENT PRIMARY KEY, " +
//                "name VARCHAR(50), " +
//                "last_name VARCHAR(50), " +
//                "age TINYINT)";
//        try (Connection connection = Util.getConnection();
//             Statement statement = connection.createStatement()) {
//            statement.execute(sql);
//            System.out.println("Table created");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public void dropUsersTable() {
//        String sql = "DROP TABLE IF EXISTS USERS";
//        try (Connection connection = Util.getConnection();
//             Statement statement = connection.createStatement()) {
//            statement.execute(sql);
//            System.out.println("Table dropped");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public void saveUser(String name, String lastName, byte age) {
//        String sql = "INSERT INTO USERS (name, last_name, age) VALUES (?, ?, ?)";
//        try (Connection connection = Util.getConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//            preparedStatement.setString(1, name);
//            preparedStatement.setString(2, lastName);
//            preparedStatement.setByte(3, age);
//            preparedStatement.executeUpdate();
//            System.out.println("Пользователь с именем -" + name + " добавлен в базу данных");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public void removeUserById(long id) {
//        String sql = "DELETE FROM USERS WHERE id = ?";
//        try (Connection connection = Util.getConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//            preparedStatement.setLong(1, id);
//            preparedStatement.executeUpdate();
//            System.out.println("User removed");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public List<User> getAllUsers() {
//        List<User> users = new ArrayList<>();
//        String sql = "SELECT * FROM USERS";
//        try (Connection connection = Util.getConnection();
//             Statement statement = connection.createStatement();
//             ResultSet resultSet = statement.executeQuery(sql)) {
//            while (resultSet.next()) {
//                User user = new User();
//                user.setId(resultSet.getLong("id"));
//                user.setName(resultSet.getString("name"));
//                user.setLastName(resultSet.getString("last_name"));
//                user.setAge(resultSet.getByte("age"));
//                users.add(user);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return users;
        return null;
    }

    public void cleanUsersTable() {
//        String sql = "TRUNCATE TABLE USERS";
//        try (Connection connection = Util.getConnection();
//             Statement statement = connection.createStatement()) {
//            statement.executeUpdate(sql);
//            System.out.println("Table cleaned");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}

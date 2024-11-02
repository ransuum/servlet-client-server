package org.practice.servletlab.repo;

import org.practice.servletlab.enums.Gender;
import org.practice.servletlab.models.ProfilePicture;
import org.practice.servletlab.models.User;
import org.practice.servletlab.storageData.DataBaseConnection;
import org.practice.servletlab.storageData.SQLRequest;

import java.sql.*;
import java.time.LocalDate;

public class Repository implements UserDao {
    private final Connection connection;

    public Repository() {
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        try {
            this.connection = dataBaseConnection.getConnection();
            Statement statement = this.connection.createStatement();
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS users (\n" +
                    "                       id VARCHAR(255) PRIMARY KEY,\n" +
                    "                       username VARCHAR(16) NOT NULL UNIQUE,\n" +
                    "                       email VARCHAR(60) NOT NULL UNIQUE,\n" +
                    "                       password VARCHAR(16) NOT NULL,\n" +
                    "                       birthday DATE NOT NULL,\n" +
                    "                       gender VARCHAR(10) NOT NULL\n" +
                    ")");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public User findByUsernameAndPassword(String username, String password) {
        User user = null;
        try (PreparedStatement preparedStatement = this.connection.prepareStatement(SQLRequest.FIND_BY_USERNAME_PASSWORD.getSql())) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    user = User.builder()
                            .id(resultSet.getString("id"))
                            .username(resultSet.getString("username"))
                            .password(resultSet.getString("password"))
                            .email(resultSet.getString("email"))
                            .gender(Gender.valueOf(resultSet.getString("gender")))
                            .birthday(resultSet.getObject("birthday", LocalDate.class))
                            .build();
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    @Override
    public User findByEmailAndPassword(String email, String password) {
        User user = null;
        try (PreparedStatement preparedStatement = this.connection.prepareStatement(SQLRequest.FIND_BY_EMAIL_PASSWORD.getSql())) {
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    user = User.builder()
                            .id(resultSet.getString("id"))
                            .username(resultSet.getString("username"))
                            .password(resultSet.getString("password"))
                            .email(resultSet.getString("email"))
                            .gender(Gender.valueOf(resultSet.getString("gender")))
                            .birthday(resultSet.getObject("birthday", LocalDate.class))
                            .build();
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    @Override
    public void save(User user) {
        try (PreparedStatement preparedStatement = this.connection.prepareStatement(SQLRequest.INSERT.getSql())) {
            preparedStatement.setString(1, user.getId());
            preparedStatement.setString(2, user.getUsername());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.setString(4, user.getGender().name());
            preparedStatement.setString(5, user.getEmail());
            preparedStatement.setDate(6, Date.valueOf(user.getBirthday()));
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public User findByEmail(String email) {
        User user = null;
        try (PreparedStatement preparedStatement = this.connection.prepareStatement(SQLRequest.FIND_BY_EMAIL.getSql())) {
            preparedStatement.setString(1, email);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    user = User.builder()
                            .id(resultSet.getString("id"))
                            .username(resultSet.getString("username"))
                            .password(resultSet.getString("password"))
                            .email(resultSet.getString("email"))
                            .gender(Gender.valueOf(resultSet.getString("gender")))
                            .birthday(resultSet.getObject("birthday", LocalDate.class))
                            .build();
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    @Override
    public User findByUsername(String username) {
        User user = null;
        try (PreparedStatement preparedStatement = this.connection.prepareStatement(SQLRequest.FIND_BY_USERNAME.getSql())) {
            preparedStatement.setString(1, username);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    user = User.builder()
                            .id(resultSet.getString("id"))
                            .username(resultSet.getString("username"))
                            .password(resultSet.getString("password"))
                            .email(resultSet.getString("email"))
                            .gender(Gender.valueOf(resultSet.getString("gender")))
                            .birthday(resultSet.getObject("birthday", LocalDate.class))
                            .build();
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }
}

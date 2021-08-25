package app.logic;

import app.model.Publication;
import app.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ProcessQueriesInterface {

    User mapRowsUser(ResultSet resultSet) throws SQLException;

    Publication mapRowsPub(ResultSet resultSet) throws SQLException;

    boolean register(User user) throws ClassNotFoundException, SQLException;

    boolean login(User user);

    boolean checkPassword(User user);

    //public boolean checkPassword(User user);



}

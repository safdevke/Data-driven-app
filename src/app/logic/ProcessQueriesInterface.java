package app.logic;

import app.model.Publication;
import app.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ProcessQueriesInterface {

    public User mapRowsUser(ResultSet resultSet) throws SQLException;

    public Publication mapRowsPub(ResultSet resultSet) throws SQLException;

    public boolean register(User user) throws ClassNotFoundException, SQLException;

    public boolean login(User user);

}

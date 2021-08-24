package app.logic;

import app.model.Library;
import app.model.Publication;
import app.model.User;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class MappingRows {

    public User mapRowsUser(ResultSet resultSet) throws SQLException {
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        User user = new User(resultSetMetaData.getColumnName(1),
                resultSetMetaData.getColumnName(2),
                resultSetMetaData.getColumnName(3));
        return user;
    }

    public Publication mapRowsPub(ResultSet resultSet) throws SQLException {
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        Publication publication = new Publication(resultSetMetaData.getColumnName(1),
                resultSetMetaData.getColumnName(2),
                resultSetMetaData.getColumnName(3));
        return publication;
    }
}


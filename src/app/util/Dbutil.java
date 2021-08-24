package app.util;

import java.sql.*;
import java.util.Arrays;

public class Dbutil {

    String user = "root";
    String passwd = "toor";
    String url = "publications:mysql://localhost:3306";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection connection;
    PreparedStatement preparedStatement;

    public Dbutil() throws ClassNotFoundException {
        Class.forName(driver);
        try {
            connection = DriverManager.getConnection(url, user, passwd);
        } catch (SQLException e) {
            System.out.println("Connection to the database went horribly wrong!");
        }
    }

    public boolean writeToDb(String query, String[] replace) throws SQLException {
        preparedStatement = connection.prepareStatement(query);
        for (int i = 1; i <= replace.length; i++) {
            preparedStatement.setString(i, replace[i]);
        }
        return preparedStatement.executeUpdate() > 0;
    }

    public ResultSet readFromDb(String query, String[] replace) throws SQLException {
        preparedStatement = connection.prepareStatement(query);
        for (int i = 1; i <= replace.length; i++) {
            preparedStatement.setString(i, replace[i]);
        }
        return preparedStatement.executeQuery();
    }

    public void close() throws SQLException {
        preparedStatement.close();
        connection.close();
    }
}

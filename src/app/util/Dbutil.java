package app.util;

import java.sql.*;

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

    public boolean writeToDb(String query) throws SQLException {
        preparedStatement = connection.prepareStatement(query);
        return preparedStatement.executeUpdate(query) > 0;
    }

    public ResultSet readFromDb(String query) throws SQLException {
        preparedStatement = connection.prepareStatement(query);
        return preparedStatement.executeQuery(query);
    }

    public void close() throws SQLException {
        preparedStatement.close();
        connection.close();
    }
}

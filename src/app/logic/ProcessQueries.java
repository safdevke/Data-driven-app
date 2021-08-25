package app.logic;

import app.model.Publication;
import app.model.User;
import app.ui.ProcessObjects;
import app.util.Dbutil;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Comparator;

public class ProcessQueries implements ProcessQueriesInterface, Comparator {

    Dbutil dbutil = new Dbutil();
    ProcessObjects processObjects = new ProcessObjects();

    public ProcessQueries() throws ClassNotFoundException {
    }

    @Override
    public User mapRowsUser(ResultSet resultSet) throws SQLException {
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        return new User(resultSetMetaData.getColumnName(1),
                resultSetMetaData.getColumnName(2),
                resultSetMetaData.getColumnName(3));
    }

    @Override
    public Publication mapRowsPub(ResultSet resultSet) throws SQLException {
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        return new Publication(resultSetMetaData.getColumnName(1),
                resultSetMetaData.getColumnName(2),
                resultSetMetaData.getColumnName(3));
    }

    @Override
    public boolean register(User user) throws SQLException {
        String[] arr = {user.getUserName(), user.getPassword(), user.getEmail()};
        return dbutil.writeToDb("insert ignore into publications.users values(?,?,?);", arr);
    }

    @Override
    public boolean login(User user) {
        User userInDb;
        try {
            String[] arr = {user.getUserName()};
             userInDb = mapRowsUser(dbutil.readFromDb("select from publications.users where name=?;", arr));
        } catch (Exception e) {
            return false;
        }
        return compare(user, userInDb) == 0;
    }

    @Override
    public boolean checkPassword(User user) {
        String[] input = {" "};
        User userInDb = processObjects.createUser(input);
        if (login(user)) {
            try {
                String[] arr = {user.getPassword()};
                userInDb = mapRowsUser(dbutil.readFromDb("select from publications.users where password=?;", arr));
            } catch (Exception e) {
                return false;
            }
        }
        return compare(user, userInDb) == 0;
    }

    @Override
    public int compare(Object o1, Object o2) {
        User user1 = (User) o1;
        User user2 = (User) o2;
        return user1.getUserName().compareTo(user2.getUserName()) | user1.getPassword().compareTo(user2.getPassword());
    }

}

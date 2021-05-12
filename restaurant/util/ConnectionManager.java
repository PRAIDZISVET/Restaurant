package by.itacademy.restaurant.util;

import lombok.experimental.UtilityClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@UtilityClass
public class ConnectionManager {

    private static final String URL = "db.url";
    private static final String USERNAME = "db.username";
    private static final String PASSWORD = "db.password";

    public static Connection get() throws SQLException {
        return DriverManager.getConnection(PropertiesUtil.get(URL), PropertiesUtil.get(USERNAME),
                PropertiesUtil.get(PASSWORD));
    }
}

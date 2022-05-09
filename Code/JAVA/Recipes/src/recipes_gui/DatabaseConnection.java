package recipes_gui;

import org.apache.log4j.*;
import javax.swing.*;
import java.util.Arrays;
import java.io.IOException;
import java.sql.*;

public class DatabaseConnection {
    private static Logger logger = Logger.getLogger(DatabaseConnection.class);

    public static void main(String[] args) {

        logger.info("Proba");
        System.out.println("Proba done");

       /*String host = System.getenv("DB_HOST");
        String port = System.getenv("DB_PORT");
        String dbname = System.getenv("DB_NAME");
        String url = String.format("jdbc:mysql://localhost:3306/recipes",host,port,dbname);
        String username = System.getenv("DB_USER");
        String password = System.getenv("DB_PASSWORD");

        JDBCUtil jdbcUtil = new JDBCUtil("com.mysql.cj.jdbc.Driver",url,username,password);
        jdbcUtil.getConnection();*/
    }
}
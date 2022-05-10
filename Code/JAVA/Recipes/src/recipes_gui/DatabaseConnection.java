package recipes_gui;

import org.apache.log4j.*;
import javax.swing.*;
import java.util.Arrays;
import java.io.IOException;
import java.sql.*;

public class DatabaseConnection {
    private static Logger logger = Logger.getLogger(DatabaseConnection.class);

    public static void main(String[] args) throws IOException, SQLException{

        logger.info("Proba");
        System.out.println("Proba done");

        String jdbcUrl = "jdbc:mysql://localhost:3306/recipes";
        String username = "root";
        String password = "";

        Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

        String sql = "INSERT INTO freefrom(freefrom_id, freefrom_name) values (1, Vegan)";
        
    }
}
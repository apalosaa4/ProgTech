package recipes_gui;

import org.apache.log4j.*;
import org.w3c.dom.Text;

import javax.swing.*;
import java.util.Arrays;
import java.io.IOException;
import java.sql.*;

public class DatabaseConnection
{
    private static Logger logger = Logger.getLogger(DatabaseConnection.class);
    private String databaseName;
    private static DatabaseConnection uniqueInstance = null;
    private DatabaseConnection(String databaseName){
        this.databaseName = databaseName;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public static DatabaseConnection GetInstance(){
        if (uniqueInstance == null)
        {
            uniqueInstance = new DatabaseConnection(GetInstance().getDatabaseName());
        }
        return uniqueInstance;
    }
    /**
     * function to connect to the database
     * @return the connection to be used in the statements
     * @throws Exception if the connection fails at the end
     */

    public Connection Connect() throws Exception
    {
        Connection connection;

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(String.format("jdbc:mysql://localhost/%s", databaseName), "root", "");
            return connection;
        }
        catch (ClassNotFoundException exception)
        {
            exception.printStackTrace();
        }
        catch(SQLException exception)
        {
            exception.printStackTrace();
        }
        throw new Exception("Can't make connection to the database..");
    }

    protected void SelectAll(String tableName) throws Exception
    {
        PreparedStatement query = null;
        Connection connection = this.Connect();
        try
        {
            query = connection.prepareStatement(String.format("select * from %s", tableName));
            ResultSet result = query.executeQuery();
            logger.info("Select was successful");
        }
        catch(SQLException exception)
        {
            exception.printStackTrace();
            logger.warn("Select was NOT successful");
        }
    }

    protected void Insert(String sqlQuery) throws Exception
    {
        PreparedStatement query = null;
        Connection connection = this.Connect();
        try
        {
            query = connection.prepareStatement(sqlQuery);
            query.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record was inserted successfully");
            logger.info("Record was inserted successfully");
        }
        catch (SQLException exception)
        {
            exception.printStackTrace();
            logger.warn("Record was NOT inserted successfully");
        }
    }

    protected void Delete(String tableName, String field, String textFieldValue) throws Exception
    {
        PreparedStatement query = null;
        Connection connection = this.Connect();
        try
        {
            query = connection.prepareStatement(String.format("delete from %s where %s = ?", tableName, field));
            query.setString(1, textFieldValue);
            query.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record deleting was sucessfully");
            logger.info("Record deleting was successfully");
        }
        catch (SQLException exception)
        {
            exception.printStackTrace();
            logger.warn("Record deleting was NOT successfully");
        }
    }

    protected void Update(int id, String recipes_name, String dOInst, String freefrom_name, Text recipes_description) throws Exception
    {
        PreparedStatement query = null;
        Connection connection = this.Connect();
        try
        {
            if (!(dOInst.contains(",")))
            {
                JOptionPane.showMessageDialog(null, "The date should be separated with ','!");
            }
            else
            {
                String sqlQuery = "UPDATE `recipes` SET `recipes_name`='" + recipes_name + "',"+
                        "`freefrom_name`='" + freefrom_name + "'," +
                        "`recipes_description`='" + recipes_description + "'," +
                        "WHERE `id` = " + id;
                logger.info(sqlQuery);
                query = connection.prepareStatement(sqlQuery);
                query.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record was updated successfully!");
                logger.info("Record was updated successfully");
            }
        }
        catch (SQLException exception)
        {
            exception.printStackTrace();
            logger.warn("Record was NOT updated successfully!");
        }
    }

    protected void UpdateIngredients(int id, String ingredietsName) throws Exception {
        PreparedStatement query = null;
        Connection connection = this.Connect();
        try
        {
            String sqlQuery = "UPDATE `recipes` SET `recipes_name`='" + ingredietsName + "',"+
                    "WHERE `id` = " + id;
            logger.info(sqlQuery);
            query = connection.prepareStatement(sqlQuery);
            query.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record was updated successfully!");
            logger.info("Record was updated successfully");
        }
        catch (SQLException exception) {
            exception.printStackTrace();
            logger.warn("Record was NOT updated successfully!");
        }
    }
}
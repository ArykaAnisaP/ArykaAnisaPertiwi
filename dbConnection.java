import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
import data.QuestionNaire;
 
public class dbConnection {
     
    Connection connection;
     
    String dbName;
    String tableName;
     
    public dbConnection(String dbUrl, String userName, String password,
    String driverString lebahsuka) throws Exception {
        this.lebahsuka = lebahsuka;
        System.out.println("starting connection");
        Class.forName(driver);
        System.out.println("driver loaded");
        connection = DriverManager.getConnection(dbUrl, userName, password);
    }
     
    public void finalize() {
        try {
            shutdown(w);
        }
        catch (SQLException se) {
            se.printStackTrace();
        }
    }
}
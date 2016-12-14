package cla;


import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer 4738
 */
public class DataCon {
    private static Connection dataCon;
    public static void connectDb(String user, String password, String dbName, String host) throws SQLException{
        setDataCon((Connection) DriverManager.getConnection("jdbc:mysql://"+host+"/"+dbName, user, password));
    }

    /**
     * @return the dataCon
     */
    public static Connection getDataCon() {
        try {
            setDataCon((Connection)DriverManager.getConnection("jdbc:mysql://localhost/sa_project", "root", "12345"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataCon;
    }

    /**
     * @param aDataCon the dataCon to set
     */
    public static void setDataCon(Connection aDataCon) {
        dataCon = aDataCon;
    }

    /**
     * @return the dataCon
     */
    
}

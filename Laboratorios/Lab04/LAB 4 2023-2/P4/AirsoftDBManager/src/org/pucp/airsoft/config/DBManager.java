/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.pucp.airsoft.config;

/**
 *
 * @author USUARIO
 */
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author USUARIO //mira la url esos adicionales
 */
//aca es DBManager
public class DBManager {
    public static String url = "jdbc:mysql://"+
            "lp2-labs-inf282-2023-2.ccv53oykh3ij.us-east-1.rds.amazonaws.com"+
            ":3306/inf282";
    public static String user = "master";
    public static String password = "lp2labsinf282";
    private static DBManager dbmanager;
    private Connection con;
    public static DBManager getInstance(){
        if(dbmanager==null){
            createInstance();
        }
        return dbmanager;
    }
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection(url,user,password);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
    //tmb estatic
    private static void createInstance(){
        if(dbmanager==null){
            dbmanager = new DBManager();
        }
    }
}

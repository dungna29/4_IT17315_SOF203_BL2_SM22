/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dungna89
 */
public class DBContext {

  //Giúp kết nối đến CSDL
  ////jdbc:sqlserver://DUNGNAPC\SQLEXPRESS:1433;databaseName=FINALASS_FPTShop_SP22_BL2_DUNGNA29
  private static final String USERNAME = "dungna29";
  private static final String PASSWORD = "123456";
  private static final String SERVER = "localhost";
  private static final String PORT = "1433";
  private static final String DATABASE_NAME = "FINALASS_FPOLYSHOP_SM22_BL2_DUNGNA29";
  private static final boolean USING_SSL = false;

  private static String CONNECT_STRING;

  static {
    try {
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      StringBuilder connectStringBuilder = new StringBuilder();
      connectStringBuilder.append("jdbc:sqlserver://")
              .append(SERVER).append(":").append(PORT).append(";")
              .append("databaseName=").append(DATABASE_NAME).append(";")
              .append("user=").append(USERNAME).append(";")
              .append("password=").append(PASSWORD).append(";");
      if (USING_SSL) {
        connectStringBuilder.append("encrypt=true;trustServerCertificate=true;");
      }
      CONNECT_STRING = connectStringBuilder.toString();
      System.out.println("Connect String có dạng: " + CONNECT_STRING);
    } catch (ClassNotFoundException ex) {
      Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
  public static Connection GetConnection() throws SQLException{
    return DriverManager.getConnection(CONNECT_STRING);
  }
//  public static void main(String[] args) throws SQLException {
//    Connection conn = GetConnection();
//    DatabaseMetaData dbmt = conn.getMetaData();
//    System.out.println(dbmt.getDriverName());
//    System.out.println(dbmt.getDatabaseProductName());
//    System.out.println(dbmt.getDatabaseProductVersion());
//  }
}

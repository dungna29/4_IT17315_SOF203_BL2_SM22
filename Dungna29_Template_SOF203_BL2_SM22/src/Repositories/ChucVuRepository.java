/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Models.ChucVu;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author Dungna89
 */
//Code CRUD đối tượng này với CSDL
public class ChucVuRepository {  
  /*
  Dùng để tham khảo.
  final String INSERT_SQL = "INSERT INTO [dbo].[ChucVu] ([MaChucVu],[TenChucVu])VALUES(?,?)";
    final String UPDATE_SQL = "UPDATE [dbo].[ChucVu] SET [MaChucVu] = ? WHERE [IdChucVu] = ?";
    final String DELETE_SQL = "DELETE FROM [dbo].[ChucVu] WHERE [IdChucVu] = ?";
    final String SELECT_BY_SQL = "SELECT * FROM [dbo].[ChucVu] WHERE [IdChucVu] = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM [dbo].[ChucVu]";
  */
 

  public ChucVuRepository() {
  }
  
  public boolean Add(ChucVu obj) {
    try (Connection conn = DBContext.GetConnection()) {
      Statement st = conn.createStatement();
      String INSERT_CHUCVU = "INSERT INTO CHUCVU(Ma,Ten) VALUES(" +"'"+ obj.getMa() + "','" + obj.getTen() + "')";
      System.out.println(INSERT_CHUCVU);
      st.executeUpdate(INSERT_CHUCVU);
      //conn.close();
      return true;
    } catch (Exception e) {
      System.out.println("Lỗi không thể kết nối vào CSDL tại Add()");
      e.printStackTrace();
      return false;
    }
  }
  public boolean Update(ChucVu obj) {
    try (Connection conn = DBContext.GetConnection()) {
      Statement st = conn.createStatement();
      String UPDATE_CHUCVU = "UPDATE CHUCVU SET MA = '" +obj.getMa()+"',Ten = '"+obj.getTen()+"' WHERE ID = '"+obj.getId()+"'";
      st.executeUpdate(UPDATE_CHUCVU);
      conn.close();
      return true;
    } catch (Exception e) {
      System.out.println("Lỗi không thể kết nối vào CSDL tại Add()");
      return false;
    }
  }
   public boolean Delete(ChucVu obj) {
    try (Connection conn = DBContext.GetConnection()) {
      Statement st = conn.createStatement();
      String DELETE_CHUCVU = "DELETE FROM CHUCVU WHERE ID = '"+obj.getId()+"'";
       System.out.println(DELETE_CHUCVU);
      st.executeUpdate(DELETE_CHUCVU);
      return true;
    } catch (Exception e) {
      System.out.println("Lỗi không thể kết nối vào CSDL tại Delete()");
      return false;
    }
  }

  //Chọc vào DB lấy dữ liệu ra
  public List<ChucVu> GetAll() {
    String SELECT_CHUCVU = "SELECT * FROM CHUCVU";
    List<ChucVu> lstChucVus = new ArrayList<>();
    try (Connection conn = DBContext.GetConnection()) {
      Statement st = conn.createStatement();
      ResultSet rs = st.executeQuery(SELECT_CHUCVU);

      //Gán lại giá trị khi truy vấn về đối tượng
      while (rs.next()) {
        lstChucVus.add(new ChucVu(rs.getString(1), rs.getString(2), rs.getString(3)));
      }
    } catch (Exception e) {
      System.out.println("Lỗi không thể kết nối vào CSDL tại GetAll()");
    }
    return lstChucVus;
  }
 
}

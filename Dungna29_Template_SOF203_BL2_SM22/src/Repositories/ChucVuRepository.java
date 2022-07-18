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
  private final String UPDATE_CHUCVU = "UPDATE CHUCVU SET";
  private final String DELETE_CHUCVU = "DELETE FROM CHUCVU WHERE ID =";

  public ChucVuRepository() {
  }
  
  public String Add(ChucVu obj) {
    
    try (Connection conn = DBContext.GetConnection()) {
      Statement st = conn.createStatement();
      String INSERT_CHUCVU = "INSERT INTO CHUCVU(Ma,Ten) VALUES(" +"'"+ obj.getMa() + "','" + obj.getTen() + "')";
      System.out.println(INSERT_CHUCVU);
      st.executeUpdate(INSERT_CHUCVU);
      return "Thêm thành công";
    } catch (Exception e) {
      System.out.println("Lỗi không thể kết nối vào CSDL tại Add()");
      return "Thêm thất bại";
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

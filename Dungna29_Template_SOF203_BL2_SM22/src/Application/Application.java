/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import Views.FrmChucVu;
import Views.FrmQLNhanVien;

/**
 *
 * @author Dungna89
 */
public class Application {
  //Nơi có main duy nhất trên project và khởi chạy ứng dụng
  public static void main(String[] args) {
    new FrmChucVu().setVisible(true);
  }
 
}

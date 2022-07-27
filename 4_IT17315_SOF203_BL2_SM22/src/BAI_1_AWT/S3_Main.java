/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_1_AWT;

/**
 *
 * @author Dungna89
 */
public class S3_Main {
  public static void main(String[] args) {
    new S3_JFrame();
      System.out.println("");
  }
   /*
        Có 2 kiểu Container trong Swing đó là Top-Level Container và Multi-Purpose Container
        Top-Level Container bao gồm: Jframe, JDialog, JApplet(Được sử dụng trong ứng dụng WEB), JWindow: Chỉ là một màn hình chờ được bật lên lúc khởi động
        Multi-Purpose Container gồm: Jpanel, Jlayered, JinternalFrame và JDesktopPane  
        */      
   /*
        Một vài phương thức trong Jframe
        setSize(width, height);
        setLocationRelativeTo(null); //Frame khi chạy sẽ hiển thị ra giữa màn hình
        setDefaultCloseOperation(EXIT_ON_CLOSE);//tự động đóng khi thoát form khi người dùng click vào nút close
        setSize(300, 200);
        setResizable(false); //không cho thay đổi kích thước màn hình
        setVisible(true);//Hiển thị Jframe trên màn hình khi cần gọi hiển thị   
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);Không làm gì cả
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); Chỉ đóng frame đó, các frame khác liên quan sẽ không bị đóng       
        setLocation(x,y); Đặt vị trí xuất hiện trên màn hình
        pack(); Đặt kích thước Jrame vừa đủ với nội dung
        getContentPane().SetBackgroud(Corlor."Color");
        */
}

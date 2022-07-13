/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_2_JDBC;
import java.sql.*;//Import thư viện sql
/**
 *
 * @author Dungna89
 */
public class S2_DbConnection {
  /*
    1. Tải JDK 11 hoặc 16 => Sau khi tải và cài đặt xong thì trỏ môi trường windows về bản 16 hoặc 11. Phải khởi động lại máy tính
    2. Driver tải bản 9.4 => Giải nén để thư mục trong ổ C bắt buộc.
    3. Xem video cài đặt lại môi trường
    4. Tạo tài khoản trên SQL SERVER
*/
  static String hostName = "DUNGNAPC\\SQLEXPRESS";
  static String acc = "dungna31";
  static String pass = "123456";
  static String dbName = "FINALASS_FPTShop_SP22_BL2_DUNGNA29";
  static String stringConnection = "jdbc:sqlserver://" +hostName+":1433;databaseName=" +dbName;//Chuỗi kết nối lấy từ phần service
  //jdbc:sqlserver://DUNGNAPC\SQLEXPRESS:1433;databaseName=FINALASS_FPTShop_SP22_BL2_DUNGNA29 
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    //Bước 1: Load Driver
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//Muốn gõ nhanh thì gõ ra bên ngoài chữ com. sẽ có gợi ý
    
    //Bước 2: Tạo kết nối - OpenConnection
    Connection conn = DriverManager.getConnection(stringConnection, acc, pass);
    //Bước 3: Tạo Statement sau đó thực thi câu lệnh sql
    Statement st = conn.createStatement();
    
    //Bước 4: Thực thi câu lệnh SQL
    String query = "SELECT * FROM CHUCVU";//1 câu lệnh T SQL
    ResultSet rs = st.executeQuery(query);//Thực thi câu SQL
    
    while (rs.next()) {
      System.out.println(rs.getString(2));
      //Đây sẽ là nơi map nó với Đối tượng
    }
    st.close();//Đóng kết nối khi không cần sử dụng
    conn.close();
    System.out.println("");
  }
    
  
}

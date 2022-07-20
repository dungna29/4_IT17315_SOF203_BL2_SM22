/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.text.Normalizer;
import java.util.regex.Pattern;

/**
 *
 * @author Dungna89
 */
public class Utility {
  //Code các phương thức hay dùng như: Các phương thức xử lý chuỗi, Check số, chữ....
  //1. Phương thức zen mã theo tên Nguyễn ANH Dũng => dungna
  public static String ZenMaTheoTen(String value){//NGUYỄN ANH DŨNG
    if (value.isEmpty() || value.isBlank()) return "";
    var temp = value.trim().toLowerCase();//nguyễn anh dũng
    String[] arrNames = temp.split("\\s+");//Cắt chuỗi về mảng
    String finalName = VietHoaChuCaiDau(arrNames[arrNames.length-1]).trim();//Dũng 
    for (int i = 0; i < arrNames.length -1; i++) {
      finalName += LayChuCaiDau(arrNames[i]);//Dũngna
    }
    return unAccent(finalName);//Dungna
  }
  //2. Phương thức viết hoa chữ cái đầu nGUYỄN ANH dũng => Nguyễn Anh Dũng
  public static String VietHoaFullName(String value){//NGUYỄN ANH DŨNG
    if (value.isEmpty() || value.isBlank()) return "";
    var temp = value.trim().toLowerCase();//nguyễn anh dũng
    String[] arrNames = temp.split("\\s+");//Cắt chuỗi về mảng
    String finalName = "";
    for (int i = 0; i < arrNames.length; i++) {
      finalName += VietHoaChuCaiDau(arrNames[i]);//Dũngna
    }
    return finalName;//Nguyễn Anh Dũng
  }
  
  //Phương thức viết hoa chữ cái đầu
  private static String VietHoaChuCaiDau(String value){//DŨNG => Dũng
    var temp = value.trim().toLowerCase();//dũng
    return String.valueOf(temp.charAt(0)).toUpperCase() + temp.substring(1) + " ";//=> Dũng
  }
  //Phương thức lấy chữ cái đầu
   private static String LayChuCaiDau(String value){//DŨNG => d
    var temp = value.trim().toLowerCase();//dũng
    return String.valueOf(temp.charAt(0));//=> Dũng
  }
  
  
  
  
    private static String unAccent(String s) {//Convert từ tiếng việt có dấu về tiếng việt 0 dấu
    String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
    Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
    return pattern.matcher(temp).replaceAll("").replaceAll("Đ", "D").replace("đ", "");
  }
}

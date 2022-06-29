/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_1_AWT;

import java.awt.Button;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 *
 * @author Dungna89
 */
public class S2_AWT1 extends Frame implements ActionListener{
  //Khởi tạo 2 nút
  Button btnRed,btnYellow;//Khai báo nút
  Label lblText = new Label();//Khởi tạo 1 nhãn
 
  //Tạo 1 contructor
  public S2_AWT1(String title) throws HeadlessException {
   //Đặt tên cho form
    setTitle(title);
    setLayout(new FlowLayout());//Set bố cục của form
    btnRed = new Button("Nút đỏ");//Khởi tạo nút
    btnRed.addActionListener(this);
    add(btnRed);//Thêm nút vào form
  }

  public static void main(String[] args) {
    S2_AWT1 s2 = new S2_AWT1("Form đầu tiên học java 3");
    s2.setSize(800,400);
    s2.show();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String str = e.getActionCommand();
    if (str.equals("Nút đỏ")) {
      this.setBackground(Color.red);
    }
  }
}

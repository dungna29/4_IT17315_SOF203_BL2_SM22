/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_1_AWT;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author Dungna89
 */
public class S3_JFrame extends JFrame{

  public S3_JFrame() throws HeadlessException {
    setTitle("JFRAME JAVA3");
    setSize(800,400);
    setLocationRelativeTo(null);//Khi chạy ứng dụng sẽ nằm giữa màn hình
    setResizable(false);//Không cho phép kéo giãn kích thước
    setVisible(true);
  }
  
}

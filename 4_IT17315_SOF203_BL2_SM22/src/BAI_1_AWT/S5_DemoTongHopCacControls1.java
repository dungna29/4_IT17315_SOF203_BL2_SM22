/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_1_AWT;

import java.util.Hashtable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Dungna89
 */
public class S5_DemoTongHopCacControls1 extends javax.swing.JFrame {

  /**
   * Creates new form S5_DemoTongHopCacControls1
   */
  public S5_DemoTongHopCacControls1() {
    initComponents();
    GuiVolume();
    GuiThang();
  }

  void GuiThang() {
    Hashtable hs = new Hashtable();
    String[] arrThang = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    for (int i = 0; i < 12; i++) {
      hs.put(i, new JLabel(arrThang[i]));
    }
    jSlider_Thang.setLabelTable(hs);
  }

  void GuiVolume() {
    jSlider_Volumne.setPaintTicks(true);//Cho phép sử dụng major
    jSlider_Volumne.setMajorTickSpacing(10);//Từ vị trí không đến vạch tiếp theo sẽ là 10 trên 100

    jSlider_Volumne.setPaintLabels(true);//Cho phép thêm nhãn
    Hashtable hash = jSlider_Volumne.createStandardLabels(10);//Hiển thị nhãn dựa trên 10/100
    jSlider_Volumne.setLabelTable(hash);
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this
   * code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    btn_Mess = new javax.swing.JButton();
    btn_confirm = new javax.swing.JButton();
    btn_option1 = new javax.swing.JButton();
    btn_input = new javax.swing.JButton();
    btn_option2 = new javax.swing.JButton();
    txt_text = new javax.swing.JTextField();
    jPanel3 = new javax.swing.JPanel();
    btn_input2 = new javax.swing.JButton();
    jPanel4 = new javax.swing.JPanel();
    jSlider_Volumne = new javax.swing.JSlider();
    jLabel1 = new javax.swing.JLabel();
    lbl_volume = new javax.swing.JLabel();
    jSlider_Thang = new javax.swing.JSlider();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dialog", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 36))); // NOI18N
    jPanel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

    btn_Mess.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    btn_Mess.setText("Message");
    btn_Mess.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_MessActionPerformed(evt);
      }
    });

    btn_confirm.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    btn_confirm.setText("Confirm");
    btn_confirm.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_confirmActionPerformed(evt);
      }
    });

    btn_option1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    btn_option1.setText("Option 1");
    btn_option1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_option1ActionPerformed(evt);
      }
    });

    btn_input.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    btn_input.setText("Input");
    btn_input.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_inputActionPerformed(evt);
      }
    });

    btn_option2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    btn_option2.setText("Option 2");
    btn_option2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_option2ActionPerformed(evt);
      }
    });

    txt_text.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(btn_Mess)
          .addComponent(btn_confirm)
          .addComponent(btn_option1))
        .addGap(32, 32, 32)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(btn_option2)
          .addComponent(btn_input)
          .addComponent(txt_text, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btn_Mess)
          .addComponent(btn_input))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btn_confirm)
          .addComponent(btn_option2))
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btn_option1))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(24, 24, 24)
            .addComponent(txt_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(128, Short.MAX_VALUE))
    );

    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Img Button", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 36))); // NOI18N
    jPanel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

    btn_input2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    btn_input2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BAI_1_AWT/facebook.png"))); // NOI18N
    btn_input2.setText("Facebook");
    btn_input2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_input2ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addComponent(btn_input2)
        .addGap(0, 13, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(btn_input2)
        .addContainerGap(26, Short.MAX_VALUE))
    );

    jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Slider", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 36))); // NOI18N
    jPanel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

    jSlider_Volumne.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        jSlider_VolumneStateChanged(evt);
      }
    });

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel1.setText("Volume");

    lbl_volume.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    lbl_volume.setText("jLabel1");

    jSlider_Thang.setMaximum(12);
    jSlider_Thang.setPaintLabels(true);
    jSlider_Thang.setPaintTicks(true);
    jSlider_Thang.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        jSlider_ThangStateChanged(evt);
      }
    });

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addGap(23, 23, 23)
        .addComponent(jLabel1)
        .addGap(40, 40, 40)
        .addComponent(jSlider_Volumne, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(20, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
            .addComponent(lbl_volume)
            .addGap(219, 219, 219))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
            .addComponent(jSlider_Thang, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(99, 99, 99))))
    );
    jPanel4Layout.setVerticalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel1)
          .addComponent(jSlider_Volumne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addComponent(lbl_volume)
        .addGap(18, 18, 18)
        .addComponent(jSlider_Thang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(46, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(17, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        .addContainerGap(249, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btn_MessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MessActionPerformed
    JOptionPane.showMessageDialog(this, "Chào các bạn đến với java 3");
  }//GEN-LAST:event_btn_MessActionPerformed

  private void btn_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inputActionPerformed
    String input = JOptionPane.showInputDialog(this, "Bạn có muốn học lại java 3 không?");
    txt_text.setText(input);
  }//GEN-LAST:event_btn_inputActionPerformed

  private void btn_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmActionPerformed
    var temp = JOptionPane.showConfirmDialog(this, "Bạn có chắc là muốn học lại java 3 chứ?");
    if (temp == 1) {
      JOptionPane.showMessageDialog(this, "Bạn sẽ được toại nguyện 1");
    } else if (temp == 0) {
      JOptionPane.showMessageDialog(this, "Bạn sẽ được toại nguyện 0");
    } else {
      JOptionPane.showMessageDialog(this, "Bạn sẽ được toại nguyện 2");
    }
  }//GEN-LAST:event_btn_confirmActionPerformed

  private void btn_option1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_option1ActionPerformed
    Object[] arrObj = {"Có", "Không"};
    var temp = JOptionPane.showOptionDialog(this, "Bạn có muốn qua JAVA 3?", "Câu hỏi khó", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, arrObj, arrObj[0]);
    if (temp == 0) {
      JOptionPane.showMessageDialog(this, "Bạn chọn có");
      return;
    }
    JOptionPane.showMessageDialog(this, "Bạn chọn không");
  }//GEN-LAST:event_btn_option1ActionPerformed

  private void btn_option2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_option2ActionPerformed
    Object[] arrObj = {"JAVA", "C#", "PHP", "PYTHON", "JS"};
    var temp = JOptionPane.showOptionDialog(this, "Bạn thích ngôn ngữ nào dưới đây", "Lựa chọn ngôn ngữ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, arrObj, arrObj[0]);
    switch (temp) {
      case 0:
        JOptionPane.showMessageDialog(this, "Bạn yêu thích ngôn ngữ: " + arrObj[0]);
        break;
      case 1:
        JOptionPane.showMessageDialog(this, "Bạn yêu thích ngôn ngữ: " + arrObj[1]);
        break;
      case 2:
        JOptionPane.showMessageDialog(this, "Bạn yêu thích ngôn ngữ: " + arrObj[2]);
        break;
      case 3:
        JOptionPane.showMessageDialog(this, "Bạn yêu thích ngôn ngữ: " + arrObj[3]);
        break;
      case 4:
        JOptionPane.showMessageDialog(this, "Bạn yêu thích ngôn ngữ: " + arrObj[4]);
        break;

    }
  }//GEN-LAST:event_btn_option2ActionPerformed

  private void btn_input2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_input2ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_btn_input2ActionPerformed

  private void jSlider_VolumneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider_VolumneStateChanged
    if (jSlider_Volumne.getValueIsAdjusting()) {
      //return;//Khi chưa dừng kéo thì sẽ không chạy xuống dưới
    }
    lbl_volume.setText(String.valueOf(jSlider_Volumne.getValue()));
  }//GEN-LAST:event_jSlider_VolumneStateChanged

  private void jSlider_ThangStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider_ThangStateChanged
    // TODO add your handling code here:
  }//GEN-LAST:event_jSlider_ThangStateChanged

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(S5_DemoTongHopCacControls1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(S5_DemoTongHopCacControls1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(S5_DemoTongHopCacControls1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(S5_DemoTongHopCacControls1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new S5_DemoTongHopCacControls1().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btn_Mess;
  private javax.swing.JButton btn_Mess1;
  private javax.swing.JButton btn_confirm;
  private javax.swing.JButton btn_confirm1;
  private javax.swing.JButton btn_input;
  private javax.swing.JButton btn_input1;
  private javax.swing.JButton btn_input2;
  private javax.swing.JButton btn_option1;
  private javax.swing.JButton btn_option2;
  private javax.swing.JButton btn_option3;
  private javax.swing.JButton btn_option4;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JSlider jSlider_Thang;
  private javax.swing.JSlider jSlider_Volumne;
  private javax.swing.JLabel lbl_volume;
  private javax.swing.JTextField txt_text;
  private javax.swing.JTextField txt_text1;
  // End of variables declaration//GEN-END:variables
}

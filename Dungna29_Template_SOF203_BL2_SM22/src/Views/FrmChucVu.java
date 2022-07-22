/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Models.ChucVu;
import Services.QLChucVuService;
import Utilities.Utility;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dungna89
 */
public class FrmChucVu extends javax.swing.JFrame {

  private QLChucVuService _Service;
  private DefaultTableModel _DefaultTableModel;
  //private DefaultComboBoxModel _DefaultComboBoxModel;
  private String _idWhenClick;

  public FrmChucVu() {
    initComponents();
    _Service = new QLChucVuService();
    txt_Ma.setEnabled(false);
    LoadTable(null);
  }

  private ChucVu GetDataFromGui() {
    return new ChucVu(null, txt_Ma.getText(), txt_Ten.getText());
  }

  private void LoadTable(String input) {
    _DefaultTableModel = (DefaultTableModel) tbl_ChucVu.getModel();
    _DefaultTableModel.setRowCount(0);
    int stt = 1;
    for (var x : _Service.GetAll(input)) {
      _DefaultTableModel.addRow(new Object[]{stt++, x.getId(), x.getMa(), x.getTen()});
    }
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this
   * code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel2 = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tbl_ChucVu = new javax.swing.JTable();
    txt_TimKiem = new javax.swing.JTextField();
    jPanel2 = new javax.swing.JPanel();
    btn_Them = new javax.swing.JButton();
    btn_Sua = new javax.swing.JButton();
    btn_Xoa = new javax.swing.JButton();
    btn_Clear = new javax.swing.JButton();
    jPanel3 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    txt_Ma = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    txt_Ten = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel2.setText("QUẢN LÝ CHỨC VỤ");

    jPanel1.setBackground(new java.awt.Color(255, 204, 204));

    tbl_ChucVu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    tbl_ChucVu.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Title 1", "Title 2", "Title 3", "Title 4"
      }
    ));
    tbl_ChucVu.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tbl_ChucVuMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(tbl_ChucVu);

    txt_TimKiem.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    txt_TimKiem.setText("Tìm kiếm...");
    txt_TimKiem.addCaretListener(new javax.swing.event.CaretListener() {
      public void caretUpdate(javax.swing.event.CaretEvent evt) {
        txt_TimKiemCaretUpdate(evt);
      }
    });
    txt_TimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        txt_TimKiemMouseClicked(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        txt_TimKiemMouseExited(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(txt_TimKiem)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE))
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(txt_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    btn_Them.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    btn_Them.setText("THÊM");
    btn_Them.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_ThemActionPerformed(evt);
      }
    });
    jPanel2.add(btn_Them);

    btn_Sua.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    btn_Sua.setText("Sửa");
    btn_Sua.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_SuaActionPerformed(evt);
      }
    });
    jPanel2.add(btn_Sua);

    btn_Xoa.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    btn_Xoa.setText("Xóa");
    btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_XoaActionPerformed(evt);
      }
    });
    jPanel2.add(btn_Xoa);

    btn_Clear.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    btn_Clear.setText("Clear");
    jPanel2.add(btn_Clear);

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel1.setText("Mã:");

    txt_Ma.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

    jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel3.setText("Tên:");

    txt_Ten.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    txt_Ten.addCaretListener(new javax.swing.event.CaretListener() {
      public void caretUpdate(javax.swing.event.CaretEvent evt) {
        txt_TenCaretUpdate(evt);
      }
    });
    txt_Ten.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseExited(java.awt.event.MouseEvent evt) {
        txt_TenMouseExited(evt);
      }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addGap(26, 26, 26)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel3)
          .addComponent(jLabel1))
        .addGap(18, 18, 18)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(txt_Ma, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
          .addComponent(txt_Ten))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addGap(24, 24, 24)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(txt_Ma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
        .addGap(21, 21, 21)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(txt_Ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(27, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
      .addGroup(layout.createSequentialGroup()
        .addGap(70, 70, 70)
        .addComponent(jLabel2)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(4, 4, 4)
        .addComponent(jLabel2)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void txt_TenCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_TenCaretUpdate
    if (txt_Ten.getText().isEmpty()) {
      txt_Ma.setText("");
      return;
    }
    txt_Ma.setText(Utility.ZenMaTheoTen(txt_Ten.getText()));
  }//GEN-LAST:event_txt_TenCaretUpdate

  private void txt_TenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_TenMouseExited
    if (txt_Ten.getText().isEmpty()) {
      return;
    }
    txt_Ten.setText(Utility.VietHoaFullName(txt_Ten.getText()).trim());
  }//GEN-LAST:event_txt_TenMouseExited

  private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
    JOptionPane.showMessageDialog(this, _Service.Add(GetDataFromGui()));
    LoadTable(null);
  }//GEN-LAST:event_btn_ThemActionPerformed

  private void tbl_ChucVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ChucVuMouseClicked
    int rowIndex = tbl_ChucVu.getSelectedRow();
    if (rowIndex == -1) return;
    _idWhenClick = tbl_ChucVu.getModel().getValueAt(rowIndex, 1).toString();
    System.out.println(_idWhenClick);
    var temp = _Service.GetChucVuByID(_idWhenClick);
    txt_Ma.setText(temp.getMa());
    txt_Ten.setText(temp.getTen());
  }//GEN-LAST:event_tbl_ChucVuMouseClicked

  private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
    var temp = new ChucVu();
    temp.setId(_idWhenClick);
    JOptionPane.showMessageDialog(this, _Service.Delete(temp));
    LoadTable(null);
    _idWhenClick = "";
  }//GEN-LAST:event_btn_XoaActionPerformed

  private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
    var temp = GetDataFromGui();
    temp.setId(_idWhenClick);
    JOptionPane.showMessageDialog(this, _Service.Update(temp));
    LoadTable(null);
    //_idWhenClick = "";
  }//GEN-LAST:event_btn_SuaActionPerformed

  private void txt_TimKiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_TimKiemCaretUpdate
    if (txt_TimKiem.getText().isEmpty()) {
      LoadTable(null);
      return;
    }
    LoadTable(txt_TimKiem.getText());
  }//GEN-LAST:event_txt_TimKiemCaretUpdate

  private void txt_TimKiemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_TimKiemMouseExited
    txt_TimKiem.setText("Tìm kiếm......");
    LoadTable(null);
  }//GEN-LAST:event_txt_TimKiemMouseExited

  private void txt_TimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_TimKiemMouseClicked
    txt_TimKiem.setText("");
  }//GEN-LAST:event_txt_TimKiemMouseClicked

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
      java.util.logging.Logger.getLogger(FrmChucVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(FrmChucVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(FrmChucVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(FrmChucVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new FrmChucVu().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btn_Clear;
  private javax.swing.JButton btn_Sua;
  private javax.swing.JButton btn_Them;
  private javax.swing.JButton btn_Xoa;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tbl_ChucVu;
  private javax.swing.JTextField txt_Ma;
  private javax.swing.JTextField txt_Ten;
  private javax.swing.JTextField txt_TimKiem;
  // End of variables declaration//GEN-END:variables
}

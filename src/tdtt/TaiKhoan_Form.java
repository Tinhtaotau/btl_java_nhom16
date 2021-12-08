/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdtt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bvc
 */
public class TaiKhoan_Form extends javax.swing.JFrame {

    /**
     * Creates new form TaiKhoan_Form
     */
    ConnectDB cndb=new ConnectDB();
    public Connection cn=cndb.getConnectDB();
    public TaiKhoan_Form() {
        initComponents();
        load();
        truyendl();
    }
    public ArrayList<TaiKhoan> TKList(){
        ArrayList<TaiKhoan> TKList = new ArrayList<>();
        try{
             String sql="select * from TaiKhoan";
        Statement stm=cn.createStatement();
        ResultSet rs=stm.executeQuery(sql);
        TaiKhoan tk;
        while(rs.next()){
            tk= new TaiKhoan(rs.getString("maNV"),rs.getString("tenDN"),rs.getString("matKhau"));
            TKList.add(tk);
        }
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this,"Loi");
        }
       return TKList;
    }
    public void load(){
        ArrayList<TaiKhoan> list= TKList();
        DefaultTableModel model = (DefaultTableModel)tbTK.getModel();
        Object[] row=new Object[3];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getMaNV();
            row[1]=list.get(i).getTenDN();
            row[2]=list.get(i).getmK();
            model.addRow(row);
        }
    }
    public void truyendl(){
        tbTK.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(tbTK.getSelectedRow()>=0)
                {
//                txtMaSV.setText(bang.getValueAt(bang.getSelectedRow(),0)+"");
                txtMAnv.setText(tbTK.getValueAt(tbTK.getSelectedRow(),0)+"");
                txtTenTK.setText(tbTK.getValueAt(tbTK.getSelectedRow(),1)+"");
                txtMK.setText(tbTK.getValueAt(tbTK.getSelectedRow(),2)+"");
                }
                
            }
        });
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMAnv = new javax.swing.JTextField();
        txtTenTK = new javax.swing.JTextField();
        txtMK = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbTK = new javax.swing.JTable();
        btXoa = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã Nhân Viên");

        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Tên Tài Khoản");

        jButton3.setText("Sửa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Mật Khẩu");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Tài khoản");

        tbTK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Nhân Viên", "Tên Tài Khoản", "Mật Khẩu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTKMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbTK);

        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel3))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtMAnv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                .addComponent(txtTenTK, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMK, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton1)
                        .addGap(29, 29, 29)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btXoa)
                        .addGap(59, 59, 59)
                        .addComponent(btnThoat)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMAnv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(btXoa)
                    .addComponent(btnThoat))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void executeQuery(String query){
        Statement stm;
        try{
            stm=cn.createStatement();
            if(stm.executeUpdate(query)==1)
            {
                //JOptionPane.showMessageDialog(null,"OK");
                DefaultTableModel model =(DefaultTableModel)tbTK.getModel();
                model.setRowCount(0);
                load();
            }
            else{
                JOptionPane.showMessageDialog(null, "false");
            }
        }
        catch(Exception ex){
                    ex.printStackTrace();
                    }
        }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
           if(txtMAnv.getText().equals("")||txtMK.getText().equals("")||txtTenTK.getText().equals(""))
       {
           JOptionPane.showMessageDialog(rootPane, "Bạn vui lòng nhập hết thông tin mới");
           return;
       }
        else
       {
           try{           
           String sqlSelect="select * from NhanVien where MaNV='"+txtMAnv.getText()+"'";
           PreparedStatement pst=cn.prepareStatement(sqlSelect);           
           ResultSet rs=pst.executeQuery();
                if(rs.next())
                {
                    try{
                        String sqlSelect1="select * from TaiKhoan where maNV='"+txtMAnv.getText()+"'";
                        PreparedStatement pst1=cn.prepareStatement(sqlSelect1);           
                        ResultSet rs1=pst1.executeQuery();
                        if(rs1.next())
                        {                           
                            JOptionPane.showMessageDialog(rootPane, "Nhân viên này đã có tài khoản!");
                            return;
                        }
                        else
                        {                           
                            try
                            {
                               String sqlSelect2="select * from TaiKhoan where TenDN='"+txtTenTK.getText()+"' and matKhau='"+txtMK.getText()+"'";
                               PreparedStatement pst2=cn.prepareStatement(sqlSelect2);
                               ResultSet rs2=pst2.executeQuery(); 
                               if(rs2.next())
                               {
                                JOptionPane.showMessageDialog(rootPane, "Tên đăng nhập và mật khẩu đã bị trùng! Vui lòng nhập lại!");                                    
                               }
                               else
                               {
                                    String sql1="insert into TaiKhoan values('"+txtTenTK.getText()+"','"+txtMK.getText()+"','"+txtMAnv.getText()+"')";
                                     Statement stm= cn.createStatement();
                                     executeQuery(sql1);
                               }
                            }
                            catch(Exception ex)
                            {
                                JOptionPane.showMessageDialog(rootPane, "lỗi");
                            }                                      
                        }
                    }
                    catch(Exception e1)
                    {
                        JOptionPane.showMessageDialog(rootPane, "lỗi");
                    }
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Hệ thống chưa có nhân viên này!");
                }
           }catch(Exception ex)
           {
               JOptionPane.showMessageDialog(rootPane, "Lỗi kết nối!");
           }    
       }  
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbTKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTKMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tbTKMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(txtMAnv.getText().equals("")||txtMK.getText().equals("")||txtTenTK.getText().equals(""))
       {
           JOptionPane.showMessageDialog(rootPane, "Bạn vui lòng nhập hết thông tin mới");
           return;
       }
        else
       {
           try{           
           String sqlSelect="select * from NhanVien where MaNV='"+txtMAnv.getText()+"'";
           PreparedStatement pst=cn.prepareStatement(sqlSelect);           
           ResultSet rs=pst.executeQuery();
                if(rs.next())
                {
                    try{
                        
                        
                        {                           
                            try
                            {
                               String sqlSelect2="select * from TaiKhoan where TenDN='"+txtTenTK.getText()+"' and matKhau='"+txtMK.getText()+"'";
                               PreparedStatement pst2=cn.prepareStatement(sqlSelect2);
                               ResultSet rs2=pst2.executeQuery(); 
                               if(rs2.next())
                               {
                                JOptionPane.showMessageDialog(rootPane, "Tên đăng nhập và mật khẩu đã bị trùng! Vui lòng nhập lại!");                                    
                               }
                               else
                               {
                                String query="update TaiKhoan set tenDN='"+txtTenTK.getText()+"',matKhau='"+txtMK.getText()+"' where maNV='"+txtMAnv.getText()+"'" ;
                                executeQuery(query);
                               }
                            }
                            catch(Exception ex)
                            {
                                JOptionPane.showMessageDialog(rootPane, "lỗi");
                            }                                      
                        }
                    }
                    catch(Exception e1)
                    {
                        JOptionPane.showMessageDialog(rootPane, "lỗi");
                    }
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Hệ thống chưa có nhân viên này!");
                }
           }catch(Exception ex)
           {
               JOptionPane.showMessageDialog(rootPane, "Lỗi kết nối!");
           }   
//        String query="update TaiKhoan set tenDN='"+txtTenTK.getText()+"',matKhau='"+txtMK.getText()+"' where maNV='"+txtMAnv.getText()+"'" ;
//        executeQuery(query);
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        // TODO add your handling code here:
        String query="delete from TaiKhoan where (maNV='"+txtMAnv.getText()+"')";
        executeQuery(query);
    }//GEN-LAST:event_btXoaActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

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
            java.util.logging.Logger.getLogger(TaiKhoan_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaiKhoan_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaiKhoan_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaiKhoan_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaiKhoan_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btXoa;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tbTK;
    private javax.swing.JTextField txtMAnv;
    private javax.swing.JTextField txtMK;
    private javax.swing.JTextField txtTenTK;
    // End of variables declaration//GEN-END:variables
}

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
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bvc
 */
public class CauLacBo_Form extends javax.swing.JFrame {
        ConnectDB cndb=new ConnectDB();
        public Connection cn=cndb.getConnectDB();
    /**
     * Creates new form CauLacBo
     */
    public CauLacBo_Form() {
        initComponents();
        load();
        truyendl();
        
    }
    public String getNoiDDung(){
        
        return txtMaCLB.getText();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaCLB = new javax.swing.JTextField();
        txtTenCLB = new javax.swing.JTextField();
        txtMaNV = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCLB = new javax.swing.JTable();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btThoat = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("CÂU LẠC BỘ");

        jLabel2.setText("Mã Câu Lạc Bộ");

        jLabel3.setText("Tên Câu Lạc Bộ");

        jLabel4.setText("Mã Nhân Viên");

        tbCLB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã CLB", "Tên CLB", "Mã NV"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbCLB);

        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btSua.setText("Sửa");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btThoat.setText("Thoat");
        btThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThoatActionPerformed(evt);
            }
        });

        jButton1.setText("Chi Tiết");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Thành Tích");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaCLB, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenCLB, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(303, 303, 303))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaCLB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btThem)
                    .addComponent(btSua))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenCLB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btXoa)
                    .addComponent(btThoat))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        // TODO add your handling code here:
         String query="delete from CauLacBo where (maCLB='"+txtMaCLB.getText()+"')";
         executeQuery(query);
    }//GEN-LAST:event_btXoaActionPerformed

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        // TODO add your handling code here:
//        try{
           if(txtMaCLB.getText().equals("")||txtTenCLB.getText().equals("")||txtMaNV.getText().equals(""))
       {
           JOptionPane.showMessageDialog(rootPane, "Bạn vui lòng nhập hết thông tin mới");
           return;
       }
           else
       {
           try{           
           String sqlSelect="select * from NhanVien where maNV='"+txtMaNV.getText()+"'";
           PreparedStatement pst=cn.prepareStatement(sqlSelect);           
           ResultSet rs=pst.executeQuery();
                if(rs.next())
                {
                    try{
                        String sqlSelect1="select * from CauLacBo where maCLB='"+txtMaCLB.getText()+"'";
                        PreparedStatement pst1=cn.prepareStatement(sqlSelect1);           
                        ResultSet rs1=pst1.executeQuery();
                        if(rs1.next())
                        {                           
                            JOptionPane.showMessageDialog(rootPane, "CLB nay da ton tai");
                            return;
                        }
                        else
                        {                           
                            try
                            {
                               String sqlSelect2="select * from CauLacBo where tenCLB='"+txtTenCLB.getText()+"'";
                               PreparedStatement pst2=cn.prepareStatement(sqlSelect2);
                               ResultSet rs2=pst2.executeQuery(); 
                               if(rs2.next())
                               {
                                JOptionPane.showMessageDialog(rootPane, "Ten CLB da ton tai");                                    
                               }
                               else
                               {
                                    String sql1="insert into CauLacBo values('"+txtMaCLB.getText()+"','"+txtTenCLB.getText()+"','"+txtMaNV.getText()+"')";
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
    }//GEN-LAST:event_btThemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
        String tendn=txtMaCLB.getText();
        if(txtMaCLB.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Ban chua chon CLB");
            return;
        }
        else{
            new HocVien_Form(tendn).setVisible(true);
            HocVien_Form frmmain=new HocVien_Form();
            frmmain.setLocationRelativeTo(null);
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btThoatActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        //        // TODO add your handling code here:
        if(txtMaCLB.getText().equals("")||txtTenCLB.getText().equals("")||txtMaNV.getText().equals(""))
       {
           JOptionPane.showMessageDialog(rootPane, "Bạn vui lòng nhập hết thông tin mới");
           return;
       }
           else
       {
           try{           
           String sqlSelect="select * from NhanVien where maNV='"+txtMaNV.getText()+"'";
           PreparedStatement pst=cn.prepareStatement(sqlSelect);           
           ResultSet rs=pst.executeQuery();
                if(rs.next())
                {
                    try{
                        
                        
                        {                           
                            try
                            {
                               String sqlSelect2="select * from CauLacBo where tenCLB='"+txtTenCLB.getText()+"'";
                               PreparedStatement pst2=cn.prepareStatement(sqlSelect2);
                               ResultSet rs2=pst2.executeQuery(); 
                               if(rs2.next())
                               {
                                JOptionPane.showMessageDialog(rootPane, "Ten CLB da ton tai");                                    
                               }
                               else
                               {
                                    String sql1="update CauLacBo set tenCLB='"+txtTenCLB.getText()+"',maNV='"+txtMaNV.getText()+"' where maCLB='"+txtMaCLB.getText()+"'";
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
        //        String query="update CauLacBo set tenCLB='"+txtTenCLB.getText()+"',maNV='"+txtMaNV.getText()+"' where maNV='"+txtMaNV.getText()+"'" ;
        //        executeQuery(query);
        
    }//GEN-LAST:event_btSuaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String tendn=txtMaCLB.getText();
        if(txtMaCLB.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Ban chua chon CLB");
            return;
        }
        else{
            new ThanhTich_Form(tendn).setVisible(true);
            ThanhTich_Form frmmain=new ThanhTich_Form();
            frmmain.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public ArrayList<CauLacBo> TKList(){
        ArrayList<CauLacBo> TKList = new ArrayList<>();
        try{
             String sql="select * from CauLacBo";
        Statement stm=cn.createStatement();
        ResultSet rs=stm.executeQuery(sql);
        CauLacBo tk;
        while(rs.next()){
            tk= new CauLacBo(rs.getString("maCLB"),rs.getString("tenCLB"),rs.getString("maNV"));
            TKList.add(tk);
        }
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this,"Loi");
        }
       return TKList;
    }
    public void load(){
        ArrayList<CauLacBo> list= TKList();
        DefaultTableModel model = (DefaultTableModel)tbCLB.getModel();
        Object[] row=new Object[3];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getMaCLB();
            row[1]=list.get(i).getTenCLB();
            row[2]=list.get(i).getMaNV();
            
            model.addRow(row);
        }
    }
        
    @SuppressWarnings("unchecked")
    public void executeQuery(String query){
        Statement stm;
        try{
            stm=cn.createStatement();
            if(stm.executeUpdate(query)==1)
            {
                //JOptionPane.showMessageDialog(null,"OK");
                DefaultTableModel model =(DefaultTableModel)tbCLB.getModel();
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
    public void truyendl(){
        tbCLB.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(tbCLB.getSelectedRow()>=0)
                {
//                txtMaSV.setText(bang.getValueAt(bang.getSelectedRow(),0)+"");
                txtMaCLB.setText(tbCLB.getValueAt(tbCLB.getSelectedRow(),0)+"");
                txtTenCLB.setText(tbCLB.getValueAt(tbCLB.getSelectedRow(),1)+"");
                txtMaNV.setText(tbCLB.getValueAt(tbCLB.getSelectedRow(),2)+"");
                }
                
            }
        });
        }
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
            java.util.logging.Logger.getLogger(CauLacBo_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CauLacBo_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CauLacBo_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CauLacBo_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CauLacBo_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btThoat;
    private javax.swing.JButton btXoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbCLB;
    private javax.swing.JTextField txtMaCLB;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtTenCLB;
    // End of variables declaration//GEN-END:variables
}
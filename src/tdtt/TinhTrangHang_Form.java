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
 * @author Admin
 */
public class TinhTrangHang_Form extends javax.swing.JFrame {

    /**
     * Creates new form TinhTrangHang_Form
     */
    ConnectDB cndb=new ConnectDB();
    public Connection cn=cndb.getConnectDB();
    public TinhTrangHang_Form() {
        initComponents();
        
    }

    public TinhTrangHang_Form(String Ma,String SoLg,String Ten)
    {
        initComponents();
        txtMaHang.setText(Ma);
        txtSoLgBanDau.setText(SoLg);
        txtTenHang.setText(Ten);
        truyendl();
        load();
 
    }
    public ArrayList<TinhTrangHang> TKList(){
        ArrayList<TinhTrangHang> TKList = new ArrayList<>();
        try{
             String sql="select*from TinhTrangH";
        Statement stm=cn.createStatement();
        ResultSet rs=stm.executeQuery(sql);
        TinhTrangHang tk;
        while(rs.next()){
            tk= new TinhTrangHang(rs.getString("MaHang"),rs.getString("TenHang"),rs.getInt("SoLuongBanDau"),rs.getInt("SoLuongDung"),rs.getInt("SoLuongConLai"));
            TKList.add(tk);
        }
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this,"Loi");
        }
       return TKList;
    }
    public void load(){
        ArrayList<TinhTrangHang> list= TKList();
        DefaultTableModel model = (DefaultTableModel)tbTinhTrangHang.getModel();
        Object[] row=new Object[5];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getMaH();
            row[1]=list.get(i).getTenH();
            row[2]=list.get(i).getSoLgBanDau();
            row[3]=list.get(i).getSoLgDung();
            row[4]=list.get(i).tinh();
            model.addRow(row);
        }
    }
    public void truyendl(){
        tbTinhTrangHang.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(tbTinhTrangHang.getSelectedRow()>=0)
                {
                txtMaHang.setText(tbTinhTrangHang.getValueAt(tbTinhTrangHang.getSelectedRow(),0)+"");
                txtTenHang.setText(tbTinhTrangHang.getValueAt(tbTinhTrangHang.getSelectedRow(),1)+"");
                txtSoLgBanDau.setText(tbTinhTrangHang.getValueAt(tbTinhTrangHang.getSelectedRow(),2)+"");
                txtSoLgDung.setText(tbTinhTrangHang.getValueAt(tbTinhTrangHang.getSelectedRow(),3)+"");
                txtSoLgConLai.setText(tbTinhTrangHang.getValueAt(tbTinhTrangHang.getSelectedRow(),4)+""); 
                }
            }
        });
        
    }
    public void executeQuery(String query){
        Statement stm;
        try{
            stm=cn.createStatement();
            if(stm.executeUpdate(query)==1)
            {
                //JOptionPane.showMessageDialog(null,"OK");
                DefaultTableModel model =(DefaultTableModel)tbTinhTrangHang.getModel();
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaHang = new javax.swing.JTextField();
        txtTenHang = new javax.swing.JTextField();
        txtSoLgBanDau = new javax.swing.JTextField();
        txtSoLgDung = new javax.swing.JTextField();
        txtSoLgConLai = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTinhTrangHang = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã hàng");

        jLabel2.setText("Tên hàng");

        jLabel3.setText("Số lượng ban đầu");

        jLabel4.setText("Số lượng dùng");

        jLabel5.setText("Số lượng còn lại");

        txtMaHang.setEnabled(false);

        txtTenHang.setEnabled(false);

        txtSoLgBanDau.setEnabled(false);

        tbTinhTrangHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hàng", "Tên hàng", "Số lượng ban đầu", "Số lượng dùng", "Số lượng còn lại"
            }
        ));
        jScrollPane1.setViewportView(tbTinhTrangHang);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Tình trạng hàng");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
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
                .addGap(312, 312, 312)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSoLgBanDau, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTenHang, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSoLgConLai, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                    .addComponent(txtSoLgDung))))
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTenHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSoLgBanDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtSoLgDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtSoLgConLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem)
                            .addComponent(btnSua))
                        .addGap(18, 18, 18)
                        .addComponent(btnThoat))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if(txtMaHang.getText().equals("")||txtTenHang.getText().equals("")||txtSoLgDung.getText().equals(""))
        {
           JOptionPane.showMessageDialog(rootPane, "Bạn vui lòng nhập hết thông tin mới");
           return;
        }
            else
        {
           try{           
           String sqlSelect="select * from Kho where MaHang='"+txtMaHang.getText()+"'";
           PreparedStatement pst=cn.prepareStatement(sqlSelect);           
           ResultSet rs=pst.executeQuery();
                if(rs.next())
                {
                    try{
                        String sqlSelect1="select * from TinhTrangH where MaHang='"+txtMaHang.getText()+"'";
                        PreparedStatement pst1=cn.prepareStatement(sqlSelect1);           
                        ResultSet rs1=pst1.executeQuery();
                        if(rs1.next())
                        {                           
                            JOptionPane.showMessageDialog(rootPane, "Hàng này đã tồn tại");
                            return;
                        }
                        else
                        {
                            
                            int SoLgBD = Integer.parseInt(txtSoLgBanDau.getText());
                            int SoLgD = Integer.parseInt(txtSoLgDung.getText());
                            if(SoLgBD>=SoLgD)
                            {
                            String sql1="insert into TinhTrangH values('"+txtMaHang.getText()+"','"+txtTenHang.getText()+"','"+txtSoLgBanDau.getText()+"','"+txtSoLgDung.getText()+"','"+ txtSoLgConLai.getText()+"')";
                            Statement stm= cn.createStatement();
                            executeQuery(sql1);
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(rootPane, "Không đủ hàng trong kho");
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
                    JOptionPane.showMessageDialog(rootPane, "Hệ thống chưa có hàng này!");
                }
           }catch(Exception ex)
           {
               JOptionPane.showMessageDialog(rootPane, "Lỗi kết nối!");
           }
       }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if(txtMaHang.getText().equals("")||txtTenHang.getText().equals("")||txtSoLgDung.getText().equals(""))
        {
           JOptionPane.showMessageDialog(rootPane, "Bạn vui lòng nhập hết thông tin sửa");
        }
        else
        {
           try{           
           String sqlSelect="select * from TinhTrangH ";
           PreparedStatement pst=cn.prepareStatement(sqlSelect);           
           ResultSet rs=pst.executeQuery();
                if(rs.next())
                {
                    try{                          
                            try
                            {
                                int SoLgBD = Integer.parseInt(txtSoLgBanDau.getText());
                                int SoLgD = Integer.parseInt(txtSoLgDung.getText());
                                if(SoLgBD>=SoLgD)
                                {
                                String sql1="update TinhTrangH set SoLuongDung='"+txtSoLgDung.getText()+"' where MaHang='"+txtMaHang.getText()+"'";
                                Statement stm= cn.createStatement();
                                executeQuery(sql1);
                                }
                                else
                                {
                                JOptionPane.showMessageDialog(rootPane, "Không đủ hàng trong kho");
                                }
                            }
                            catch(Exception ex)
                            {
                                JOptionPane.showMessageDialog(rootPane, "lỗi");
                            }                                      
                    }
                    catch(Exception e1)
                    {
                        JOptionPane.showMessageDialog(rootPane, "lỗi");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Hệ thống chưa có hàng này!");
                }
            }catch(Exception ex)
            {
               JOptionPane.showMessageDialog(rootPane, "Lỗi kết nối!");
            }                      
        }
    }//GEN-LAST:event_btnSuaActionPerformed

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
            java.util.logging.Logger.getLogger(TinhTrangHang_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TinhTrangHang_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TinhTrangHang_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TinhTrangHang_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TinhTrangHang_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbTinhTrangHang;
    private javax.swing.JTextField txtMaHang;
    private javax.swing.JTextField txtSoLgBanDau;
    private javax.swing.JTextField txtSoLgConLai;
    private javax.swing.JTextField txtSoLgDung;
    private javax.swing.JTextField txtTenHang;
    // End of variables declaration//GEN-END:variables
}
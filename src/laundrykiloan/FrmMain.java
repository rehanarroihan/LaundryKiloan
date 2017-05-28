package laundrykiloan;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmMain extends javax.swing.JFrame {
    
    public FrmMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btMn1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btMn2 = new javax.swing.JButton();
        btMn4 = new javax.swing.JButton();
        pnl4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rekap = new javax.swing.JTable();
        pnl2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tbNama = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tbBerat = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tbTglMsk = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tbHarga = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        pnl3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        edit_nama = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        transaksi = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        total_harga = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tgl_ambil = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Laundry Kiloan");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setLayout(null);

        btMn1.setBackground(new java.awt.Color(255, 255, 255));
        btMn1.setText("Barang Masuk");
        btMn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btMn1);
        btMn1.setBounds(20, 190, 180, 32);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("\"Laurent\"");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 80, 180, 30);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Laundry Kiloan");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 50, 180, 30);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Keluar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(20, 360, 180, 32);

        btMn2.setBackground(new java.awt.Color(255, 255, 255));
        btMn2.setText("Pembayaran");
        btMn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btMn2);
        btMn2.setBounds(20, 230, 180, 32);

        btMn4.setBackground(new java.awt.Color(255, 255, 255));
        btMn4.setText("Rekap Data");
        btMn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btMn4);
        btMn4.setBounds(20, 270, 180, 32);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 220, 430);

        pnl4.setBackground(new java.awt.Color(255, 255, 255));
        pnl4.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 153, 255));
        jLabel6.setText("Rekap Data");
        pnl4.add(jLabel6);
        jLabel6.setBounds(30, 20, 270, 50);

        rekap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Atas Nama", "Berat (Kg)", "Harga", "Tgl Masuk", "Tgl Ambil"
            }
        ));
        jScrollPane1.setViewportView(rekap);

        pnl4.add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 470, 320);

        getContentPane().add(pnl4);
        pnl4.setBounds(220, 0, 500, 430);

        pnl2.setBackground(new java.awt.Color(255, 255, 255));
        pnl2.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 153, 255));
        jLabel8.setText("Barang Masuk");
        pnl2.add(jLabel8);
        jLabel8.setBounds(30, 20, 270, 50);

        jLabel9.setText("Atas Nama");
        pnl2.add(jLabel9);
        jLabel9.setBounds(30, 80, 100, 16);

        tbNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbNamaActionPerformed(evt);
            }
        });
        pnl2.add(tbNama);
        tbNama.setBounds(30, 100, 440, 24);

        jLabel10.setText("Berat");
        pnl2.add(jLabel10);
        jLabel10.setBounds(30, 200, 100, 16);
        pnl2.add(tbBerat);
        tbBerat.setBounds(30, 220, 440, 24);

        jLabel11.setText("Tanggal");
        pnl2.add(jLabel11);
        jLabel11.setBounds(30, 140, 100, 16);

        tbTglMsk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbTglMskActionPerformed(evt);
            }
        });
        pnl2.add(tbTglMsk);
        tbTglMsk.setBounds(30, 160, 440, 24);

        jLabel12.setText("Harga");
        pnl2.add(jLabel12);
        jLabel12.setBounds(30, 260, 100, 16);
        pnl2.add(tbHarga);
        tbHarga.setBounds(30, 280, 440, 24);

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setText("Simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnl2.add(jButton1);
        jButton1.setBounds(377, 330, 90, 32);

        getContentPane().add(pnl2);
        pnl2.setBounds(220, 0, 500, 430);

        pnl3.setBackground(new java.awt.Color(255, 255, 255));
        pnl3.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 153, 255));
        jLabel13.setText("Pembayaran");
        pnl3.add(jLabel13);
        jLabel13.setBounds(30, 20, 270, 50);

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Atas Nama");
        pnl3.add(jLabel14);
        jLabel14.setBounds(250, 90, 110, 30);

        edit_nama.setEditable(false);
        pnl3.add(edit_nama);
        edit_nama.setBounds(250, 120, 220, 30);

        transaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Transaksi", "Nama", "Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transaksiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(transaksi);
        if (transaksi.getColumnModel().getColumnCount() > 0) {
            transaksi.getColumnModel().getColumn(0).setResizable(false);
            transaksi.getColumnModel().getColumn(1).setResizable(false);
            transaksi.getColumnModel().getColumn(2).setResizable(false);
        }

        pnl3.add(jScrollPane2);
        jScrollPane2.setBounds(30, 90, 210, 300);

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Total Harga");
        pnl3.add(jLabel15);
        jLabel15.setBounds(250, 150, 110, 30);

        total_harga.setEditable(false);
        pnl3.add(total_harga);
        total_harga.setBounds(250, 180, 220, 30);

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Tanggal Ambil");
        pnl3.add(jLabel16);
        jLabel16.setBounds(250, 210, 110, 30);

        tgl_ambil.setEditable(false);
        pnl3.add(tgl_ambil);
        tgl_ambil.setBounds(250, 240, 220, 30);

        jButton3.setText("Ya");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        pnl3.add(jButton3);
        jButton3.setBounds(384, 280, 80, 32);

        getContentPane().add(pnl3);
        pnl3.setBounds(220, 0, 500, 430);

        setSize(new java.awt.Dimension(723, 455));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btMn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMn1ActionPerformed
        // TODO add your handling code here:
        pnl2.setVisible(true);
        pnl3.setVisible(false);
        pnl4.setVisible(false);
        
        Date date = new Date();
        String dte = new SimpleDateFormat("yyyy-MM-dd").format(date);
        tbTglMsk.setText(dte);
    }//GEN-LAST:event_btMn1ActionPerformed

    private void btMn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMn2ActionPerformed
        // TODO add your handling code here:
        pnl2.setVisible(false);
        pnl3.setVisible(true);
        pnl4.setVisible(false);
        Date date = new Date();
        String dte = new SimpleDateFormat("yyyy-MM-dd").format(date);
        tgl_ambil.setText(dte);
        
       takis();
    }//GEN-LAST:event_btMn2ActionPerformed

    private void takis(){
        String kolom[] = {"Transaksi","Nama","Total"};
       DefaultTableModel dtm = new DefaultTableModel(null, kolom);
       String SQL = "SELECT id,nama,harga FROM transaksi WHERE tgl_ambil IS NULL";
       ResultSet rs = DBConn.executeQuery(SQL);
       try{
           while(rs.next()){
               String transaksi = rs.getString(1);
               String nama = rs.getString(2);
               String harga = rs.getString(3);
               String data [] = {transaksi,nama,harga};
               dtm.addRow(data);
           }   
        }catch(SQLException ex){
            Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
       transaksi.setModel(dtm);
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        pnl2.setVisible(true);
        pnl3.setVisible(false);
        pnl4.setVisible(false);
        
        Date date = new Date();
        String dte = new SimpleDateFormat("yyyy-MM-dd").format(date);
        tbTglMsk.setText(dte);
    }//GEN-LAST:event_formWindowOpened

    private void btMn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMn4ActionPerformed
        // TODO add your handling code here:
        pnl2.setVisible(false);
        pnl3.setVisible(false);
        pnl4.setVisible(true);
        
        takiz();
    }//GEN-LAST:event_btMn4ActionPerformed
    
    private void takiz(){
        String kolom[] = {"ID","Nama","Berat (Kg)","Total","Tgl Masuk","Tgl Ambil"};
       DefaultTableModel dtms = new DefaultTableModel(null, kolom);
       String SQL = "select id,nama,berat,harga,tgl_masuk,tgl_ambil from transaksi where tgl_ambil is not null";
       ResultSet rs = DBConn.executeQuery(SQL);
       try{
           while(rs.next()){
               String id = rs.getString(1);
               String nama = rs.getString(2);
               String berat = rs.getString(3);
               String total = rs.getString(4);
               String tgl1 = rs.getString(5);
               String tgl2 = rs.getString(6);
               String duta [] = {id,nama,berat,total,tgl1,tgl2};
               dtms.addRow(duta);
           }   
        }catch(SQLException ex){
            Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
       rekap.setModel(dtms);
    }

    private void tbTglMskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbTglMskActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbTglMskActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // Iki save lur
        String SQL = "INSERT INTO transaksi (id,nama,tgl_masuk,berat,harga,tgl_ambil) "
                + "VALUES(NULL,'"+tbNama.getText()+"','"+tbTglMsk.getText()+"',"
                + "'"+tbBerat.getText()+"','"+tbHarga.getText()+"',NULL)";
        System.out.println(SQL);
        int status = DBConn.execute(SQL);
        if(status == 1){
            JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Gagal", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbNamaActionPerformed

    private void transaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transaksiMouseClicked
        // TODO add your handling code here:
        int baris = transaksi.getSelectedRow();
        if(baris != -1){
            edit_nama.setText(transaksi.getValueAt(baris,1).toString());
        }   
        total_harga.setText(transaksi.getValueAt(baris,2).toString());
    }//GEN-LAST:event_transaksiMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int baris = transaksi.getSelectedRow();
        String aidih = transaksi.getValueAt(baris, 0).toString();
        String SQL = "UPDATE transaksi SET tgl_ambil='"+tgl_ambil.getText()+"' WHERE id="+aidih;
        int status = DBConn.execute(SQL);
        if (status == 1) {
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan","Sukses", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "Data gagal disimpan", "Gagal", JOptionPane.WARNING_MESSAGE);
        }
        
        edit_nama.setText("");
        total_harga.setText("");
        takis();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btMn1;
    private javax.swing.JButton btMn2;
    private javax.swing.JButton btMn4;
    private javax.swing.JTextField edit_nama;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnl2;
    private javax.swing.JPanel pnl3;
    private javax.swing.JPanel pnl4;
    private javax.swing.JTable rekap;
    private javax.swing.JTextField tbBerat;
    private javax.swing.JTextField tbHarga;
    private javax.swing.JTextField tbNama;
    private javax.swing.JTextField tbTglMsk;
    private javax.swing.JTextField tgl_ambil;
    private javax.swing.JTextField total_harga;
    private javax.swing.JTable transaksi;
    // End of variables declaration//GEN-END:variables

}

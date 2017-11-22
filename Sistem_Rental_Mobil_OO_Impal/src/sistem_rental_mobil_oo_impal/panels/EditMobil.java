/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem_rental_mobil_oo_impal.panels;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import sistem_rental_mobil_oo_impal.Driver;
import sistem_rental_mobil_oo_impal.model.Pegawai;
import sistem_rental_mobil_oo_impal.model.Penyewa;
import sistem_rental_mobil_oo_impal.model.Supplier;
import sistem_rental_mobil_oo_impal.model.Mobil;

/**
 *
 * @author Evlive
 */
public class EditMobil extends javax.swing.JFrame {
    Driver driver;
    Mobil mobil;
    /**
     * Creates new form EditProfile
     */
    public EditMobil() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        driver = new Driver();
        mobil = new Mobil();
        reset();
        if (("supplier".equals(driver.getUserLevel()))) {
            namaSupplierField.setVisible(false);
            namaSupplierLabel.setVisible(false);
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

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        namaSupplierLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        merkField = new javax.swing.JTextField();
        namaMobilField = new javax.swing.JTextField();
        namaSupplierField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        jumlahField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        hargaField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel3.setText("Edit Mobil");

        namaSupplierLabel.setBackground(new java.awt.Color(255, 255, 255));
        namaSupplierLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        namaSupplierLabel.setText("Nama Supplier");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Nama Mobil");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setText("Merk");

        merkField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        merkField.setBorder(null);

        namaMobilField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        namaMobilField.setBorder(null);

        namaSupplierField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        namaSupplierField.setBorder(null);

        submitButton.setBackground(new java.awt.Color(0, 102, 255));
        submitButton.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Submit");
        submitButton.setBorder(null);
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        closeButton.setBackground(new java.awt.Color(0, 102, 255));
        closeButton.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        closeButton.setForeground(new java.awt.Color(255, 255, 255));
        closeButton.setText("Close");
        closeButton.setBorder(null);
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        jumlahField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jumlahField.setBorder(null);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setText("Jumlah");

        hargaField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        hargaField.setBorder(null);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setText("Harga");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(namaSupplierLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(namaSupplierField, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                    .addComponent(namaMobilField)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(111, 111, 111)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hargaField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jumlahField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                        .addComponent(merkField, javax.swing.GroupLayout.Alignment.TRAILING)))))
                        .addGap(112, 112, 112))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaSupplierLabel)
                    .addComponent(namaSupplierField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(namaMobilField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(merkField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jumlahField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(hargaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        String namaMobil = getNamaMobil();
        String merk = getMerk();
        int jumlah = getJumlah();
        int harga = getHarga();
        if ("pegawai".equals(driver.getUserLevel())) {
            Supplier supplier = driver.getSupplierByNama(getNamaSupplier());
            mobil.setIdSupplier(supplier.getId());
            driver.getDb().updateMobil(mobil.getId(), mobil);
        }
        if (!"".equals(namaMobil)) {
            mobil.setNama(namaMobil);
            driver.getDb().updateMobil(mobil.getId(), mobil);
        }
        if (!"".equals(merk)) {
            mobil.setMerk(merk);
            driver.getDb().updateMobil(mobil.getId(), mobil);
        }
        if (jumlah > 0) {
            mobil.setJumlah(jumlah);
            driver.getDb().updateMobil(mobil.getId(), mobil);
        }
        if (harga > 0) {
            mobil.setHarga(harga);
            driver.getDb().updateMobil(mobil.getId(), mobil);
        }
        this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_submitButtonActionPerformed

    public String getNamaSupplier() {
        return namaSupplierField.getText();
    } 
    
    public void setNamaSupplier(String namaSupplier) {
        namaSupplierField.setText(namaSupplier);
    }
    
    public String getNamaMobil() {
        return namaMobilField.getText();
    }
    
    public void setNamaMobil(String namaMobil) {
        namaMobilField.setText(namaMobil);
    }
    
    public String getMerk() {
        return merkField.getText();
    }
    
    public void setMerk(String merk) {
        merkField.setText(merk);
    }
    
    public int getJumlah() {
        int jumlah;
        if (jumlahField.getText().equals("")) {
            jumlah = 0;
        } else {
            jumlah = Integer.parseInt(jumlahField.getText());
        }
        return jumlah;
    }
    
    public void setJumlah(int jumlah) {
        String jumlahString = Integer.toString(jumlah);
        jumlahField.setText(jumlahString);
    }
    
    public int getHarga() {
        int harga;
        if (hargaField.getText().equals("")) {
            harga = 0;
        } else {
            harga = Integer.parseInt(hargaField.getText());
        }
        return harga;
    }
    
    public void setHarga(int harga) {
       String hargaString = Integer.toString(harga);
       hargaField.setText(hargaString);
    }
    
    public void reset() {
        setNamaSupplier("");
        setNamaMobil("");
        setMerk("");
        jumlahField.setText("");
        hargaField.setText("");
    }
    
    public Driver getDriver() {
        return driver;
    }
    
    public void setNamaSupplierFieldNotEditable() {
        namaSupplierField.setEditable(false);
    }
    
    public Mobil getMobil() {
        return mobil;
    }
    
    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }
    
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
            java.util.logging.Logger.getLogger(EditMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditMobil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JTextField hargaField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jumlahField;
    private javax.swing.JTextField merkField;
    private javax.swing.JTextField namaMobilField;
    private javax.swing.JTextField namaSupplierField;
    private javax.swing.JLabel namaSupplierLabel;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}

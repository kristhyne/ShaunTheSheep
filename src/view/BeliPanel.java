/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import controller.Database;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.AnimalFactory;
import model.Domba;
import model.Kambing;
import model.Sapi;

/**
 *
 * @author Lenovo
 */
public class BeliPanel extends javax.swing.JPanel {

    /**
     * Creates new form BeliPanel
     */
    public BeliPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupJenisHewan = new javax.swing.ButtonGroup();
        btnGroupJenisKelamin = new javax.swing.ButtonGroup();
        panelKanan1 = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        panelSapi1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        isKambing = new javax.swing.JRadioButton();
        isDomba = new javax.swing.JRadioButton();
        isJantan = new javax.swing.JRadioButton();
        isBetina = new javax.swing.JRadioButton();
        isSapi = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        beratSpinner = new javax.swing.JSpinner();
        btnBeli = new javax.swing.JButton();
        usiaSpinner = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        panelKanan1.setBackground(new java.awt.Color(204, 255, 255));
        panelKanan1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        title1.setBackground(new java.awt.Color(255, 255, 255));
        title1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        title1.setForeground(new java.awt.Color(0, 153, 153));
        title1.setText("Beli");

        panelSapi1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Jenis Kelamin");

        isKambing.setBackground(new java.awt.Color(204, 255, 255));
        btnGroupJenisHewan.add(isKambing);
        isKambing.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        isKambing.setForeground(new java.awt.Color(51, 51, 51));
        isKambing.setText(" kambing");
        isKambing.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        isKambing.setBorderPainted(true);
        isKambing.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        isKambing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isKambingActionPerformed(evt);
            }
        });

        isDomba.setBackground(new java.awt.Color(204, 255, 255));
        btnGroupJenisHewan.add(isDomba);
        isDomba.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        isDomba.setForeground(new java.awt.Color(51, 51, 51));
        isDomba.setText(" domba");
        isDomba.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        isDomba.setBorderPainted(true);
        isDomba.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        isDomba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isDombaActionPerformed(evt);
            }
        });

        isJantan.setBackground(new java.awt.Color(204, 255, 255));
        btnGroupJenisKelamin.add(isJantan);
        isJantan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        isJantan.setForeground(new java.awt.Color(51, 51, 51));
        isJantan.setText("jantan");
        isJantan.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        isJantan.setBorderPainted(true);
        isJantan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        isJantan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isJantanActionPerformed(evt);
            }
        });

        isBetina.setBackground(new java.awt.Color(204, 255, 255));
        btnGroupJenisKelamin.add(isBetina);
        isBetina.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        isBetina.setForeground(new java.awt.Color(51, 51, 51));
        isBetina.setText("betina");
        isBetina.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        isBetina.setBorderPainted(true);
        isBetina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        isBetina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isBetinaActionPerformed(evt);
            }
        });

        isSapi.setBackground(new java.awt.Color(204, 255, 255));
        btnGroupJenisHewan.add(isSapi);
        isSapi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        isSapi.setForeground(new java.awt.Color(51, 51, 51));
        isSapi.setText(" sapi");
        isSapi.setAlignmentY(0.0F);
        isSapi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        isSapi.setBorderPainted(true);
        isSapi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        isSapi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isSapiActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Berat");

        beratSpinner.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        beratSpinner.setModel(new javax.swing.SpinnerNumberModel(10, 10, null, 1));
        beratSpinner.setOpaque(true);

        btnBeli.setBackground(new java.awt.Color(0, 153, 153));
        btnBeli.setForeground(new java.awt.Color(255, 255, 255));
        btnBeli.setText("B E L I");
        btnBeli.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeliActionPerformed(evt);
            }
        });

        usiaSpinner.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usiaSpinner.setModel(new javax.swing.SpinnerNumberModel());
        usiaSpinner.setOpaque(true);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("kg");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 153));
        jLabel12.setText("bulan");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 153));
        jLabel13.setText("Usia");

        javax.swing.GroupLayout panelSapi1Layout = new javax.swing.GroupLayout(panelSapi1);
        panelSapi1.setLayout(panelSapi1Layout);
        panelSapi1Layout.setHorizontalGroup(
            panelSapi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSapi1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSapi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelSapi1Layout.createSequentialGroup()
                        .addComponent(isSapi, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(isKambing, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(isDomba, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8)
                    .addGroup(panelSapi1Layout.createSequentialGroup()
                        .addComponent(beratSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel11)
                        .addGap(33, 33, 33)
                        .addGroup(panelSapi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(usiaSpinner, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12))
                    .addComponent(jLabel7)
                    .addGroup(panelSapi1Layout.createSequentialGroup()
                        .addComponent(isJantan, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(isBetina, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        panelSapi1Layout.setVerticalGroup(
            panelSapi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSapi1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSapi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(isKambing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(isSapi, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(isDomba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSapi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isJantan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isBetina, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(panelSapi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSapi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(beratSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usiaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(btnBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelKanan1Layout = new javax.swing.GroupLayout(panelKanan1);
        panelKanan1.setLayout(panelKanan1Layout);
        panelKanan1Layout.setHorizontalGroup(
            panelKanan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKanan1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelKanan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelKanan1Layout.createSequentialGroup()
                        .addComponent(panelSapi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelKanan1Layout.createSequentialGroup()
                        .addComponent(title1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(790, 790, 790))))
        );
        panelKanan1Layout.setVerticalGroup(
            panelKanan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKanan1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(title1)
                .addGap(27, 27, 27)
                .addComponent(panelSapi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelKanan1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelKanan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void isKambingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isKambingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isKambingActionPerformed

    private void isDombaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isDombaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isDombaActionPerformed

    private void isJantanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isJantanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isJantanActionPerformed

    private void isBetinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isBetinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isBetinaActionPerformed

    private void isSapiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isSapiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isSapiActionPerformed

    private void btnBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeliActionPerformed
        // TODO add your handling code here:
        int berat = (Integer) beratSpinner.getValue();
        int usia = (Integer) usiaSpinner.getValue();
        
        String jk;        
        if(isJantan.isSelected()){
            jk = "jantan";
        } else {
            jk = "betina"; 
        }
        
        try {
            if(isSapi.isSelected()){
                Sapi tempSapi = (Sapi) AnimalFactory.addFromBuying("sapi", jk, berat, usia); 
                Database.getInstance().insertSapi(tempSapi);
                JOptionPane.showMessageDialog(this, """
                                                    Sapi Berhasil Dibeli!
                                                    
                                                    jk: """ + tempSapi.getJenis_kelamin()+ 
                                                    "\nberat: "+ tempSapi.getBerat() + 
                                                    "\nusia" + tempSapi.getUsia() +
                                                    "\nharga: " + tempSapi.getHarga()
                );
            } else if(isKambing.isSelected()){
                Kambing tempKambing = (Kambing) AnimalFactory.addFromBuying("kambing", jk, berat, usia); 
                Database.getInstance().insertKambing(tempKambing);
                JOptionPane.showMessageDialog(this, """
                                                    Kambing Berhasil Dibeli!
                                                    
                                                    jk: """ + tempKambing.getJenis_kelamin()+ 
                                                    "\nberat: "+ tempKambing.getBerat() + 
                                                    "\nusia" + tempKambing.getUsia() +
                                                    "\nharga: " + tempKambing.getHarga()
                );
            } else {
                Domba tempDomba = (Domba) AnimalFactory.addFromBuying("domba", jk, berat, usia); 
                Database.getInstance().insertDomba(tempDomba);
                JOptionPane.showMessageDialog(this, """
                                                    Domba Berhasil Dibeli!
                                                    
                                                    jk: """ + tempDomba.getJenis_kelamin()+ 
                                                    "\nberat: "+ tempDomba.getBerat() + 
                                                    "\nusia" + tempDomba.getUsia() +
                                                    "\nharga: " + tempDomba.getHarga()
                );
            }
        } catch (SQLException ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(this, "Gagal menyimpan data", "Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBeliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner beratSpinner;
    private javax.swing.JButton btnBeli;
    private javax.swing.ButtonGroup btnGroupJenisHewan;
    private javax.swing.ButtonGroup btnGroupJenisKelamin;
    private javax.swing.JRadioButton isBetina;
    private javax.swing.JRadioButton isDomba;
    private javax.swing.JRadioButton isJantan;
    private javax.swing.JRadioButton isKambing;
    private javax.swing.JRadioButton isSapi;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel panelKanan1;
    private javax.swing.JPanel panelSapi1;
    private javax.swing.JLabel title1;
    private javax.swing.JSpinner usiaSpinner;
    // End of variables declaration//GEN-END:variables
}

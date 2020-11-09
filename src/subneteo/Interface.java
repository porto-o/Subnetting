/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subneteo;

import javax.swing.JOptionPane;

/**
 *
 * @author PORTO
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form Interface
     *
     */
    FinalData fd = new FinalData();

    public Interface() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        subredesTxt = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rangoTxt = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        interfaceIP = new javax.swing.JTextField();
        btnIniciar = new javax.swing.JButton();
        Opciones = new javax.swing.JComboBox<>();
        noSubredes = new javax.swing.JTextField();
        noHost = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ipBin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        typeTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        saltoTxt = new javax.swing.JTextField();
        powerTo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese la IP que desea subnetear");

        subredesTxt.setEditable(false);
        subredesTxt.setColumns(20);
        subredesTxt.setRows(5);
        jScrollPane1.setViewportView(subredesTxt);

        jLabel3.setText("Subredes generadas");

        rangoTxt.setEditable(false);
        rangoTxt.setColumns(20);
        rangoTxt.setRows(5);
        jScrollPane2.setViewportView(rangoTxt);

        jLabel4.setText("Mascaras");

        interfaceIP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                interfaceIPKeyTyped(evt);
            }
        });

        btnIniciar.setText("Iniciar proceso UwU");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        Opciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A partir de...", "Ingresar número de subredes", "Ingresar número de host" }));
        Opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionesActionPerformed(evt);
            }
        });

        noSubredes.setEditable(false);
        noSubredes.setBackground(java.awt.SystemColor.window);
        noSubredes.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        noSubredes.setEnabled(false);
        noSubredes.setSelectionColor(new java.awt.Color(255, 204, 204));
        noSubredes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noSubredesActionPerformed(evt);
            }
        });
        noSubredes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                noSubredesKeyTyped(evt);
            }
        });

        noHost.setEditable(false);
        noHost.setBackground(java.awt.SystemColor.window);
        noHost.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        noHost.setEnabled(false);
        noHost.setSelectionColor(new java.awt.Color(255, 204, 204));
        noHost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noHostActionPerformed(evt);
            }
        });
        noHost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                noHostKeyTyped(evt);
            }
        });

        jLabel2.setText("IP en binario");

        ipBin.setEditable(false);
        ipBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipBinActionPerformed(evt);
            }
        });

        jLabel5.setText("Clase");

        typeTxt.setEditable(false);
        typeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeTxtActionPerformed(evt);
            }
        });

        jLabel7.setText("Potencia usada");

        jLabel8.setText("Saltos dados en generación de subred");

        powerTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerToActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel3)
                                .addGap(137, 137, 137)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(Opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(interfaceIP, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(noSubredes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(noHost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(110, 110, 110)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ipBin, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(75, 75, 75)
                                .addComponent(typeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(270, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(46, 46, 46)
                                        .addComponent(powerTo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(53, 53, 53)
                                        .addComponent(saltoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(btnIniciar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(typeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(interfaceIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ipBin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noSubredes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(noHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(saltoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar)
                    .addComponent(jLabel7)
                    .addComponent(powerTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:
        
        if(noSubredes.getText().isEmpty() || noSubredes.getText().equalsIgnoreCase(" ") || noHost.getText().isEmpty() || noHost.getText().equalsIgnoreCase("") || interfaceIP.getText().isEmpty() || interfaceIP.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Completa los campos o me da amsiedad ", "ERROR", 2);
        }else{

        int noSubi = Integer.parseInt(noSubredes.getText().toString());
        int noHosti = Integer.parseInt(noHost.getText().toString());

        if (noSubi > 128 || noSubi <= 0 || noHosti > 8388608 || noHosti <= 0) {
            JOptionPane.showMessageDialog(null, "RANGO SUPERADO", "ERROR", 2);

        } else {
            System.out.println("boton xD");

            Data getData = new Data();
            getData.setIp(interfaceIP.getText().toString());
            getData.setNoSub(noSubredes.getText().toString());
            getData.setHostNumber(noHost.getText().toString());
            getData.validar();

            String pruebasub = (fd.getSubredes());

            String rango = fd.getRangos();
            System.out.println("*********************************************");

            int hostNew = Integer.parseInt(getData.getHostNumber());
            String type = (fd.getType());
            String ipBinario = fd.getIpBin();
            String typeS = String.valueOf(type);
            int n = fd.getPowerTo();
            String s = fd.getConstJ();
            String ns = String.valueOf(n);

            subredesTxt.setText(pruebasub);
            rangoTxt.setText(rango);
            typeTxt.setText(typeS);
            ipBin.setText(ipBinario);
            powerTo.setText("2 ^ " + ns);
            saltoTxt.setText(s);

        }
        }

//        

    }//GEN-LAST:event_btnIniciarActionPerformed

    private void interfaceIPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_interfaceIPKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();

        if (Character.isLetter(caracter)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Oye, por que quieres ingresar texto xD?");
        }
    }//GEN-LAST:event_interfaceIPKeyTyped

    private void OpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionesActionPerformed
        // TODO add your handling code here:
        String test1 = "1";
        if (Opciones.getSelectedIndex() == 1) {
            noSubredes.setVisible(true);
            noHost.setText(test1);
            noSubredes.setEnabled(true);
            noSubredes.setEditable(true);
            noHost.setEnabled(false);
            noHost.setVisible(false);
        } else if (Opciones.getSelectedIndex() == 2) {
            noHost.setVisible(true);
            noSubredes.setText(test1);
            noHost.setEnabled(true);
            noHost.setEditable(true);
            noSubredes.setEnabled(false);
            noSubredes.setVisible(false);
        }
    }//GEN-LAST:event_OpcionesActionPerformed

    private void noSubredesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noSubredesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noSubredesActionPerformed

    private void noHostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noHostActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_noHostActionPerformed

    private void ipBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipBinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ipBinActionPerformed

    private void typeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeTxtActionPerformed

    private void powerToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_powerToActionPerformed

    private void noSubredesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noSubredesKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();

        if (Character.isLetter(caracter)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Oye, por que quieres ingresar texto xD?");
        }else if(!(Character.isDigit(caracter))){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Oye, por que quieres ingresar texto xD?");
        }
    }//GEN-LAST:event_noSubredesKeyTyped

    private void noHostKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noHostKeyTyped
        // TODO add your handling code here:}char caracter = evt.getKeyChar();
        char caracter = evt.getKeyChar();

        if (Character.isLetter(caracter)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Oye, por que quieres ingresar texto xD?");
        }else if(!(Character.isDigit(caracter))){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Oye, por que quieres ingresar texto xD?");
        }
    }//GEN-LAST:event_noHostKeyTyped

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Opciones;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JTextField interfaceIP;
    private javax.swing.JTextField ipBin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField noHost;
    private javax.swing.JTextField noSubredes;
    private javax.swing.JTextField powerTo;
    private javax.swing.JTextArea rangoTxt;
    private javax.swing.JTextField saltoTxt;
    private javax.swing.JTextArea subredesTxt;
    private javax.swing.JTextField typeTxt;
    // End of variables declaration//GEN-END:variables
}

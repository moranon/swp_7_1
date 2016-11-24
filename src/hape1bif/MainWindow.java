/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hape1bif;

import java.io.File;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author 61hape1bif
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form sample
     */
    public MainWindow() {
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

        mainTab = new javax.swing.JTabbedPane();
        contractsTab = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        contractsTable = new javax.swing.JTable();
        septemberTab = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        septemberTable = new javax.swing.JTable();
        octoberTab = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        octoberTable = new javax.swing.JTable();
        novemberTab = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        novemberTable = new javax.swing.JTable();
        decemberTab = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        decemberTable = new javax.swing.JTable();
        januaryTab = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        januaryTable = new javax.swing.JTable();
        februaryTab = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        februaryTable = new javax.swing.JTable();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openFile = new javax.swing.JMenuItem();
        saveFile = new javax.swing.JMenuItem();
        saveFileAs = new javax.swing.JMenuItem();
        mailSettings = new javax.swing.JMenuItem();
        exitApp = new javax.swing.JMenuItem();
        editEmailMenu = new javax.swing.JMenu();
        connectServer = new javax.swing.JMenuItem();
        readEmail = new javax.swing.JMenuItem();
        answerEmail = new javax.swing.JMenuItem();
        emailAuswerten = new javax.swing.JMenu();
        contractExtras = new javax.swing.JMenu();
        importContracts = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contractsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nummer", "Name", "Vorname", "E-Mail", "Beginn", "Ende", "Stunden/Monat", "Stundenvergütung", "Betreuer", "Projekt-Name", "Betreuer-Mail", "KST", "Ausgestellt am"
            }
        ));
        contractsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(contractsTable);

        javax.swing.GroupLayout contractsTabLayout = new javax.swing.GroupLayout(contractsTab);
        contractsTab.setLayout(contractsTabLayout);
        contractsTabLayout.setHorizontalGroup(
            contractsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1063, Short.MAX_VALUE)
        );
        contractsTabLayout.setVerticalGroup(
            contractsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );

        mainTab.addTab("Verträge", contractsTab);

        septemberTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nummer", "Name", "Vorname", "Typ", "Vortrag", "Stunden", "13.09.16", "14.09.16"
            }
        ));
        jScrollPane1.setViewportView(septemberTable);

        javax.swing.GroupLayout septemberTabLayout = new javax.swing.GroupLayout(septemberTab);
        septemberTab.setLayout(septemberTabLayout);
        septemberTabLayout.setHorizontalGroup(
            septemberTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1063, Short.MAX_VALUE)
        );
        septemberTabLayout.setVerticalGroup(
            septemberTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );

        mainTab.addTab("September", septemberTab);

        octoberTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nummer", "Name", "Vorname", "Typ", "Vortrag", "Stunden", "01.10.16", "02.10.16"
            }
        ));
        jScrollPane2.setViewportView(octoberTable);

        javax.swing.GroupLayout octoberTabLayout = new javax.swing.GroupLayout(octoberTab);
        octoberTab.setLayout(octoberTabLayout);
        octoberTabLayout.setHorizontalGroup(
            octoberTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1063, Short.MAX_VALUE)
        );
        octoberTabLayout.setVerticalGroup(
            octoberTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );

        mainTab.addTab("Oktober", octoberTab);

        novemberTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nummer", "Name", "Vorname", "Typ", "Vortrag", "Stunden", "01.11.16", "02.11.16"
            }
        ));
        jScrollPane3.setViewportView(novemberTable);

        javax.swing.GroupLayout novemberTabLayout = new javax.swing.GroupLayout(novemberTab);
        novemberTab.setLayout(novemberTabLayout);
        novemberTabLayout.setHorizontalGroup(
            novemberTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1063, Short.MAX_VALUE)
        );
        novemberTabLayout.setVerticalGroup(
            novemberTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );

        mainTab.addTab("November", novemberTab);

        decemberTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nummer", "Name", "Vorname", "Typ", "Vortrag", "Stunden", "01.12.16", "02.12.16"
            }
        ));
        jScrollPane5.setViewportView(decemberTable);

        javax.swing.GroupLayout decemberTabLayout = new javax.swing.GroupLayout(decemberTab);
        decemberTab.setLayout(decemberTabLayout);
        decemberTabLayout.setHorizontalGroup(
            decemberTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1063, Short.MAX_VALUE)
        );
        decemberTabLayout.setVerticalGroup(
            decemberTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );

        mainTab.addTab("Dezember", decemberTab);

        januaryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nummer", "Name", "Vorname", "Typ", "Vortrag", "Stunden", "01.01.17", "02.01.17"
            }
        ));
        jScrollPane6.setViewportView(januaryTable);

        javax.swing.GroupLayout januaryTabLayout = new javax.swing.GroupLayout(januaryTab);
        januaryTab.setLayout(januaryTabLayout);
        januaryTabLayout.setHorizontalGroup(
            januaryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1063, Short.MAX_VALUE)
        );
        januaryTabLayout.setVerticalGroup(
            januaryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );

        mainTab.addTab("Januar", januaryTab);

        februaryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nummer", "Name", "Vorname", "Typ", "Vortrag", "Stunden", "01.02.17", "02.02.17"
            }
        ));
        jScrollPane7.setViewportView(februaryTable);

        javax.swing.GroupLayout februaryTabLayout = new javax.swing.GroupLayout(februaryTab);
        februaryTab.setLayout(februaryTabLayout);
        februaryTabLayout.setHorizontalGroup(
            februaryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1063, Short.MAX_VALUE)
        );
        februaryTabLayout.setVerticalGroup(
            februaryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );

        mainTab.addTab("Februar", februaryTab);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Datei");

        openFile.setMnemonic('o');
        openFile.setText("Öffne Datei...");
        openFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openFileMouseClicked(evt);
            }
        });
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });
        fileMenu.add(openFile);

        saveFile.setMnemonic('s');
        saveFile.setText("Speichern");
        saveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileActionPerformed(evt);
            }
        });
        fileMenu.add(saveFile);

        saveFileAs.setMnemonic('a');
        saveFileAs.setText("Speichern unter...");
        saveFileAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileAsActionPerformed(evt);
            }
        });
        fileMenu.add(saveFileAs);

        mailSettings.setText("Einstellungen");
        mailSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailSettingsActionPerformed(evt);
            }
        });
        fileMenu.add(mailSettings);

        exitApp.setMnemonic('x');
        exitApp.setText("Beenden");
        exitApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitAppActionPerformed(evt);
            }
        });
        fileMenu.add(exitApp);

        menuBar.add(fileMenu);

        editEmailMenu.setMnemonic('e');
        editEmailMenu.setText("Bearbeiten");

        connectServer.setMnemonic('t');
        connectServer.setText("Verbinden");
        connectServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectServerActionPerformed(evt);
            }
        });
        editEmailMenu.add(connectServer);

        readEmail.setMnemonic('y');
        readEmail.setText("Lesen");
        readEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readEmailActionPerformed(evt);
            }
        });
        editEmailMenu.add(readEmail);

        answerEmail.setMnemonic('p');
        answerEmail.setText("Antworten");
        answerEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerEmailActionPerformed(evt);
            }
        });
        editEmailMenu.add(answerEmail);

        menuBar.add(editEmailMenu);

        emailAuswerten.setText("Auswerten");
        menuBar.add(emailAuswerten);

        contractExtras.setText("Extras");

        importContracts.setText("Verträge importieren");
        contractExtras.add(importContracts);

        menuBar.add(contractExtras);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");
        helpMenu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainTab, javax.swing.GroupLayout.PREFERRED_SIZE, 1068, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainTab, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
               
    private void exitAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitAppActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitAppActionPerformed

    private void saveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_saveFileActionPerformed

    private void saveFileAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileAsActionPerformed
        // TODO add your handling code here:

        SaveAs s = new SaveAs();
        s.setVisible(true);
    }//GEN-LAST:event_saveFileAsActionPerformed

    private void mailSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailSettingsActionPerformed
        //Dialog (Klick --> neues Fenster --> Eigenschaften)

        Settings s = new Settings();
        s.setVisible(true);
    }//GEN-LAST:event_mailSettingsActionPerformed

    private void connectServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectServerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_connectServerActionPerformed

    private void answerEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerEmailActionPerformed

    private void readEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readEmailActionPerformed
        // TODO add your handling code here:
        //open mails
        //2 Kästchen zur Auswahl (Bestätigung schicken , Fehlerbericht)
        //2 Button (Schließen, Speichern)
        //
        //Dann Dialog was geschickt wurde

    }//GEN-LAST:event_readEmailActionPerformed

    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed
        // TODO add your handling code here:

        OpenFile o = new OpenFile();
        o.setVisible(true);
    }//GEN-LAST:event_openFileActionPerformed

    private void openFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openFileMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_openFileMouseClicked

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem answerEmail;
    private javax.swing.JMenuItem connectServer;
    private javax.swing.JMenu contractExtras;
    private javax.swing.JPanel contractsTab;
    private javax.swing.JTable contractsTable;
    private javax.swing.JPanel decemberTab;
    private javax.swing.JTable decemberTable;
    private javax.swing.JMenu editEmailMenu;
    private javax.swing.JMenu emailAuswerten;
    private javax.swing.JMenuItem exitApp;
    private javax.swing.JPanel februaryTab;
    private javax.swing.JTable februaryTable;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem importContracts;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPanel januaryTab;
    private javax.swing.JTable januaryTable;
    private javax.swing.JMenuItem mailSettings;
    private javax.swing.JTabbedPane mainTab;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPanel novemberTab;
    private javax.swing.JTable novemberTable;
    private javax.swing.JPanel octoberTab;
    private javax.swing.JTable octoberTable;
    private javax.swing.JMenuItem openFile;
    private javax.swing.JMenuItem readEmail;
    private javax.swing.JMenuItem saveFile;
    private javax.swing.JMenuItem saveFileAs;
    private javax.swing.JPanel septemberTab;
    private javax.swing.JTable septemberTable;
    // End of variables declaration//GEN-END:variables

    public File f;
}

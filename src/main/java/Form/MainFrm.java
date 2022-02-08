/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

/**
 *
 * @author Mohammad Fasha
 */
public class MainFrm extends javax.swing.JFrame {

    /**
     * Creates new form NewMDIApplication
     */        
    
    public MainFrm() {
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

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        formsMenu = new javax.swing.JMenu();
        b2a2AnnotationMenuItem = new javax.swing.JMenuItem();
        owlAnnotationMenuItem = new javax.swing.JMenuItem();
        informationExtractionMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setAutoscrolls(true);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        formsMenu.setMnemonic('e');
        formsMenu.setText("Forms");

        b2a2AnnotationMenuItem.setMnemonic('t');
        b2a2AnnotationMenuItem.setText("B2A2 Annotation");
        b2a2AnnotationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2a2AnnotationMenuItemActionPerformed(evt);
            }
        });
        formsMenu.add(b2a2AnnotationMenuItem);

        owlAnnotationMenuItem.setMnemonic('y');
        owlAnnotationMenuItem.setText("OWL Annotation");
        owlAnnotationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                owlAnnotationMenuItemActionPerformed(evt);
            }
        });
        formsMenu.add(owlAnnotationMenuItem);

        informationExtractionMenuItem.setMnemonic('p');
        informationExtractionMenuItem.setText("Information Extraction");
        informationExtractionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informationExtractionMenuItemActionPerformed(evt);
            }
        });
        formsMenu.add(informationExtractionMenuItem);

        menuBar.add(formsMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void b2a2AnnotationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2a2AnnotationMenuItemActionPerformed
        B2A2 f = new B2A2();
        desktopPane.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_b2a2AnnotationMenuItemActionPerformed

    private void owlAnnotationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_owlAnnotationMenuItemActionPerformed
        OWLAnnotation f = new OWLAnnotation();
        desktopPane.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_owlAnnotationMenuItemActionPerformed

    private void informationExtractionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informationExtractionMenuItemActionPerformed
        InformationExctration f = new InformationExctration();
        desktopPane.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_informationExtractionMenuItemActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

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
                MainFrm mainFrm = new MainFrm();
                mainFrm.setVisible(true);
                mainFrm.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem b2a2AnnotationMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu formsMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem informationExtractionMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem owlAnnotationMenuItem;
    // End of variables declaration//GEN-END:variables

}

package com.blackflower.bingoll;

import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author emirs
 */
public class MainFrame extends javax.swing.JFrame {

    public static MainFrame instance;

    public final StartingPagePanel startingPage;
    public final GamePagePanel gamePage;

    public MainFrame() {
        initComponents();

        startingPage = new StartingPagePanel();
        gamePage = new GamePagePanel();

        this.add(mainPanel);
        setPage(startingPage);

        this.mainPanel.setSize(new Dimension(1200, 600));
        this.setSize(new Dimension(1200, 600));
        this.setPreferredSize(new Dimension(1200, 600));
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        if (instance == null) {
            instance = this;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.GridLayout());
        getContentPane().add(mainPanel, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    public final void setPage(JPanel page) {
        if (mainPanel.getComponentCount() > 0) {
            IPage oldPage = (IPage) mainPanel.getComponent(mainPanel.getComponentCount() - 1);
            oldPage.onPageDisappear();
        }

        mainPanel.removeAll();
        mainPanel.add(page);
        mainPanel.revalidate();
        mainPanel.repaint();
        System.out.println("Page Setted!");

        if (page instanceof IPage iPage) {
            iPage.onPageSetted();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}

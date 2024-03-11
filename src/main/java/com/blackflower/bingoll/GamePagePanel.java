package com.blackflower.bingoll;

import com.blackflower.bingoll.core.GameManager;
import com.blackflower.bingoll.customComponents.GameTableComponent;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JPanel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author emirs
 */
public class GamePagePanel extends javax.swing.JPanel implements IPage {

    private int playerCount = 2;

    public int getPlayerCount() {
        return playerCount;
    }

    public void setPlayerCount(int playerCount) {
        this.playerCount = playerCount;
    }

    public GamePagePanel() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(204, 204, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Spin");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 520, 100, 30));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "10", "52", "68", "90", "50", "10" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 50, 210, 470));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Last Spins");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 210, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onPageSetted() {

        int offsetX = 40;
        int offsetY = 40;
        int maxColumnCount = 2;
        int maxRowCount = 2;
        int currentColumnCount = 0;
        int currentRowCount = 0;
        int width = 370;
        int height = 125;
        
        for (int i = 0; i <  GameManager.instance.players.size(); i++) {
            AbsoluteConstraints absConstraints = new AbsoluteConstraints((width + offsetX) * currentColumnCount + 60, (height + offsetY) * currentRowCount + 60, width, height);
            GameTableComponent newGameTable = new GameTableComponent(GameManager.instance.players.get(i));
            add(newGameTable, absConstraints);
            
            currentColumnCount++;
            if (currentColumnCount == maxColumnCount) {
                currentColumnCount = 0;
                currentRowCount++;
            }
        }
    }

    @Override
    public void onPageDisappear() {
        //gamePanel.removeAll();
    }
}

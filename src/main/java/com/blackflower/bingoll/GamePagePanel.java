package com.blackflower.bingoll;

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

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(204, 204, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Spin");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 520, 100, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onPageSetted() {
        /*LayoutManager layoutManager = new GridLayout();
        JPanel gamePanel = new JPanel(layoutManager);
        AbsoluteConstraints absConstraints = new AbsoluteConstraints(0, 0, 360, 120);
        gamePanel.setPreferredSize(new Dimension(360, 120)); // Set preferred size
        add(gamePanel, absConstraints);
        
        gamePanel.setSize(new Dimension(360, 120));
        GridLayout layout = (GridLayout)gamePanel.getLayout();
        layout.setHgap(20);
        layout.setVgap(20);
        switch (playerCount) {
            case 2 -> {
                layout.setColumns(2);
                layout.setRows(1);
            }
            case 3 -> {
                layout.setColumns(2);
                layout.setRows(2);
            }
            case 4 -> {
                layout.setColumns(2);
                layout.setRows(2);
            }
            default -> throw new AssertionError();
        }*/

        int offsetX = 20;
        int offsetY = 20;
        int maxColumnCount = 2;
        int maxRowCount = 2;
        int currentColumnCount = 0;
        int currentRowCount = 0;
        int width = 360;
        int height = 120;
        
        for (int i = 0; i < playerCount; i++) {
            AbsoluteConstraints absConstraints = new AbsoluteConstraints((width + offsetX) * currentColumnCount, (height + offsetY) * currentRowCount, width, height);
            GameTableComponent newGameTable = new GameTableComponent();
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

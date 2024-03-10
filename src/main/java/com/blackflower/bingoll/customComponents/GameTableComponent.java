package com.blackflower.bingoll.customComponents;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author emirs
 */
public class GameTableComponent extends javax.swing.JPanel {

    public GameTableComponent() {
        initComponents();

        this.setPreferredSize(new Dimension(360, 120));
        GridLayout layout = (GridLayout) this.getLayout();
        layout.setColumns(9);
        layout.setRows(3);
        layout.setHgap(0);
        layout.setVgap(0);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                JPanel cell = new JPanel();
                cell.setPreferredSize(new Dimension(40, 40));
                CardLayout cardLayout = new CardLayout(0, 0);
                cell.setLayout(cardLayout);
                //cell.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                CircleComponent newCircle = new CircleComponent(19, CardColor.PURPLE);
                cell.add(newCircle);
                add(cell);
            }
            JPanel cell = new JPanel();
            cell.setPreferredSize(new Dimension(40, 40));
            CardLayout cardLayout = new CardLayout(0, 0);
            cell.setLayout(cardLayout);
            //cell.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            NumberedCircleComponent newCircle = new NumberedCircleComponent(19, CardColor.PURPLE, i * 5);
            cell.add(newCircle);
            add(cell);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.GridLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

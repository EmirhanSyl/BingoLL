package com.blackflower.bingoll.customComponents;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author emirs
 */
public class Triangle extends javax.swing.JPanel {

    private int width;
    private int height;
    private Color color;
    boolean upside = true;

    public Triangle(int width, int height, Color color, boolean upside) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.upside = upside;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Set color of the line
        g.setColor(color);

        int centerX = width / 2;

        // Draw the triangular shape
        if (!upside) {
            int[] xPoints = {centerX - 10, centerX, centerX + 10};
            int[] yPoints = {height - 10, height + 10, height - 10};
            g.fillPolygon(xPoints, yPoints, 3);
        } else {
            int[] xPoints = {centerX - 10, centerX, centerX + 10}; 
            int[] yPoints = {height + 10, height - 10, height + 10}; 
            g.fillPolygon(xPoints, yPoints, 3); 
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

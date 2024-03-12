package com.blackflower.bingoll.customComponents;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author emirs
 */
public class VerticalLine extends JComponent{
    private int width;
    private int height;
    private Color color;

    public VerticalLine(int width, int height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Set color of the line
        g.setColor(color);
        // Draw the line
        g.drawLine(width / 2, 0, width / 2, height);
    }
}

package com.blackflower.bingoll.customComponents;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author emirs
 */
public class CircleComponent extends JPanel {

    private final int radius;
    private final CardColor color;

    public CircleComponent(int radius, CardColor color) {
        this.radius = radius;
        this.color = color;

        setBackground(color.getBackgroundColor());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Get the width and height of the JPanel
        int width = getWidth();
        int height = getHeight();

        // Calculate the center coordinates of the JPanel
        int centerX = width / 2;
        int centerY = height / 2;

        int diagonalX = width;
        int diagonalY = height;

        // Create a gradient paint for the circle
        GradientPaint gradient = new GradientPaint(centerX, centerY, new Color(115,26,65,255), diagonalX, diagonalY, new Color(104, 0, 53));

        Graphics2D g2d = (Graphics2D) g;

        // Set the paint to the gradient paint
        g2d.setPaint(gradient);

        // Draw the circle
        g2d.fillOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);
    }
}

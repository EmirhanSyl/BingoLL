package com.blackflower.bingoll.customComponents;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author emirs
 */
public class NumberedCircleComponent extends JPanel {

    private final int radius;
    private final CardColor color;
    private int number;

    public NumberedCircleComponent(int radius, CardColor color, int number) {
        this.radius = radius;
        this.color = color;
        this.number = number;
        setPreferredSize(new Dimension(2 * radius, 2 * radius));

        setBackground(color.getBackgroundColor());
    }
    
    public void setNumber(int number){
        this.number = number;
        revalidate();
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Get the width and height of the panel
        int width = getWidth();
        int height = getHeight();

        // Calculate the center coordinates of the panel
        int centerX = width / 2;
        int centerY = height / 2;
        

        // Draw the shadow circle (slightly larger and semi-transparent)
        int shadowRadius = radius + 1; // Adjust the shadow size as needed
        g.setColor(new Color(67,10,34, 100)); // Semi-transparent black color for shadow
        g.fillOval(centerX - shadowRadius, centerY - shadowRadius, 2 * shadowRadius, 2 * shadowRadius);

        // Draw the circle
        g.setColor(new Color(210, 194, 204));
        g.fillOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);
        
        // Draw the number in the center of the circle
        g.setColor(color.getTextColor());
        Font font = new Font("Arial", Font.BOLD, radius);
        g.setFont(font);
        FontMetrics metrics = g.getFontMetrics(font);
        String numberString = String.valueOf(number);
        int stringWidth = metrics.stringWidth(numberString);
        int stringHeight = metrics.getHeight();
        g.drawString(numberString, centerX - stringWidth / 2, centerY + stringHeight / 4);


    }
}

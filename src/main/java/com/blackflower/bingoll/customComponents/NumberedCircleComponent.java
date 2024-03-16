package com.blackflower.bingoll.customComponents;

import com.blackflower.bingoll.GamePagePanel;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

/**
 *
 * @author emirs
 */
public class NumberedCircleComponent extends JPanel {

    private final int radius;
    private final CardColor color;
    private int number;
    private boolean checked;
    private boolean isHovered;
    private boolean hoverState = true;

    public NumberedCircleComponent(int radius, CardColor color, int number) {
        this.radius = radius;
        this.color = color;
        this.number = number;
        setPreferredSize(new Dimension(2 * radius, 2 * radius));

        setBackground(color.getBackgroundColor());

        // Add mouse listener to detect mouse enter and exit events
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                isHovered = true;
                repaint();
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                if (hoverState && GamePagePanel.lastNumber == number) {
                    checked = true;
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                isHovered = false;
                repaint();
            }
        });
    }

    public void setNumber(int number) {
        this.number = number;
        repaint();
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
        repaint();
    }

    public void setHoverState(boolean hoverState) {
        this.hoverState = hoverState;
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
        g.setColor(new Color(67, 10, 34, 100)); // Semi-transparent black color for shadow
        g.fillOval(centerX - shadowRadius, centerY - shadowRadius, 2 * shadowRadius, 2 * shadowRadius);

        if (hoverState && isHovered) {
            for (int i = 0; i < 3; i++) {
                g.setColor(new Color(51, 153, 255, 100 + i * 50));

                int circleRadius = radius + i * 1;

                g.fillOval(centerX - circleRadius, centerY - circleRadius, 2 * circleRadius, 2 * circleRadius);
            }
        }

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

        if (checked) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.RED.darker());
            g2d.setStroke(new BasicStroke(3));
            g2d.drawLine(width, 0, 0, height);
        }
    }
}

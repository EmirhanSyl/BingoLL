package com.blackflower.bingoll.customComponents;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.Timer;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author emirs
 */
public class CarouselSpinner extends javax.swing.JPanel {

    JLabel generatedLabels[] = new JLabel[90];
    public static int slidingAmount = 1;
    public boolean isSpinningStarted = false;

    private static final int ANIMATION_DURATION_MS = 1000;
    private static final int ANIMATION_STEP_DELAY_MS = 10;
    
    public CarouselSpinner() {
        initComponents();

        generateLabels();
    }
    
    private void generateLabels(){
        for (int i = 0; i < 90; i++) {
            JLabel newlabel = new JLabel("" + (i + 1));
            newlabel.setFont(new Font("Segoe UI", 1, 24));
            newlabel.setHorizontalAlignment(SwingConstants.CENTER);
            newlabel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
            add(newlabel, new AbsoluteConstraints(i * 90, 0, 90, 100));
            generatedLabels[i] = newlabel;
        }
    }

    public void startAllAnimations() {

        startAnimation(generatedLabels);
        isSpinningStarted = true;
    }

    public static void startAllAnimations(JLabel[] labels) {
        SwingWorker<Void, JLabel> worker = new SwingWorker<Void, JLabel>() {
            private int newNumber = 10;
            
            @Override
            protected Void doInBackground() throws Exception {
                // Perform animation
                long startTime = System.currentTimeMillis();
                long elapsedTime = 0;

                while (elapsedTime < ANIMATION_DURATION_MS) {
                    for (JLabel label : labels) {
                        Point location = label.getLocation();
                        if (location.x > -label.getWidth()) {
                            publish(label);
                            label.setLocation(location.x - 1, location.y);
                        } else {
                            label.setLocation(720, location.y);
                        }
                    }

                    Thread.sleep(ANIMATION_STEP_DELAY_MS);
                    elapsedTime = System.currentTimeMillis() - startTime;
                }

                // Update label text after animation completes
                for (JLabel label : labels) {
                    label.setText("" + newNumber++);
                }

                return null;
            }

            @Override
            protected void process(List<JLabel> chunks) {
                // Update GUI with intermediate state (label positions)
                for (JLabel label : chunks) {
                    label.repaint();
                }
            }
        };

        worker.execute();
    }
    
    public final void startAnimation(JLabel labels[]) {
        Timer timer = new Timer(10, new ActionListener() {
            private int[] targetX = new int[labels.length];

            {
                // Initialize targetX array for each label
                for (int i = 0; i < labels.length; i++) {
                    targetX[i] = labels[i].getLocation().x - labels[i].getSize().width;
                }
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                int sliding = slidingAmount;
                for (int i = 0; i < labels.length; i++) {
                    if (labels[i].getLocation().x > targetX[i]) {
                        int x = labels[i].getLocation().x - sliding;
                        labels[i].setLocation(x, labels[i].getLocation().y);
                    } else {
                        if (labels[i].getLocation().x < -1) {
                            
                            int maxX = 0;
                            for (JLabel label : labels) {
                                maxX = (maxX > label.getLocation().x) ? maxX: label.getLocation().x;
                            }
                            labels[i].setLocation(maxX + labels[i].getSize().width, 
                                    labels[i].getLocation().y);
                        }
                        targetX[i] = labels[i].getLocation().x - labels[i].getSize().width;
                        //((Timer) e.getSource()).stop();
                    }
                }

            }
        });
        timer.start();
    }
    
    public int getSelectedNumber(Point p) {
        for (JLabel generatedLabel : generatedLabels) {
            if (generatedLabel.contains(p)) {
                return Integer.parseInt(generatedLabel.getText());
            }
        }
        return -1;
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}

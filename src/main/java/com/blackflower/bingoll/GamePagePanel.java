package com.blackflower.bingoll;

import com.blackflower.bingoll.core.BingoLinkedList;
import com.blackflower.bingoll.core.GameManager;
import com.blackflower.bingoll.customComponents.CardColor;
import com.blackflower.bingoll.customComponents.CarouselSpinner;
import com.blackflower.bingoll.customComponents.GameTableComponent;
import com.blackflower.bingoll.customComponents.NumberedCircleComponent;
import com.blackflower.bingoll.customComponents.Triangle;
import com.blackflower.bingoll.customComponents.VerticalLine;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Point;
import java.util.Random;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author emirs
 */
public class GamePagePanel extends javax.swing.JPanel implements IPage {

    public static int lastNumber = -2;
    Random random = new Random();
    public int lastSpinInfoMax = 5;
    public int lastSpinInfoAmount;
    NumberedCircleComponent lastSpins[] = new NumberedCircleComponent[lastSpinInfoMax];
    BingoLinkedList<Integer> lastNumbers = new BingoLinkedList<>();

    public GamePagePanel() {
        initComponents();

        spinnerLine.add(new Triangle(20, 20, Color.RED, false));
        spinnerLine1.add(new Triangle(20, 20, Color.RED, true));

        for (int i = 0; i < lastSpinInfoMax; i++) {
            NumberedCircleComponent lastSpin = new NumberedCircleComponent(25, CardColor.WHITE, 0);
            lastSpin.setHoverState(false);
            lastSpins[i] = lastSpin;
            add(lastSpin, new AbsoluteConstraints(945, 80 * (i + 1), 80, 80));
            this.setComponentZOrder(lastSpin, 0);
            lastSpin.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        carouselPanel = new javax.swing.JPanel();
        carouselSpinner1 = new com.blackflower.bingoll.customComponents.CarouselSpinner();
        spinnerLine1 = new javax.swing.JPanel();
        spinnerLine = new javax.swing.JPanel();
        spinnerLine2 = new javax.swing.JPanel();
        NameLabel1 = new javax.swing.JLabel();
        NameLabel2 = new javax.swing.JLabel();
        NameLabel3 = new javax.swing.JLabel();
        NameLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(204, 204, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Spin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, 100, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Last Spins");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 130, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 80, 90, 400));

        carouselPanel.setLayout(new java.awt.CardLayout());
        carouselPanel.add(carouselSpinner1, "card2");

        add(carouselPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 720, 100));

        spinnerLine1.setBackground(new java.awt.Color(255, 255, 255));
        spinnerLine1.setForeground(new java.awt.Color(255, 255, 255));
        spinnerLine1.setLayout(new java.awt.GridLayout(1, 0));
        add(spinnerLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 20, 30));

        spinnerLine.setBackground(new java.awt.Color(255, 255, 255));
        spinnerLine.setForeground(new java.awt.Color(255, 255, 255));
        spinnerLine.setLayout(new java.awt.GridLayout(1, 0));
        add(spinnerLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 20, 30));

        spinnerLine2.setBackground(new java.awt.Color(255, 255, 255));
        spinnerLine2.setForeground(new java.awt.Color(255, 255, 255));
        spinnerLine2.setLayout(new java.awt.GridLayout(1, 0));
        add(spinnerLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 390, 2, 100));

        NameLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NameLabel1.setForeground(new java.awt.Color(0, 0, 0));
        NameLabel1.setText("Player 1:");
        add(NameLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 230, 30));

        NameLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NameLabel2.setForeground(new java.awt.Color(0, 0, 0));
        NameLabel2.setText("Player 2:");
        add(NameLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 230, 30));

        NameLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NameLabel3.setForeground(new java.awt.Color(0, 0, 0));
        NameLabel3.setText("Player 3:");
        add(NameLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 230, 30));

        NameLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NameLabel4.setForeground(new java.awt.Color(0, 0, 0));
        NameLabel4.setText("Player 4:");
        add(NameLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 230, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (!carouselSpinner1.isSpinningStarted) {
            carouselSpinner1.startAllAnimations();
        }
        Thread decrementThread = new Thread(() -> adjustSpinningSpeed());
        decrementThread.start();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NameLabel1;
    private javax.swing.JLabel NameLabel2;
    private javax.swing.JLabel NameLabel3;
    private javax.swing.JLabel NameLabel4;
    private javax.swing.JPanel carouselPanel;
    private com.blackflower.bingoll.customComponents.CarouselSpinner carouselSpinner1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel spinnerLine;
    private javax.swing.JPanel spinnerLine1;
    private javax.swing.JPanel spinnerLine2;
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

        for (int i = 0; i < GameManager.instance.players.size(); i++) {
            AbsoluteConstraints absConstraints = new AbsoluteConstraints((width + offsetX) * currentColumnCount + 60, (height + offsetY) * currentRowCount + 60, width, height);
            GameTableComponent newGameTable = new GameTableComponent(GameManager.instance.players.get(i));
            add(newGameTable, absConstraints);

            currentColumnCount++;
            if (currentColumnCount == maxColumnCount) {
                currentColumnCount = 0;
                currentRowCount++;
            }
        }

        switch (GameManager.instance.players.size()) {
            case 2:
                NameLabel1.setText(GameManager.instance.players.get(0).nickname);
                NameLabel2.setText(GameManager.instance.players.get(1).nickname);
                NameLabel3.setText("");
                NameLabel4.setText("");
                break;
            case 3:
                NameLabel1.setText(GameManager.instance.players.get(0).nickname);
                NameLabel2.setText(GameManager.instance.players.get(1).nickname);
                NameLabel3.setText(GameManager.instance.players.get(2).nickname);
                NameLabel4.setText("");
                break;
            case 4:
                NameLabel1.setText(GameManager.instance.players.get(0).nickname);
                NameLabel2.setText(GameManager.instance.players.get(1).nickname);
                NameLabel3.setText(GameManager.instance.players.get(2).nickname);
                NameLabel4.setText(GameManager.instance.players.get(3).nickname);
                break;
            default:
                throw new AssertionError();
        }
    }

    @Override
    public void onPageDisappear() {
        //gamePanel.removeAll();
    }

    private void adjustSpinningSpeed() {
        CarouselSpinner.slidingAmount = random.nextInt(80, 90);

        while (CarouselSpinner.slidingAmount > 0) {
            int decrement = (int) (Math.pow(CarouselSpinner.slidingAmount, 2) / 400); // Parabolic function (adjust the coefficient to control the rate of decrease)
            if (decrement < 1) {
                decrement = 1; // Ensure decrement is at least 1
            }

            CarouselSpinner.slidingAmount -= decrement;

            // Add a delay to slow down the decrementing process
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int selectedNum = carouselSpinner1.getSelectedNumber(new Point(360, 50));

        System.out.println("Selected: " + selectedNum);
        addLastSpin(selectedNum);
    }

    private void addLastSpin(int selectedNum) {
        if (lastSpinInfoAmount < lastSpinInfoMax) {
            lastNumbers.addFirst(selectedNum);
            lastSpins[lastSpinInfoMax - lastSpinInfoAmount - 1].setNumber(selectedNum);
            lastSpins[lastSpinInfoMax - lastSpinInfoAmount - 1].setVisible(true);
            lastSpinInfoAmount++;
        } else {
            lastNumbers.addFirst(selectedNum);
            for (int i = 0; i < lastSpins.length; i++) {
                lastSpins[i].setNumber(lastNumbers.get(i));
            }
        }

        lastNumber = selectedNum;
    }
}

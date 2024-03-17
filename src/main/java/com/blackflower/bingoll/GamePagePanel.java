package com.blackflower.bingoll;

import com.blackflower.bingoll.core.BingoLinkedList;
import com.blackflower.bingoll.core.GameManager;
import com.blackflower.bingoll.core.GameNumber;
import com.blackflower.bingoll.core.PlayerCard;
import com.blackflower.bingoll.customComponents.CardColor;
import com.blackflower.bingoll.customComponents.CarouselSpinner;
import com.blackflower.bingoll.customComponents.GameTableComponent;
import com.blackflower.bingoll.customComponents.NumberedCircleComponent;
import com.blackflower.bingoll.customComponents.Triangle;
import com.blackflower.bingoll.customComponents.VerticalLine;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.WindowEvent;
import java.util.Random;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author emirs
 */
public class GamePagePanel extends javax.swing.JPanel implements IPage {

    public static int lastNumber = -2;
    public int lastSpinInfoMax = 5;
    public int lastSpinInfoAmount;

    private int statusTextCount;

    private boolean autoPlay;
    private boolean repetition;

    Random random = new Random();

    NumberedCircleComponent lastSpins[] = new NumberedCircleComponent[lastSpinInfoMax];
    BingoLinkedList<Integer> lastNumbers = new BingoLinkedList<>();

    JRadioButton cinkoInfos[];
    JTextArea textAreas[];

    public GamePagePanel() {
        initComponents();

        spinnerLine.add(new Triangle(20, 20, Color.RED, false));
        spinnerLine1.add(new Triangle(20, 20, Color.RED, true));

        for (int i = 0; i < lastSpinInfoMax; i++) {
            NumberedCircleComponent lastSpin = new NumberedCircleComponent(25, CardColor.WHITE, new GameNumber(0));
            lastSpin.setHoverState(false);
            lastSpins[i] = lastSpin;
            add(lastSpin, new AbsoluteConstraints(905, 80 * (i + 1), 80, 80));
            this.setComponentZOrder(lastSpin, 0);
            lastSpin.setVisible(false);
        }

        JRadioButton tempCinkoInfos[] = {
            p1Cinko1,
            p1Cinko2,
            p1Cinko3,
            p2Cinko1,
            p2Cinko2,
            p2Cinko3,
            p3Cinko1,
            p3Cinko2,
            p3Cinko3,
            p4Cinko1,
            p4Cinko2,
            p4Cinko3,};

        cinkoInfos = tempCinkoInfos;

        JTextArea tempTextAreas[] = {
            statusTextArea1,
            statusTextArea2,
            statusTextArea3,
            statusTextArea4,
            statusTextArea5,
            statusTextArea6,
            statusTextArea7,
            statusTextArea8,};

        textAreas = tempTextAreas;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fastSpinButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        statusTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        statusTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        statusTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        statusTextArea4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        statusTextArea5 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        statusTextArea6 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        statusTextArea7 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        statusTextArea8 = new javax.swing.JTextArea();
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
        p1Cinko3 = new javax.swing.JRadioButton();
        p1Cinko1 = new javax.swing.JRadioButton();
        p1Cinko2 = new javax.swing.JRadioButton();
        p2Cinko1 = new javax.swing.JRadioButton();
        p2Cinko2 = new javax.swing.JRadioButton();
        p2Cinko3 = new javax.swing.JRadioButton();
        p3Cinko1 = new javax.swing.JRadioButton();
        p3Cinko2 = new javax.swing.JRadioButton();
        p3Cinko3 = new javax.swing.JRadioButton();
        p4Cinko1 = new javax.swing.JRadioButton();
        p4Cinko2 = new javax.swing.JRadioButton();
        p4Cinko3 = new javax.swing.JRadioButton();
        spinButton1 = new javax.swing.JButton();
        repetitionCheckBox = new javax.swing.JCheckBox();
        autoPlayCheckBox = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        quitButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(204, 204, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fastSpinButton.setText("Fast Spin");
        fastSpinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fastSpinButtonActionPerformed(evt);
            }
        });
        add(fastSpinButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 90, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Status");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 20, 170, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(8, 1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setOpaque(false);

        statusTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        statusTextArea1.setColumns(25);
        statusTextArea1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        statusTextArea1.setLineWrap(true);
        statusTextArea1.setRows(5);
        statusTextArea1.setTabSize(5);
        statusTextArea1.setText("\"PLAYER 1\" status updated to BIRINCI_CINKO");
        statusTextArea1.setWrapStyleWord(true);
        statusTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        statusTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(statusTextArea1);

        jPanel2.add(jScrollPane1);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setOpaque(false);
        jScrollPane2.setRowHeaderView(null);

        statusTextArea2.setBackground(new java.awt.Color(255, 255, 255));
        statusTextArea2.setColumns(25);
        statusTextArea2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        statusTextArea2.setLineWrap(true);
        statusTextArea2.setRows(5);
        statusTextArea2.setTabSize(5);
        statusTextArea2.setText("\"PLAYER 1\" status updated to BIRINCI_CINKO");
        statusTextArea2.setWrapStyleWord(true);
        statusTextArea2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        statusTextArea2.setEnabled(false);
        jScrollPane2.setViewportView(statusTextArea2);

        jPanel2.add(jScrollPane2);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane3.setOpaque(false);
        jScrollPane3.setRowHeaderView(null);

        statusTextArea3.setBackground(new java.awt.Color(255, 255, 255));
        statusTextArea3.setColumns(25);
        statusTextArea3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        statusTextArea3.setLineWrap(true);
        statusTextArea3.setRows(5);
        statusTextArea3.setTabSize(5);
        statusTextArea3.setText("\"PLAYER 1\" status updated to BIRINCI_CINKO");
        statusTextArea3.setWrapStyleWord(true);
        statusTextArea3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        statusTextArea3.setEnabled(false);
        jScrollPane3.setViewportView(statusTextArea3);

        jPanel2.add(jScrollPane3);

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane4.setOpaque(false);
        jScrollPane4.setRowHeaderView(null);

        statusTextArea4.setBackground(new java.awt.Color(255, 255, 255));
        statusTextArea4.setColumns(25);
        statusTextArea4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        statusTextArea4.setLineWrap(true);
        statusTextArea4.setRows(5);
        statusTextArea4.setTabSize(5);
        statusTextArea4.setText("\"PLAYER 1\" status updated to BIRINCI_CINKO");
        statusTextArea4.setWrapStyleWord(true);
        statusTextArea4.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        statusTextArea4.setEnabled(false);
        jScrollPane4.setViewportView(statusTextArea4);

        jPanel2.add(jScrollPane4);

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane5.setOpaque(false);
        jScrollPane5.setRowHeaderView(null);

        statusTextArea5.setBackground(new java.awt.Color(255, 255, 255));
        statusTextArea5.setColumns(25);
        statusTextArea5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        statusTextArea5.setLineWrap(true);
        statusTextArea5.setRows(5);
        statusTextArea5.setTabSize(5);
        statusTextArea5.setText("\"PLAYER 1\" status updated to BIRINCI_CINKO");
        statusTextArea5.setWrapStyleWord(true);
        statusTextArea5.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        statusTextArea5.setEnabled(false);
        jScrollPane5.setViewportView(statusTextArea5);

        jPanel2.add(jScrollPane5);

        jScrollPane6.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane6.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane6.setOpaque(false);
        jScrollPane6.setRowHeaderView(null);

        statusTextArea6.setBackground(new java.awt.Color(255, 255, 255));
        statusTextArea6.setColumns(25);
        statusTextArea6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        statusTextArea6.setLineWrap(true);
        statusTextArea6.setRows(5);
        statusTextArea6.setTabSize(5);
        statusTextArea6.setText("\"PLAYER 1\" status updated to BIRINCI_CINKO");
        statusTextArea6.setWrapStyleWord(true);
        statusTextArea6.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        statusTextArea6.setEnabled(false);
        jScrollPane6.setViewportView(statusTextArea6);

        jPanel2.add(jScrollPane6);

        jScrollPane7.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane7.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane7.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane7.setOpaque(false);
        jScrollPane7.setRowHeaderView(null);

        statusTextArea7.setBackground(new java.awt.Color(255, 255, 255));
        statusTextArea7.setColumns(25);
        statusTextArea7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        statusTextArea7.setLineWrap(true);
        statusTextArea7.setRows(5);
        statusTextArea7.setTabSize(5);
        statusTextArea7.setText("\"PLAYER 1\" status updated to BIRINCI_CINKO");
        statusTextArea7.setWrapStyleWord(true);
        statusTextArea7.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        statusTextArea7.setEnabled(false);
        jScrollPane7.setViewportView(statusTextArea7);

        jPanel2.add(jScrollPane7);

        jScrollPane8.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane8.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane8.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane8.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane8.setOpaque(false);
        jScrollPane8.setRowHeaderView(null);

        statusTextArea8.setBackground(new java.awt.Color(255, 255, 255));
        statusTextArea8.setColumns(25);
        statusTextArea8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        statusTextArea8.setLineWrap(true);
        statusTextArea8.setRows(5);
        statusTextArea8.setTabSize(5);
        statusTextArea8.setText("\"PLAYER 1\" status updated to BIRINCI_CINKO");
        statusTextArea8.setWrapStyleWord(true);
        statusTextArea8.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        statusTextArea8.setEnabled(false);
        jScrollPane8.setViewportView(statusTextArea8);

        jPanel2.add(jScrollPane8);

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 80, 170, 400));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 80, 90, 400));

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

        p1Cinko3.setBackground(new java.awt.Color(255, 255, 255));
        p1Cinko3.setForeground(new java.awt.Color(255, 0, 0));
        p1Cinko3.setEnabled(false);
        p1Cinko3.setMaximumSize(new java.awt.Dimension(30, 30));
        p1Cinko3.setMinimumSize(new java.awt.Dimension(20, 20));
        add(p1Cinko3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        p1Cinko1.setBackground(new java.awt.Color(255, 255, 255));
        p1Cinko1.setForeground(new java.awt.Color(255, 0, 0));
        p1Cinko1.setEnabled(false);
        p1Cinko1.setMaximumSize(new java.awt.Dimension(50, 50));
        p1Cinko1.setMinimumSize(new java.awt.Dimension(20, 20));
        p1Cinko1.setPreferredSize(new java.awt.Dimension(30, 30));
        add(p1Cinko1, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 30, 20, 20));

        p1Cinko2.setBackground(new java.awt.Color(255, 255, 255));
        p1Cinko2.setForeground(new java.awt.Color(255, 0, 0));
        p1Cinko2.setEnabled(false);
        p1Cinko2.setMaximumSize(new java.awt.Dimension(30, 30));
        p1Cinko2.setMinimumSize(new java.awt.Dimension(20, 20));
        add(p1Cinko2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        p2Cinko1.setBackground(new java.awt.Color(255, 255, 255));
        p2Cinko1.setForeground(new java.awt.Color(255, 0, 0));
        p2Cinko1.setEnabled(false);
        p2Cinko1.setMaximumSize(new java.awt.Dimension(50, 50));
        p2Cinko1.setMinimumSize(new java.awt.Dimension(20, 20));
        p2Cinko1.setPreferredSize(new java.awt.Dimension(30, 30));
        add(p2Cinko1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 20, 20));

        p2Cinko2.setBackground(new java.awt.Color(255, 255, 255));
        p2Cinko2.setForeground(new java.awt.Color(255, 0, 0));
        p2Cinko2.setEnabled(false);
        p2Cinko2.setMaximumSize(new java.awt.Dimension(30, 30));
        p2Cinko2.setMinimumSize(new java.awt.Dimension(20, 20));
        add(p2Cinko2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, -1, -1));

        p2Cinko3.setBackground(new java.awt.Color(255, 255, 255));
        p2Cinko3.setForeground(new java.awt.Color(255, 0, 0));
        p2Cinko3.setEnabled(false);
        p2Cinko3.setMaximumSize(new java.awt.Dimension(30, 30));
        p2Cinko3.setMinimumSize(new java.awt.Dimension(20, 20));
        add(p2Cinko3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, -1, -1));

        p3Cinko1.setBackground(new java.awt.Color(255, 255, 255));
        p3Cinko1.setForeground(new java.awt.Color(255, 0, 0));
        p3Cinko1.setEnabled(false);
        p3Cinko1.setMaximumSize(new java.awt.Dimension(50, 50));
        p3Cinko1.setMinimumSize(new java.awt.Dimension(20, 20));
        p3Cinko1.setPreferredSize(new java.awt.Dimension(30, 30));
        add(p3Cinko1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 20, 20));

        p3Cinko2.setBackground(new java.awt.Color(255, 255, 255));
        p3Cinko2.setForeground(new java.awt.Color(255, 0, 0));
        p3Cinko2.setEnabled(false);
        p3Cinko2.setMaximumSize(new java.awt.Dimension(30, 30));
        p3Cinko2.setMinimumSize(new java.awt.Dimension(20, 20));
        add(p3Cinko2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));

        p3Cinko3.setBackground(new java.awt.Color(255, 255, 255));
        p3Cinko3.setForeground(new java.awt.Color(255, 0, 0));
        p3Cinko3.setEnabled(false);
        p3Cinko3.setMaximumSize(new java.awt.Dimension(30, 30));
        p3Cinko3.setMinimumSize(new java.awt.Dimension(20, 20));
        add(p3Cinko3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        p4Cinko1.setBackground(new java.awt.Color(255, 255, 255));
        p4Cinko1.setForeground(new java.awt.Color(255, 0, 0));
        p4Cinko1.setEnabled(false);
        p4Cinko1.setMaximumSize(new java.awt.Dimension(50, 50));
        p4Cinko1.setMinimumSize(new java.awt.Dimension(20, 20));
        p4Cinko1.setPreferredSize(new java.awt.Dimension(30, 30));
        add(p4Cinko1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, 20, 20));

        p4Cinko2.setBackground(new java.awt.Color(255, 255, 255));
        p4Cinko2.setForeground(new java.awt.Color(255, 0, 0));
        p4Cinko2.setEnabled(false);
        p4Cinko2.setMaximumSize(new java.awt.Dimension(30, 30));
        p4Cinko2.setMinimumSize(new java.awt.Dimension(20, 20));
        add(p4Cinko2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 200, -1, -1));

        p4Cinko3.setBackground(new java.awt.Color(255, 255, 255));
        p4Cinko3.setForeground(new java.awt.Color(255, 0, 0));
        p4Cinko3.setEnabled(false);
        p4Cinko3.setMaximumSize(new java.awt.Dimension(30, 30));
        p4Cinko3.setMinimumSize(new java.awt.Dimension(20, 20));
        add(p4Cinko3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 200, -1, -1));

        spinButton1.setText("Spin");
        spinButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spinButton1ActionPerformed(evt);
            }
        });
        add(spinButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, 100, 30));

        repetitionCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        repetitionCheckBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        repetitionCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        repetitionCheckBox.setText("Allow Repetition");
        repetitionCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        repetitionCheckBox.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        repetitionCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repetitionCheckBoxActionPerformed(evt);
            }
        });
        add(repetitionCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 530, 170, 30));

        autoPlayCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        autoPlayCheckBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        autoPlayCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        autoPlayCheckBox.setText("Auto Play");
        autoPlayCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoPlayCheckBoxActionPerformed(evt);
            }
        });
        add(autoPlayCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, 210, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Last Spins");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 130, 30));

        quitButton.setText("Quit Game");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });
        add(quitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 530, 130, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void fastSpinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fastSpinButtonActionPerformed
        if (carouselSpinner1.isSpinningStarted) {
            return;
        }

        if (!repetition && lastNumbers.size() < 90) {
            int randomNumber = random.nextInt(1, 91);
            while (lastNumbers.contains(randomNumber)) {
                randomNumber = random.nextInt(1, 91);
            }
            addLastSpin(randomNumber);
        } else {
            addLastSpin(random.nextInt(1, 91));
        }

        if (lastNumbers.size() > 90) {
            repetitionCheckBox.setSelected(true);
        }
    }//GEN-LAST:event_fastSpinButtonActionPerformed

    private void spinButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spinButton1ActionPerformed
        // TODO add your handling code here:
        if (!carouselSpinner1.isSpinningStarted) {
            carouselSpinner1.startAllAnimations();
        } else {
            return;
        }
        Thread decrementThread = new Thread(() -> adjustSpinningSpeed());
        decrementThread.start();
    }//GEN-LAST:event_spinButton1ActionPerformed

    private void repetitionCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repetitionCheckBoxActionPerformed
        // TODO add your handling code here:
        repetition = repetitionCheckBox.isSelected();
    }//GEN-LAST:event_repetitionCheckBoxActionPerformed

    private void autoPlayCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoPlayCheckBoxActionPerformed
        // TODO add your handling code here:
        autoPlay = autoPlayCheckBox.isSelected();
    }//GEN-LAST:event_autoPlayCheckBoxActionPerformed

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        // TODO add your handling code here:
        MainFrame.instance.dispatchEvent(new WindowEvent(MainFrame.instance, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_quitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NameLabel1;
    private javax.swing.JLabel NameLabel2;
    private javax.swing.JLabel NameLabel3;
    private javax.swing.JLabel NameLabel4;
    private javax.swing.JCheckBox autoPlayCheckBox;
    private javax.swing.JPanel carouselPanel;
    private com.blackflower.bingoll.customComponents.CarouselSpinner carouselSpinner1;
    private javax.swing.JButton fastSpinButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JRadioButton p1Cinko1;
    private javax.swing.JRadioButton p1Cinko2;
    private javax.swing.JRadioButton p1Cinko3;
    private javax.swing.JRadioButton p2Cinko1;
    private javax.swing.JRadioButton p2Cinko2;
    private javax.swing.JRadioButton p2Cinko3;
    private javax.swing.JRadioButton p3Cinko1;
    private javax.swing.JRadioButton p3Cinko2;
    private javax.swing.JRadioButton p3Cinko3;
    private javax.swing.JRadioButton p4Cinko1;
    private javax.swing.JRadioButton p4Cinko2;
    private javax.swing.JRadioButton p4Cinko3;
    private javax.swing.JButton quitButton;
    private javax.swing.JCheckBox repetitionCheckBox;
    private javax.swing.JButton spinButton1;
    private javax.swing.JPanel spinnerLine;
    private javax.swing.JPanel spinnerLine1;
    private javax.swing.JPanel spinnerLine2;
    private javax.swing.JTextArea statusTextArea1;
    private javax.swing.JTextArea statusTextArea2;
    private javax.swing.JTextArea statusTextArea3;
    private javax.swing.JTextArea statusTextArea4;
    private javax.swing.JTextArea statusTextArea5;
    private javax.swing.JTextArea statusTextArea6;
    private javax.swing.JTextArea statusTextArea7;
    private javax.swing.JTextArea statusTextArea8;
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

        for (JTextArea textArea : textAreas) {
            textArea.setText("");
            textArea.setVisible(false);
        }

        for (int i = 0; i < GameManager.instance.players.size(); i++) {
            AbsoluteConstraints absConstraints = new AbsoluteConstraints((width + offsetX) * currentColumnCount + 60, (height + offsetY) * currentRowCount + 60, width, height);
            GameTableComponent newGameTable = new GameTableComponent(GameManager.instance.players.get(i));
            add(newGameTable, absConstraints);

            currentColumnCount++;
            if (currentColumnCount == maxColumnCount) {
                currentColumnCount = 0;
                currentRowCount++;
            }

            insertStatusUpdate("'" + GameManager.instance.players.get(i).nickname + "' Has just started the game. Good luck!");
        }

        //<editor-fold defaultstate="collapsed" desc="PLEASE DONT UNFOLD THIS PART! NOTHING IMPORTENT...">
        PLEASEHIDETHISMETHOD();
        //</editor-fold>
    }

    public void insertStatusUpdate(PlayerCard card) {
        String updateText = "'" + card.nickname.toUpperCase()
                + "' has updated status to " + card.status;

        updateStatusText(updateText);
    }

    public void insertStatusUpdate(String updateText) {
        updateStatusText(updateText);
    }
    
    private void updateStatusText(String updateText){
        if (statusTextCount < textAreas.length) {
            for (int i = statusTextCount; i > 0; i--) {
                textAreas[i].setText(textAreas[i-1].getText());
            }
            textAreas[0].setText(updateText);
            textAreas[statusTextCount].setVisible(true);
            statusTextCount++;
        } else {
            for (int i = textAreas.length - 1; i > 0; i--) {
                textAreas[i].setText(textAreas[i-1].getText());
            }

            textAreas[0].setText(updateText);
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
        carouselSpinner1.isSpinningStarted = false;
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

        if (autoPlay) {
            GameManager.instance.checkGameStatus(autoPlay);
            updateCinkos();
            repaint();
        }

    }

    public void updateCinkos() {
        for (int i = 0; i < GameManager.instance.players.size(); i++) {
            PlayerCard card = GameManager.instance.players.get(i);

            for (int j = 0; j < card.cinkoCount; j++) {
                cinkoInfos[(i * 3) + j].setSelected(true);
            }
        }
    }

    private void PLEASEHIDETHISMETHOD() {
        switch (GameManager.instance.players.size()) {
            case 2 -> {
                NameLabel1.setText(GameManager.instance.players.get(0).nickname);
                NameLabel2.setText(GameManager.instance.players.get(1).nickname);
                NameLabel3.setText("");
                NameLabel4.setText("");

                p1Cinko1.setVisible(true);
                p1Cinko2.setVisible(true);
                p1Cinko3.setVisible(true);
                p2Cinko1.setVisible(true);
                p2Cinko2.setVisible(true);
                p2Cinko3.setVisible(true);

                p3Cinko1.setVisible(false);
                p3Cinko2.setVisible(false);
                p3Cinko3.setVisible(false);
                p4Cinko1.setVisible(false);
                p4Cinko2.setVisible(false);
                p4Cinko3.setVisible(false);
            }
            case 3 -> {
                NameLabel1.setText(GameManager.instance.players.get(0).nickname);
                NameLabel2.setText(GameManager.instance.players.get(1).nickname);
                NameLabel3.setText(GameManager.instance.players.get(2).nickname);
                NameLabel4.setText("");

                p1Cinko1.setVisible(true);
                p1Cinko2.setVisible(true);
                p1Cinko3.setVisible(true);
                p2Cinko1.setVisible(true);
                p2Cinko2.setVisible(true);
                p2Cinko3.setVisible(true);
                p3Cinko1.setVisible(true);
                p3Cinko2.setVisible(true);
                p3Cinko3.setVisible(true);

                p4Cinko1.setVisible(false);
                p4Cinko2.setVisible(false);
                p4Cinko3.setVisible(false);
            }
            case 4 -> {
                NameLabel1.setText(GameManager.instance.players.get(0).nickname);
                NameLabel2.setText(GameManager.instance.players.get(1).nickname);
                NameLabel3.setText(GameManager.instance.players.get(2).nickname);
                NameLabel4.setText(GameManager.instance.players.get(3).nickname);

                p1Cinko1.setVisible(true);
                p1Cinko2.setVisible(true);
                p1Cinko3.setVisible(true);
                p2Cinko1.setVisible(true);
                p2Cinko2.setVisible(true);
                p2Cinko3.setVisible(true);
                p3Cinko1.setVisible(true);
                p3Cinko2.setVisible(true);
                p3Cinko3.setVisible(true);
                p4Cinko1.setVisible(true);
                p4Cinko2.setVisible(true);
                p4Cinko3.setVisible(true);
            }
            default ->
                throw new AssertionError();
        }
    }
}

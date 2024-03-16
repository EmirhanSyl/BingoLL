package com.blackflower.bingoll;

import com.blackflower.bingoll.core.GameManager;
import com.blackflower.bingoll.customComponents.CardColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Timer;

/**
 *
 * @author emirs
 */
public class StartingPagePanel extends javax.swing.JPanel implements IPage {

    public StartingPagePanel() {
        initComponents();

        DefaultComboBoxModel<CardColor> model1 = new DefaultComboBoxModel<>(CardColor.COLORS);
        p1ThemeCB.setModel(model1);
        DefaultComboBoxModel<CardColor> model2 = new DefaultComboBoxModel<>(CardColor.COLORS);
        p2ThemeCB.setModel(model2);
        DefaultComboBoxModel<CardColor> model3 = new DefaultComboBoxModel<>(CardColor.COLORS);
        p3ThemeCB.setModel(model3);
        DefaultComboBoxModel<CardColor> model4 = new DefaultComboBoxModel<>(CardColor.COLORS);
        p4ThemeCB.setModel(model4);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        playerCountSpinner = new javax.swing.JSpinner();
        startGameButton = new javax.swing.JButton();
        p1NameLabel = new javax.swing.JLabel();
        p1NameTextField = new javax.swing.JTextField();
        p1CardThemeLabel = new javax.swing.JLabel();
        p1ThemeCB = new javax.swing.JComboBox<>();
        p2NameLabel = new javax.swing.JLabel();
        p2NameTextField = new javax.swing.JTextField();
        p2CardThemeLabel = new javax.swing.JLabel();
        p2ThemeCB = new javax.swing.JComboBox<>();
        p4ThemeCB = new javax.swing.JComboBox<>();
        p3NameLabel = new javax.swing.JLabel();
        p3NameTextField = new javax.swing.JTextField();
        p3CardThemeLabel = new javax.swing.JLabel();
        p3ThemeCB = new javax.swing.JComboBox<>();
        p4NameLabel = new javax.swing.JLabel();
        p4NameTextField = new javax.swing.JTextField();
        p4CardThemeLabel = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome To BingoLL");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Select player count:");

        playerCountSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                playerCountSpinnerStateChanged(evt);
            }
        });

        startGameButton.setText("Start Game");
        startGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGameButtonActionPerformed(evt);
            }
        });

        p1NameLabel.setText("Player 1 Name:");

        p1NameTextField.setText("Player 1");

        p1CardThemeLabel.setText("Player 1 Card Theme:");

        p2NameLabel.setText("Player 2 Name:");

        p2NameTextField.setText("Player 2");

        p2CardThemeLabel.setText("Player 2 Card Theme:");

        p3NameLabel.setText("Player 3 Name:");

        p3NameTextField.setText("Player 3");

        p3CardThemeLabel.setText("Player 3 Card Theme:");

        p4NameLabel.setText("Player 4 Name:");

        p4NameTextField.setText("Player 4");

        p4CardThemeLabel.setText("Player 4 Card Theme:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(p4NameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(p4NameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(p3NameTextField)
                            .addComponent(p3NameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(p4CardThemeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(p4ThemeCB, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(p3CardThemeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(p3ThemeCB, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(p1NameTextField)
                                .addComponent(p1NameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                            .addComponent(p2NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p2NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 445, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(playerCountSpinner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(p2CardThemeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(p2ThemeCB, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(p1CardThemeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(p1ThemeCB, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(222, 222, 222))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(469, 469, 469)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(493, 493, 493)
                        .addComponent(startGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerCountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p1NameLabel)
                    .addComponent(p1CardThemeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p1NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1ThemeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p2NameLabel)
                    .addComponent(p2CardThemeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p2NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2ThemeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p3NameLabel)
                    .addComponent(p3CardThemeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p3NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p3ThemeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p4NameLabel)
                    .addComponent(p4CardThemeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p4NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p4ThemeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(startGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void startGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGameButtonActionPerformed
        // TODO add your handling code here:

        switch ((int) playerCountSpinner.getValue()) {
            case 2 -> {
                GameManager.instance.addPlayer(p1NameTextField.getText(), (CardColor) p1ThemeCB.getSelectedItem());
                GameManager.instance.addPlayer(p2NameTextField.getText(), (CardColor) p2ThemeCB.getSelectedItem());
            }
            case 3 -> {
                GameManager.instance.addPlayer(p1NameTextField.getText(), (CardColor) p1ThemeCB.getSelectedItem());
                GameManager.instance.addPlayer(p2NameTextField.getText(), (CardColor) p2ThemeCB.getSelectedItem());
                GameManager.instance.addPlayer(p3NameTextField.getText(), (CardColor) p3ThemeCB.getSelectedItem());
            }
            case 4 -> {
                GameManager.instance.addPlayer(p1NameTextField.getText(), (CardColor) p1ThemeCB.getSelectedItem());
                GameManager.instance.addPlayer(p2NameTextField.getText(), (CardColor) p2ThemeCB.getSelectedItem());
                GameManager.instance.addPlayer(p3NameTextField.getText(), (CardColor) p3ThemeCB.getSelectedItem());
                GameManager.instance.addPlayer(p4NameTextField.getText(), (CardColor) p4ThemeCB.getSelectedItem());
            }
            default -> throw new AssertionError();
        }

        MainFrame.instance.setPage(MainFrame.instance.gamePage);
    }//GEN-LAST:event_startGameButtonActionPerformed

    private void playerCountSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_playerCountSpinnerStateChanged
        // TODO add your handling code here:
        if ((int) playerCountSpinner.getValue() >= 4) {
            playerCountSpinner.setValue(4);
        } else if ((int) playerCountSpinner.getValue() <= 2) {
            playerCountSpinner.setValue(2);
        }

        switch ((int) playerCountSpinner.getValue()) {
            case 2 -> {
                p3CardThemeLabel.setVisible(false);
                p3NameLabel.setVisible(false);
                p3NameTextField.setVisible(false);
                p3ThemeCB.setVisible(false);

                p4CardThemeLabel.setVisible(false);
                p4NameLabel.setVisible(false);
                p4NameTextField.setVisible(false);
                p4ThemeCB.setVisible(false);
            }
            case 3 -> {
                p3CardThemeLabel.setVisible(true);
                p3NameLabel.setVisible(true);
                p3NameTextField.setVisible(true);
                p3ThemeCB.setVisible(true);

                p4CardThemeLabel.setVisible(false);
                p4NameLabel.setVisible(false);
                p4NameTextField.setVisible(false);
                p4ThemeCB.setVisible(false);
            }
            case 4 -> {
                p3CardThemeLabel.setVisible(true);
                p3NameLabel.setVisible(true);
                p3NameTextField.setVisible(true);
                p3ThemeCB.setVisible(true);

                p4CardThemeLabel.setVisible(true);
                p4NameLabel.setVisible(true);
                p4NameTextField.setVisible(true);
                p4ThemeCB.setVisible(true);
            }
            default ->
                throw new AssertionError();
        }
    }//GEN-LAST:event_playerCountSpinnerStateChanged

    @Override
    public void onPageSetted() {
        playerCountSpinner.setValue(2);
    }

    @Override
    public void onPageDisappear() {
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel p1CardThemeLabel;
    private javax.swing.JLabel p1NameLabel;
    private javax.swing.JTextField p1NameTextField;
    private javax.swing.JComboBox<CardColor> p1ThemeCB;
    private javax.swing.JLabel p2CardThemeLabel;
    private javax.swing.JLabel p2NameLabel;
    private javax.swing.JTextField p2NameTextField;
    private javax.swing.JComboBox<CardColor> p2ThemeCB;
    private javax.swing.JLabel p3CardThemeLabel;
    private javax.swing.JLabel p3NameLabel;
    private javax.swing.JTextField p3NameTextField;
    private javax.swing.JComboBox<CardColor> p3ThemeCB;
    private javax.swing.JLabel p4CardThemeLabel;
    private javax.swing.JLabel p4NameLabel;
    private javax.swing.JTextField p4NameTextField;
    private javax.swing.JComboBox<CardColor> p4ThemeCB;
    private javax.swing.JSpinner playerCountSpinner;
    private javax.swing.JButton startGameButton;
    // End of variables declaration//GEN-END:variables
}

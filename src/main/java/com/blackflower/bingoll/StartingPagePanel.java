package com.blackflower.bingoll;

/**
 *
 * @author emirs
 */
public class StartingPagePanel extends javax.swing.JPanel implements IPage{

    public StartingPagePanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        playerCountSpinner = new javax.swing.JSpinner();
        startGameButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome To BingoLL");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(playerCountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(469, 469, 469)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(506, 506, 506)
                        .addComponent(startGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(501, Short.MAX_VALUE))
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
                .addGap(110, 110, 110)
                .addComponent(startGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void startGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGameButtonActionPerformed
        // TODO add your handling code here:
        MainFrame.instance.gamePage.setPlayerCount((int)playerCountSpinner.getValue());
        MainFrame.instance.setPage(MainFrame.instance.gamePage);
    }//GEN-LAST:event_startGameButtonActionPerformed

    private void playerCountSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_playerCountSpinnerStateChanged
        // TODO add your handling code here:
        if ((int)playerCountSpinner.getValue() >= 4) {
            playerCountSpinner.setValue(4);
        }else if((int)playerCountSpinner.getValue() <= 2){
            playerCountSpinner.setValue(2);
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
    private javax.swing.JSpinner playerCountSpinner;
    private javax.swing.JButton startGameButton;
    // End of variables declaration//GEN-END:variables
}

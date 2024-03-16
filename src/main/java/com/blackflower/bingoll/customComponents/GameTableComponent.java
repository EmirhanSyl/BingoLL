package com.blackflower.bingoll.customComponents;

import com.blackflower.bingoll.core.BingoLinkedList;
import com.blackflower.bingoll.core.PlayerCard;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author emirs
 */
public class GameTableComponent extends javax.swing.JPanel {

    PlayerCard playerCard;

    public GameTableComponent() {
        initComponents();

        this.setPreferredSize(new Dimension(370, 125));
        GridLayout layout = (GridLayout) this.getLayout();
        layout.setColumns(9);
        layout.setRows(3);
        layout.setHgap(0);
        layout.setVgap(0);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                JPanel cell = new JPanel();
                cell.setPreferredSize(new Dimension(40, 40));
                CardLayout cardLayout = new CardLayout(0, 0);
                cell.setLayout(cardLayout);
                //cell.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                CircleComponent newCircle = new CircleComponent(19, CardColor.PURPLE);
                cell.add(newCircle);
                add(cell);
            }
            JPanel cell = new JPanel();
            cell.setPreferredSize(new Dimension(40, 40));
            CardLayout cardLayout = new CardLayout(0, 0);
            cell.setLayout(cardLayout);
            //cell.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            NumberedCircleComponent newCircle = new NumberedCircleComponent(19, CardColor.PURPLE, i * 5);
            cell.add(newCircle);
            add(cell);
        }
    }

    public GameTableComponent(PlayerCard playerCard) {
        initComponents();

        this.playerCard = playerCard;

        this.setPreferredSize(new Dimension(370, 125));
        GridLayout layout = (GridLayout) this.getLayout();
        layout.setColumns(9);
        layout.setRows(3);
        layout.setHgap(0);
        layout.setVgap(0);

        int numberIndex = 0;
        int number = playerCard.cardNumbersLL.get(numberIndex).getNumber();
        int numberColumnIndex = (Math.floorDiv(number, 10));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                Component circle;

                if (numberColumnIndex == j) {
                    circle = new NumberedCircleComponent(19, playerCard.cardColor, number);
                    numberIndex++;
                    if (numberIndex < playerCard.cardNumbersLL.size()) {
                        number = playerCard.cardNumbersLL.get(numberIndex).getNumber();
                        numberColumnIndex = (Math.floorDiv(number, 10));
                    }
                } else {
                    circle = new CircleComponent(19, playerCard.cardColor);
                }

                JPanel cell = new JPanel();
                cell.setPreferredSize(new Dimension(40, 40));
                CardLayout cardLayout = new CardLayout(0, 0);
                cell.setLayout(cardLayout);

                cell.add(circle);
                add(cell);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.GridLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

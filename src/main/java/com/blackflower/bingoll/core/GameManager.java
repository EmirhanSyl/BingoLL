package com.blackflower.bingoll.core;

import com.blackflower.bingoll.GamePagePanel;
import com.blackflower.bingoll.MainFrame;
import com.blackflower.bingoll.customComponents.CardColor;
import java.util.Random;

/**
 *
 * @author emirs
 */
public class GameManager {

    public static GameManager instance = new GameManager();
    public static int[][] player1Card = { 
        {-1, 14, -1, 36, 41, -1, -1, 74, 86}, 
        {6, -1, -1, 33, -1, 57, 68, 70, -1}, 
        {-1, 10, 28, -1, 49, 54, -1, -1, 89} 
    };
    
    public static int[][] player2Card;
    public static int[][] player3Card;
    public static int[][] player4Card;

    public BingoLinkedList<PlayerCard> players = new BingoLinkedList<>();
    Random random = new Random();

    public GameManager() {

    }

    public void checkGameStatus(boolean autoPlay) {
        for (int i = 0; i < players.size(); i++) {
            if (autoPlay) {
                players.get(i).checkCard(GamePagePanel.lastNumber);
            } else {
                players.get(i).checkCinko();
                MainFrame.instance.gamePage.updateCinkos();
            }

        }

        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).status == PlayerCard.PLAYER_STATUS.TOMBALA) {
                finishGame(players.get(i));
            }
        }
    }

    public void finishGame(PlayerCard winner) {
        // show the winner and finish the game...
    }

    public BingoLinkedList<GameNumber> createCardNumbers() {
        BingoLinkedList<GameNumber> bll = new BingoLinkedList<>();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                int origin = (j == 0) ? 1 : ((Math.floorDiv(bll.getLast().getNumber(), 10) + 1) * 10);
                int boundry = (5 + j) * 10;

                int num = random.nextInt(origin, boundry);
                GameNumber gameNumber = new GameNumber(num);
                if (bll.contains(gameNumber)) {
                    j--;
                    continue;
                }

                bll.addLast(gameNumber);
            }
        }

        return bll;
    }

    public BingoLinkedList<GameNumber> convertArrayToCard(int[][] matrix) {
        BingoLinkedList<GameNumber> bll = new BingoLinkedList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != -1) {
                    bll.addLast(new GameNumber(matrix[i][j]));
                }
            }
        }

        return bll;
    }

    public void addPlayer(String name, CardColor cardColor) {
        BingoLinkedList<GameNumber> card;
        switch (players.size()) {
            case 0 -> card = (player1Card == null) ? createCardNumbers() : convertArrayToCard(player1Card);
            case 1 -> card = (player2Card == null) ? createCardNumbers() : convertArrayToCard(player2Card);
            case 2 -> card = (player3Card == null) ? createCardNumbers() : convertArrayToCard(player3Card);
            case 3 -> card = (player4Card == null) ? createCardNumbers() : convertArrayToCard(player4Card);
            default -> card = createCardNumbers();
        }
        PlayerCard pCard = new PlayerCard(players.size(), name, cardColor, card);
        players.addLast(pCard);
    }

}

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
    
    public BingoLinkedList<PlayerCard> players = new BingoLinkedList<>();
    Random random = new Random();

    public GameManager() {
        
        /*if (instance == null) {
            instance = new GameManager();
        }*/
    }

    public void startGame(int playerCount){
        // Starts the game
    }
    
    public void spinTheWheel(){
        // spins the wheel
    }
    
    public void checkGameStatus(boolean autoPlay){
        for (int i = 0; i < players.size(); i++) {
            if (autoPlay) {
                players.get(i).checkCard(GamePagePanel.lastNumber);
            }else{
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
    
    public void finishGame(PlayerCard winner){
        // show the winner and finish the game...
    }
    
    public BingoLinkedList<GameNumber> createCardNumbers(){
        BingoLinkedList<GameNumber> bll = new BingoLinkedList<>();
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                int origin = (j == 0) ? 1 : ((Math.floorDiv(bll.getLast().getNumber(), 10) + 1) * 10);
                int boundry = (5+j)*10;
                
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
    
    public void addPlayer(String name, CardColor cardColor){
        PlayerCard pCard = new PlayerCard(players.size(), name, cardColor, createCardNumbers());
        players.addLast(pCard);
    }
    
}

package com.blackflower.bingoll.core;

import com.blackflower.bingoll.customComponents.CardColor;
import java.awt.Color;
import java.util.LinkedList;
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
    
    public void checkGameStatus(){
        // checks all the players status in the game
    }
    
    public void finishGame(){
        // show the winner and finish the game...
    }
    
    public BingoLinkedList<Integer> createCardNumbers(){
        BingoLinkedList<Integer> bll = new BingoLinkedList<>();
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                int origin = (j == 0) ? 1 : (Math.ceilDiv(bll.getLast(), 10) * 10);
                int boundry = (5+j)*10;
                
                int num = random.nextInt(origin, boundry);
                if (bll.contains(num)) {
                    j--;
                    continue;
                }
                
                System.out.println(num);
                bll.addLast(num);
            }
            System.out.println("NEW ROW");
        }
        
        return bll;
    }
    
    public void addPlayer(String name, CardColor cardColor){
        PlayerCard pCard = new PlayerCard(players.size(), name, cardColor, createCardNumbers());
        players.addLast(pCard);
    }
    
}

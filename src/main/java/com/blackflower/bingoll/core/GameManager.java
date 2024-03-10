package com.blackflower.bingoll.core;

import java.util.LinkedList;

/**
 *
 * @author emirs
 */
public class GameManager {
    
    public static GameManager instance;
    
    public BingoLinkedList players;

    public GameManager() {
        
        if (instance == null) {
            instance = this;
        }
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
    
}

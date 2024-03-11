package com.blackflower.bingoll.core;

import com.blackflower.bingoll.customComponents.CardColor;
import java.util.LinkedList;

/**
 *
 * @author emirs
 */
public class PlayerCard {
    
    public int id;
    public String nickname;
    public final CardColor cardColor;
    public final BingoLinkedList<Integer> cardNumbersLL;
    public PLAYER_STATUS status;
    
    public static enum PLAYER_STATUS{
        JUST_STARTED,
        BIRINCI_CINKO,
        IKINCI_CINKO,
        TOMBALA,
    }

    public PlayerCard(int id, String nickname, CardColor cardColor, BingoLinkedList<Integer> cardNumbersLL) {
        this.nickname = nickname;
        this.cardColor = cardColor;
        this.cardNumbersLL = cardNumbersLL;
        
        status = PLAYER_STATUS.JUST_STARTED;
    } 
    
    public void checkCard(int number){
        // checks the card and updates the cardStatus according to given number
    }
    
}

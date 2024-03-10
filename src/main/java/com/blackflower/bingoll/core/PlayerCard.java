package com.blackflower.bingoll.core;

import com.blackflower.bingoll.customComponents.CardColor;
import java.util.LinkedList;

/**
 *
 * @author emirs
 */
public class PlayerCard {
    
    public final CardColor cardColor;
    public final LinkedList cardNumbersLL;
    

    public PlayerCard(CardColor cardColor, LinkedList cardNumbersLL) {
        this.cardColor = cardColor;
        this.cardNumbersLL = cardNumbersLL;
    }
    
    
    
}

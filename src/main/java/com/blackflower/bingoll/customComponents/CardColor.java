package com.blackflower.bingoll.customComponents;

import java.awt.Color;

/**
 *
 * @author emirs
 */
public class CardColor {
    public static final CardColor BLACK = new CardColor("BLACK", Color.BLACK, Color.WHITE, Color.WHITE);
    public static final CardColor RED = new CardColor("RED", Color.RED, Color.WHITE, Color.WHITE);
    public static final CardColor BLUE = new CardColor("BLUE", Color.BLUE, Color.WHITE, Color.WHITE);
    public static final CardColor PURPLE = new CardColor("PURPLE", new Color(92,21,48), new Color(104, 0, 53), new Color(92,21,48));
    public static final CardColor WHITE = new CardColor("WHITE", Color.WHITE, new Color(104, 0, 53), new Color(92,21,48));
    
    public static final CardColor COLORS[] = {
        PURPLE,
        BLACK,
        RED,
        BLUE,
        WHITE
    };
    

    private final String name;
    private final Color backgroundColor;
    private final Color foregroundColor;
    private final Color textColor;

    private CardColor(String name, Color backgroundColor, Color foregroundColor, Color textColor) {
        this.name = name;
        this.backgroundColor = backgroundColor;
        this.foregroundColor = foregroundColor;
        this.textColor = textColor;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public Color getForegroundColor() {
        return foregroundColor;
    }

    public Color getTextColor() {
        return textColor;
    }

    @Override
    public String toString() {
        return name; 
    }
    
    
}

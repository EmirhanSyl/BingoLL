package com.blackflower.bingoll.customComponents;

import java.awt.Color;

/**
 *
 * @author emirs
 */
public class CardColor {
    public static final CardColor BLACK = new CardColor(Color.BLACK, Color.WHITE, Color.WHITE);
    public static final CardColor RED = new CardColor(Color.RED, Color.WHITE, Color.WHITE);
    public static final CardColor BLUE = new CardColor(Color.BLUE, Color.WHITE, Color.WHITE);
    public static final CardColor PURPLE = new CardColor(new Color(92,21,48), new Color(104, 0, 53), new Color(92,21,48));
    

    private final Color backgroundColor;
    private final Color foregroundColor;
    private final Color textColor;

    private CardColor(Color backgroundColor, Color foregroundColor, Color textColor) {
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
}

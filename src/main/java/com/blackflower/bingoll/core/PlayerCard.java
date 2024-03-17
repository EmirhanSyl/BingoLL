package com.blackflower.bingoll.core;

import com.blackflower.bingoll.MainFrame;
import com.blackflower.bingoll.customComponents.CardColor;

/**
 *
 * @author emirs
 */
public class PlayerCard {

    public int id;
    public String nickname;
    public final CardColor cardColor;
    public final BingoLinkedList<GameNumber> cardNumbersLL;
    public PLAYER_STATUS status;

    public int cinkoCount = 0;

    public static enum PLAYER_STATUS {
        JUST_STARTED,
        BIRINCI_CINKO,
        IKINCI_CINKO,
        TOMBALA,
    }

    public PlayerCard(int id, String nickname, CardColor cardColor, BingoLinkedList<GameNumber> cardNumbersLL) {
        this.nickname = nickname;
        this.cardColor = cardColor;
        this.cardNumbersLL = cardNumbersLL;

        status = PLAYER_STATUS.JUST_STARTED;
    }

    public void checkCard(int number) {
        // checks the card and updates the cardStatus according to given number
        for (int i = 0; i < cardNumbersLL.size(); i++) {
            if (cardNumbersLL.get(i).getNumber() == number) {
                cardNumbersLL.get(i).setChecked(true);
                break;
            }
        }

        checkCinko();
    }

    public void checkCinko() {
        int prevCinkoCount = cinkoCount;
        cinkoCount = 0;
        for (int i = 0; i < 3; i++) {
            boolean cinko = true;
            for (int j = 0; j < 5; j++) {
                if (!cardNumbersLL.get((i*5) + j).isChecked()) {
                    cinko = false;
                    break;
                }
            }
            if (cinko) {
                cinkoCount++;
            }
        }

        switch (cinkoCount) {
            case 0 -> status = PLAYER_STATUS.JUST_STARTED;
            case 1 -> status = PLAYER_STATUS.BIRINCI_CINKO;
            case 2 -> status = PLAYER_STATUS.IKINCI_CINKO;
            case 3 -> status = PLAYER_STATUS.TOMBALA;
        }
        
        if (prevCinkoCount != cinkoCount) {
            switch (status) {
                case BIRINCI_CINKO -> MainFrame.instance.gamePage.insertStatusUpdate(this);
                case IKINCI_CINKO -> MainFrame.instance.gamePage.insertStatusUpdate(this);
                case TOMBALA -> MainFrame.instance.gamePage.insertStatusUpdate("'" + nickname + "' Has finished the game. TOMBALA");
            }
        }
    }

}

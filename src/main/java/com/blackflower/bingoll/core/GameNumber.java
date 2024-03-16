package com.blackflower.bingoll.core;

/**
 *
 * @author emirs
 */
public class GameNumber {
    private final int number;
    private boolean checked;

    public GameNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Integer) {
            return ((int)obj == number);
        }else if(obj instanceof GameNumber gameNumber){
            return (gameNumber.getNumber() == number);
        }else{
            return super.equals(obj);
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.number;
        return hash;
    }
    
    
    
}

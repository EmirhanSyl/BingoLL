package com.blackflower.bingoll;

import com.blackflower.bingoll.core.BingoLinkedList;
import com.blackflower.bingoll.core.GameManager;

/**
 *
 * @author emirs
 */
public class BingoLL {

    public static void main(String[] args) {
        BingoLinkedList<Integer> bll = GameManager.instance.createCardNumbers();
        
        System.out.println("------------------");
        bll.print();
        //System.out.println(Math.ceilDiv(8,10));
    }
}

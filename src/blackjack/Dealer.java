/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Enes
 */
public class Dealer {
    ArrayList<ImageIcon> dealerHand;
    private int dealerScore =0;
    private String dealerStatus = null;

    public Dealer() {
    }

    public ArrayList<ImageIcon> getDealerHand() {
        return dealerHand;
    }

    public void setDealerHand(ArrayList<ImageIcon> dealerHand) {
        this.dealerHand = dealerHand;
    }

    public int getDealerScore() {
        return dealerScore;
    }

    public void setDealerScore(int dealerScore) {
        this.dealerScore = dealerScore;
    }

    public String getDealerStatus() {
        return dealerStatus;
    }

    public void setDealerStatus(String dealerStatus) {
        this.dealerStatus = dealerStatus;
    }
    
    
}

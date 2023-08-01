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
public class Player {
    String name;
    ArrayList<ImageIcon> playerHand;
    private int playerScore =0;
    private String playerStatus = null;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ImageIcon> getPlayerHand() {
        return playerHand;
    }

    public void setPlayerHand(ArrayList<ImageIcon> playerHand) {
        this.playerHand = playerHand;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public String getPlayerStatus() {
        return playerStatus;
    }

    public void setPlayerStatus(String playerStatus) {
        this.playerStatus = playerStatus;
    }
        
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author Enes
 */
public class Cards {
    
    private ImageIcon spade[] = new ImageIcon[13];
    private ImageIcon heart[] = new ImageIcon[13];
    private ImageIcon club[] = new ImageIcon[13];
    private ImageIcon diamond[] = new ImageIcon[13];
    Random rnd = new Random();

    public Cards() {
        
        for (int i = 0; i < spade.length; i++) { //spade
            spade[i]= new ImageIcon(getClass().getClassLoader().getResource("spades"+ "/" + (i+2) + "_of_spades.png"));
        }
        
        for (int i = 0; i < heart.length; i++) { //heart
            heart[i]= new ImageIcon(getClass().getClassLoader().getResource("hearts"+ "/" + (i+2) + "_of_hearts.png"));
        }
        
        for (int i = 0; i < diamond.length; i++) { //diamond
            diamond[i]= new ImageIcon(getClass().getClassLoader().getResource("diamonds"+ "/" + (i+2) + "_of_diamonds.png"));
        }
        
        for (int i = 0; i < club.length; i++) { //club
            club[i]= new ImageIcon(getClass().getClassLoader().getResource("clubs"+ "/" + (i+2) + "_of_clubs.png"));
        }
        
    }

    public ImageIcon hitCard(){
        ImageIcon card = null;
        int selectedCard = rnd.nextInt(15);
        int suits = rnd.nextInt(4);
        
        switch(suits){
            case 0:
                card = spade[selectedCard];
                break;
            case 1:
                card = heart[selectedCard];
                break;
            case 2:
                card = diamond[selectedCard];
                break;
            case 3:
                card = club[selectedCard];
                break;
        }
        return card;
    }
    
        
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

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

    public Cards() {
        
        for (int i = 0; i < spade.length; i++) { //spade
            spade[i]= new ImageIcon(getClass().getClassLoader().getResource("spades"+ "/" + (i+2) + "_of_spades.png"));
            System.out.println(spade[i]);
        }
        
        for (int i = 0; i < heart.length; i++) { //heart
            heart[i]= new ImageIcon(getClass().getClassLoader().getResource("hearts"+ "/" + (i+2) + "_of_hearts.png"));
            System.out.println(heart[i]);
        }
        
        for (int i = 0; i < diamond.length; i++) { //diamond
            diamond[i]= new ImageIcon(getClass().getClassLoader().getResource("diamonds"+ "/" + (i+2) + "_of_diamonds.png"));
            System.out.println(diamond[i]);
        }
        
        for (int i = 0; i < club.length; i++) { //club
            club[i]= new ImageIcon(getClass().getClassLoader().getResource("clubs"+ "/" + (i+2) + "_of_clubs.png"));
            System.out.println(club[i]);
        }
        
    }

    
    
        
    
}

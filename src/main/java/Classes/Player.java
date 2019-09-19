/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Antony Torbey
 */
public class Player {
    //Stocks the name of the player
    private String name;
    //Stocks the possible scores
    private String[] tabScore;
    //Stocks the score of the player
    private int score;
    
    //Default constructor
    public Player(String name){
        this.name = name;
        this.tabScore = new String[] {"0\t","15\t","30\t","40\t","advantage"};  //tabulation added at the end of each number so the "advantage" doesn't look too long
        this.score = 0;
    }

    //Returns player's name
    public String getName() {
        return name;
    }

    //Change player's name
    public void setName(String name) {
        this.name = name;
    }
    
    //Implements player's score
    public void scored(){
        score++;
    }
    
    //This method is only used if player with advantage looses the point, so he looses his advantage and goes back to "40"
    public void unScore(){
        score--;
    }

    //Returns player's score position in tabScore[]
    public int scorePos() {
        return score;
    }
    
    //Returns player's real score
    public String getScore(){
        return tabScore[score];
    }
    
}

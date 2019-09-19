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
public class Game {
    //Stocks informations about player 1
    private Player p1;
    //Stocks informations about player 2
    private Player p2;
    //Stocks the possible scores
    private final String[] tabScore = {"0\t","15\t","30\t","40\t","advantage"};   //tabulation added at the end of each number so the "advantage" doesn't look too long
    //Stocks the score of the first players
    private int p1Score;
    //Stocks the score of the second players
    private int p2Score;
    
    //Default Constructor
    public Game(Player player1, Player player2){
        System.out.println("A game has begun ! Welcome "+player1.getName()+" and "+player2.getName());
        System.out.println("------------------------------------------------------");
        this.p1 = player1;
        this.p2 = player2;
        this.p1Score = 0;
        this.p2Score = 0;
    }

    public int getP1Score() {
        return p1Score;
    }

    public int getP2Score() {
        return p2Score;
    }
    
    
    
    //Returns player's real score
    private String getScore(int score){
        return tabScore[score];
    }
    
    //player 1 scored a point
    public void p1Scored(){
        
        if ( (p1Score < 3) || ( p1Score == 3 && p2Score == 3 ) )  //If player 1 is below "40", he scores a point. IF player 1 and player 2 are at "40", player 1 gains advantage.
        {
            p1Score++;
            System.out.println(p1.getName()+"\t\t\t|\t\t\t"+p2.getName());
            System.out.println(this.getScore(p1Score)+"\t\t|\t\t\t"+this.getScore(p2Score));
            System.out.println("------------------------------------------------------");
        }
        else if ( (p2Score < 3) || (p1Score == 4) ) //Or else (that means player 1 is at "40" or has an advantage), if player 2 is below "40" or player 1 already has an advantage, player 1 wins the game.
        {
            System.out.println(p1.getName()+" won the game ! Congratulations !");
            System.exit(0);
        }
        else    //The last case is if player 1 is at "40" and player 2 has an advantage. Then player 2 looses his advantage.
        {
            p2Score--;
            System.out.println(p1.getName()+"\t\t\t|\t\t\t"+p2.getName());
            System.out.println(this.getScore(p1Score)+"\t\t|\t\t\t"+this.getScore(p2Score));
            System.out.println("------------------------------------------------------");
        }
            
    }
    
    //player 2 scored a point
    public void p2Scored(){
        
        if ( (p2Score < 3) || ( p1Score == 3 && p2Score == 3 ) )  //If player 2 is below "40", he scores a point. IF player 1 and player 2 are at "40", player 1 gains advantage.
        {
            p2Score++;
            System.out.println(p1.getName()+"\t\t\t|\t\t\t"+p2.getName());
            System.out.println(this.getScore(p1Score)+"\t\t|\t\t\t"+this.getScore(p2Score));
            System.out.println("------------------------------------------------------");
        }
        else if ( (p1Score < 3) || (p2Score == 4) ) //Or else (that means player 2 is at "40" or has an advantage), if player 1 is below "40" or player 2 already has an advantage, player 2 wins the game.
        {
            System.out.println(p2.getName()+" won the game ! Congratulations !");
            System.exit(0);
        }
        else    //The last case is if player 2 is at "40" and player 1 has an advantage. Then player 1 looses his advantage.
        {
            p1Score--;
            System.out.println(p1.getName()+"\t\t\t|\t\t\t"+p2.getName());
            System.out.println(this.getScore(p1Score)+"\t\t|\t\t\t"+this.getScore(p2Score));
            System.out.println("------------------------------------------------------");
        }
        
    }
}

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
    
    //Default Constructor
    public Game(String player1, String player2){
        System.out.println("A game has begun ! Welcome "+player1+" and "+player2);
        System.out.println("------------------------------------------------------");
        this.p1 = new Player(player1);
        this.p2 = new Player(player2);
    }
    
    //player 1 scored a point
    public void p1Scored(){
        
        if ( (p1.scorePos() < 3) || ( p1.scorePos() == 3 && p2.scorePos() == 3 ) )  //If player 1 is below "40", he scores a point. IF player 1 and player 2 are at "40", player 1 gains advantage.
        {
            p1.scored();
            System.out.println(p1.getName()+"\t\t\t|\t\t\t"+p2.getName());
            System.out.println(p1.getScore()+"\t\t|\t\t\t"+p2.getScore());
            System.out.println("------------------------------------------------------");
        }
        else if ( (p2.scorePos() < 3) || (p1.scorePos() == 4) ) //Or else (that means player 1 is at "40" or has an advantage), if player 2 is below "40" or player 1 already has an advantage, player 1 wins the game.
        {
            System.out.println(p1.getName()+" won the game ! Congratulations !");
            System.exit(0);
        }
        else    //The last case is if player 1 is at "40" and player 2 has an advantage. Then player 2 looses his advantage.
        {
            p2.unScore();
            System.out.println(p1.getName()+"\t\t\t|\t\t\t"+p2.getName());
            System.out.println(p1.getScore()+"\t\t|\t\t\t"+p2.getScore());
            System.out.println("------------------------------------------------------");
        }
            
    }
    
    //player 2 scored a point
    public void p2Scored(){
        
        if ( (p2.scorePos() < 3) || ( p1.scorePos() == 3 && p2.scorePos() == 3 ) )  //If player 2 is below "40", he scores a point. IF player 1 and player 2 are at "40", player 1 gains advantage.
        {
            p2.scored();
            System.out.println(p1.getName()+"\t\t\t|\t\t\t"+p2.getName());
            System.out.println(p1.getScore()+"\t\t|\t\t\t"+p2.getScore());
            System.out.println("------------------------------------------------------");
        }
        else if ( (p1.scorePos() < 3) || (p2.scorePos() == 4) ) //Or else (that means player 2 is at "40" or has an advantage), if player 1 is below "40" or player 2 already has an advantage, player 2 wins the game.
        {
            System.out.println(p2.getName()+" won the game ! Congratulations !");
            System.exit(0);
        }
        else    //The last case is if player 2 is at "40" and player 1 has an advantage. Then player 1 looses his advantage.
        {
            p1.unScore();
            System.out.println(p1.getName()+"\t\t\t|\t\t\t"+p2.getName());
            System.out.println(p1.getScore()+"\t\t|\t\t\t"+p2.getScore());
            System.out.println("------------------------------------------------------");
        }
        
    }
}

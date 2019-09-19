/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Scanner;

/**
 *
 * @author Antony Torbey
 */
public class Main {
    public static void main(String[] args){
        
        //Stocks player 1's informations
        String player1;
        //Stocks player 2's informations
        String player2;
        //Stocks the variable that the user will push on the keyboard to indicate who scored a point
        String action;
        
        Scanner sc = new Scanner(System.in);
        
        do
        {
            System.out.print("Please enter the first player's name (max 7 caracters): ");
            player1 = sc.nextLine();
            System.out.println("\n");
        }
        while (player1.length()>7);  //Asks for a name till the user enter's a valide name
        
        do
        {
            System.out.print("Please enter the second player's name (max 7 caracters): ");
            player2 = sc.nextLine();
            System.out.println("\n");
        }
        while (player2.length()>7);  //Asks for a name till the user enter's a valide name
        
        Player p1 = new Player(player1);
        Player p2 = new Player(player2);
        
        Game game1 = new Game(p1 , p2); //Creates the game
        
        //The menu
        System.out.println("1 : "+p1.getName()+" scored a point");
        System.out.println("2 : "+p2.getName()+" scored a point");
        System.out.println("0 : Exit game");
        
        do
        {
            action = sc.nextLine();
            switch (action) {
            case "1":
                game1.p1Scored();
                break;
            case "2":
                game1.p2Scored();
                break;
            case "0":
                System.exit(0);
            }
        }
        while( (!action.equals("1")) || (!action.equals("2")) || (!action.equals("0")) );   //Waits for an action till the user hits "1", "2", or "0"
        
        
    }
}

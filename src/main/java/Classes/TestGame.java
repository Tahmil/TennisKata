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
public class TestGame {
    public static void main(String[] args){
        
        //Stocks player 1's informations
        String p1;
        //Stocks player 2's informations
        String p2;
        //Stocks the variable that the user will push on the keyboard to indicate who scored a point
        String action;
        
        Scanner sc = new Scanner(System.in);
        
        do
        {
            System.out.print("Please enter the first player's name (max 7 caracters): ");
            p1 = sc.nextLine();
            System.out.println("\n");
        }
        while (p1.length()>7);  //Asks for a name till the user enter's a valide name
        
        do
        {
            System.out.print("Please enter the second player's name (max 7 caracters): ");
            p2 = sc.nextLine();
            System.out.println("\n");
        }
        while (p2.length()>7);  //Asks for a name till the user enter's a valide name
        
        Game game1 = new Game(p1 , p2); //Creates the game
        
        //The menu
        System.out.println("1 : "+p1+" scored a point");
        System.out.println("2 : "+p2+" scored a point");
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
            default:
                //System.exit(0);
            }
        }
        while( (!action.equals("1")) || (!action.equals("2")) || (!action.equals("0")) );   //Waits for an action till the user hits "1", "2", or "0"
        
        
    }
}

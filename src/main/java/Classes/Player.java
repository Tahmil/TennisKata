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
    
    //Default constructor
    public Player(String name){
       
        this.name = name;
    }

    //Returns player's name
    public String getName() {
        return name;
    }

    //Change player's name
    public void setName(String name) {
        this.name = name;
    }
    
    
}

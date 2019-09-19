/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 80ant
 */
public class GameTest {
    
 
    
    public GameTest() {
    }

    
    /**
     * Test of p1Scored method, of class Game.
     */
    @Test
    public void testP1Scored() {
    Player player1 = new Player("Claude");
    Player player2 = new Player("Antony");
    Game game= new Game(player1, player2);
        game.p1Scored();
        assertEquals(game.getP1Score(), 1);
    }

    /**
     * Test of p2Scored method, of class Game.
     */
    @Test
    public void testP2Scored() {
         Player player1 = new Player("Claude");
    Player player2 = new Player("Antony");
    Game game= new Game(player1, player2);
        game.p2Scored();
        assertEquals(game.getP2Score(), 1);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.snakegame;

import java.util.Scanner;

/**
 *
 * @author wenyang
 */
public class Main {
    
    public static void main(String[] args) {
        SnakesLadders game = new SnakesLadders();
        System.out.println(game.play(1, 1));
        //System.out.println(game.play(1, 5));
        //System.out.println(game.play(6, 2));
        //System.out.println(game.play(1, 1));
        /*game = new SnakesLadders();
        assertEquals("Player 1 is on square 38", game.play(1, 1));
        assertEquals("Player 1 is on square 44", game.play(1, 5));
        assertEquals("Player 2 is on square 31", game.play(6, 2));
        assertEquals("Player 1 is on square 25", game.play(1, 1));
        */

        
    }

    private static void assertEquals(String string, String play) {
        if (string.equals(play)){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }
    }
}

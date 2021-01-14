package com.mycompany.snakegame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wenyang
 */
public class SnakesLadders {
    private int player1;
    private int player2;
    private boolean playerOrder;
    
    public SnakesLadders() {
        player1=0;
        player2=0;
        playerOrder=true;
    }
    
    
    
    public String play(int die1, int die2) {
        String string="";
        if (gameOver(player1)&&gameOver(player2)){
            if (playerOrder){
                player1=player1+die1+die2;
                player1=special(player1);
                string= winOrNot(new String("Player 1"), player1);
            }else {
                player2=player2+die1+die2;
                player2=special(player2);
                string=winOrNot(new String("Player 2"), player2);
            }
            //after the calculation is done 
            if (die1!=die2){
                playerOrder=!playerOrder;

            }
        }else {
            string="Game over!";
        }
        
        return string;
    }
    
    public String winOrNot(String string, int sum){
        if (sum==100){
            return string+" Wins";
        }else {
            return string+" is on square "+sum;
        }
    }
    
    public boolean gameOver(int sum){
        if (sum==100){
            return false;
        }
        return true;
    }
    
    
    
    public int special(int sum){
        if (sum==2){
            sum=38;
        }else if (sum==7){
            sum=14;
        }else if (sum==8){
            sum=31;
        }else if (sum==15){
            sum=26;
        }else if (sum==21){
            sum=42;
        }else if (sum==28){
            sum=84;
        }else if (sum==36){
            sum=44;
        }else if (sum==51){
            sum=67;
            
        }else if (sum==71){
            sum=91;
        }else if (sum==78){
            sum=98;
        }else if (sum==87){
            sum=94;
        }else if (sum==16){
            sum=6;
        }else if (sum==49){
            sum=11;
        }else if (sum==46){
            sum=25;
        }else if (sum==62){
            sum=19;
        }else if (sum==64){
            sum=60;
        }else if (sum==74){
            sum=53;
        }else if (sum==89){
            sum=68;
        }else if (sum==95){
            sum=75;
        }else if (sum==92){
            sum=88;
        }else if (sum==99){
            sum=80;
        }else if (sum>100){
            sum=200-sum;
        }
        return sum;
    }
    
    
    
    
}

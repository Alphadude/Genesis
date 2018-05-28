/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genesis;

import java.util.Random;

/**
 *
 * @author USER
 */
public class RandomNumber {
    
    public static int randomizer(){
        Random rand = new Random();
        int random = rand.nextInt(3);
        return random;
    }
    
    public static String compair(int x, int y){
        String value;
        if (x != y){
            value = "YOU GUESSED WRONG";
        }else{
            value = "YOU GUESSED RIGHT";
        }
    return value;
    }
}

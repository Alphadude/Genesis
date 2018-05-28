
package genesis;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class GameClass {
    
    public static void main(String []args){
        //this is where i created the object of the randomnumber class
        RandomNumber raz = new RandomNumber();
        //this is where i collected the number from the genrated class and stored it in a variable
        int compt = raz.randomizer();
        //this is where i used scanner to get the value from the keyboard
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER YOUR GUESSED NUMBER");
        int guess = input.nextInt();
        //this is where i used the last method and passed the two values to it for it to be compaired22
        String answer =raz.compair(compt,guess);
        System.out.println(answer);
    }
    
}

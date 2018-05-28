
package genesis;

import java.util.Random;
import java.util.Scanner;
public class RandomGen {
    
    public static void main(String []args){
        int i = 1;
        Random generator = new Random();
        
        Scanner input = new Scanner(System.in);
        
        int Dice = 1 + generator.nextInt(4);
        
        while(i == 1){
        
        System.out.println(" ENTER A NUMBER BETWEEN 1 AND 5");
          
        
        int value = 1 + input.nextInt();
        
        if(value != Dice){
            System.out.println("YOUR GUESS WAS INCORRECT");
            return;
        }
        else{
            System.out.println("YOUR GUESS WAS CORRECT");
            i++;
            return;
        }
        
    }
    }
    
}


package genesis;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ArrayLoops {
    public static void main(String []args){
        Scanner put = new Scanner(System.in);
        int [] collection = new int[12];
        
        int counter = 0,i=1;
        
        while(counter <= 11){
            System.out.println("ENTER NUMBER "+ i);
            collection[counter] = put.nextInt();
            counter++;
            i++;
        }
        int counter2 , counter3 = 11;
        System.out.println("input from first to last is ");
        for(counter2 = 0; counter2<= 11; counter2++){
            System.out.println(collection[counter2]);
            
        }
        System.out.println("input from last to first is ");
        for (counter3 = 11; counter3>= 0; counter3--){
            System.out.println(collection[counter3]);
        }
    }
    
}

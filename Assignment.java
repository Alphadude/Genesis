
package genesis;

import java.util.*;
public class Assignment {
    
    public static void main(String []args){
        
        double balance;
        int response;
        int year = 1;
        final double INT_RATE = 0.03;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter initial bank balnace");
        balance = keyboard.nextDouble();
        System.out.println("Do you want to see next year's balance");
        System.out.println("Enter 1 for yes");
        System.out.println("Enter any number for no >>");
        response = keyboard.nextInt();
        
        while(response == 1){
            balance = balance + balance*INT_RATE;
            System.out.println("After year "+year+" at"+ INT_RATE+" intrset rate, balnace is "+balance);
            year = year + 1;
            System.out.println("\n Do you want to see the balanace" + " At the end of another year");
            System.out.print("Enter 1 for yes");
            System.out.print(" or any other number for no >> ");
            response = keyboard.nextInt();
        }
    }
    
}

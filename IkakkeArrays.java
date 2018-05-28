
package genesis;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class IkakkeArrays {
    public static void main(String []args){
        
        
       //public static void main(String args[]){
       String str = new String("28-12-2018");
       
       System.out.println("split(String regex):");
       
       String array1[]= str.split("-");
       
       for (String temp: array1){
          System.out.println(temp);
       }
//       System.out.println("split(String regex, int limit) with limit=2:");
//       String array2[]= str.split("/", 2);
//       for (String temp: array2){
//          System.out.println(temp);
//       }
//       System.out.println("split(String regex, int limit) with limit=0:");
//       String array3[]= str.split("/", 0);
//       for (String temp: array3){
//          System.out.println(temp);
//       }
//       System.out.println("split(String regex, int limit) with limit=-5:");
//       String array4[]= str.split("/", -5);
//       for (String temp: array4){
//          System.out.println(temp);
//       }
   }
 
//      Scanner input = new Scanner(System.in);
//      int [] Num = new int[12];
//      for(int x = 0; x<=11; x++){
//          System.out.println("Enter number");
//          Num[x] = input.nextInt();
//          
//      }
//      for(int x1 = 0; x1 <= 11; x1++){
//          System.out.println(Num[x1]);
//      }
//      for (int x2 = 11; x2 >= 0; x2--){
//          System.out.println(Num[x2]);
//      }
    //}
    
}

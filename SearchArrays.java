
package genesis;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class SearchArrays {
    public static void main(String []args){
        String [] Names = {"JANUARY","FEBUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
        Scanner input = new Scanner(System.in);
        System.out.println("TYPE IN A MONTH AND GET IF ITS IN THE ARRAY AND RETURN THE INDEX");
        String search = input.next();
        
        for(int x = 0; x<= Names.length;x++){
            
            if(search.equalsIgnoreCase(Names[x])){
                System.out.println("THE MONTH "+search+" LOCATED IN INDEX "+(x));
                break;
            }
            //System.out.println("THE MONTH CANNOT BE FOUND");
            }
               
        }
        
    }
    


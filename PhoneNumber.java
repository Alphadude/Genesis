
package genesis;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PhoneNumber {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the complete phone number ");
        String number = input.nextLine().trim();
        String Areacode = number.substring(0, 3);
        String network = number.substring(3, 6);
         System.out.println("THE AREA CODE "+Areacode);
         System.out.println("THE NETWORK PROVIDER "+network);
   
         int AreaC = Integer.parseInt(Areacode);
         int Network = Integer.parseInt(network);
         
         if(AreaC == 234){
             //System.out.println("This is the Country Code for  Nigeria");
             if (network.equals("703")|| network.equals("0706")|| network.equals("0803")|| network.equals("0806")){
                 System.out.println("This is the Country Code for  Nigeria and the network provider is MTN");
             }else if(network.equals("702")|| network.equals("0708")|| network.equals("0802")|| network.equals("0808")){
                 System.out.println("This is the Country Code for  Nigeria and the network provider is AIRTEL");
             }else if(network.equals("705")|| network.equals("0705")|| network.equals("0805")|| network.equals("0807")){
                 System.out.println("This is the Country Code for  Nigeria and the network provider is MTN");
             }else{
                 System.out.println("Check Again");
             }
             
         }else if(AreaC == 233){
        //System.out.println("This is the Country Code for Ghana");
            if (network.equals("703")|| network.equals("0706")|| network.equals("0803")|| network.equals("0806")){
                 System.out.println("This is the Country Code for  Ghana and the network provider is MTN");
             }else if(network.equals("702")|| network.equals("0708")|| network.equals("0802")|| network.equals("0808")){
                 System.out.println("This is the Country Code for  Ghana and the network provider is AIRTEL");
             }else if(network.equals("705")|| network.equals("0705")|| network.equals("0805")|| network.equals("0807")){
                 System.out.println("This is the Country Code for  Ghana and the network provider is MTN");
             }else{
                 System.out.println("Check Again");
             }
         }else if(AreaC == 44){
             
             //System.out.println("This is the Country Code for United Kindom");
             if (network.equals("703")|| network.equals("0706")|| network.equals("0803")|| network.equals("0806")){
                 System.out.println("This is the Country Code for  United Kindom and the network provider is MTN");
             }else if(network.equals("702")|| network.equals("0708")|| network.equals("0802")|| network.equals("0808")){
                 System.out.println("This is the Country Code for  United Kindom and the network provider is AIRTEL");
             }else if(network.equals("705")|| network.equals("0705")|| network.equals("0805")|| network.equals("0807")){
                 System.out.println("This is the Country Code for  United Kindom and the network provider is MTN");
             }else{
                 System.out.println("Check Again");
             }
             
         }
        
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genesis;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ReplaceClass {
    
    public static void main(String []args){
        //String awesome = "mechatronics";
        String name;
        
        Scanner inout = new Scanner(System.in);
        String awesome = inout.nextLine();
        System.out.println(awesome);
        String newString = awesome.replace("c", "t");
        System.out.println(newString);
        
//        System.out.println(newString.indexOf("o"));
//        System.out.println(newString.length());
//        System.out.println(newString.substring(5, 12));
        
        String login = (newString.substring(0, 1).toUpperCase());
        String login2 = (newString.substring(1).toLowerCase());
        String newLogin = login + login2;
        System.out.println(newLogin);
        
//        String newName = name.substring(0,1);
//        String newVarable = newName.toUpperCase();
//        String LastName = newVarable + name.substring(1);
//        System.out.println(LastName);
        
        
        //System.out.println(name.substring(0)+"G");
        
        
        
        //String [][] name = {{"w", "j","k"},{"n","h"}};
        
    }
}

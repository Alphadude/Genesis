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
public class UseArea {
    
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE 1st SIDES OF THE SHAPE ");
        double side = input.nextDouble();
        
        System.out.println("ENTER THE 2nd SIDES OF THE SHAPE ");
        double side2 = input.nextDouble();
        
        AreaClas area = new AreaClas();
        
        System.out.println(area.Area(side, side2));
    }
    
}

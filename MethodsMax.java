/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genesis;

/**
 *
 * @author USER
 */
public class MethodsMax {
    public static void main(String [] args){
        System.out.println(maxnumber((int)'j',(int)'k'));
    }
    public static int maxnumber(int x, int y){
        if (x<y){
            return y;
        }else{
            return x;
        }
    }
}

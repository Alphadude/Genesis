
package genesis;

/**
 *
 * @author USER
 */
public class LeapYear {
    
    public static boolean isLeapYear(int year){
        
        if (year%4 == 0){
            return true;
        }else if (year%100 == 0){
            return false;
        }else if(year%400 == 0){
            return true;
        }
        return false;
    }
    
    public static void main(String []args){
        System.out.println(" IS YEAR 1900 A LEAP YEAR "+isLeapYear(1900));
        System.out.println(" IS YEAR 1988 A LEAP YEAR "+isLeapYear(1988));
        System.out.println(" IS YEAR 1998 A LEAP YEAR "+isLeapYear(1998));
        System.out.println(" IS YEAR 1996 A LEAP YEAR "+isLeapYear(1996));
        System.out.println(" IS YEAR 2000 A LEAP YEAR "+isLeapYear(2000));
        System.out.println(" IS YEAR 2014 A LEAP YEAR "+isLeapYear(2014));
        System.out.println(" IS YEAR 2018 A LEAP YEAR "+isLeapYear(2018));
        System.out.println(" IS YEAR 2020 A LEAP YEAR "+isLeapYear(2020));
    }
}

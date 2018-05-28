
package genesis;

import static java.lang.Math.sqrt;


public class inhertThree extends inhertTwo{
    double x,y;
    inhertTwo boom = new inhertTwo();
    
    public void Display(){
        System.out.println(" i am a shape class");
    }
    
    double SqureRoot(double x, double y){
        return sqrt(x);
    }

    @Override
    double Area(double x, double y) {
        return super.Area(x, y); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

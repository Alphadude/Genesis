
package genesis;


public class inhertTwo{
    
    double length;
    double bredth;
    double Area;
    
    inhertTwo(){
        this(0,0);
    }
    
    inhertTwo(double length, double bredth){
        this.length = length;
        this.bredth = bredth;
    }
    double Area(double x, double y){
        double area;
        area = x * y;
        return area;
    }
}

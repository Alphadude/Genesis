
package genesis;


public class inhertOne extends inhertTwo {
    
     private double side;
     private String Awesomeness;
    
    inhertOne(double side, String Awesomen){
        this.side = side;
        this.Awesomeness = Awesomen;
        
    }
    inhertOne(){
       
       
    }

    /**
     * @return the side
     */
    public double getSide() {
        return side;
    }

    /**
     * @param side the side to set
     */
    public void setSide(double side) {
        this.side = side;
    }

    /**
     * @return the Awesomeness
     */
    public String getAwesomeness() {
        return Awesomeness;
    }

    /**
     * @param Awesomeness the Awesomeness to set
     */
    public void setAwesomeness(String Awesomeness) {
        this.Awesomeness = Awesomeness;
    }
    
   
    
}

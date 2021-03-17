/**
 *This class contains methods used to manipulate the OrderedPair object consisting of two instance fields, x and y which represent the x and y values of a coordinate.
 * This class contains constructors that can assign the OrderedPair to default values of 0 as well as another constructor with parameters giving initial values of OrderedPair
 * There are also instance methods that can find the slope(returns double) and midpoint(returns OrderedPair) between two OrderedPair objects. There is a toString method to print the OrderedPair like such (x, y).
 * There are accessor and mutatuor methods for the private field y allowing user to get the y value as well as set a new value to y. There is an equals method which compares
 * two OrderedPair objects and returns true or false depending on whether both OrderedPairs are equal. There is also a class method called distance used to find the distance
 * between two OrderedPair objects returned as a double.
 * @author Meet Patel
 * Date November 2, 2020
 */

class OrderedPair{
  
  double x;    // x-coordinate of the ordered pair
  private double y;  // y-coordinate of the ordered pair
  
  /**
   * constructor that creates an OrderedPair assigning 0.0 to each coordinate (x and y). 
   * OrderedPairs created with this constructor will represent the origin in the Cartesian plane (0, 0)
   */
  public OrderedPair(){
    x=0.0;
    y=0.0;
  }
  
  /**
   * constructor that creates an OrderedPair with double parameters giving initial values of the coordinates
   * @param x double vaue representing the x coordinate of ordered pair
   * @param y double vaue representing the y coordinate of ordered pair
   */
  public OrderedPair(double x, double y){
    this.x=x;
    this.y=y;
  }
  
  /**
   * returns a string that is formatted to represent the ordered pair as the folllowing: (x, y)
   * default print method
   * @return String that represents ordered pair
   */
  public String toString(){
    return "("+x+", "+y+")";
  }
  
  /**
   * this method returns a double value representing the slope of the line 
   * between the implicit OrderedPair and the explicit OrderedPair
   * @param other -explicit OrderedPair 
   * @return slope of line that goes through the implicit and explicit OrderedPairs as a double value
   */
  public double getSlope(OrderedPair other){
    return (other.y-this.y)/(other.x-this.x);
  }
  
  /**
   * this method returns an OrderedPair representing the midpoint between the implicit and explicit OrderedPair object
   * @param other -explicit OrderedPair object
   * @return the midpoint of the two OrderedPair objects 
   */
  public OrderedPair midpoint(OrderedPair other){
    return new OrderedPair((this.x+other.x)/2,(this.y+other.y)/2);
  }
  
  /**
   * returns a boolean value determining whether or not two OrderedPair objects represent the same point on a graph
   * @param other - explicit OrderedPair object that implicit OrderedPair is to be compared to
   * @return true if x values and y values of both OrderedPairs are equal, false otherwise
   */
  public boolean equals(OrderedPair other){
    return (roundThreeDecimals(this.x)==roundThreeDecimals(other.x))&&(roundThreeDecimals(this.y)==roundThreeDecimals(other.y));
  }
  
  /**
   * accessor method that allows end user to access the y value of the implicit OrderedPair object
   * @return y value of implicit OrderedPair
   */
  public double getY(){
    return this.y;
  }
  
  /*
   * mutator method that allows end user to alter the y value of the implicit OrderedPair
   * @param newY - new y value the user wishes to assign 
   */
  public void setY(double newY){
    this.y=newY;
  }
  
  /**
   * this method returns the distance between two coordinates on a cartesian plane represented by 2 OrderedPair objects
   * @param point1 -OrderedPair object representing first coodinates
   * @param point2 -OrderedPair object representing second coordinate 
   * @return distance between the two coordinates represented as a double value
   */
  public static double distance(OrderedPair point1, OrderedPair point2){
    return Math.sqrt(Math.pow(point2.x-point1.x,2)+Math.pow(point2.y-point1.y,2));
  }
    
  /**
   * This method takes a dobuble value and rounds it to 3 decimal places and returns the rounded double value.
   * @param num  - input original double value 
   * @return original double value rounded to 3 decimal places. 
   */
  public static double roundThreeDecimals(double num){
    double roundedNum=(Math.round(num*1000))/1000.0;
    return roundedNum;
  }
  
}
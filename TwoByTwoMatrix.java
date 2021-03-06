/**
 * This class contains instance methods for the TwoByTwoMatrix object which is comprised of the instance fields, a,b,c and d (top left, top right,
 * bottom left and bottom right) representing the 4 elements in their respective positions of a 2x2 matrix. This class includes a constructor that
 * creates a default TwoByTwoMatrix object and another that allows user to assign values. There are instance methods that are used to multiply,add,
 * or subtract two TwoByTwoMatrix objects with each other as well as inverse or transpose a singular TwoByTwoMatrix. These methods return the resulting
 * TwoByTwoMatrix object. This class also consists of boolean instance methods that return boolean values depending on whether the TwoByTwoMatrix 
 * parameter is an identity matrix, whether its invertible, or if two TwoByTwoMatrix objects are inverses or equal to each other. The determinant 
 * method returns a double value representing the determinant of the TwoByTwoMatrix and the scalarMultiply method simply multiplies each field by 
 * a value and alters the implicit TwoByTwoMatrix instead of returning a new one. There is a toString method which allows the object to be printed 
 * in a certain format that looks like a 2x2 matrix.
 * @author Meet Patel
 * Date October 30, 2020
 */

class TwoByTwoMatrix{
  
  double a;  // Top left element
  double b;  // Top right element
  double c;  // Bottom left element
  double d; // Bottom right element
  
  /**
   *constructor method that creates a TwoByTwoMatrix, assigning 0 to each element
   */
  public TwoByTwoMatrix (){
    a=0;
    b=0;
    c=0;
    d=0;
  } 
  
  /**
   * Creates a TwoByTwoMatrix with parameters giving the initial values of the elements
   * @param a -Top left element as double value
   * @param b -Top right element as double value
   * @param c -Bottom left element as double value
   * @param d -Bottom right element as double value
   */
  public TwoByTwoMatrix (double a, double b, double c, double d){
    this.a=a;
    this.b=b;
    this.c=c;
    this.d=d;
  }
  
  /**
   * this method returns a String that is formatted to 
   * look like a 2x2 matrix, like the following example:
   * [1 0]
   * [0 1]
   * @return String representing a TwoByTwoMatrix
   */
  public String toString(){
    return ("["+a+" "+b+"]\n["+c+" "+d+"]");
  }
  
  
  /**
   * calculates and returns the determinant of the implicit TwoByTwoMatrix as a double
   * determinant is calculated as (a*d)-(b*c)
   * @return determinant -double value representing determinant
   */
  public double determinant(){
    return(this.a*this.d-this.b*this.c);
  }
  
  /**
   * calculates the sum of two matrices(TwoByTwoMatrix objects) and returns it as a TwoByTwoMatrix
   * @param other -explicit TwoByTwoMatrix that is to be added to implicit TwoByTwoMatrix
   * @return sum of the implicit and explicit TwoByTwoMatrix objects
   */
  public TwoByTwoMatrix plus(TwoByTwoMatrix other){
    return new TwoByTwoMatrix(this.a+other.a,this.b+other.b,this.c+other.c,this.d+other.d);
  }
  
  /**
   * calculates the differece between two matrices(TwoByTwoMatrix objects) and returns it as a TwoByTwoMatrix
   * @param other -explicit TwoByTwoMatrix that is to be subtracted from implicit TwoByTwoMatrix
   * @return the difference which is equal to the implicit TwoByTwoMatrix minus the explicit TwoByTwoMatrix
   */
  public TwoByTwoMatrix minus(TwoByTwoMatrix other){
    return new TwoByTwoMatrix(this.a-other.a,this.b-other.b,this.c-other.c,this.d-other.d);
  }
  
  /**
   * calculates the product of two matrices(TwoByTwoMatrix objects)and returns it as a TwoByTwoMatrix
   * @param other -explicit TwoByTwoMatrix that is used to multiply the implicit TwoByTwoMatrix
   * @return product of the implicit TwoByTwoMatrix multiplied by the explicit TwoByTwoMatrix
   */
  public TwoByTwoMatrix multiply(TwoByTwoMatrix other){
    return new TwoByTwoMatrix(this.a*other.a+this.b*other.c,this.a*other.b+this.b*other.d,this.c*other.a+this.d*other.c,this.c*other.b+this.d*other.d);
  }
  
  /**
   * multiplies each element within implicit TwoByTwoMatrix (a,b,c,d) by a double 
   * value and alters values in the implicit TwoByTwoMatrix directly, nothing is returned
   * @param num -number that is used to multiply each element within the implicit TwoByTwoMatrix
   */
  public void scalarMultiply(double num){
    this.a*=num;
    this.b*=num;
    this.c*=num;
    this.d*=num;
  }
  
  /**
   * determines if the implicit TwoByTwoMatrix is the identity matrix, [1,0,0,1] and returns boolean value
   * @return true if implicit TwoByTwoMatrix has the same values(rounded to 3 decimal places) in the same positions as the identity matrix, [1,0,0,1]
   */
  public boolean isIdentityMatrix(){
    return(roundThreeDecimals(a)==1&&roundThreeDecimals(d)==1&&roundThreeDecimals(b)==0&&roundThreeDecimals(c)==0);
  }
  
  /**
   * determines if the implicit TwoByTwoMatrix is invertible, it is not
   * invertible if determinant is equal to 0. A boolean value is returned
   * @return true if determinant is not 0 rounded to 3 decimal places 
   */
  public boolean isInvertible(){
    return !(roundThreeDecimals(this.determinant())==0);
  }
  
  /**
   * determines if the implicit TwoByTwoMatrix is the inverse of the explicit TwoByTwoMatrix 
   * by using the fact that if AB=BA=I(identity matrix) A and B are inverses of each other
   * boolean value is returned 
   * @param other - explicit TwoByTwoMatrix that the implict TwoByTwoMatrix will be compared to
   * @return true if implicit times explicit TwoByTwoMatrix and explicit times implicit TwoByTwoMatrix are both equal to the identity matrix
   */
  public boolean isInverse(TwoByTwoMatrix other){
    TwoByTwoMatrix i=new TwoByTwoMatrix(1,0,0,1);
    return (this.multiply(other)).equals(i)&&(other.multiply(this)).equals(i);
  }
  
  /**
   * determines if two TwoByTwoMatrix objects are equal to each other by comparing values at 
   * each postion of both matrices. Matrices are equal when both have the same values at the same positions.
   * boolean value is returned
   * @param other -explicit TwoByTwoMatrix that is compared with implicit one
   * @return true if all positions of both matrices have equal values rounded to 3 decimal places
   */ 
  public boolean equals(TwoByTwoMatrix other){
    return roundThreeDecimals(this.a)==roundThreeDecimals(other.a)&&roundThreeDecimals(this.b)==roundThreeDecimals(other.b)&&roundThreeDecimals(this.c)==roundThreeDecimals(other.c)&&roundThreeDecimals(this.d)==roundThreeDecimals(other.d);
  }
  
  /**
   * this method returns the inverse of a TwoByTwoMatrix or throws a RuntimeException 
   * if the TwoByTwoMatrix is not invertible (not invertible when determinant is equal to 0)
   * @return inverse of the implicit TwoByTwoMatrix
   */
  public TwoByTwoMatrix inverse(){
    TwoByTwoMatrix inverse=null;
    if(this.isInvertible()){
      inverse= new TwoByTwoMatrix(this.d,-this.b,-this.c,this.a);
      inverse.scalarMultiply(1.0/this.determinant());
      return inverse;
    }
    else{
      throw new RuntimeException("This matrix is not invertible");
    }
  }
  
  /**
   * this method transposes the implicit TwoByTwoMatrix by turning the rows into columns and returns the 
   * resulting TwoByTwoMatrix. For 2x2 matrices the b and c postions can be swapped to transpose the matrix
   * @return tranposed TwoByTwoMatrix (values at postions b and c are swapped)
   */
  public TwoByTwoMatrix transpose(){
    return new TwoByTwoMatrix(this.a,this.c,this.b,this.d);
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
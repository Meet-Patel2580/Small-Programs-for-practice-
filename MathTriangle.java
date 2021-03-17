/**
 * This class contains methods that can return int or double values for the area, perimeter
 * and angles of a triangle given the side lengths. It also contains methods that return boolean
 * values to determine if a triangle is scalene,isosceles, equilateral, right, acute or obtuse given side lengths.
 * @author Meet Patel
 * Date October 14, 2020
 */

import java.lang.Math;
public class MathTriangle{
  public static void main(String [] args){
    
    //test case for area
    System.out.println("------===={testing area}====------");
    System.out.println("*case 1 -> (3,4,5): " + area(3,4,5)+"  |should return 6.0");
    System.out.println("*case 2 -> (8,12,18): " + area(8,12,18)+"  |should return 38.249\n");
    
    //test case for perimeter
    System.out.println("------===={testing perimeter}====------");
    System.out.println("*case 1 -> (12,18,27): " + perimeter(12,18,27)+"  |should return 57");
    System.out.println("*case 2 -> (6,8,10): " + perimeter(6,8,10)+"  |should return 24\n");
    
    //test case for angle
    System.out.println("------===={testing angle}====------");
    System.out.println("*case 1 -> (3,3,3): " + angle(3,3,3)+"  |should return 1.0471975511965979");
    System.out.println("*case 2 -> (25,20,15): " + angle(25,20,15)+"  |should return 1.5707963267948966\n");
    
    //test case for aisIsosceles
    System.out.println("------===={testing isIsosceles}====------");
    System.out.println("*case 1 -> (6,6,8): " + isIsosceles(6,6,8)+"  |should return true");
    System.out.println("*case 2 -> (7,12,15): " + isIsosceles(7,12,15)+"  |should return false\n");
    
    //test case for isEquilateral
    System.out.println("------===={testing isEquilateral}====------");
    System.out.println("*case 1 -> (5,5,5): " + isEquilateral(5,5,5)+"  |should return true");
    System.out.println("*case 2 -> (9,9,14): " + isEquilateral(9,9,14)+"  |should return false\n");
    
    //test case for isScalene
    System.out.println("------===={testing isScalene}====------");
    System.out.println("*case 1 -> (2,4,5): " + isScalene(2,4,5)+"  |should return true");
    System.out.println("*case 2 -> (6,6,8): " + isScalene(6,6,8)+"  |should return false\n");
    
    //test case for isRight
    System.out.println("------===={testing isRight}====------");
    System.out.println("*case 1 -> (9,12,15): " + isRight(9,12,15)+"  |should return true");
    System.out.println("*case 2 -> (3,3,3): " + isRight(3,3,3)+"  |should return false\n");
    
    //test case for isObtuse
    System.out.println("------===={testing isObtuse}====------");
    System.out.println("*case 1 -> (7,5,8): " + isObtuse(4,5,8)+"  |should return true");
    System.out.println("*case 2 -> (9,12,15): " + isObtuse(9,12,15)+"  |should return false\n");
    
    //test case for isAcute
    System.out.println("------===={testing isAcute}====------");
    System.out.println("*case 1 -> (5,5,5): " + isAcute(5,5,5)+"  |should return true");
    System.out.println("*case 2 -> (7,5,8): " + isAcute(4,5,8)+"  |should return false");
    
  }
  
  /**
   * area: this method takes three positive integer parameters
   * representing the three sides of a triangle and returns the
   * area of the triangle as a double. 
   * @param a  - input side length 
   * @param b  - input side length 
   * @param c  - input side length
   * @return area of triangle
   */
  public static double area (int a, int b, int c){
    double halfP=(double)(a+b+c)/2;
    double area= round(Math.sqrt(halfP*(halfP-a)*(halfP-b)*(halfP-c)));
    return area;
  }
  
  /* this method takes three positive integer parameters representing the three 
   * sides of a triangle and returns the perimeter of the triangle as an int.
   * @param a  - input side length 
   * @param b  - input side length 
   * @param c  - input side length
   * @return perimeter of triangle
   */
  public static int perimeter(int a, int b, int c){
    int perimeter=a+b+c;
    return perimeter;
  }
  
  /*
   * this method takes three positive integer parameters representing the three
   * sides of a triangle and returns the magnitude, in radians, of the angle 
   * opposite the side whose length is given by the first int parameter.
   * @param a  - input side length 
   * @param b  - input side length 
   * @param c  - input side length
   * @return double value representing measurement of angle opposite to side length given by first int parameter.
   */
  public static double angle(int a, int b, int c){
    double angle= Math.acos(((Math.pow(b,2))+(Math.pow(c,2))-(Math.pow(a,2)))/(2.0*c*b));
    return angle;
  }
  
  /* 
   * this method takes three positive integer parameters representing the 
   * three sides of a triangle and returns true if the sides represent an 
   * isosceles triangle (any two sides are equal) and false otherwise.
   * @param a  - input side length 
   * @param b  - input side length 
   * @param c  - input side length
   * @return true if 2 sides are equal to each other 
   */
  public static boolean isIsosceles(int a, int b, int c){
    if(a==b||a==c||b==c){
      return true;
    }
    else{
      return false; 
    }
  }
  
  /*
   * this method takes three positive integer parameters representing the
   * three sides of a triangle and returns true if the sides represent an 
   * equilateral triangle (all three sides are equal) and false otherwise.
   * @param a  - input side length 
   * @param b  - input side length 
   * @param c  - input side length
   * @return true if all sides are equal to each other 
   */
  public static boolean isEquilateral (int a, int b, int c){
    if(a==b&&a==c){
      return true;
    }
    else{
      return false; 
    }
  }
  
  /*
   * this method takes three positive integer parameters representing the 
   * three sides of a triangle and returns true if the sides represent a 
   * scalene triangle (none of the sides are equal) and false otherwise.
   * @param a  - input side length 
   * @param b  - input side length 
   * @param c  - input side length
   * @return true if all sides are of different lengths
   */
  public static boolean isScalene(int a, int b, int c){
    if((a!=b)&&(a!=c)&&(b!=c)){
      return true;
    }
    else{
      return false; 
    }
  }
  
  /*
   * this method takes three positive integer parameters representing the three 
   * sides of a triangle and returns true if the triangle represented by those
   * sides is a right angle triangle (one of the angles is 90°) and false otherwise.
   * @param a  - input side length 
   * @param b  - input side length 
   * @param c  - input side length
   * @return true if there is a 90 degree angle in the triangle
   */
  public static boolean isRight (int a, int b, int c){
    double rounded90= round(Math.PI/2);
    if ((round(angle(a,b,c))== rounded90)||(round(angle(b,c,a))==rounded90)||(round(angle(c,b,a))==rounded90)){
      return true;
    }
    else{
      return false;
    }
  }
  
  /* 
   * this method takes three positive integer parameters representing the three sides
   * of a triangle and returns true if the triangle represented by those sides is an 
   * obtuse triangle (has an angle greater than 90°)   and false otherwise.
   * @param a  - input side length 
   * @param b  - input side length 
   * @param c  - input side length
   * @return true if an angle in the triangle is greater than 90 degrees
   */
  public static boolean isObtuse(int a,int b, int c){
    double rounded90= round(Math.PI/2);
    if ((round(angle(a,b,c))>rounded90)||(round(angle(b,c,a))>rounded90)||(round(angle(c,b,a))>rounded90)){
      return true;
    }
    else{
      return false;
    }
  }
  
  /**
   * this method takes three positive integer parameters representing the three sides
   * of a triangle and returns true if the triangle represented by those sides is an
   * acute triangle (all angles are less than 90°)   and false otherwise.
   * @param a  - input side length 
   * @param b  - input side length 
   * @param c  - input side length
   * @return true if all angles in the triangle are less than 90 degrees
   */
  public static boolean isAcute(int a,int b, int c){
    double rounded90= round(Math.PI/2);
    if ((round(angle(a,b,c))<rounded90)&&(round(angle(b,c,a))<rounded90)&&(round(angle(c,b,a))<rounded90)){
      return true;
    }
    else{
      return false;
    }
  }
  
  /*
   * This method takes a dobuble value and rounds it to 3 decimal places and returns the rounded double value.
   * @param num  - input original double value 
   * @return original double value rounded to 3 decimal places. 
   */
  public static double round(double num){
    double roundedNum=(Math.round(num*1000))/1000.0;
    return roundedNum;
  }
  
}
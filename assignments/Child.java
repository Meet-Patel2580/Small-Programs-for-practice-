import java.lang.Math;
public class Child{
  
  private int height; // height in cm
  private double mass; // mass in kg
  
  public Child(int height, double mass){
  this.height=height;
  this.mass=mass;
  }
  
  
  public boolean equals(Child other){
    return (Math.abs(this.height-other.height))<=2&&(Math.abs(this.mass-other.mass))<=0.5;
  }
  
}
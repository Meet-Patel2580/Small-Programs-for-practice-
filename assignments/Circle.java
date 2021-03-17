public class Circle{

double x;
double y;
private double r;


public Circle (double x, double y, double r){
  this.x=x;
  this.y=y;
  if(r<0){
    System.out.println("Radius must be a positive number, Radius will be set to the absolute value");
      this.r=-r;
  }
  else{
    this.r=r;
  }
  
}

//g
public String toString(){
  return("centre: ("+this.x+","+this.y+") radius: "+this.r);
}



//a
public Circle(){
x=0;
y=0;
r=1;
}
//b
//public Circle(double x,double y,double r){
//this.x=x;
//this.y=y;
//this.r=r;
//}
//c
public Circle(Circle other){
this.x=other.x;
this.y=other.y;
this.r=other.r;
}


//f
public boolean equals(Circle other){
return (this.x==other.x&&this.y==other.y&&this.r==other.r);
}






//a
public double area(){
  double area= Math.PI*Math.pow(r,2);
  return area;
}
//b
public Circle smaller(Circle other){
  if(this.r<other.r){
    return this;
  }
  else if(this.r>other.r){
    return other;
  }
  else{
    return this;
  }
}

}
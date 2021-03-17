public class Complex{

int re;  // real part "a"
int im;  // imaginary part "b"


//a
public double modulus(){
  double size= Math.sqrt(Math.pow(this.re,2)+Math.pow(this.im,2));
  return size;
}
//b
public void scale(double x){
this.re*=x;
this.im*=x;
}


}
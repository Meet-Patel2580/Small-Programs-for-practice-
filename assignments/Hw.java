public class Hw{
  public static void main(String[]args){
    
    //Fraction[] fracArray = new Fraction[100];
    
    for (int i = 0; i < fracArray.length; i++){
      fracArray[i] = new Fraction(i,i+1);
    }
    
    for(int x=0;x<fracArray.length; x++){
      System.out.println( fracArray[x]);
    }
  }
}
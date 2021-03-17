public class Sample{
  public static void main (String [] args){
    
    printArray(arrFactors(12));
    
  } 
  
  public static int nFactors(int n){ 
    
    int numFactors=0;
    
    for(int i=n;i>0;i--){
      if(n%i==0){
        numFactors++;
      }
    }
    return numFactors;
  }
  
  public static int[] arrFactors(int x){ 
    int [] factors = new int[nFactors(x)];
    int factor=1;
    for(int i=0; i<factors.length; factor++){
      if(x%factor==0){
        factors[i]=factor;
        i++;
      }
    }
    return factors;
  }
  
  public static void printArray(int[] list){
    System.out.print("{");
    for(int i=0;i<list.length-1;i++){
      System.out.print(list[i]+ ", ");
    }
    System.out.print(list[list.length-1]+"}");
  }
  
  
}




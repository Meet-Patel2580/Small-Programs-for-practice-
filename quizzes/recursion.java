public class recursion{
  public static void main (String []args){
    System.out.println(numEars(20));
    System.out.println(moreBunnies(10));
    System.out.println(sumDigits(2344));
    int[] array={1,2,3,4,5};
    System.out.println(find6(array,0));
    System.out.println(count7(17971));
  }
  
  public static int numEars(int numBunnies){
    if(numBunnies==0)
      return 0;
    else if(numBunnies==1)
      return 2;
    else
      return numEars(numBunnies-1)+2 ;
  }
  
  public static int moreBunnies(int numBunnies){
    if(numBunnies==0)
      return 0;
    else if(numBunnies==1)
      return 2;
    else if(numBunnies%2==0)
      return moreBunnies(numBunnies-1)+3;
    else
      return moreBunnies(numBunnies-1)+2;
  }
  
  public static int sumDigits(int num){
    if(num<10)
      return num;
    else
      return sumDigits(num/10)+sumDigits(num%10);
  }
  
  public static boolean find6(int[] array, int index){
    if(index<array.length){
      if(array[index]==6)
        return true;
      else
        return find6(array,index+1);
    }
    else
      return false;
  }
  
  
  public static int count7(int num){
    if(num==7)
      return 1;
    else if(num<10)
      return 0;
    else{
      if(num%10==7)
        return 1+ count7(num/10);
      else 
        return 0+ count7(num/10);
    }
    
  }
  
}
public class sample2{
  public static void main (String[]args){
  
    int [] multiples= {1,4,6,9,12,44,55,23,43,5};
    System.out.println(lastMultiple(multiples));
  }
  public static int lastMultiple(int[] list){
   int index=-2;
      for(int i=list.length-1; i>=0;i--){
      if(list[i]%3==0){
        index=list[i];
        break;
      
      }
    }
    return index;
  }
}
public class SumEvens{
  public static void main(String[]args){
    
    //regular test case, to show that method stops at last index and doesnt result in a indexOutOfBounds exception.
    int[] array= {14,2,1,5,6,7,1,9,10};
    System.out.println("{14,2,1,5,6,7,1,9,10} --> Sum of even numbers should be: 32");
    System.out.println("Output from method:"+sumEvens(array,0)+"\n");
    
    //test case with negative values and odd numbers
    int[] array1= {-5,1,3,7,-9};
    System.out.println("{-5,1,3,7,-9} --> Sum of even numbers should be: 0");
    System.out.println("Output from method:"+sumEvens(array1,0)+"\n");
    
    //test case with negative even numbers and 0 as well. 
    int[] array2= {-4,1,6,-7,8,0};
    System.out.println("{-4,1,6,-7,8,0} --> Sum of even numbers should be: 10");
    System.out.println("Output from method:"+sumEvens(array2,0)+"\n");
    
    
  }
  
  public static int sumEvens(int[] array, int index){
    if(index<array.length){
      if(array[index]%2==0){
        return array[index]+sumEvens(array,index+1);
      }
      else{
        return 0+sumEvens(array,index+1);
      }
    }
    else{
      return 0;
    }
  }
  
}
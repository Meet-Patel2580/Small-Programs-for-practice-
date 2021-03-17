//Meet Patel
//RemoveElement.java

public class RemoveElement{
  public static void main (String [] args){
    
    //test case for arrays of type int
    int[] intArray={5,8,2,0,9};
    printArray(removeElementAt(intArray,4));
    printArray(removeElementAt(intArray,2));
    
    System.out.println();
    
    //test case for arrays of type double
    double[] doubleArray={2.5,6.4,3.8,4.3,5.3,21.2,57.1};
    printArray(removeElementAt(doubleArray,1));
    printArray(removeElementAt(doubleArray,5));
    
  }
  
  //for arrays of type int
  //returns new array without the element at given index
  public static int[] removeElementAt(int[] originalArray, int index){
    int[] newArray = new int[originalArray.length-1];
    for(int i=0;i<=originalArray.length-1;i++){
      if(i<index){
        newArray[i]=originalArray[i];
      }
      else if(i>index){
        newArray[i-1]=originalArray[i];
      }
    }
    return newArray;
  }
  
  //for arrays of type double
  //returns new array without the element at given index
  public static double[] removeElementAt(double[] originalArray, int index){
    double[] newArray = new double[originalArray.length-1];
    for(int i=0;i<=originalArray.length-1;i++){
      if(i<index){
        newArray[i]=originalArray[i];
      }
      else if(i>index){
        newArray[i-1]=originalArray[i];
      }
    }
    return newArray;
  }
  // Helper Method - Nicely prints out an array of ints
  public static void printArray(int[] list){
    System.out.print("{");
    for(int i=0;i<list.length-1;i++){
      System.out.print(list[i]+ ", ");
    }
    System.out.println(list[list.length-1]+"}");
  }
  
  // Helper Method - Nicely prints out an array of doubles
  public static void printArray(double[] list)
  {
    System.out.print("{");
    for(int i = 0; i < list.length-1; i++){
      System.out.print(list[i] + ", ");
    }
    System.out.println(list[list.length-1]  + "}");
  } 
}
import java.util.Scanner;
public class Main3{
  public static void main(String[] args){
    
    Scanner kbReader= new Scanner(System.in);
    int n = kbReader.nextInt();
    int m = kbReader.nextInt();
    int k = kbReader.nextInt();
    
    int[][] canvas= new int[m][n];
    
    for(int i=k;i>0;i--){
      String input = kbReader.nextLine();
      String[] choices=input.split(" ");
      int num= Integer.parseInt(choices[1]);
        
      if(choices[0].equals("R")){
      applyPaintRows(num, canvas, n);
      }
      else if(choices[0].equals("C")){
       applyPaintCol(num, canvas, m);
      }
    }
    
   System.out.println(numGold(canvas));
    
  }
  
  public static int numGold(int[][] array){
    int goldInside=0;
    for (int outer = 0; outer < array.length;outer++){
      for(int inner = 0; inner < array[outer].length; inner++){
        if (array[outer][inner]==1){
          goldInside++;
        }
      }
    }
    return goldInside;
  }
  
  public static int[][] applyPaintRows(int a, int[][] array, int col){  
    for(int x=col-1; x>-1;x--){  
        if(array[a-1][x]==0){
          array[a-1][x] = 1; 
         }
        else{
        array[a-1][x] = 0; 
        }
    }
    return array;
}
    public static int[][] applyPaintCol(int a, int[][] array, int row){  
    for(int x=row-1; x>-1;x--){  
        if(array[x][a-1]==0){
          array[x][a-1] = 1; 
         }
        else{
        array[x][a-1] = 0; 
        }
    }
    return array;
}
  
  }
  
 

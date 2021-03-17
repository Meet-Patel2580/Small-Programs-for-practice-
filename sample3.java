public class sample3{
  public static void main (String []args){
    
    if(checkInt("fes"))
      System.out.println("true");
    else
      System.out.println("false");
  }
  
  public static boolean checkInt(String checkForDigit){
    int numDigits= 0;
    boolean isDigit=false;
    for(int i=0;i<checkForDigit.length()-1;i++){
      if (Character.isDigit(checkForDigit.charAt(i))){
        numDigits++;
      }
      else{
        isDigit= false;
      }
    }
    if (numDigits==checkForDigit.length()-1){
      isDigit= true;
    }
    return isDigit;
  }
}
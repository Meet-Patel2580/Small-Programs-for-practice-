public class sample4{
  public static void main(String[] args){
    String hello="hello";
    char originalLetter='l';
      char newLetter='y';
      replace(hello, originalLetter, newLetter);
  }  
  public static void replace(String word, char originalLetter, char replace){
    String newWord="";
    for(int i=0;i<word.length();i++){
      if (word.charAt(i)==originalLetter){
        newWord+=replace;
      } 
      else{
        newWord+=word.charAt(i);
      }
    }
    System.out.println(newWord);
  }
}
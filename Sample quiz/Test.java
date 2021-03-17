public class Test{
  public static void main(String[]args){
  
    OrderedPair testToString=new OrderedPair();
    System.out.println(testToString);
    
    OrderedPair testToString2=new OrderedPair(0.5,3);
     System.out.println(testToString2);
     
     //getSlope
       System.out.println(testToString2.getSlope(testToString));
     //midpoint
       System.out.println(testToString2.midpoint(testToString));
     //equals
       OrderedPair x=new OrderedPair(0.5004,3.0001);
       System.out.println(testToString2.equals(x));
       // accesor
         System.out.println(testToString2.getY());
        testToString2.setY(4);
       System.out.println(testToString2);
  }
}
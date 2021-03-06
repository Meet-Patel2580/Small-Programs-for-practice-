class OrderedPairTESTING
{
  public static void main(String[] args)
  {
    OrderedPair op1 = new OrderedPair(3, 4);
    OrderedPair op2 = new OrderedPair(-2, -5);
    
    System.out.println(op1);
    System.out.println(op2);
    
    System.out.println(op1.getSlope(op2));
    
    System.out.println(op1.midpoint(op2));
    
    System.out.println(op1.getSlope(op2));
    
    System.out.println(op1.equals(op2));
    OrderedPair op3 = new OrderedPair(3, 4);
    System.out.println(op1.equals(op3));
    
    System.out.println(op1.getSlope(op2));
    
    System.out.println(op1.getY());
    op1.setY(100);
    System.out.println(op1);
    
  }  
}

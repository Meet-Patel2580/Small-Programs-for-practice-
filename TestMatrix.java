class TwoByTwoMatrixTESTING
{
  public static void main(String[] args)
  {
    TwoByTwoMatrix pog = new TwoByTwoMatrix(2, 3, 4, 5);
    TwoByTwoMatrix pog2 = new TwoByTwoMatrix();
    
    //testing toString method
    System.out.println("toString()");
    System.out.println(pog);
    System.out.println(pog2);
    /**
     * [2   3]
     * [4   5]
     * 
     * [0   0]
     * [0   0]
     */
    
    //testing determinant method
    System.out.println("\ndeterminant()");
    TwoByTwoMatrix determinantTest = new TwoByTwoMatrix(2.5, 3.0, 1.0, 0);
    System.out.println(determinantTest.determinant());
    /**
     * -3
     */
    
    //testing plus method
    System.out.println("\nplus()");
    TwoByTwoMatrix addTest = new TwoByTwoMatrix(2, -3, 7, 5);
    TwoByTwoMatrix addTest2 = new TwoByTwoMatrix(7, -5, -2, 0);
    System.out.println(addTest.plus(addTest2));
    /**
     * [9   -8]
     * [5   5]
     */
    
    //testing minus method
    System.out.println("\nminus()");
    System.out.println(addTest.minus(addTest2));
    /**
     * [-5  2]
     * [9   5]
     */
    
    //testing multiply method
    System.out.println("\nmultiply()");
    TwoByTwoMatrix multiplyTest = new TwoByTwoMatrix(2, -2, 5, 3);
    TwoByTwoMatrix multiplyTest2 = new TwoByTwoMatrix(-1, 4, 7, -6);
    System.out.println(multiplyTest.multiply(multiplyTest2));
    /**
     * [-16 20]
     * [16  2]
     */
    
    TwoByTwoMatrix mult = new TwoByTwoMatrix(2, 1, 3, 4);
    TwoByTwoMatrix mult2 = new TwoByTwoMatrix(3, 4, -2, 3);
    System.out.println(mult.multiply(mult2));
    /**
     * [4   11]
     * [1  24]
     */
    
    //testing scalarmultiply method
    System.out.println("\nmultiplyScalar()");
    TwoByTwoMatrix scalarTest = new TwoByTwoMatrix(1, 0, 3, 4);
    scalarTest.scalarMultiply(3.5);
    System.out.println(scalarTest);
    /**
     * [3.5     0]
     * [10.5    14]
     */
    
    //testing isIdentityMatrix method
    System.out.println("\nisIdentityMatrix()");
    TwoByTwoMatrix identity = new TwoByTwoMatrix(1, 0, 0, 1);
    TwoByTwoMatrix notIdentity = new TwoByTwoMatrix(1, 1, 0, 1);
    System.out.println(identity.isIdentityMatrix() + " should be true");
    System.out.println(notIdentity.isIdentityMatrix() + " should be false");
    
    //testing isInvertible method
    System.out.println("\nisInvertible()");
    TwoByTwoMatrix invertible = new TwoByTwoMatrix(2, -3, 7, 5);
    TwoByTwoMatrix notInvertible = new TwoByTwoMatrix(5, 0, 0, 0);
    System.out.println(invertible.isInvertible() + " should be true");
    System.out.println(notInvertible.isInvertible() + " should be false");
    
    //testing isInverse 
    System.out.println("\nisInverse");
    TwoByTwoMatrix first = new TwoByTwoMatrix(2, 3, 5, 7);
    TwoByTwoMatrix firstInverse = new TwoByTwoMatrix(-7, 3, 5, -2);
    System.out.println(first.isInverse(firstInverse) + " should be true");
    System.out.println(pog.isInverse(pog2) + " should be false");
    
    
    //testing equals method
    System.out.println("\nequals()");
    TwoByTwoMatrix pair = new TwoByTwoMatrix(6.234, 7.234111, 7.6241, 5.555);
    TwoByTwoMatrix pair1 = new TwoByTwoMatrix(6.2341, 7.234, 7.624, 5.555123);
    System.out.println(pair.equals(pair1) + " should be true");
    System.out.println(pair);

     
    
    
    TwoByTwoMatrix pear = new TwoByTwoMatrix(1.111111, 7.237, 3.1239, 6.2);
    TwoByTwoMatrix pear2 = new TwoByTwoMatrix(1.111, 7.23, 3.1231, 8.23);
    System.out.println(pear.equals(pear2) + " should be false");
    
    //testing inverse method
    System.out.println("\ninverse()");
    TwoByTwoMatrix inversed = new TwoByTwoMatrix(2, 3, 5, 7);
    System.out.println(inversed.inverse());
    /**
     * [-7  3]
     * [5   -2]
     */
    
    TwoByTwoMatrix inversed2 = new TwoByTwoMatrix(3, 5, -7, 2);
    System.out.println(inversed2.inverse());
    
   
    
    //testing transpose method
    System.out.println("\ntranspose()");
    TwoByTwoMatrix transposed = new TwoByTwoMatrix(3, -5, 7, 1);
    System.out.println(transposed.transpose());
    /**
     * [3   7]
     * [-5  1]
     */
    
    System.out.println(TwoByTwoMatrix.roundThreeDecimals(-1.0/2));
    
     TwoByTwoMatrix sadge = new TwoByTwoMatrix(5, 0 ,0 ,0);
    System.out.println(sadge.inverse());
  }  
}
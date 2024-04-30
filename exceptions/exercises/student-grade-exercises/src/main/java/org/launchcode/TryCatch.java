package org.launchcode;

public class TryCatch {
    public static void main(String[] args) {
        // Test out your Divide() function!
        System.out.println("Test  started");
        int x = 10;
        int y = 0;
        try {
            int result = x/y;
            System.out.println("Division Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println( "Arithmetic error: "+ e.getMessage());
        }
        System.out.println("Test  finished");
    }
//        public static int Divide ( int x, int y) throws ArithmeticException {
//            // Write code here!
//            if (y == 0) {
//                throw new ArithmeticException("Division by zero is not allowed.");
//            }
//            return (x / y);
//        }
//
//}
}

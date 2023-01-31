public class IntAndDouble {
    public static void main(String[] commandLine) {
        System.out.println(floatingPoint(5));
    }

    // writes a method that will provide the 'index'th term in the fibonacci sequence using Binet's formula 
    
    private static int floatingPoint( int index) {
        double sqrtFive = Math.sqrt(5);
        return (int) ((Math.pow(1 + sqrtFive, index) - Math.pow((1 - sqrtFive), index)) / (Math.pow(2, index) * sqrtFive));
    }

}

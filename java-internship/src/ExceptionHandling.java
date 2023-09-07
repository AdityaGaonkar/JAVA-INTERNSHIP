public class ExceptionHandling {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds.");
        }
        //In the previous code there was no try and catch for divide by zero block because it causes and arithmetic exception
        //So by putting  divide(10,0) inside try and catch block the code successfully executes without any error 
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e){
            System.out.println("Divide by zero exception");
        };
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}


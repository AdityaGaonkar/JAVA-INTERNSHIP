public class ArrayManipulation {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};

            for (int i = 0; i <= numbers.length-1; i++)//the previous incorrect code creates an array index out of bounds exception because the last valid index of the array of length n is n-1.
                //Therefore, i should traverse from 0 to n-1
            {
                System.out.println(numbers[i]);
            }
        }
    }

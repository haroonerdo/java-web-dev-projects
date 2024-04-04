import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a list with at least 10 integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        // Call the method to find the sum of even numbers
        int sumEvens = sumEvenNumbers(numbers);
        System.out.println("Sum of even numbers: " + sumEvens);

        // Call the method to find the sum of odd numbers
        int sumOdds = sumOddNumbers(numbers);
        System.out.println("Sum of odd numbers: " + sumOdds);
    }

    // Static method to find the sum of all even numbers in an ArrayList
    public static int sumEvenNumbers(ArrayList<Integer> list) {
        int sum = 0;
        for (int num : list) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
    public static int sumOddNumbers(ArrayList<Integer> list) {
        int sum = 0;
        for (int num : list) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        return sum;
    }


}

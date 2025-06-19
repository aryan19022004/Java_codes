import java.util.Scanner;

public class Java_day2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check for primality: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }

    /**
     * Checks if a given integer is a prime number.
     * A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
     *
     * @param num The integer to check.
     * @return true if the number is prime, false otherwise.
     */
    public static boolean isPrime(int num) {
        // 0, 1, and negative numbers are not prime.
        if (num <= 1) {
            return false;
        }

        // 2 is the only even prime number.
        if (num == 2) {
            return true;
        }

        // If the number is even and greater than 2, it's not prime.
        if (num % 2 == 0) {
            return false;
        }

        // Check for divisibility from 3 up to the square root of the number,
        // incrementing by 2 to only check odd divisors.
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false; // If divisible by any number, it's not prime.
            }
        }

        return true; // If no divisors are found, it's prime.
    }
}
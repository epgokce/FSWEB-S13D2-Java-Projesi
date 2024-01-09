public class Main {
    public static void main(String[] args) {
        System.out.println("Finding Palindrome Numbers:");
        System.out.println(isPalindrome(-1221)); //true
        System.out.println(isPalindrome(707)); //true
        System.out.println(isPalindrome(11212)); //false
        System.out.println("Finding Perfect Numbers:");
        System.out.println(isPerfectNumber(6));   // true
        System.out.println(isPerfectNumber(28));  // true
        System.out.println(isPerfectNumber(5));   // false
        System.out.println(isPerfectNumber(-1));  // false
    }

    public static boolean isPalindrome(int number) {

        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
    public static boolean isPerfectNumber(int number) {

        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }
}
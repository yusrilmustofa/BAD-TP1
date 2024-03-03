import java.util.Scanner;

public class TP1_NO3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input sebuah angka bulat: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " bilangan anda adalah Prima");
        } else {
            System.out.println(number + " bukan Bilanagan Prima karena bisa dibagi oleh " + findDivisor(number));
        }

        scanner.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int findDivisor(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return i;
            }
        }
        return -1;
    }
}

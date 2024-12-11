public class PrimeNumb {
    public static void main(String[] args) {
        int limit = 100; // Change this to set the range
        for (int num = 2; num <= limit; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
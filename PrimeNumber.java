public class PrimeNumber {

    private static boolean isPrimeNumber(int number) {

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        System.out.println();
        return true;
    }


    public static void main(String args[]) {

        int number = 2;
        int count = 0;
        long sum = 0;
        float avg = 0;
        while (number < 1000) {
            if (isPrimeNumber(number)) {
                sum += number;
                count++;

                avg = sum / count;
            }
            number++;
        }
        System.out.println("Sum of prime numbers between 1 to 1000 is:" + sum);
        System.out.println("Average of prime numbers between 1 to 1000 is:" + avg);
    }

}
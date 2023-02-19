import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int ini = scanner.nextInt();
        int end = scanner.nextInt();

        for (; ini <= end; ini++) {
            if (ini % 3 == 0 && ini % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (ini % 5 == 0) {
                System.out.println("Buzz");
            } else if (ini % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(ini);
            }
        }
    }
}
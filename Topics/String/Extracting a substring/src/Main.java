import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String word = scanner.nextLine();
        int num = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.print(word.substring(num, ++num2));
    }
}
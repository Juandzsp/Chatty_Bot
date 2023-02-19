import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int dias = scanner.nextInt();
        int comida = scanner.nextInt();
        int vuelo = scanner.nextInt();
        int hotel = scanner.nextInt();

        System.out.println(dias * comida + vuelo * 2 + hotel * --dias);

    }
}

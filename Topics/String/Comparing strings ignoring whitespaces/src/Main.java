import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String str = scanner.nextLine().replace(" ", "");
        String space = scanner.nextLine().replace(" ", "");

        System.out.println(str.equals(space));
    }
}
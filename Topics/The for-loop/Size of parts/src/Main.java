import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int l = 0;
        int s = 0;
        int p = 0;

        for (int i = 0; i < n; i++) {
            int test = scanner.nextInt();
            if (test == -1) {
                s++;
            } else if (test == 0) {
                p++;
            } else {
                l++;
            }
        }
        System.out.println(p + " " + l + " " + s);
    }
}

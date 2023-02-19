package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        greet("Athena", "2023"); // change it as you need
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hola! Mi nombre es " + assistantName + ".");
        System.out.println("Fui creada en " + birthYear + ".");
        System.out.println("Por favor, recuerdame tu nombre.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("Que genial nombre tienes, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Dejame adivinar tu nombre.");
        System.out.println("Ingresa el sobrante de dividir tu edad entre 3, 5 y 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Tu edad es " + age + "; buen tiempo para aprender a programar!");
    }

    static void count() {
        System.out.println("Ahora te probare que puedo contar hasta el numero que me pidas.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println(i + "!");
        }
    }

    static void test() {
        System.out.println("Probemos tu conocimiento de programacion.");
        int correcto = 0;
        // write your code here
        while(correcto != 1){
            System.out.println("Cuales son los mejores lenguajes para Front-end?");
            System.out.println("1. Java, C++, Python");
            System.out.println("2. Java script, CSS, HTML");
            System.out.println("3. C, PHP, Arduino");
            System.out.println("4. C++, CSS, HTML");
            int respuesta = scanner.nextInt();
            if(respuesta == 2){
                correcto++;
            }else {
                System.out.println("Por favor, intentalo de nuevo.");
            }
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}

import java.util.Scanner;


public class Question5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a string que terá seus caracteres invertidos: ");

        String original = scanner.nextLine();
        String invertida = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }

        System.out.println("String digitada: " + original);
        System.out.println("String após a inversão: " + invertida);
    }
}
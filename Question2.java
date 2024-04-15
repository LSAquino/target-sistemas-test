import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número que deseja verificar se está na sequência de Fibonacci: ");

        int number = scanner.nextInt();
        int a = 0, b = 1;
        boolean isFibonacci = false;

        while (b <= number) {
            if (b == number) {
                isFibonacci = true;
                break;
            }
            int temp = b;
            b = a + b;
            a = temp;
        }

        if (isFibonacci) {
            System.out.println("O número " + number + " está presente na sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " não está presente na sequência de Fibonacci.");
        }
    }

}

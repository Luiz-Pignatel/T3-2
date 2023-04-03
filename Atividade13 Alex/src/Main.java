import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.print("Digite um numero: ");
        
        while (!input.hasNextInt()) {
            System.out.print("Digite apenas numeros: ");
            input.next();
        }
        numero = input.nextInt();

        if (numero < 10) {
            System.out.println(numero + " Menor que 10");
        } else if (numero == 10) {
            System.out.println(numero + " Igual a 10");
        } else if (numero > 10) {
            System.out.println(numero + " Maior que 10");
        }
    }
}
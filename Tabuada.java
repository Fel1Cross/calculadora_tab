package Tabuada;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Scanner;

public class tabuada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero1, numero2, resultado;
        int opcao;
        String continuar = "";

        do {
            System.out.println("\n===== CALCULADORA COM TABUADA =====");
            System.out.println("Feito por Fabiano e Felipe");
            System.out.println("-----------------------------------");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Tabuada");
            System.out.print("Digite a opção (1 a 5): ");

            try {
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o primeiro número: ");
                        numero1 = scanner.nextDouble();
                        System.out.print("Digite o segundo número: ");
                        numero2 = scanner.nextDouble();
                        resultado = numero1 + numero2;
                        System.out.printf("Resultado: %.2f%n", resultado);
                        break;

                    case 2:
                        System.out.print("Digite o primeiro número: ");
                        numero1 = scanner.nextDouble();
                        System.out.print("Digite o segundo número: ");
                        numero2 = scanner.nextDouble();
                        resultado = numero1 - numero2;
                        System.out.printf("Resultado: %.2f%n", resultado);
                        break;

                    case 3:
                        System.out.print("Digite o primeiro número: ");
                        numero1 = scanner.nextDouble();
                        System.out.print("Digite o segundo número: ");
                        numero2 = scanner.nextDouble();
                        resultado = numero1 * numero2;
                        System.out.printf("Resultado: %.2f%n", resultado);
                        break;

                    case 4:
                        System.out.print("Digite o primeiro número: ");
                        numero1 = scanner.nextDouble();
                        System.out.print("Digite o segundo número: ");
                        numero2 = scanner.nextDouble();
                        if (numero2 != 0) {
                            resultado = numero1 / numero2;
                            System.out.printf("Resultado: %.2f%n", resultado);
                        } else {
                            System.out.println("Erro: Divisão por zero!");
                        }
                        break;

                    case 5:
                        System.out.print("Digite um número para ver a tabuada: ");
                        int numTabuada = scanner.nextInt();
                        System.out.println("Tabuada do " + numTabuada + ":");
                        for (int i = 1; i <= 10; i++) {
                            System.out.println(numTabuada + " x " + i + " = " + (numTabuada * i));
                        }
                        break;

                    default:
                        System.out.println("Opção inválida. Digite um número de 1 a 5.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Digite apenas números.");
                scanner.nextLine(); 
                continue;
            }

            System.out.print("Deseja fazer outra operação? (s/n): ");
            continuar = scanner.next();

        }while (continuar.equalsIgnoreCase("s"));

        System.out.println("Calculadora finalizada.");
        scanner.close();
    }
}


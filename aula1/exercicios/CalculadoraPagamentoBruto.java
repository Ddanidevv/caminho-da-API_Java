package aula1.exercicios;

import java.util.Scanner;

public class CalculadoraPagamentoBruto {

  /**
   * @param arg
   */
  public static void main(String arg[]) {
    //1. Get the number of hours worked
    System.out.println("Insira o número de horas que o funcionário trabalhou.");
    Scanner scanner = new Scanner(System.in);
    int hora = scanner.nextInt();

    //2. Get the hourly pay rate
    System.out.println("Insira a taxa de pagamento do funcionário.");
    double taxa = scanner.nextDouble();
    scanner.close();

    //3. Multiply hours and pay rate
    double pagamentoBruto = hora * taxa;

    //4. Display result
    System.out.println("o salário bruto do funcionário é" + pagamentoBruto);
  }
}

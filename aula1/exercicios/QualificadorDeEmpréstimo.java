package aula1.exercicios;

import java.util.Scanner;

public class QualificadorDeEmpréstimo {

  public static void main(String[] args) {
    // Inicialize o que sabemos
    int requerimentoSalario = 3000;
    int obrigatorioAnosEmpregados = 2;

    //Obter o que não conseguimos
    System.out.println("Digite seu salário");
    Scanner scanner = new Scanner(System.in);
    double salario = scanner.nextDouble();

    System.out.println("Insira o número de anos com seu empregador atual:");
    double anos = scanner.nextDouble();

    scanner.close();

    //Tomar decisão
    if (salario >= requerimentoSalario) {
      if (anos >= obrigatorioAnosEmpregados) {
        System.out.println("Parabéns! Você se qualifica para o empréstimo");
      } else {
        System.out.println(
          "Desculpe, você deve ter trabalhado em seu emprego atual" + "anos"
        );
      }
    } else {
      System.out.println(
        "Desculpe, você deve ganhar pelo menos $" + requerimentoSalario + " para se qualificar para o empréstimo." );
    }
  }
}

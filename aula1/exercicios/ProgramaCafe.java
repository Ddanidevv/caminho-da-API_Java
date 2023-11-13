package aula1.exercicios;

import java.util.Scanner;

public class ProgramaCafe {

  public static void main(String[] args) {
    // Crie um objeto Scanner para obter entrada do usuário
    Scanner scanner = new Scanner(System.in);

    // Peça ao usuário para inserir uma estação do ano
    System.out.print("Digite uma estação do ano: ");
    String estacao = scanner.nextLine();

    // Peça ao usuário para inserir um número inteiro
    System.out.print("Digite um número inteiro: ");
    int numero = scanner.nextInt();

    // Consuma a nova linha após a entrada do número inteiro
    scanner.nextLine();

    // Peça ao usuário para inserir um adjetivo
    System.out.print("Digite um adjetivo: ");
    String adjetivo = scanner.nextLine();

    // Crie a frase completa
    String frase = String.format(
      "Num dia %s de %s, eu bebo no mínimo %d xícaras de café.",
      adjetivo,
      estacao,
      numero
    );

    // Exiba a frase completa
    System.out.println(frase);

    // Feche o Scanner
    scanner.close();
  }
}

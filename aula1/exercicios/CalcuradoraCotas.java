package aula1.exercicios;

import java.util.Scanner;

public class CalcuradoraCotas {

  public static void main(String[] args) {
    int cota = 10;
    System.out.println("Insira o número de vendas que você fez esta semana");
    Scanner scanner = new Scanner(System.in);
    int vendas = scanner.nextInt();
    scanner.close();
if (vendas >= cota){
    System.out.println("Parabéns! Você atingiu sua cota");
}
else{
    int vendaCurta = cota - vendas;
    System.out.println("Você não atingiu sua cota. Você estava " + vendaCurta + "venda curta ");
}

  }
}

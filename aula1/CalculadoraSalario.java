package aula1;

import java.util.Scanner;

public class CalculadoraSalario {
    public static void main(String args[]){
 //Inicializa valores conhecidos
    int salario = 1000;
    int bonus = 250;
    int quota = 10;

//Obter valores para o desconhecido
System.out.println("Quantas vendas o funcionário fez esta semana?");
Scanner scanner = new Scanner (System.in);
int vendas = scanner.nextInt();
scanner.close();

//Desvio rápido para os ganhadores de bônus
if (vendas > quota){
    salario = salario + bonus;
}
    System.out.print("O salário do funcionário é R$" + salario);
}
}
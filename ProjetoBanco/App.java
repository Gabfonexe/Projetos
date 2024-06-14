package ProjetoBanco;

import java.util.Scanner;

import ProjetoBanco.Contas.ContaCorrente;

public class App {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite Seu nome: ");
    String titular = sc.nextLine();
    System.out.println("Digite a sua Angência: ");
    int agencia = sc.nextInt();
    double saldo = 0;
    ContaCorrente contaCorrente = new ContaCorrente(titular, saldo, agencia);

    System.out.println(contaCorrente.toString());
    

  }
}

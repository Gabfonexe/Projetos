package ProjetoBanco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ProjetoBanco.Contas.ContaCorrente;
import ProjetoBanco.Contas.ContaInvestimento;
import ProjetoBanco.Contas.ContaPoupanca;

public class App {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    try {

      boolean ligado = true;

      while (ligado) {

        System.out.println("Qual tipo de conta você deseja abrir :\n \n [1]Corrente\n [2]Poupança\n [3] Investimento\n");
        int n = sc.nextInt();
      
        switch (n) {

          case 1:
            if (true) {
              System.out.println("Digite Seu nome: ");
              String titular = sc.next();
              System.out.println("Digite a sua Angência: ");
              int agencia = sc.nextInt();
              double saldo = 0;
              List <ContaCorrente> listaCorrente = new ArrayList<>();
              listaCorrente.add(new ContaCorrente(titular, saldo, agencia));
              System.out.println(listaCorrente.toString()); ligado = false;
              break;
            }

          case 2:
            if (true) {
              System.out.println("Digite Seu nome: ");
              String titular = sc.next();
              System.out.println("Digite a sua Angência: ");
              int agencia = sc.nextInt();
              double saldo = 0;
              List<ContaPoupanca> listaPoupanca = new ArrayList<>();
              listaPoupanca.add(new ContaPoupanca(titular, saldo, agencia));
              System.out.println(listaPoupanca.toString()); ligado = false;
              break;
            }

          case 3:
            if (true) {
              System.out.println("Digite Seu nome: ");
              String titular = sc.next();
              System.out.println("Digite a sua Angência: ");
              int agencia = sc.nextInt();
              double saldo = 0;
              List<ContaInvestimento> listaInvestimentos = new ArrayList<>(); 
              listaInvestimentos.add(new ContaInvestimento(titular, saldo, agencia));
              System.out.println(listaInvestimentos.toString());ligado = false;
              break;
            }

          default:
            System.out.println("Digite um número entre 1 - 3: ");
        }
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    try{
      System.out.println("Conta criado com sucesso . . . \n");
      System.out.println("Deseja Realizar alguma Operação financeira [s]im / [nao] ?");
      String res = sc.next();

      if(res == "s"){
        System.out.println("Operações bancárias: \n [1] Depositar\n [2] Sacar\n [3] Saldo \n");
        int n = sc.nextInt();

        switch (n) {
          case 1:
            
            break;
          
          case 2:
            
            break;

          case 3:
            
            break;
            
          default:
            break;
        }
      }

    }catch (Exception e){

    }




  }
}

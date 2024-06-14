package ProjetoBanco;

import java.util.Scanner;
import ProjetoBanco.Model.LimparTela;
import ProjetoBanco.Contas.ContaCorrente;
import ProjetoBanco.Contas.ContaInvestimento;
import ProjetoBanco.Contas.ContaPoupanca;

public class App {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    LimparTela lt = new LimparTela();
    ContaCorrente contaCorrente = new ContaCorrente();
    ContaPoupanca contaPoupanca = new ContaPoupanca();
    ContaInvestimento contaInvestimento = new ContaInvestimento();

    try {

      boolean ligado = true;

      while (ligado) {

        System.out
            .println("Qual tipo de conta você deseja abrir :\n \n [1] Corrente\n [2] Poupança\n [3] Investimento\n");
        int n = sc.nextInt();
        lt.limparTela();

        switch (n) {

          case 1:
            if (true) {
              System.out.println("Digite Seu nome: ");
              String titular = sc.next();
              System.out.println("Digite a sua Angência: ");
              int agencia = sc.nextInt();
              lt.limparTela();
              double saldo = 0;
              contaCorrente.adicionarConta(titular, agencia, saldo);
              System.out.println(contaCorrente.toString());
              break;
            }

          case 2:
            if (true) {
              System.out.println("Digite Seu nome: ");
              String titular = sc.next();
              System.out.println("Digite a sua Angência: ");
              int agencia = sc.nextInt();
              double saldo = 0;
              contaPoupanca.adicionarConta(titular, agencia, saldo);
              break;
            }

          case 3:
            if (true) { 
              
              System.out.println("Qual tipo de investimento você deseja? \n\n [1] risco baixo - 9% a.a \n [2] risco médio - 16% a.a \n [3] risco alto - 23% a.a\n");
              System.out.println("Digite Seu nome: ");
              String titular = sc.next();
              System.out.println("Digite a sua Angência: ");
              int agencia = sc.nextInt();
              double saldo = 0;
              contaInvestimento.adicionarConta(titular, saldo, agencia);
              break;
            }

          default:
            System.out.println("Digite um número entre 1 - 3: ");
            continue;
        }
        System.out.println();
        System.out.println("Criando conta");Thread.sleep(2000);
        for(int i=0; i < 5; i++){
          System.out.println("."); Thread.sleep(2000);
        }
        lt.limparTela();
        System.out.println();
        System.out.println("Conta criada com sucesso  \n");
        System.out.println("Deseja Realizar alguma Operação financeira [s]im / [nao] ?");
        char res = sc.next().charAt(0);

        if (res == 's') {

          System.out.println("Operações bancárias: \n [1] Depositar\n [2] Sacar\n [3] Saldo \n");
          int x = sc.nextInt();

          switch (x) {
            case 1:

              System.out.println("Digite o valor de Depósito: ");
              double valor = sc.nextDouble();

              if (n == 1) {
                contaCorrente.deposito(valor);
                System.out.println(contaCorrente.toString());
                System.out.println("Deseja sair? [1] sim / [2] não ");
                int num = sc.nextInt();
                switch (num) {
                  case 1:
                    ligado = false;
                    break;
                  case 2:
                    break; 
                }
                
              } else if (n == 2) {
                contaPoupanca.deposito(valor);
                System.out.println(contaPoupanca.toString());
                
              } else if (n == 3) {
                contaInvestimento.deposito(valor);
                System.out.println(contaInvestimento.toString());
                
              }
              break;

            case 2:

              System.out.println("Digite o valor de Saque: ");
              valor = sc.nextDouble();

              if (n == 1) {
                contaCorrente.saque(valor);
                System.out.println(contaCorrente.toString());
                System.out.println("Deseja sair? [1] sim / [2] não ");
                String num = sc.next();
                switch (num) {
                  case "1":
                    continue;
                  case "2":
                    
                    break; 
                }
                
              } else if (n == 2) {
                contaPoupanca.saque(valor);
                System.out.println(contaPoupanca.toString());
                
              } else if (n == 3) {
                contaInvestimento.saque(valor);
                System.out.println(contaInvestimento.toString());
                
              }
              break;

            case 3:
              if (n == 1) {
                System.out.println(contaCorrente.toString());
                
              } else if (n == 2) {
                System.out.println(contaPoupanca.toString());
                
              } else if (n == 3) {
                System.out.println(contaInvestimento.toString());
                
              }
              break;

            default:
              break;
          }
        } else {
          ligado = false;
          break;
        }
      }

      System.out.println("Deseja Adicionar Mais alguma conta? ");

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    finally { // pode gerar erro do while
      sc.close();
    }

  }
}

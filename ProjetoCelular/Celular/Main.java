package ProjetoCelular.Celular;

import java.util.Scanner;
import java.lang.Exception;
import ProjetoCelular.Limpartela.LimparTela;

import ProjetoCelular.Sistema.Sistema;

public class Main {
  public static void main(String[] args) throws ExceptionCelular {

    Scanner sc = new Scanner(System.in);
    Sistema sistema = new Sistema();
    LimparTela limpar = new LimparTela();

    boolean ligado = true;

    while (ligado) {

      try {
        System.out.println("Deseja iniciar o sistema ? [s] / [n]");
        char resposta = sc.next().charAt(0);
        limpar.limparTela();
        if (resposta != 's' && resposta != 'n') {
          Thread.sleep(1000);
          throw new ExceptionCelular("Digite [s] ou [n] \n");
        }
        limpar.limparTela();
        System.out.println("-------------------------------------------");

        if (resposta == 's') {

          sistema.rodarSistema();

          Thread.sleep(2000);
          System.out.println();
          limpar.limparTela();

          System.out.printf(
              "Digite a opção desejada: \n [1] Camera\n [2] Música\n [3] Internet\n [4] Telefone\n [5] GPS\n \n ");
          Integer num = sc.nextInt();
          System.out.println();
          limpar.limparTela();
          ValidarNumero validar = new ValidarNumero(num);

          switch (validar.validarNumero(num)) {
            case 1:
              System.out.println(". . . Abrindo aplicativo de Camêra . . .");
              Thread.sleep(2000);
              sistema.tirarFoto();
              Thread.sleep(1000);
              sistema.gravarVideo();
              Thread.sleep(1000);
              sistema.armazenar();
              Thread.sleep(1000);
              System.out.println("-------------------------------------------");
              System.out
                  .println("Aperte 1 para retornar ao menu ou pressione qualquer outro número para desligar o celular");
              int a = sc.nextInt();
              if (a == 1) {
                break;
              } else {
                ligado = false;
                System.out.println("Desligando o celular . . .");
                Thread.sleep(1000);
                break;
              }

            case 2:
              System.out.println(". . . Abrindo aplicativo de Música . . .");
              Thread.sleep(2000);
              sistema.selecionarMusica();
              Thread.sleep(1000);
              sistema.tocarMusica();
              Thread.sleep(1000);
              sistema.pausarMusica();
              Thread.sleep(1000);
              sistema.proximaMusica();
              Thread.sleep(1000);
              sistema.anteriorMusica();
              Thread.sleep(1000);
              System.out.println("-------------------------------------------");
              System.out
                  .println("Aperte 1 para retornar ao menu ou pressione qualquer outro número para desligar o celular");
              int b = sc.nextInt();
              if (b == 1) {
                break;
              } else {
                ligado = false;
                System.out.println("Desligando o celular . . .");
                Thread.sleep(1000);
                break;
              }

            case 3:
              System.out.println(". . . Abrindo o Navegador de Internet . . .");
              Thread.sleep(2000);
              sistema.acessarInternet();
              Thread.sleep(1000);
              sistema.adicionarAba();
              Thread.sleep(1000);
              sistema.atualizarPagina();
              Thread.sleep(1000);
              System.out.println("-------------------------------------------");
              System.out
                  .println("Aperte 1 para retornar ao menu ou pressione qualquer outro número para desligar o celular");
              int c = sc.nextInt();
              if (c == 1) {
                break;
              } else {
                ligado = false;
                System.out.println("Desligando o celular . . .");
                Thread.sleep(1000);
                break;
              }

            case 4:
              System.out.println(". . . Abrindo lista de Contatos . . .");
              Thread.sleep(2000);
              sistema.armazenarContato();
              Thread.sleep(1000);
              sistema.ligar();
              Thread.sleep(1000);
              sistema.iniciarCorreioVoz();
              Thread.sleep(1000);
              sistema.desligar();
              Thread.sleep(1000);
              System.out.println("-------------------------------------------");
              System.out
                  .println("Aperte 1 para retornar ao menu ou pressione qualquer outro número para desligar o celular");
              int d = sc.nextInt();
              if (d == 1) {
                break;
              } else {
                ligado = false;
                System.out.println("Desligando o celular . . .");
                Thread.sleep(1000);
                break;
              }

            case 5:
              System.out.println(". . . Abrindo GPS . . .");
              Thread.sleep(2000);
              sistema.acessarCoordenadas();
              Thread.sleep(1000);
              sistema.fornecerLocalizacao();
              Thread.sleep(1000);
              System.out.println("-------------------------------------------");
              System.out
                  .println("Aperte 1 para retornar ao menu ou pressione qualquer outro número para desligar o celular");
              int e = sc.nextInt();
              if (e == 1) {
                break;
              } else {
                ligado = false;
                System.out.println("Desligando o celular . . .");
                Thread.sleep(1000);
                break;
              }
          }

        } else if (resposta == 'n') {
          System.out.println("Desligando o celular . . .");

          String[] vetor = new String[20];

          for (int i = 0; i < vetor.length; i++) {
            vetor[i] = "=";
            vetor[i] += "-";
            System.out.print(vetor[i]);
            Thread.sleep(300);
          }
          System.out.println("-");
          ligado = false;
        }
      }

      catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
  }
}

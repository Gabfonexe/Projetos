package ProjetoCelular.Celular;
import java.util.Scanner;
import java.lang.Exception;
import ProjetoCelular.Limpartela.LimparTela;

import ProjetoCelular.Sistema.Sistema;

public class Main{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Sistema sistema = new Sistema();
    LimparTela limpar = new LimparTela();

    boolean ligado = true;

    while (ligado){

      try{

        System.out.println("Deseja iniciar o sistema ? [SIM] / [NAO]");
        char resposta = sc.next().charAt(0);
        limpar.limparTela();
        
        System.out.println("-------------------------------------------");

        if(resposta == 's'){
          
          System.out.println(sistema.rodarSistema()); // método de retorno 
          for (int i=0; i < 3; i++){
            System.out.println("... Carregando"); Thread.sleep(1000);
          }
          Thread.sleep(2000);
          System.out.println();
          limpar.limparTela();

          System.out.printf("Digite a opção desejada: \n [1] Camera\n [2] Música\n [3] Internet\n [4] Telefone\n [5] GPS\n \n ");
          Integer num = sc.nextInt();
          System.out.println();
          limpar.limparTela();

          boolean loop = true;
          while (loop){
            switch (num) {
              case 1:
                System.out.println(". . . Abrindo aplicativo de Camêra . . ."); Thread.sleep(2000);
                sistema.tirarFoto(); Thread.sleep(1000);
                sistema.gravarVideo(); Thread.sleep(1000);
                sistema.armazenar(); Thread.sleep(1000);
                System.out.println("-------------------------------------------");
                break;
              
              case 2:
                System.out.println(". . . Abrindo aplicativo de Música . . ."); Thread.sleep(2000);
                sistema.selecionarMusica(); Thread.sleep(1000);
                sistema.tocarMusica(); Thread.sleep(1000);
                sistema.pausarMusica(); Thread.sleep(1000);
                sistema.proximaMusica(); Thread.sleep(1000);
                sistema.anteriorMusica(); Thread.sleep(1000);
                System.out.println("-------------------------------------------");
                break;
  
              case 3:
                System.out.println(". . . Abrindo o Navegador de Internet . . ."); Thread.sleep(2000);
                sistema.acessarInternet(); Thread.sleep(1000);
                sistema.adicionarAba(); Thread.sleep(1000);
                sistema.atualizarPagina(); Thread.sleep(1000);
                System.out.println("-------------------------------------------");
                break;
  
              case 4:
                System.out.println(". . . Abrindo lista de Contatos . . ."); Thread.sleep(2000);
                sistema.armazenarContato(); Thread.sleep(1000);
                sistema.ligar(); Thread.sleep(1000);
                sistema.iniciarCorreioVoz(); Thread.sleep(1000);
                sistema.desligar(); Thread.sleep(1000);
                System.out.println("-------------------------------------------");
                break;
  
              case 5:
                System.out.println(". . . Abrindo GPS . . ."); Thread.sleep(2000);
                sistema.acessarCoordenadas(); Thread.sleep(1000);
                sistema.fornecerLocalizacao(); Thread.sleep(1000);
                System.out.println("-------------------------------------------");
                break;
            
              default:
                System.out.println("Digite um número entre 1 - 5 ");
                break;
            }

          }
          
        }
        else if (resposta == 'n'){
          System.out.println("Desligando o celular . . .");

          String[] vetor = new String[10];
      

          for(int i=0; i<vetor.length; i++){
            vetor[i] += "teste";
            System.out.println(vetor[i]);
            
          }
          System.out.println("-");
          ligado = false;
        }

      }

      catch(Exception e){
        System.out.println(e.getMessage());
      }
      
  
  

    }

        
  }
  
}

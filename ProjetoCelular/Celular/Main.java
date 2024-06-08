package ProjetoCelular.Celular;
import java.util.Scanner;
import java.lang.Exception;

import ProjetoCelular.Sistema.Sistema;

public class Main{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Sistema sistema = new Sistema();

    boolean ligado = true;

    while (ligado){

      try{

        System.out.println("Deseja iniciar o sistema ? [SIM] / [NAO]");
        char resposta = sc.next().charAt(0);

        System.out.println("-------------------------------------------");

        if(resposta == 's'){
          
          System.out.println(sistema.rodarSistema()); // método de retorno 
          for (int i=0; i < 5; i++){
            System.out.println(".");
          }
          System.out.println();
        }
        else{
          System.out.println("Desligando o celular . . .");
          System.out.println("-------------------------------------------");
        }

      }

      catch(Exception e){
        System.out.println(e.getMessage());
      }
      
  
  

    }

        
  }
  
}

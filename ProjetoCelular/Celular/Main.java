package ProjetoCelular.Celular;
import java.util.Scanner;
import java.lang.Exception;

import ProjetoCelular.Sistema.Sistema;

public class Main{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Sistema sistema = new Sistema();

    try{
      System.out.println("Deseja iniciar o sistema ? [S] / [N]");
    String resposta = sc.next().toUpperCase();
    if(resposta == "S"){

    }
    System.out.println(sistema.rodarSistema()); // método de retorno 
    }

    catch(Exception e){
      System.out.println(e.getMessage());
    }
    
    
    
  }
  
}

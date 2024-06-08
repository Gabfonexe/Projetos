package ProjetoCelular.Celular;

import java.util.Scanner;

public class ValidarNumero {

  Scanner sc = new Scanner(System.in);
  private Integer numero;

  public ValidarNumero(){

  }

  public ValidarNumero(Integer numero){
    this.numero = numero;
  }

  public Integer getNumero() {
    return numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }


  public Integer validarNumero(Integer numero){

    if(numero > 5){
      System.out.println("Digite um número entre 1 - 5: ");
      numero = sc.nextInt();
      while(numero > 5){
        System.out.println("Digite um número entre 1 - 5: ");
        numero = sc.nextInt();
      }
    }
    else{}

    return numero;

  }
  
  public static void main(String[] args) {
    
    ValidarNumero validar = new ValidarNumero();


    validar.validarNumero(6);
  }

  
}

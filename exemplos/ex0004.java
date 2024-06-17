package exemplos;

import java.util.Scanner;



abstract class Cofre{
  protected String tipo;
  protected String metodoAbertura;

  public Cofre(String tipo, String metodoAbertura){
    this.tipo = tipo;
    this.metodoAbertura = metodoAbertura;
  }

  public void imprimirInformacoes(){
    System.out.println("Tipo: " + this.tipo);
    System.out.println("Metodo de abertura: " + this.metodoAbertura);
  }
}

class cofreDigital extends Cofre{

  private int senha;

    public cofreDigital(int senha){
      super("Cofre Digital", "Senha");
      this.senha = senha;
    }
    public boolean validarSenha(int confirmacaoSenha) {
      return confirmacaoSenha == this.senha;
    }
}

class CofreFisico extends Cofre {

  public CofreFisico() {
    super("Cofre Fisico", "Chave");
  }
}

public class ex0004 {


  public static void main(String[] args) {
    // Lê o tipo de cofre (primeira linha da entrada)
    Scanner scanner = new Scanner(System.in);
    String tipoCofre = scanner.nextLine();
    
    // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
    if (tipoCofre.equalsIgnoreCase("digital")) {
      System.out.println("Tipo: Cofre Digital");
      int senha = scanner.nextInt();
      System.out.println("Metodo de abertura: Senha");
      cofreDigital cofre = new cofreDigital(senha);
      int senhaDois = scanner.nextInt();
      if(cofre.validarSenha(senhaDois) == true){
        System.out.println("Cofre aberto!");
      }
      else{
        System.out.println("Senha incorreta!");
      }
  }
    else{
      System.out.println("Tipo: Cofre Fisico");
      System.out.println("Metodo de abertura: Chave");
    }
  
}
}




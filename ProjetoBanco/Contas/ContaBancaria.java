package ProjetoBanco.Contas;

public class ContaBancaria {
  
  protected String titular;
  protected int agencia;
  protected double saldo;

  public ContaBancaria(String titular, int agencia, double saldo){
    this.titular = titular;
    this.agencia = agencia;
    this.saldo = saldo;
  }


}

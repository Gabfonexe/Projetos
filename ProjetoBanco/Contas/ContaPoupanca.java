package ProjetoBanco.Contas;

public class ContaPoupanca implements ContaBancaria {


  private String titular;
  private double saldo;
  private int agencia;


  public ContaPoupanca(String titular, double saldo, int agencia){
    this.titular = titular;
    this.saldo = saldo;
    this.agencia = agencia;
  }

  @Override
  public void saque(double valor) {
    this.saldo += valor;
    
  }

  @Override
  public void deposito(double valor) {
    this.saldo -= valor;
  }

  @Override
  public void saldo() {
   System.out.println(saldo);
  }

  @Override
  public void infoConta(){

  }

  public String toString(){
    return String.format(" Titular: %s\n Agência: %s\n Saldo: %.2f ", titular, agencia, saldo);
  }

  
}

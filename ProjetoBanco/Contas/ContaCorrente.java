package ProjetoBanco.Contas;

public class ContaCorrente implements ContaBancaria {

  private String titular;
  private double saldo;
  private int agencia;


  public ContaCorrente(String titular, double saldo, int agencia){
    this.titular = titular;
    this.saldo = saldo;
    this.agencia = agencia;
  }

  @Override
  public void saque() {
    
  }

  @Override
  public void deposito() {
    
  }

  @Override
  public void saldo() {
    
  }

  @Override
  public void infoConta(){

  }
  
  public String toString(){
    return String.format(" Titular: %s\n Agência: %s\n Saldo: %.2f ", titular, agencia, saldo);
  }
  
}

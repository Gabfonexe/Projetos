package ProjetoBanco.Contas;

import java.util.ArrayList;
import java.util.List;

public class ContaInvestimento  implements IContaBancaria{

  protected List<ContaBancaria> contaBancarias;


  public ContaInvestimento(){
    
    this.contaBancarias = new ArrayList<>();
  }

  public void adicionarConta(String titular, double saldo, int agencia){
    contaBancarias.add(new ContaBancaria(titular, agencia, saldo));
  }

  @Override
  public void saque(double valor) {
    this.contaBancarias.get(0).saldo -= valor;
    
  }

  @Override
  public void deposito(double valor) {
    this.contaBancarias.get(0).saldo += valor;
  }

  @Override
  public void saldo() {
   System.out.println(contaBancarias.get(0).saldo);
  }

  public double riscoBaixo(double valor){
    return this.contaBancarias.get(0).saldo += valor * 0.09;
  }

  public double riscoMedio(double valor){
    return this.contaBancarias.get(0).saldo += valor * 0.16;
  }

  public double riscoAlto(double valor){
    return this.contaBancarias.get(0).saldo += valor * 0.23;
  }


  public String toString(){
    return String.format(" Titular: %s\n Agência: %s\n Saldo: %.2f ", contaBancarias.get(0).titular, contaBancarias.get(0).agencia, contaBancarias.get(0).saldo);
  }
  
}

/* 
class RiscoBaixo extends ContaInvestimento{

  public RiscoBaixo(String titular, int agencia, double saldo){
    super();
  }

  public double riscoBaixo(double valor){
    return this.contaBancarias.get(0).saldo += valor * 0.09;
  }

}

class RiscoMedio extends ContaInvestimento{

  public RiscoMedio(String titular, int agencia, double saldo){
    super();
  }

  public double riscoMedio(double valor){
    return this.contaBancarias.get(0).saldo += valor * 0.09;
  }


}

class RiscoAlto extends ContaInvestimento{


  public RiscoAlto(String titular, int agencia, double saldo){
    super();
  }

  public double riscoAlto(double valor){
    return this.contaBancarias.get(0).saldo += valor * 0.09;
  }

}
 */

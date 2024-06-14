package ProjetoBanco.Contas;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente implements IContaBancaria {

  List<ContaBancaria> contaBancarias;

  public ContaCorrente(){
    this.contaBancarias = new ArrayList<>();
  }

  public void adicionarConta(String titular, int agencia, double saldo){
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
   System.out.println(contaBancarias.getFirst().toString());
  }
 
  public String toString(){
    return String.format(" Titular: %s\n Agência: %s\n Saldo: %.2f ", contaBancarias.get(0).titular, contaBancarias.get(0).agencia, contaBancarias.get(0).saldo);
  }

}

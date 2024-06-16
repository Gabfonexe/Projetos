package ProjetoBanco.Contas.ContasInvestimento;

import ProjetoBanco.Contas.ContaBancaria;
import ProjetoBanco.Contas.ContaInvestimento;

public class RiscoBaixo extends ContaInvestimento{

  public RiscoBaixo(String titular, int agencia, double saldo){
    super();
  }

  public double riscoBaixo(double valor){
    return this.contaBancarias.get(0).saldo += valor * 0.09;
  }
  
}

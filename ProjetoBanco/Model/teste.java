package ProjetoBanco.Model;

import javax.swing.JOptionPane;
import ProjetoBanco.Model.LimparTela;
import ProjetoBanco.Contas.ContaCorrente;
import ProjetoBanco.Contas.ContaInvestimento;
import ProjetoBanco.Contas.ContaPoupanca;
import ProjetoBanco.ExceptionBanco.ExceptionBanco;


public class teste {

  public static void main(String[] args) throws ExceptionBanco{

    LimparTela lt = new LimparTela();
    ContaCorrente contaCorrente = new ContaCorrente();
    ContaPoupanca contaPoupanca = new ContaPoupanca();
    ContaInvestimento contaInvestimento = new ContaInvestimento();

    try {

      boolean ligado = true;

      while (ligado) {

        String[] options = {"Corrente", "Poupança", "Investimento"};
        int n = JOptionPane.showOptionDialog(null, "Qual tipo de conta você deseja abrir?", "Escolha uma opção", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        lt.limparTela();

        switch (n) {

          case 0:
            String titular = JOptionPane.showInputDialog("Digite Seu nome: ");
            int agencia = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua Agência: "));
            lt.limparTela();
            double saldo = 0;
            contaCorrente.adicionarConta(titular, agencia, saldo);
            JOptionPane.showMessageDialog(null, contaCorrente.toString());
            break;

          case 1:
            titular = JOptionPane.showInputDialog("Digite Seu nome: ");
            agencia = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua Agência: "));
            saldo = 0;
            contaPoupanca.adicionarConta(titular, agencia, saldo);
            break;

          case 2:
            titular = JOptionPane.showInputDialog("Digite Seu nome: ");
            agencia = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua Agência: "));
            saldo = 0;
            contaInvestimento.adicionarConta(titular, saldo, agencia);
            break;

          default:
            JOptionPane.showMessageDialog(null, "Digite um número entre 1 - 3: ");
            continue;
        }

        // Restante do código...
      }

    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, e.getMessage());
    }
  }
}

  

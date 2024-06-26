package exemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ex0001 {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Saldo inicial: ");
        double saldo = scanner.nextDouble();
        System.out.println("Digite a quantidade de  transaçõe: ");
        int quantidadeTransacoes = scanner.nextInt();

        List<Transacao> transacoes = new ArrayList<>();

        for (int i = 1; i <= quantidadeTransacoes; i++) {
          
            System.out.println("[S] Saque, [D] Depósito: ");
            String tipoTransacaoStr = scanner.next().toUpperCase();
            char tipoTransacao = tipoTransacaoStr.charAt(0);
            System.out.println("Digite o valor da transação: ");
            double valorTransacao = scanner.nextDouble();

            // TODO: Criar uma nova transação e adicioná-la à lista de transações
            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
            transacoes.add(transacao);
            // Verifica e atualiza o saldo da conta com base no tipo de transação
            if ( transacao.getTipo() == 'D') {
                saldo += transacao.getValor();
            } else if (transacao.getTipo() == 'S') {
                saldo -= transacao.getValor();
            }
        }

        System.out.println("\nSaldo : " + saldo);
        System.out.println("\nTransacoes:");
        transacoes.stream()
                .map(transacao -> transacao.getTipo() + " de " + transacao.getValor()).forEach(System.out::println);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

class Transacao {
    private char tipo;
    private double valor;

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}
           
  

  


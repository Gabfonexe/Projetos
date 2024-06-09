package Projetos.Empregados;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class PolimorfismoMain {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    List <PolimorfismoExercicioFuncionario> lista = new ArrayList<>();

    System.out.print("Digite o número de funcionários: ");
    int n = sc.nextInt();

    for (int i=1; i <= n; i++){
      System.out.println("Dados Funcinário #" + i);
      System.out.print("É tercerizado? ");
      char c = sc.next().charAt(0);

      if(c == 'y'){
        System.out.print("Nome: ");
        sc.nextLine(); //consumir a linha
        String nome = sc.nextLine();
        System.out.print("Horas Trabalhadas: ");
        Integer horas = sc.nextInt();
        System.out.print("Valor por Hora: ");
        Double valorHora = sc.nextDouble();

        lista.add(new PolimorfismoExercicioFuncionario(nome, horas, valorHora));

      }

      if(c == 'n'){

        System.out.print("Nome: ");
        sc.nextLine(); //consumir a linha
        String nome = sc.nextLine();
        System.out.print("Horas Trabalhadas: ");
        Integer horas = sc.nextInt();
        System.out.print("Valor por Hora: ");
        Double valorHora = sc.nextDouble();
        System.out.print("Custo adicional: ");
        Double custoAdicional = sc.nextDouble();

        lista.add(new PolimorfismoExercicioFuncionarioTercerizado(nome, horas, valorHora, custoAdicional));

      }
      System.out.println("Pagamentos: ");
      for (PolimorfismoExercicioFuncionario funcionarios : lista ){

        System.out.printf("%S - R$ %.2f", funcionarios.getNome(), funcionarios.pagamento());
      }
    }
    
    sc.close();
  }
  
}

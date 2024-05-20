package Projetos.Trabalhador;


import Entities.Trabalhador;
import Entities.ContratoHora;
import Enum.NivelTrabalho;
import Entities.Departamento;
import java.util.Scanner;
import java.util.Locale;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TrabalhadorMain {

  public static void main(String[] args) throws ParseException {
    
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.print("Digite o nome do departamento: ");
    String nomeDepartamento = sc.nextLine();
    System.out.println("Dados do Funcionário: ");
    System.out.print("Nome: ");
    String nomeFuncionario = sc.nextLine();
    System.out.print("Nível: ");
    String nivelFuncionario = sc.nextLine().toUpperCase();
    System.out.print("Salário Base: ");
    double salarioBase = sc.nextDouble();
    Trabalhador trabalhador = new Trabalhador(nomeFuncionario, NivelTrabalho.valueOf(nivelFuncionario), salarioBase, new Departamento(nomeDepartamento));

    System.out.print("Quantos Contratos você trabalhou?  ");
    int num = sc.nextInt();

    for(int i=0; i<num; i++){

      System.out.printf("Dados contrato #%d", i+1);
      System.out.println();
      System.out.print("Data (DD/MM/YYYY): ");
      Date dataContrato = sdf.parse(sc.next());
      System.out.print("Valor por hora: ");
      Double valorHora = sc.nextDouble();
      System.out.print("Duração: ");
      Integer horas = sc.nextInt();
      ContratoHora contrato = new ContratoHora(dataContrato, valorHora, horas); //add throws ParseException
      trabalhador.addContrato(contrato);
    }

    System.out.println();
    System.out.print("Digite o Mês para calcular o rendimento total (MM/YYYY): ");
    String mesAno = sc.next();
    int mes = Integer.parseInt(mesAno.substring(0,2));
    int ano = Integer.parseInt(mesAno.substring(3));
    System.out.println("Name: " + trabalhador.getNome() );
    System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
    System.out.println("Rendimento Total: " + mesAno + ": " + String.format("%.2f", trabalhador.rendaTotal(ano, mes) ));

    


    

    sc.close();

  }
  
}

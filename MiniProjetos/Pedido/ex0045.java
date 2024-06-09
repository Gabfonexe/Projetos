package Projetos.Pedido;

import java.util.Locale;
import java.util.Scanner;

import Entities.ClienteEx45;
import Entities.OrdemItemEx45;
import Entities.PedidoEx45;
import Entities.ProdutoEx45;
import Enum.OrdemStatusEx45;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ex0045 {

  public static void main(String[] args) throws ParseException{

    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.println("Dados do cliente: ");
    System.out.print("Nome: ");
    String nome = sc.nextLine();
    System.out.print("Email: ");
    String email = sc.next();
    System.out.print("Data de Aniversário: ");
    Date aniversario = sdf.parse(sc.next());
    System.out.println();
    ClienteEx45 cliente = new ClienteEx45(nome, email, aniversario );

    System.out.print("Dados do Pedido: " +"\n");
    System.out.print("Status: ");
    String status = sc.next();
    System.out.print("Quantos itens terá o pedido: ");

    PedidoEx45 pedido = new PedidoEx45(new Date(), OrdemStatusEx45.valueOf(status), cliente);

    int qtdItens = sc.nextInt();
    
    
    for(int i=0; i < qtdItens; i++){

      System.out.printf("Digite #%d item", i+1);
      System.out.println();
      System.out.print("Nome do produto: ");
      String nomeProduto = sc.next();
      System.out.print("Preço do produto: ");
      Double preco = sc.nextDouble();
      ProdutoEx45 produto = new ProdutoEx45(nomeProduto, preco);
      System.out.print("Quantidade de Itens: ");
      Integer quantidade = sc.nextInt();
      OrdemItemEx45 item = new OrdemItemEx45(quantidade, preco, produto);
      pedido.addItem(item);
    }
    
    System.out.println();
    System.out.println("RECIBO: ");
    System.out.println(pedido);

    sc.close();

  }
 
}

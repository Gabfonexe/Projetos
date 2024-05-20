package Projetos.Produtos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import Entities.ProdutoEx46;
import Entities.ProdutoImportadoEx46;
import Entities.ProdutoUsadoEx46;

import java.util.List;


public class ex0046 {

  public static void main(String[] args) throws ParseException {

    Scanner sc = new Scanner(System.in);
    List<ProdutoEx46> lista = new ArrayList<>();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.print("Digite o número de produtos: ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.print("Produto #" + i + "\n");
      System.out.print("Comum, usado ou importado (c/u/i) ?  ");
      char c = sc.next().charAt(0);

      if (c == 'c') {
        System.out.print("Nome: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        Double preco = sc.nextDouble();
        lista.add(new ProdutoEx46(nome, preco));
      }

      else if (c == 'u'){
        System.out.print("Nome: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        Double preco = sc.nextDouble();
        System.out.print("Data de Fabricação: ");
        String data = sc.next();
        sdf.parse(data);
        lista.add(new ProdutoUsadoEx46(nome, preco, data));
      }

      else if (c == 'i'){
        System.out.print("Nome: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        Double preco = sc.nextDouble();
        System.out.print("Preço do imposto: ");
        Double imposto = sc.nextDouble();
        lista.add(new ProdutoImportadoEx46(nome, preco, imposto));
      }
    }

    for(ProdutoEx46 produtos : lista){
      System.out.println(produtos.tagPreco());
    }
    sc.close();
  }
}

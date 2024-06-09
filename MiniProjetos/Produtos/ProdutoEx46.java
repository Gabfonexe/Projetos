package Projetos.Produtos;

public class ProdutoEx46 {

  private String nome;
  private Double preco;

  public ProdutoEx46(){

  }

  public ProdutoEx46(String nome, Double preco){
    this.nome = nome;
    this.preco = preco;
  }
  
  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public Double getPreco(){
    return preco;
  }

  public void setPreco(Double preco){
    this.preco = preco;
  }

  public String tagPreco (){
    return nome + " " + "R$ " + preco;
  }


}

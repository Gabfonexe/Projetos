package Projetos.Pedido;

public class ProdutoEx45 {

  private String nome;
  private Double preco;

  public ProdutoEx45(){

  }

  public ProdutoEx45(String nome, Double preco) {
    this.nome = nome;
    this.preco = preco;
  }

  public ProdutoEx45(String nome){
    this.nome = nome;
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

  public String toString(){
    return nome + ", " + preco;
  }
}

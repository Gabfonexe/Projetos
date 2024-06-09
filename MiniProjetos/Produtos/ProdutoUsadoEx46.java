package Projetos.Produtos;

public final class ProdutoUsadoEx46 extends ProdutoEx46 {

  private String data;

  public ProdutoUsadoEx46 (){
    super();
  }

  public ProdutoUsadoEx46 (String nome, Double preco, String data){
    super(nome, preco);
    this.data = data;
  }

  public String getData(){
    return data;
  }

  public void setData(String data){
    this.data = data;
  }

  @Override
  public String tagPreco(){
    return super.getNome() + "R$ " + super.tagPreco() + " " + "Frabricado em: " + getData();
  }

}
package Projetos.Produtos;

public final class ProdutoImportadoEx46 extends ProdutoEx46 {

  private Double imposto;

  public ProdutoImportadoEx46(){
    super();
  }

  public ProdutoImportadoEx46(String nome, Double preco, Double imposto){
    super(nome, preco);
    this.imposto = imposto;
  }

  public Double getImposto(){
    return imposto;
  }

  public void setImposto(Double impostos){
    this.imposto = impostos;
  }

  @Override
  public String tagPreco (){
    return super.getNome() + " " + "R$" + totalPrice();
  }

  public Double totalPrice(){
    return imposto + super.getPreco();
  }
  
}

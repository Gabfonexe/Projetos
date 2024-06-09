package Projetos.Pedido;

public class OrdemItemEx45 {

  private Integer quantidade;
  private Double preco;
  private ProdutoEx45 produto;
  //List<ProdutoEx45> produto = new ArrayList<>();

  public OrdemItemEx45(){

  }

  public OrdemItemEx45(Integer quantidade){
    this.quantidade = quantidade;
  }

  public OrdemItemEx45(Integer quantidade, Double preco, ProdutoEx45 produto){
    this.quantidade = quantidade;
    this.preco = preco;
    this.produto = produto;
  }

  public Integer getQuantidade(){
    return quantidade;
  }

  public void setQuantidade(Integer quantidade){
    this.quantidade = quantidade;
  }

  public Double getPreco(){
    return preco;
  }

  public void setPreco(Double preco){
    this.preco = preco;
  }

  public Double subTotal(){
    return quantidade * preco;
  }

  public ProdutoEx45 getProduto() {
    return produto;
  }

  public void setProduto(ProdutoEx45 produto) {
    this.produto = produto;
  }

  @Override
  public String toString(){
    return produto.getNome()
                  + ", R$ "
                  + String.format("%.2f", preco)
                  + ", Quantidade: "
                  + quantidade +
                  ", Subtotal: R$ "
                  + String.format("%.2f", subTotal());
  }
}

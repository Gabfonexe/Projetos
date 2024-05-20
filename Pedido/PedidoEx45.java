package Projetos.Pedido;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Enum.OrdemStatusEx45;

public class PedidoEx45{

  SimpleDateFormat sdf = new SimpleDateFormat();
  private Date momento;
  private OrdemStatusEx45 status;
  private ClienteEx45 cliente;

  List<OrdemItemEx45> itens = new ArrayList<>();
  

  public PedidoEx45(){

  }

  public PedidoEx45(Date momento, OrdemStatusEx45 status, ClienteEx45 cliente){
    this.momento = momento;
    this.status = status;
    this.cliente = cliente;
  }

  
  public ClienteEx45 getCliente() {
    return cliente;
  }

  public void setCliente(ClienteEx45 cliente) {
    this.cliente = cliente;
  }

  public Date getMomento(){
    return momento;
  }

  public void setMomento(Date momento){
    this.momento = momento;
  }

  public OrdemStatusEx45 getStatus(){
    return status;
  }

  public void setStatus(OrdemStatusEx45 status){
    this.status = status;   
  }

  public List<OrdemItemEx45> getOrdemItemEx45(){
    return itens;
  }

  public void addItem(OrdemItemEx45 item){
    itens.add(item);
  }

  public void removeItem(OrdemItemEx45 item){
    itens.remove(item);
  }


  //OrdemItemEx45 item = new OrdemItemEx45();

  public Double total(){
    Double soma = 0.0;
    for (OrdemItemEx45 i : itens){
      soma += i.subTotal();
    }
    return soma;
  }


  public String toString(){
    StringBuilder sb = new StringBuilder();
    
    sb.append("Momento do pedido: ");
    sb.append(sdf.format(momento) + "\n");
    sb.append("Status do Pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("itens do Pedido:\n");
    for (OrdemItemEx45 item : itens){
      sb.append(item + "\n");
    }
    sb.append("Valor Total: R$");
    sb.append(String.format("%.2f", total()));
    return sb.toString();
  }


}


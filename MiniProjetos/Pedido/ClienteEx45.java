package Projetos.Pedido;

import java.util.Date;

public class ClienteEx45 {
  
  private String nome;
  private String email;
  private Date aniversario;


  public ClienteEx45(){

  }

  public ClienteEx45(String nome, String email, Date aniversario){
    this.nome = nome;
    this.email = email;
    this.aniversario = aniversario;
  }

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getEmail(){
    return email;
  }
  
  public void setEmail(String email){
    this.email = email;
  }

  public Date getAniversario(){
    return aniversario;
  }

  public void setAniversario(Date aniversario){
    this.aniversario = aniversario;
  }

  
}

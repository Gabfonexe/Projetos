package Projetos.Trabalhador;

import java.util.Date;

public class ContratoHora {

  private Date data; 
  private Double valorPorHora;
  private Integer horasTrabalhadas;
  
  public ContratoHora(){

  }

  public ContratoHora(Date data, Double valorPorHora, Integer horasTrabalhadas){

    this.data = data;
    this.valorPorHora = valorPorHora;
    this.horasTrabalhadas = horasTrabalhadas;
  }

  public ContratoHora(Double valorPorHora, Integer horasTrabalhadas){

    this.valorPorHora = valorPorHora;
    this.horasTrabalhadas = horasTrabalhadas;
  }

  public Date getData(){
    return data;
  }

  public void setData(Date data){
    this.data = data;
  }

  public Double getValorPorHora(){
    return valorPorHora;
  }

  public void setValorPorHora(Double valor){
    this.valorPorHora = valor;
  }

  public Integer getHorasTrabalhadas(){
    return horasTrabalhadas;
  }

  public void setHorasTrabalhadas(Integer horas){
    this.horasTrabalhadas = horas;
  }

  // método do valor total do contrato

  public Double valorTotalContrato(){
    return horasTrabalhadas * valorPorHora;
  }
}

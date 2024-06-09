package Projetos.Trabalhador;


import Entities.ContratoHora;
import Enum.NivelTrabalho;
import Entities.Departamento;
import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;

public class Trabalhador {

  private String nome;
  private NivelTrabalho nivel;
  private Double salarioBase;

  private Departamento departamento; // declarar a var da classe departamento
  private List<ContratoHora> contrato = new ArrayList<>(); // fazer uma lista da classe e instanciar

  
  public Trabalhador(){

  }

  public Trabalhador (String nome, NivelTrabalho nivel, Double salarioBase, Departamento departamento){
    this.nome = nome;
    this.nivel = nivel;
    this.salarioBase = salarioBase;
    this.departamento = departamento;
  }

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public NivelTrabalho getNivel(){
    return nivel;
  }

  public void setNivel(NivelTrabalho nivel){
    this.nivel = nivel;
  }

  public Double getsalarioBase(){
    return salarioBase;
  }

  public void setsalarioBase(Double salarioBase){
    this.salarioBase = salarioBase;
  }

  public Departamento getDepartamento(){
    return departamento;
  }

  public void setDepartamento(Departamento departamento){
    this.departamento = departamento;
  }

  public List<ContratoHora> getContratoHora(){ 
    return contrato;
  }


  /* NÃO PODE TER O SET DO CONTRATO HORA, POIS SÓ PODE SER MUDADO PELOS MÉTODOS:
   * ADD E REMOVE DO TIPO LIST
   */
  
  // métodos de add, remover e incremento

  public void addContrato(ContratoHora contratos){
    contrato.add(contratos);
  }

  public void removerContrato(ContratoHora contratos){
    contrato.remove(contratos); 
  }

  public double rendaTotal(int ano, int mes){
    double soma = salarioBase;
    Calendar cal = Calendar.getInstance();
    for(ContratoHora c : contrato){
      cal.setTime(c.getData());
      int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if (ano == c_ano && mes == c_mes) {
				soma += c.valorTotalContrato();
			}
    }
    return soma;
  }

}

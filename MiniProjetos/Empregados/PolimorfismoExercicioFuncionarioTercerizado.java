package Projetos.Empregados;


public class PolimorfismoExercicioFuncionarioTercerizado extends PolimorfismoExercicioFuncionario{
  
  private Double custoAdicional;

  public PolimorfismoExercicioFuncionarioTercerizado(){
    super();
  }

  public PolimorfismoExercicioFuncionarioTercerizado(String nome, Integer horas, Double ValorHora, Double custoAdicional){
    super(nome, horas, ValorHora);
    this.custoAdicional = custoAdicional;
  }

  public Double getCustoAdicional(){
    return custoAdicional;
  }

  public void setCustoAdicional(Double custoAdicional){
    this.custoAdicional = custoAdicional;
  }

  @Override
  public Double pagamento(){
    return super.pagamento() + custoAdicional * 1.1;
  }


}

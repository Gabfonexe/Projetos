package ProjetoCelular.Sistema;

public class Sistema implements Camera, NavegadorInternet, Gps, Telefonar, ReprodutorMusical{

 
  private String rodarSistema(){
    return "Iniciando Sistema . . .";
  }



  @Override
  public void tirarFoto() {
    System.out.println("Tirando Foto");
  }

  @Override
  public void gravarVideo() {
    System.out.println("Gravando Vídeo");
  }

  @Override
  public void armazenar() {
    System.out.println("Armazenando na galeria");
  }

  @Override
  public void tocarMusica() {
    System.out.println("Tocando música");
  }

  @Override
  public void pausarMusica() {
    System.out.println("Música pausada");
  }

  @Override
  public void proximaMusica() {
    System.out.println("Avançando Playlist");
  }

  @Override
  public void anteriorMusica() {
    System.out.println("Retrocendo Playlist");
  }

  @Override
  public void armazenarContato() {
    System.out.println("Contato Armazenado");
  }

  @Override
  public void ligar() {
    System.out.println("Ligando...");
  }

  @Override
  public void desligar() {
    System.out.println("Desligando...");
  }

  @Override
  public void acessarCoordenadas() {
    System.out.println("Acessando coordendas geográficas");
  }

  @Override
  public void fornecerLocalizacao() {
    System.out.println("Gerando localização atual...");
  }

  @Override
  public void acessarInternet() {
    System.out.println("Acessando o navegador");
  }

  @Override
  public void selecionarMusica() {
    System.out.println("Música selecionada");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz: ................");
  }

  @Override
  public void adicionarAba() {
    System.out.println("Adicionando aba no navegador");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Página Atualizada");
  }
  
}

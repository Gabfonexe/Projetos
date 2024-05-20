package Projetos.Post;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

  private Date momento;
  private String titulo;
  private String conteudo;
  private Integer likes;

  private List<Comentarios> comentario = new ArrayList<>();
  private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
  public Post(){

  }

  // não criar construtor para a lista de comentarios

  public Post(Date momento, String titulo, String conteudo, Integer likes) {
    this.momento = momento;
    this.titulo = titulo;
    this.conteudo = conteudo;
    this.likes = likes;
  }

  public Date getMomento() {
    return momento;
  }

  public void setMomento(Date momento) {
    this.momento = momento;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getConteudo() {
    return conteudo;
  }

  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  public Integer getLikes() {
    return likes;
  }

  public void setLikes(Integer likes) {
    this.likes = likes;
  }

  public  List<Comentarios> getComentarios(){
    return comentario;
  }

  public void addComentario(Comentarios comentarios){
    comentario.add(comentarios);
  }

  public void removeComentario(Comentarios comentarios){
    comentario.remove(comentarios);
  }

  public String toString(){
// usar a Stringbuilder

    StringBuilder sb = new StringBuilder();

    sb.append(titulo + "\n");
    sb.append(likes);
    sb.append(" Likes - ");
    sb.append(sdf.format(momento) + "\n");
    sb.append(conteudo + "\n");
    sb.append("Comentarios:\n");
    for (Comentarios c : comentario){
      sb.append(c.getTexto() + "\n");
    }
    return sb.toString();
  }
}

  
    
  
  




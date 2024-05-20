package Projetos.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import Entities.Comentarios;
import Entities.Post;

public class PostMain {
                                 
  public static void main(String[] args) throws ParseException  {
    
    // instanciar o simpledate 
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    Comentarios c1 = new Comentarios("Tenha uma boa viagem");
    Comentarios c2 = new Comentarios("Como isso é bom");
    Post p1 = new Post( // passando sdf como parametro do method 
      sdf.parse("21/06/2019 11:15:25"), 
      "Viajando para nova zelandia",
      "Eu estou indo visitar um incrível país", 25);

    p1.addComentario(c1);
    p1.addComentario(c2); 

    Comentarios c3 = new Comentarios("Boa noite! ");
    Comentarios c4 = new Comentarios("Que a força esteja com você");
    Post p2 = new Post(
      sdf.parse("20/01/2022 13:16:09"),
      "Boa noite galera",
      "Vejo vocês amanhã",
      14);

    p2.addComentario(c3);
    p2.addComentario(c4);

    System.out.println(p1);
    System.out.println(p2);
       



  }

  
  
}

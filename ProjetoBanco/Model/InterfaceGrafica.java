package ProjetoBanco.Model;
import javax.swing.*;

public class InterfaceGrafica {

    public static void main(String[] args) {
        
        // Cria um novo JFrame
        JFrame frame = new JFrame("Minha Primeira Janela");
        
        // Define a operação de fechamento
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Define o tamanho da janela
        frame.setSize(800, 600);
        
        // Cria um novo JButton
        JButton botao = new JButton("Clique Aqui");
        JTextField campoTexto = new JTextField(20);
        frame.getContentPane().add(campoTexto);
        
        // Adiciona o botão ao JFrame
        frame.getContentPane().add(botao);
        
        // Torna o JFrame visível
        frame.setVisible(true);
    }
}

  


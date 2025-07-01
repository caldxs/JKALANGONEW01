package br.com.jcalango.view;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JIntro extends JFrame {
    public JIntro(){
        setTitle("JKalango Splash Screen");
        setSize(900, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        String textoIntro ="Sua memória é um borrão... tudo começou com o frio cortante, a névoa espessa...\n"
        + "E aquela voz distante, quase um sussurro, chamando você pelo nome, como se já te conhecesse.\n"
        + "A casa diante de você não é apenas velha — ela respira, observa.\n"
        + "À medida que você atravessa seus corredores e abre cada porta, ela parece se lembrar... de quem você realmente é.";


        JLabel janela = new JLabel(textoIntro);
        janela.setOpaque(false);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.add(janela);

        JButton startButton = new JButton("Iniciar Missão");
        panel.add(startButton);
        
        startButton.addActionListener(new ActionListener() {
        @Override
        
        public void actionPerformed(ActionEvent e) {
            //JOptionPane.showMessageDialog(JIntro.this, "Primeira Missão Iniciada");
            dispose();
            new JCadastroJogador();
        }
        });
        setContentPane(panel);
        setVisible(true);
    }
   public static void main(String[] args) {
    new JIntro();
   }
}
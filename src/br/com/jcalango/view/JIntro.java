package br.com.jcalango.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JIntro extends JFrame {
    public JIntro() {
        setTitle("JKalango INTRO");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        String narracao = "Sua memória é um borrão... tudo começou com o frio cortante, a névoa espessa...\n"
        + "E aquela voz distante, quase um sussurro, chamando você pelo nome, como se já te conhecesse.\n"
        + "A casa diante de você não é apenas velha — ela respira, observa.\n"
        + "À medida que você atravessa seus corredores e abre cada porta, ela parece se lembrar... de quem você realmente é.";

        
        JTextArea textoPanic = new JTextArea(narracao);
        add(textoPanic, BorderLayout.CENTER);
        JButton startJButton = new JButton("Iniciar");
        add(startJButton);
        startJButton.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new JCadastroJogador();
                 JOptionPane.showMessageDialog(JIntro.this, "PRIMEIRA PARTE ");
            }
        });

        setVisible(true);
    }
}
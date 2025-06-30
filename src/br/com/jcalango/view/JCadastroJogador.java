package br.com.jcalango.view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//extends é herança 

public class JCadastroJogador extends JFrame{
    //Construtor inicializa os componentes do formulario
    public JCadastroJogador(){
        //Titulo da janela
        setTitle("Faça parte do JKalango!");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //TAMANHO
        setSize(400,450);
        //posição
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        JLabel lblnome = new JLabel("nome");
        JTextField txtNome = new JTextField(25);
        add(lblnome);
        add(txtNome);
     JButton btnCadatrar = new JButton("Cdastrar");
     btnCadatrar.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        }
        
     });
     setVisible(true);

        

}

}

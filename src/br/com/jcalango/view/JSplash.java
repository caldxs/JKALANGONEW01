package br.com.jcalango.view;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class JSplash extends JFrame {
    //1°) O formulário (Jframe)
    public JSplash(){
        setTitle("JKalango Splash");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        //2°) Adicionar o JButton com o título Start        
        JButton startJButton = new JButton("Start");
        add(startJButton);
        //3°(Adicionar um evento ao botão que ao clicar mostre "Jkalango"
        startJButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(JSplash.this, "Jcalango");
            }
            
        });
        //4°) Mostrar o formulário 
        setVisible(true);
        
    }
    
    



}
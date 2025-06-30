import javax.swing.JOptionPane;

public class Fomiga extends Personagem implements IArmamento{
    public Fomiga(){
        
    }

    @Override
    public void mover() {
        energia -=2;
     //JOptionPane.showMessageDialog(null,"Fomiga:" + "\n" +"Anda só pra frente, se perder a rota Game Over:"+ energia  + "\n" + "Avançou duas casa");
    }

     @Override
     public void fazerSom(){
      //  JOptionPane.showMessageDialog(null,"Som Fomiga:" + "\n" + "rsrsrsrsrs" + "\n" );
     }
     public void mostrarEnergia(){
       // JOptionPane.showMessageDialog(null,"Dormindo, Energia atual:" + energia);
    }
    public void comer(){
        energia +=2;
       // JOptionPane.showMessageDialog(null,"Comendo, para recuperar energia");
    }
}
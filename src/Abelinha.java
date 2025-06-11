import javax.swing.JOptionPane;

public class Abelinha extends Personagem{

    @Override
    public void mover() {
        energia -=1;
      JOptionPane.showMessageDialog(null,"Abelinha:" + "\n" + "Voando nos 360 graus: "+ energia + "\n" + "Avançou uma casa");
    }
    @Override
    public void fazerSom(){
        JOptionPane.showMessageDialog(null,"Som Abelinha:" + "\n" + "ziziziizizi" + "\n" );
    }
    public void mostrarEnergia(){
        JOptionPane.showMessageDialog(null,"Dormindo, Energia atual:" + energia);
    }
    public void comer(){
        energia +=3;
        JOptionPane.showMessageDialog(null,"Comendo, para recuperar energia");
    }
}
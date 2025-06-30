import javax.swing.JOptionPane;

public abstract class Personagem {
    public abstract void mover();
    public abstract void fazerSom();
    public int dormir(){
        return energia +=10;
    }
    protected int energia = 10;
    public Personagem(){
        
    }

    public abstract void comer();

    public void verificarEnergia(){
        if(energia < 5){
          //  JOptionPane.showMessageDialog(null, "Personagem cansado");
           // JOptionPane.showMessageDialog(null,"Personagem está sem energia, vá comer ou domrir ");

        }else{
        //    JOptionPane.showMessageDialog(null,"O personagem está descansado");
            
        }
        }
    }




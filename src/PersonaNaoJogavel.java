public class  PersonaNaoJogavel extends Personagem{

    @Override
    public void mover() {
        
        throw new UnsupportedOperationException("Unimplemented method 'mover'");
    }

    @Override
    public void fazerSom() {
        
        throw new UnsupportedOperationException("Unimplemented method 'fazerSom'");
    }

    @Override
    public void comer() {
        
        throw new UnsupportedOperationException("Unimplemented method 'comer'");
    }

}

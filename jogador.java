public abstract class Jogador {
    
    protected int[] tentativa = new int[2];
    protected int jogador;

    
    public Jogador(int jogador2){
        this.jogador = jogador2;
    }
    
    public abstract void jogar(areaJogo areaJogo);
    
    public abstract void Tentativa(areaJogo areaJogo);

    public boolean checaTentativa(int[] tentativa, areaJogo areaJogo){
        if(areaJogo.getPosicao(tentativa) == 0)
            return true;
        else
            return false;
            
    }
    
}

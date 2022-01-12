public class areaJogo {
    private int[][] areaJogo= new int[3][3];
    
    public areaJogo(){
        areava();
    }
    
    public void areava(){
        for(int linha=0 ; linha<3 ; linha++)
            for(int coluna=0 ; coluna<3 ; coluna++)
                areaJogo[linha][coluna]=0;
    }
    
    public void mostrandootabuleiro(){
        System.out.println();
        for(int linha=0 ; linha<3 ; linha++){
        
            for(int coluna=0 ; coluna<3 ; coluna++){
                
                if(areaJogo[linha][coluna]==-1){
                    System.out.print(" X ");
                }
                if(areaJogo[linha][coluna]==1){
                    System.out.print(" O ");
                }
                if(areaJogo[linha][coluna]==0){
                    System.out.print("   ");
                }
                
                if(coluna==0 || coluna==1)
                    System.out.print("|");
            }
            System.out.println();
        }
                
    }

    public int getPosicao(int[] tentativa){
        return areaJogo[tentativa[0]][tentativa[1]];
    }
    
    public void setPosicao(int[] tentativa, int jogador){
        if(jogador == 1)
            areaJogo[tentativa[0]][tentativa[1]] = -1;
        else
            areaJogo[tentativa[0]][tentativa[1]] = 1;
        
        mostrandootabuleiro();
    }

    public int linha1(){
        for(int linha=0 ; linha<3 ; linha++){

            if( (areaJogo[linha][0] + areaJogo[linha][1] + areaJogo[linha][2]) == -3)
                return -1;
            if( (areaJogo[linha][0] + areaJogo[linha][1] + areaJogo[linha][2]) == 3)
                return 1;
        }
        
        return 0;
                
    }
    
    public int coluna1(){
        for(int coluna=0 ; coluna<3 ; coluna++){

            if( (areaJogo[0][coluna] + areaJogo[1][coluna] + areaJogo[2][coluna]) == -3)
                return -1;
            if( (areaJogo[0][coluna] + areaJogo[1][coluna] + areaJogo[2][coluna]) == 3)
                return 1;
        }
        
        return 0;
                
    }
    
    public int diagonal(){
        if( (areaJogo[0][0] + areaJogo[1][1] + areaJogo[2][2]) == -3)
            return -1;
        if( (areaJogo[0][0] + areaJogo[1][1] + areaJogo[2][2]) == 3)
            return 1;
        if( (areaJogo[0][2] + areaJogo[1][1] + areaJogo[2][0]) == -3)
            return -1;
        if( (areaJogo[0][2] + areaJogo[1][1] + areaJogo[2][0]) == 3)
            return 1;
        
        return 0;
    }

    public boolean areaJogoCompleto(){
        for(int linha=0 ; linha<3 ; linha++)
            for(int coluna=0 ; coluna<3 ; coluna++)
                if( areaJogo[linha][coluna]==0 )
                    return false;
        return true;
    }
}

import java.util.Scanner;

public class real extends Jogador{
    public Scanner entrada = new Scanner(System.in);
    
    public real(int jogador2){
        super(jogador2);
        this.jogador2 = jogador;
        System.out.println("Jogador 'real' criado!");
    }
    
    public void jogar(areaJogo areaJogo){
        Tentativa(areaJogo);
        areaJogo.setPosicao(tentativa, jogador);
    }
    
    public void Tentativa(areaJogo areaJogo){
        do{
            do{
                System.out.print("Linha: ");
                tentativa[0] = entrada.nextInt();
                
                if( tentativa[0] > 3 ||tentativa[0] < 1)
                    System.out.println("Linha inválida. É 1, 2 ou 3");
                
            }while( tentativa[0] > 3 ||tentativa[0] < 1);
            
            do{
                System.out.print("Coluna: ");
                tentativa[1] = entrada.nextInt();
                
                if(tentativa[1] > 3 ||tentativa[1] < 1)
                    System.out.println("Coluna inválida. É 1, 2 ou 3");
                
            }while(tentativa[1] > 3 ||tentativa[1] < 1);
            
            tentativa[0]--; 
            tentativa[1]--;
            
            if(!checaTentativa(tentativa, areaJogo))
                System.out.println("Esse local já foi marcado. Tente outro.");
        }while( !checaTentativa(tentativa, areaJogo) );
    }
}

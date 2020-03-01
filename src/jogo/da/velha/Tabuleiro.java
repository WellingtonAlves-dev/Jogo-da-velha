package jogo.da.velha;

/**
 *
 * @author Wellington
 */
public class Tabuleiro {
    
    public String tabuleiro[][]; //matriz bidimensional
    public String simbolo;  //Simbolo responsavel pela forma do tabuleiro
    public String ultimaJogada; // e quem fez a ultima jogada!
    
    /**
     * Construtor do tabuleiro
     * @param x 
     */
    public Tabuleiro(int x) {
        this.tabuleiro = new String[x][x]; //construtor tabuleiro
    }
    
    /**
     * SobreCarga/overload do construtor do tabuleiro
     * @param x
     * @param simbolo 
     */
    public Tabuleiro(int x, String simbolo) { //Sobrecarga(Overload) Do construtor tabuleiro
        this.tabuleiro = new String[x][x];
        this.setSimbolo(simbolo);
        this.simbolo = simbolo; 
    }
    
    /**
     * metodo para definir como será a interface do tabuleiro ex: ---
     * @param simbolo 
     */
    public void setSimbolo(String simbolo) { //responsavel por seta o simbolo(estrutura do tab)
        for(int i = 0; i < tabuleiro.length; i++) {
            for(int j = 0; j < tabuleiro.length; j++) {
                tabuleiro[i][j] = simbolo;
            }
        }
    }
    
    public void exibirTabuleiro() { //Exibir tabuleiros
        String x_direction = " ";
        for(int i = 0; i < tabuleiro.length; i++) {//for para exibir a quantidade de colunas disponivel
            x_direction = x_direction + Integer.toString(i);
        } 
        System.out.println(" " + x_direction);
        for(int i = 0; i < tabuleiro.length; i++) {//for para exibir as linhas e colunas disponivel
            System.out.print(i + " ");
            for(int j = 0; j < tabuleiro.length; j++) {                
                System.out.print(tabuleiro[i][j]);
            }
            System.out.println(" ");
        }
    }
}

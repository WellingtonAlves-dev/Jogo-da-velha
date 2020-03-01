/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.da.velha;

/**
 *
 * @author Wellington
 */
public class Peca {
    public String peca; //o valor da peca EX: X ou O
    public Tabuleiro tab; //O tabuleiro(ele é chamado de fora pq esse mesmo tabuleiro é usado em outros objetos)
    
    /**
     * Construtor da Peça
     * @param peca
     * @param tab 
     */
    public Peca(String peca, Tabuleiro tab) {
        this.peca = peca;
        this.tab = tab;
        reloadTab();
    }
    
    /**
     * Metodo que seta a peça e o local onde ela vai ser adicionada no tabuleiro
     * @param linha
     * @param coluna 
     */
    public void setPeca(int linha, int coluna) {
        try {
            if(validarSet(linha, coluna)) {
                tab.tabuleiro[linha][coluna] = this.peca;
                reloadTab();
                tab.ultimaJogada = this.peca;
            }
            else {
                System.out.println("Já existe uma peça nesse local!!");
            }
        } catch(Exception e) {
            System.out.println("Esse local não existe!!");
        }
    }
    
    /**
     * chama o metodo exibirTabuleiro
     */
    public void reloadTab() { //metodo para atualizar a tela
        tab.exibirTabuleiro();
    }
    
    /**
     * valida se já foi colocado alguma peça no tabuleiro!
     * @param linha
     * @param coluna
     * @return true or false
     */
    public boolean validarSet(int linha, int coluna) {
        return tab.tabuleiro[linha][coluna] == tab.simbolo;
    }
}

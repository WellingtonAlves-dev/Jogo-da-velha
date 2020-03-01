/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.da.velha;

import java.util.Scanner;

/**
 *
 * @author Wellington
 */
public class Jogo {
    public Peca peca1;
    public Peca peca2;
    public Tabuleiro tab;
    
    public Jogo(Peca peca1, Peca peca2, Tabuleiro tab) {
        this.peca1 = peca1;
        this.peca2 = peca2;
        this.tab = tab;
        tab.ultimaJogada = peca2.peca;
    }
    
    public void jogar() {
        int linha, coluna;
        
        Scanner sc = new Scanner(System.in);
        while(true) {
            if(toggleJogada()) {
                System.out.println("Vez da peça: " + this.peca2.peca);
                System.out.print("Digite a linha: ");
                linha = sc.nextInt();
                System.out.print("Digite a coluna: ");
                coluna = sc.nextInt();
                peca2.setPeca(linha, coluna);
            }
            else {
                System.out.println("Vez da peça: " + this.peca1.peca);
                System.out.print("Digite a linha: ");
                linha = sc.nextInt();
                System.out.print("Digite a coluna: ");
                coluna = sc.nextInt();
                peca1.setPeca(linha, coluna);
            }
        }
    }
    
    public boolean toggleJogada() {
        return tab.ultimaJogada == peca1.peca; //se for verdadeiro então e a vez da peça 2
    }
}

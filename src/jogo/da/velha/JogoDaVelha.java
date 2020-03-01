package jogo.da.velha;

/**
 * Jogo da velha simples para praticar e demonstração
 * o jogo ele é feito para demonstrar o uso da composição e OO
 * Todo o jogo é feito no terminal é baseado em turnos
 * Tecnicas que usei foi, construtor, OO, composicação
 * tomada de decisão, metodos, modificadores de acesso
 * Matriz e organização do codigo!
 * também a regra de 1 para muitos no caso do tabuleiro...
 * @author Wellington
 */
public class JogoDaVelha {

    /**
     * Main class
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bem vindo ao jogo da velha criado por Wellington R. Alves");
        Tabuleiro tab = new Tabuleiro(3, "-"); //Instancia a classe criando um objeto

        
        Peca pecaX = new Peca("X", tab);
        Peca pecaO = new Peca("O", tab);
        Jogo jogo = new Jogo(pecaX, pecaO, tab);
        
        
        jogo.jogar(); //chama o metodo responsavel pelo jogo
        
    }
    
}
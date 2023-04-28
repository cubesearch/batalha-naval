package BatalhaNaval;

import java.util.Arrays;
import java.util.Scanner;

public class Jogador {
    private String[] coordenadasLinhasLetras = {"A", "B", "C", "D", "E", "F", "G", "H"};
    private char[][] meuJogo;
    private char[][] jogoDoAdversario;
    private String nomeJogador;
    static final int QTD_ARMAS_JOGADOR = 1;

    public Jogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
        this.meuJogo = new char[8][8];
        this.jogoDoAdversario = new char[8][8];
    }

    public void inicializarMatrizesComEspaco() {
        //"setando" os valores nulos da matriz de null para vazio
        for (int i = 0; i < meuJogo.length; i++) {
            Arrays.fill(meuJogo[i], ' ');
            Arrays.fill(jogoDoAdversario[i], ' ');
        }
    }

    public void imprimeMatrizDoJogador() {
        //Imprimido a matriz do jogador
        for (int i = 1; i < coordenadasLinhasLetras.length + 1; i++) {
            System.out.print("     " + i);
        }
        System.out.println();
        for (int linha = 0; linha < meuJogo.length; linha++) {
            System.out.print(coordenadasLinhasLetras[linha] + "  ");
            for (int coluna = 0; coluna < meuJogo[linha].length; coluna++) {
                System.out.print("| " + meuJogo[linha][coluna] + " |" + " ");
            }
            System.out.println();
        }
    }

    public void adicionarArmas() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < QTD_ARMAS_JOGADOR; i++) {
            System.out.printf("\nAdicione sua %dª arma", i + 1);
            System.out.println("\nAdicione o número da linha: ");
            int linha = scanner.nextInt();

            System.out.println("Adicione o número da coluna: ");
            int coluna = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Adicione a arma na matriz: ");
            char armaJogador = scanner.next().charAt(0);

            meuJogo[linha - 1][coluna - 1] = armaJogador;
            imprimeMatrizDoJogador();
        }
    }

    public void atirar(Jogador oponente, int linhaAlvo, int colunaAlvo) {
        verificarSeAcertou(oponente, linhaAlvo, colunaAlvo);
    }

    private void verificarSeAcertou(Jogador oponente, int linhaAlvo, int colunaAlvo) {
        for (int linha = 0; linha < oponente.meuJogo.length; linha++) {
            if ((linhaAlvo-1) == linha) {
                for (int coluna = 0; coluna < oponente.meuJogo[linha].length; coluna++) {
                    if ((colunaAlvo-1) == coluna) {
                        if (oponente.meuJogo[linha][coluna] == 'c'
                                || oponente.meuJogo[linha][coluna] == 's'
                                || oponente.meuJogo[linha][coluna] == 'p') {
                            jogoDoAdversario[linha][coluna] = 'o';
                            System.out.println("Acertou!");
                        } else {
                            jogoDoAdversario[linha][coluna] = 'x';
                            System.out.println("Água!");
                        }
                    }
                }
            }
        }
    }

    public boolean verificarSeAcabou() {
        int qtdDeAcertos = 0;
        for (int linha = 0; linha < jogoDoAdversario.length; linha++) {
            for (int coluna = 0; coluna < jogoDoAdversario[linha].length; coluna++) {
                if (jogoDoAdversario[linha][coluna] == 'o') {
                    qtdDeAcertos += 1;
                    System.out.println("O jogador " + nomeJogador + " venceu!");
                }
            }
        }
        if (qtdDeAcertos == QTD_ARMAS_JOGADOR) {
            return true;
        }
        return false;
    }


    public void imprimeJogoDoAdversario() {
        //Imprimido a matriz do jogador
        System.out.println("Matriz do jogador");
        for (int i = 1; i < coordenadasLinhasLetras.length + 1; i++) {
            System.out.print("     " + i);
        }
        System.out.println();
        for (int linha = 0; linha < jogoDoAdversario.length; linha++) {
            System.out.print(coordenadasLinhasLetras[linha] + "  ");
            for (int coluna = 0; coluna < jogoDoAdversario[linha].length; coluna++) {
                System.out.print("| " + jogoDoAdversario[linha][coluna] + " |" + " ");
            }
            System.out.println();
        }
    }
}

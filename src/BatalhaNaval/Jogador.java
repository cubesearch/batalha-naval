package BatalhaNaval;
import java.util.Arrays;
import java.util.Scanner;

public class Jogador {
    private String[] coordenadasLinhasLetras = {"A", "B", "C", "D", "E", "F", "G", "H"};
    private String[][] meuJogo;
    private String[][] jogoDoAdversario;
    private int numRodadas;
    private String nomeJogador;
    static final int QTD_ARMAS_JOGADOR = 6;

    public Jogador(String nomeJogador){
        this.nomeJogador = nomeJogador;
        this.meuJogo = new String[coordenadasLinhasLetras.length][coordenadasLinhasLetras.length];
        this.jogoDoAdversario = new String[coordenadasLinhasLetras.length][coordenadasLinhasLetras.length];
        this.numRodadas = 0;
    }

    public String getNomeJogador(){
        return this.nomeJogador;
    }

    public void adicionarArmasTabuleiro(){
        System.out.println("Para cada jogador, são disponibilizadas 6 seis armas. 3 submarinos, 2 cruzadores e 1 porta-avião. \nAs armas são representadas por: s - submarino, c - cruzador e p - porta-avião.");
        System.out.println("O jogo consiste em uma matriz 8X8, ou seja, 8 linhas e 8 colunas");
        System.out.printf("Jogador(a) %s, adicione suas armas!: ", getNomeJogador());
        System.out.println("\nPrimeiro informe as cordenadas das linhas e depois as cordenadas das colunas");
        System.out.println("\nCoordenadas de linhas: A - 1, B - 2, C - 3, D - 4, E - 5, F - 6, G - 7, H - 8. \nCoordenadas das colunas: 1, 2, 3, 4, 5, 6, 7, 8");

        //"setando" os valores nulos da matriz de null para vazio
        for(int estadoValores = 0; estadoValores < meuJogo.length; estadoValores++){
            Arrays.fill(meuJogo[estadoValores], " ");
        }

        //Atribuindo as armas a matriz
        Scanner entradaValores = new Scanner(System.in);
        for(int i = 0; i < QTD_ARMAS_JOGADOR; i++){
            System.out.printf("\nAdicione sua %dª arma", i+1);
            System.out.println("\nAdicione o número da linha: ");
            int linha = entradaValores.nextInt();
            System.out.println("Adicione o número da coluna: ");
            int coluna = entradaValores.nextInt();
            entradaValores.nextLine();
            System.out.println("Adicione a arma na matriz: ");
            String armaJogador = entradaValores.nextLine();
            meuJogo[linha-1][coluna-1] = armaJogador;
        }

        //Imprimido a matriz do jogador
        System.out.println("Matriz do jogador");
        for(int i = 1; i < coordenadasLinhasLetras.length+1; i++){
            System.out.print("     " + i);
        }
        System.out.println();
        for(int linhaMatriz = 0; linhaMatriz < meuJogo.length; linhaMatriz++){
            System.out.print(coordenadasLinhasLetras[linhaMatriz] + "  ");
            for(int colunaMatriz = 0; colunaMatriz < meuJogo[linhaMatriz].length; colunaMatriz++){
                System.out.print("| " + meuJogo[linhaMatriz][colunaMatriz] + " |" + " ");
            }
            System.out.println();
        }
    }

}
